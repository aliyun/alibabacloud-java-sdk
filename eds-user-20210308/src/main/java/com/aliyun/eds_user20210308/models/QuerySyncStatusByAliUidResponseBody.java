// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class QuerySyncStatusByAliUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySyncStatusByAliUidResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySyncStatusByAliUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncStatusByAliUidResponseBody self = new QuerySyncStatusByAliUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySyncStatusByAliUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySyncStatusByAliUidResponseBody setData(QuerySyncStatusByAliUidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySyncStatusByAliUidResponseBodyData getData() {
        return this.data;
    }

    public QuerySyncStatusByAliUidResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySyncStatusByAliUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySyncStatusByAliUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySyncStatusByAliUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySyncStatusByAliUidResponseBodyData extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LatestBeginTime")
        public String latestBeginTime;

        @NameInMap("LatestEndTime")
        public String latestEndTime;

        @NameInMap("LatestSuccessTime")
        public String latestSuccessTime;

        @NameInMap("Status")
        public String status;

        public static QuerySyncStatusByAliUidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySyncStatusByAliUidResponseBodyData self = new QuerySyncStatusByAliUidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySyncStatusByAliUidResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public QuerySyncStatusByAliUidResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public QuerySyncStatusByAliUidResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public QuerySyncStatusByAliUidResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QuerySyncStatusByAliUidResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySyncStatusByAliUidResponseBodyData setLatestBeginTime(String latestBeginTime) {
            this.latestBeginTime = latestBeginTime;
            return this;
        }
        public String getLatestBeginTime() {
            return this.latestBeginTime;
        }

        public QuerySyncStatusByAliUidResponseBodyData setLatestEndTime(String latestEndTime) {
            this.latestEndTime = latestEndTime;
            return this;
        }
        public String getLatestEndTime() {
            return this.latestEndTime;
        }

        public QuerySyncStatusByAliUidResponseBodyData setLatestSuccessTime(String latestSuccessTime) {
            this.latestSuccessTime = latestSuccessTime;
            return this;
        }
        public String getLatestSuccessTime() {
            return this.latestSuccessTime;
        }

        public QuerySyncStatusByAliUidResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
