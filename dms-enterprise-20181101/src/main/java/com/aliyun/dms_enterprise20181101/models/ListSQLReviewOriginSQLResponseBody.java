// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("OriginSQLList")
    public java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> originSQLList;

    public static ListSQLReviewOriginSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLResponseBody self = new ListSQLReviewOriginSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSQLReviewOriginSQLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSQLReviewOriginSQLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSQLReviewOriginSQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSQLReviewOriginSQLResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSQLReviewOriginSQLResponseBody setOriginSQLList(java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> originSQLList) {
        this.originSQLList = originSQLList;
        return this;
    }
    public java.util.List<ListSQLReviewOriginSQLResponseBodyOriginSQLList> getOriginSQLList() {
        return this.originSQLList;
    }

    public static class ListSQLReviewOriginSQLResponseBodyOriginSQLList extends TeaModel {
        @NameInMap("SQLId")
        public Long SQLId;

        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("SQLContent")
        public String SQLContent;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("CheckedTime")
        public String checkedTime;

        @NameInMap("SqlHash")
        public String sqlHash;

        @NameInMap("ReviewSummary")
        public String reviewSummary;

        @NameInMap("SQLReviewQueryKey")
        public String SQLReviewQueryKey;

        public static ListSQLReviewOriginSQLResponseBodyOriginSQLList build(java.util.Map<String, ?> map) throws Exception {
            ListSQLReviewOriginSQLResponseBodyOriginSQLList self = new ListSQLReviewOriginSQLResponseBodyOriginSQLList();
            return TeaModel.build(map, self);
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLId(Long SQLId) {
            this.SQLId = SQLId;
            return this;
        }
        public Long getSQLId() {
            return this.SQLId;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLContent(String SQLContent) {
            this.SQLContent = SQLContent;
            return this;
        }
        public String getSQLContent() {
            return this.SQLContent;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setCheckedTime(String checkedTime) {
            this.checkedTime = checkedTime;
            return this;
        }
        public String getCheckedTime() {
            return this.checkedTime;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSqlHash(String sqlHash) {
            this.sqlHash = sqlHash;
            return this;
        }
        public String getSqlHash() {
            return this.sqlHash;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setReviewSummary(String reviewSummary) {
            this.reviewSummary = reviewSummary;
            return this;
        }
        public String getReviewSummary() {
            return this.reviewSummary;
        }

        public ListSQLReviewOriginSQLResponseBodyOriginSQLList setSQLReviewQueryKey(String SQLReviewQueryKey) {
            this.SQLReviewQueryKey = SQLReviewQueryKey;
            return this;
        }
        public String getSQLReviewQueryKey() {
            return this.SQLReviewQueryKey;
        }

    }

}
