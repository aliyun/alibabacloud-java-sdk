// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
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
         * <p>The duration of the recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If a live stream is interrupted during a recording cycle but is resumed within 3 minutes, the stream is recorded in the same recording before and after the interruption.</p>
         * </li>
         * <li><p>If a live stream is interrupted for more than 3 minutes, a new recording is generated. To change the default stream interruption time, submit a ticket.</p>
         * </li>
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
         * <p> If you set this parameter to m3u8, you must also specify the SliceOssObjectPrefix and SliceDuration parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the recording file that is stored in Object Storage Service (OSS).</p>
         * <ul>
         * <li>The name must be less than 256 bytes in length and can contain the {JobId}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime} variables.</li>
         * <li>The name must contain the {StartTime} and {EndTime} variables or the {EscapedStartTime} and {EscapedEndTime} variables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a single segment. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set Format to m3u8.</p>
         * </blockquote>
         * <p>If you do not specify this parameter, the default value 30 seconds is used. Valid values: 5 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The name of the TS segment.</p>
         * <blockquote>
         * <p> This parameter is required only if you set Format to m3u8.</p>
         * </blockquote>
         * <ul>
         * <li>By default, the duration of a segment is 30 seconds. The segment name must be less than 256 bytes in length and can contain the {JobId}, {UnixTimestamp}, and {Sequence} variables.</li>
         * <li>The segment name must contain the {UnixTimestamp} and {Sequence} variables.</li>
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
