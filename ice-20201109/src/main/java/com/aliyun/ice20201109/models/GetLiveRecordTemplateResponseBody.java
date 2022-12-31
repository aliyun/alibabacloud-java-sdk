// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateResponseBody extends TeaModel {
    // 录制模板
    @NameInMap("RecordTemplate")
    public GetLiveRecordTemplateResponseBodyRecordTemplate recordTemplate;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordTemplateResponseBody self = new GetLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordTemplateResponseBody setRecordTemplate(GetLiveRecordTemplateResponseBodyRecordTemplate recordTemplate) {
        this.recordTemplate = recordTemplate;
        return this;
    }
    public GetLiveRecordTemplateResponseBodyRecordTemplate getRecordTemplate() {
        return this.recordTemplate;
    }

    public GetLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList extends TeaModel {
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        // 格式
        @NameInMap("Format")
        public String format;

        // Oss对象名，不包含后缀
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        // 切片Oss对象名，不包含后缀
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList self = new GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class GetLiveRecordTemplateResponseBodyRecordTemplate extends TeaModel {
        // 代表创建时间的资源属性字段
        @NameInMap("CreateTime")
        public String createTime;

        // 代表创建时间的资源属性字段
        @NameInMap("LastModified")
        public String lastModified;

        // 代表资源名称的资源属性字段
        @NameInMap("Name")
        public String name;

        // 录制格式
        @NameInMap("RecordFormatList")
        public java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> recordFormatList;

        // 代表资源一级ID的资源属性字段
        @NameInMap("TemplateId")
        public String templateId;

        // 代表资源名称的资源属性字段
        @NameInMap("Type")
        public String type;

        public static GetLiveRecordTemplateResponseBodyRecordTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyRecordTemplate self = new GetLiveRecordTemplateResponseBodyRecordTemplate();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setRecordFormatList(java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> getRecordFormatList() {
            return this.recordFormatList;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
