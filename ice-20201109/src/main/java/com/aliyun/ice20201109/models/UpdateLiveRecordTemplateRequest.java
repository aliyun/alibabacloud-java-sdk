// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateRequest extends TeaModel {
    // 代表资源名称的资源属性字段
    @NameInMap("Name")
    public String name;

    // 录制格式
    @NameInMap("RecordFormat")
    public java.util.List<UpdateLiveRecordTemplateRequestRecordFormat> recordFormat;

    // 代表资源一级ID的资源属性字段
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
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        // 格式
        @NameInMap("Format")
        public String format;

        // Oss对象名，不包含后缀
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        // 切片时长
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        // 切片Oss对象名，不包含后缀
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
