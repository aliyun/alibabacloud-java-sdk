// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateRequest extends TeaModel {
    /**
     * <p>The name of the Live Record Template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of recording formats.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordFormat")
    public java.util.List<CreateLiveRecordTemplateRequestRecordFormat> recordFormat;

    public static CreateLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateRequest self = new CreateLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLiveRecordTemplateRequest setRecordFormat(java.util.List<CreateLiveRecordTemplateRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<CreateLiveRecordTemplateRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public static class CreateLiveRecordTemplateRequestRecordFormat extends TeaModel {
        /**
         * <p>The duration of a recording cycle in seconds. If you omit this parameter, it defaults to 6 hours.</p>
         * <blockquote>
         * <ul>
         * <li>If a stream interruption during a recording cycle lasts less than 3 minutes, the recording continues in the same Recording File.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>A Recording File is finalized only after a stream interruption lasts for more than 3 minutes. To change this default 3-minute threshold, submit a ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The recording format.</p>
         * <blockquote>
         * <p>If you set this parameter to <code>m3u8</code>, you must also specify the <code>SliceOssObjectPrefix</code> and <code>SliceDuration</code> parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the Recording File stored in Object Storage Service (OSS).</p>
         * <ul>
         * <li><p>The file name must be less than 256 bytes and supports the following variables: {JobId}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime}.</p>
         * </li>
         * <li><p>The value must include either the {StartTime} or {EscapedStartTime} variable and either the {EndTime} or {EscapedEndTime} variable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of each slice in seconds.</p>
         * <blockquote>
         * <p>This parameter is valid only when <code>Format</code> is set to <code>m3u8</code>.</p>
         * </blockquote>
         * <p>The default value is 30. The value must be an integer from 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The name of the TS slice.</p>
         * <blockquote>
         * <p>This parameter is required only when <code>Format</code> is set to <code>m3u8</code>.</p>
         * </blockquote>
         * <ul>
         * <li><p>The file name must be less than 256 bytes and supports the following variables: {JobId}, {UnixTimestamp}, and {Sequence}.</p>
         * </li>
         * <li><p>The value must include the {UnixTimestamp} and {Sequence} variables.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static CreateLiveRecordTemplateRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRecordTemplateRequestRecordFormat self = new CreateLiveRecordTemplateRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public CreateLiveRecordTemplateRequestRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

}
