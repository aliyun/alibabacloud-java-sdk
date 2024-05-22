// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateResponseBody extends TeaModel {
    /**
     * <p>录制模板</p>
     */
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

        /**
         * <p>格式</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Oss对象名，不包含后缀</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>切片Oss对象名，不包含后缀</p>
         */
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
        /**
         * <p>代表创建时间的资源属性字段</p>
         * <br>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * <br>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>录制格式</p>
         */
        @NameInMap("RecordFormatList")
        public java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> recordFormatList;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
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
