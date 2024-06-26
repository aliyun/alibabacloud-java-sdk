// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RecordTemplateList")
    public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateList> recordTemplateList;

    /**
     * <strong>example:</strong>
     * <p>BEA98A0C-7870-15FE-B96F-8880BB600A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>格式</p>
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

        public static ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList self = new ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class ListLiveRecordTemplatesResponseBodyRecordTemplateList extends TeaModel {
        /**
         * <p>代表创建时间的资源属性字段</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T02:48:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>最后修改时间</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T03:26:36Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>test template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>录制格式</p>
         */
        @NameInMap("RecordFormatList")
        public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList> recordFormatList;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Type")
        public String type;

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

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setRecordFormatList(java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList> recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public java.util.List<ListLiveRecordTemplatesResponseBodyRecordTemplateListRecordFormatList> getRecordFormatList() {
            return this.recordFormatList;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLiveRecordTemplatesResponseBodyRecordTemplateList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
