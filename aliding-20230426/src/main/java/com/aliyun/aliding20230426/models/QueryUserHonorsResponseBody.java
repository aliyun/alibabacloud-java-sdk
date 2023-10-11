// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryUserHonorsResponseBody extends TeaModel {
    @NameInMap("honors")
    public java.util.List<QueryUserHonorsResponseBodyHonors> honors;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryUserHonorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserHonorsResponseBody self = new QueryUserHonorsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserHonorsResponseBody setHonors(java.util.List<QueryUserHonorsResponseBodyHonors> honors) {
        this.honors = honors;
        return this;
    }
    public java.util.List<QueryUserHonorsResponseBodyHonors> getHonors() {
        return this.honors;
    }

    public QueryUserHonorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryUserHonorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUserHonorsResponseBodyHonorsGrantHistory extends TeaModel {
        @NameInMap("grantTime")
        public Long grantTime;

        @NameInMap("senderUserid")
        public String senderUserid;

        public static QueryUserHonorsResponseBodyHonorsGrantHistory build(java.util.Map<String, ?> map) throws Exception {
            QueryUserHonorsResponseBodyHonorsGrantHistory self = new QueryUserHonorsResponseBodyHonorsGrantHistory();
            return TeaModel.build(map, self);
        }

        public QueryUserHonorsResponseBodyHonorsGrantHistory setGrantTime(Long grantTime) {
            this.grantTime = grantTime;
            return this;
        }
        public Long getGrantTime() {
            return this.grantTime;
        }

        public QueryUserHonorsResponseBodyHonorsGrantHistory setSenderUserid(String senderUserid) {
            this.senderUserid = senderUserid;
            return this;
        }
        public String getSenderUserid() {
            return this.senderUserid;
        }

    }

    public static class QueryUserHonorsResponseBodyHonors extends TeaModel {
        @NameInMap("expirationTime")
        public Long expirationTime;

        @NameInMap("grantHistory")
        public java.util.List<QueryUserHonorsResponseBodyHonorsGrantHistory> grantHistory;

        @NameInMap("honorDesc")
        public String honorDesc;

        @NameInMap("honorId")
        public String honorId;

        @NameInMap("honorName")
        public String honorName;

        public static QueryUserHonorsResponseBodyHonors build(java.util.Map<String, ?> map) throws Exception {
            QueryUserHonorsResponseBodyHonors self = new QueryUserHonorsResponseBodyHonors();
            return TeaModel.build(map, self);
        }

        public QueryUserHonorsResponseBodyHonors setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public QueryUserHonorsResponseBodyHonors setGrantHistory(java.util.List<QueryUserHonorsResponseBodyHonorsGrantHistory> grantHistory) {
            this.grantHistory = grantHistory;
            return this;
        }
        public java.util.List<QueryUserHonorsResponseBodyHonorsGrantHistory> getGrantHistory() {
            return this.grantHistory;
        }

        public QueryUserHonorsResponseBodyHonors setHonorDesc(String honorDesc) {
            this.honorDesc = honorDesc;
            return this;
        }
        public String getHonorDesc() {
            return this.honorDesc;
        }

        public QueryUserHonorsResponseBodyHonors setHonorId(String honorId) {
            this.honorId = honorId;
            return this;
        }
        public String getHonorId() {
            return this.honorId;
        }

        public QueryUserHonorsResponseBodyHonors setHonorName(String honorName) {
            this.honorName = honorName;
            return this;
        }
        public String getHonorName() {
            return this.honorName;
        }

    }

}
