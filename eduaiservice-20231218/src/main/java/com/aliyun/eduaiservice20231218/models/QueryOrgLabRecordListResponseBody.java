// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduaiservice20231218.models;

import com.aliyun.tea.*;

public class QueryOrgLabRecordListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryOrgLabRecordListResponseBodyData> data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrgLabRecordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgLabRecordListResponseBody self = new QueryOrgLabRecordListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrgLabRecordListResponseBody setData(java.util.List<QueryOrgLabRecordListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOrgLabRecordListResponseBodyData> getData() {
        return this.data;
    }

    public QueryOrgLabRecordListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryOrgLabRecordListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryOrgLabRecordListResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryOrgLabRecordListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrgLabRecordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrgLabRecordListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrgLabRecordListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrgLabRecordListResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("LabRecordId")
        public String labRecordId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubmittedAt")
        public Long submittedAt;

        public static QueryOrgLabRecordListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrgLabRecordListResponseBodyData self = new QueryOrgLabRecordListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrgLabRecordListResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryOrgLabRecordListResponseBodyData setLabRecordId(String labRecordId) {
            this.labRecordId = labRecordId;
            return this;
        }
        public String getLabRecordId() {
            return this.labRecordId;
        }

        public QueryOrgLabRecordListResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOrgLabRecordListResponseBodyData setSubmittedAt(Long submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }
        public Long getSubmittedAt() {
            return this.submittedAt;
        }

    }

}
