// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateRequest extends TeaModel {
    // 资源名称
    @NameInMap("Name")
    public byte[] name;

    // 录制格式
    @NameInMap("RecordFormat")
    public java.util.List<CreateLiveRecordTemplateRequestRecordFormat> recordFormat;

    public static CreateLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateRequest self = new CreateLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateRequest setName(byte[] name) {
        this.name = name;
        return this;
    }
    public byte[] getName() {
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
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        // 格式
        @NameInMap("Format")
        public byte[] format;

        // Oss对象名
        @NameInMap("OssObjectPrefix")
        public byte[] ossObjectPrefix;

        // 切片时长
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        // 切片Oss对象名
        @NameInMap("SliceOssObjectPrefix")
        public byte[] sliceOssObjectPrefix;

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

        public CreateLiveRecordTemplateRequestRecordFormat setFormat(byte[] format) {
            this.format = format;
            return this;
        }
        public byte[] getFormat() {
            return this.format;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setOssObjectPrefix(byte[] ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public byte[] getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public CreateLiveRecordTemplateRequestRecordFormat setSliceOssObjectPrefix(byte[] sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public byte[] getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

}
