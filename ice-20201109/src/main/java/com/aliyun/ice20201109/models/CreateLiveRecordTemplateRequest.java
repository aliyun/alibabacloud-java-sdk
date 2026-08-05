// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateRequest extends TeaModel {
    /**
     * <p>The template name.</p>
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
         * <p>The cycle recording duration. Unit: seconds. If this parameter is not specified, the default value is 6 hours.</p>
         * <blockquote>
         * <ul>
         * <li>If a live stream is interrupted during a recording cycle but resumes within 3 minutes, the recording continues in the same recording file.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>A live stream must be interrupted for more than 3 minutes before the last recording file is generated. If you need to modify the default 3-minute interruption time, submit a ticket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The format.</p>
         * <blockquote>
         * <p>If you select the m3u8 format, you must also set the request parameters SliceOssObjectPrefix and SliceDuration.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the recording file stored in OSS.</p>
         * <ul>
         * <li><p>The file name must be less than 256 bytes and supports variable matching, including {JobId}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime}.</p>
         * </li>
         * <li><p>The parameter value must contain {StartTime} or {EscapedStartTime} and {EndTime} or {EscapedEndTime}.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a single slice. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter takes effect only when Format is set to m3u8.</p>
         * </blockquote>
         * <p>If this parameter is not specified, the default value is 30 seconds. Valid values: 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The name of the TS slice.</p>
         * <blockquote>
         * <p>This parameter is required only when Format is set to m3u8.</p>
         * </blockquote>
         * <ul>
         * <li>The default slice duration is 30 seconds. The name must be less than 256 bytes and supports variable matching, including {JobId}, {UnixTimestamp}, and {Sequence}.</li>
         * <li>The parameter value must contain the {UnixTimestamp} and {Sequence} variables.</li>
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
