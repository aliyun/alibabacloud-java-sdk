// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeRoutineRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public java.util.List<ListEdgeRoutineRecordsResponseBodyRecords> records;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>121</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEdgeRoutineRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeRoutineRecordsResponseBody self = new ListEdgeRoutineRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeRoutineRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeRoutineRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeRoutineRecordsResponseBody setRecords(java.util.List<ListEdgeRoutineRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListEdgeRoutineRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListEdgeRoutineRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeRoutineRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEdgeRoutineRecordsResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>a.example.com.cnamezone.com</p>
         */
        @NameInMap("RecordCname")
        public String recordCname;

        /**
         * <strong>example:</strong>
         * <p>a.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>5407498413****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <strong>example:</strong>
         * <p>2023-12-22T08:32:02Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListEdgeRoutineRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeRoutineRecordsResponseBodyRecords self = new ListEdgeRoutineRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListEdgeRoutineRecordsResponseBodyRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEdgeRoutineRecordsResponseBodyRecords setRecordCname(String recordCname) {
            this.recordCname = recordCname;
            return this;
        }
        public String getRecordCname() {
            return this.recordCname;
        }

        public ListEdgeRoutineRecordsResponseBodyRecords setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListEdgeRoutineRecordsResponseBodyRecords setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListEdgeRoutineRecordsResponseBodyRecords setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListEdgeRoutineRecordsResponseBodyRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
