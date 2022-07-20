// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    // 数组，返回示例目录。
    @NameInMap("RecordTemplateList")
    public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateList> recordTemplateList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SortBy")
    public String sortBy;

    // 总记录数。
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLiveRecordTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordTemplatesResponseBody self = new ListLiveRecordTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordTemplatesResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLiveRecordTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLiveRecordTemplatesResponseBody setRecordTemplateList(java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateList> recordTemplateList) {
        this.recordTemplateList = recordTemplateList;
        return this;
    }
    public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateList> getRecordTemplateList() {
        return this.recordTemplateList;
    }

    public ListLiveRecordTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRecordTemplatesResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveRecordTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList extends TeaModel {
        // 录制周期时长
        @NameInMap("CycleDuration")
        public byte[] cycleDuration;

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

        public static ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList self = new ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setCycleDuration(byte[] cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public byte[] getCycleDuration() {
            return this.cycleDuration;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setFormat(byte[] format) {
            this.format = format;
            return this;
        }
        public byte[] getFormat() {
            return this.format;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setOssObjectPrefix(byte[] ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public byte[] getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setSliceOssObjectPrefix(byte[] sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public byte[] getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class ListLiveRecordTemplatesResponseBodyRecordTemplateList extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 最后修改时间
        @NameInMap("LastModified")
        public String lastModified;

        // 资源名称
        @NameInMap("Name")
        public byte[] name;

        // 录制格式
        @NameInMap("RecordFormatList")
        public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList> recordFormatList;

        // 资源一级ID
        @NameInMap("TemplateId")
        public byte[] templateId;

        // 资源名称
        @NameInMap("Type")
        public byte[] type;

        public static ListLiveRecordTemplatesResponseBodyRecordTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordTemplatesResponseBodyRecordTemplateList self = new ListLiveRecordTemplatesResponseBodyRecordTemplateList();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setName(byte[] name) {
            this.name = name;
            return this;
        }
        public byte[] getName() {
            return this.name;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setRecordFormatList(java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList> recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList> getRecordFormatList() {
            return this.recordFormatList;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setTemplateId(byte[] templateId) {
            this.templateId = templateId;
            return this;
        }
        public byte[] getTemplateId() {
            return this.templateId;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setType(byte[] type) {
            this.type = type;
            return this;
        }
        public byte[] getType() {
            return this.type;
        }

    }

}
