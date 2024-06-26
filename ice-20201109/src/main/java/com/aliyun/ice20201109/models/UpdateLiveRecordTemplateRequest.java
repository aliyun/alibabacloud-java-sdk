// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateRequest extends TeaModel {
    /**
     * <p>代表资源名称的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>录制格式</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordFormat")
    public java.util.List<UpdateLiveRecordTemplateRequestRecordFormat> recordFormat;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateRequest self = new UpdateLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveRecordTemplateRequest setRecordFormat(java.util.List<UpdateLiveRecordTemplateRequestRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }
    public java.util.List<UpdateLiveRecordTemplateRequestRecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public UpdateLiveRecordTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class UpdateLiveRecordTemplateRequestRecordFormat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>格式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Oss对象名，不包含后缀</p>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>切片时长</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>切片Oss对象名，不包含后缀</p>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static UpdateLiveRecordTemplateRequestRecordFormat build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTemplateRequestRecordFormat self = new UpdateLiveRecordTemplateRequestRecordFormat();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTemplateRequestRecordFormat setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public UpdateLiveRecordTemplateRequestRecordFormat setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public UpdateLiveRecordTemplateRequestRecordFormat setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public UpdateLiveRecordTemplateRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public UpdateLiveRecordTemplateRequestRecordFormat setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

}
