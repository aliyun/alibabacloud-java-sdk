// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class QuerySyncStatusByAliUidResponseBody extends TeaModel {
    /**
     * <p>System status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QuerySyncStatusByAliUidResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <p>Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>131239236086****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The enterprise ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cdrs948144195608****</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-30 07:50:42</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The updated at time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-02 14:27:39</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Auto increment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18500</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The latest start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-02 14:31:39</p>
         */
        @NameInMap("LatestBeginTime")
        public String latestBeginTime;

        /**
         * <p>The latest end time, regardless of whether the operation succeeded or failed.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-02 16:13:12</p>
         */
        @NameInMap("LatestEndTime")
        public String latestEndTime;

        /**
         * <p>The latest success time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-02 18:24:01</p>
         */
        @NameInMap("LatestSuccessTime")
        public String latestSuccessTime;

        /**
         * <p>The user synchronization status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
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
