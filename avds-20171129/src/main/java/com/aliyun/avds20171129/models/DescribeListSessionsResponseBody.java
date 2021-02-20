// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeListSessionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Sessions")
    public java.util.List<DescribeListSessionsResponseBodySessions> sessions;

    public static DescribeListSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListSessionsResponseBody self = new DescribeListSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListSessionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeListSessionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeListSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListSessionsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeListSessionsResponseBody setSessions(java.util.List<DescribeListSessionsResponseBodySessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DescribeListSessionsResponseBodySessions> getSessions() {
        return this.sessions;
    }

    public static class DescribeListSessionsResponseBodySessions extends TeaModel {
        @NameInMap("TTL")
        public Integer TTL;

        @NameInMap("Expired")
        public Integer expired;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("AliUid")
        public Integer aliUid;

        @NameInMap("ModifiedAt")
        public Long modifiedAt;

        @NameInMap("LoginSession")
        public String loginSession;

        @NameInMap("SessionId")
        public Integer sessionId;

        @NameInMap("Asset")
        public String asset;

        public static DescribeListSessionsResponseBodySessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeListSessionsResponseBodySessions self = new DescribeListSessionsResponseBodySessions();
            return TeaModel.build(map, self);
        }

        public DescribeListSessionsResponseBodySessions setTTL(Integer TTL) {
            this.TTL = TTL;
            return this;
        }
        public Integer getTTL() {
            return this.TTL;
        }

        public DescribeListSessionsResponseBodySessions setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeListSessionsResponseBodySessions setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public DescribeListSessionsResponseBodySessions setAliUid(Integer aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Integer getAliUid() {
            return this.aliUid;
        }

        public DescribeListSessionsResponseBodySessions setModifiedAt(Long modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public Long getModifiedAt() {
            return this.modifiedAt;
        }

        public DescribeListSessionsResponseBodySessions setLoginSession(String loginSession) {
            this.loginSession = loginSession;
            return this;
        }
        public String getLoginSession() {
            return this.loginSession;
        }

        public DescribeListSessionsResponseBodySessions setSessionId(Integer sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Integer getSessionId() {
            return this.sessionId;
        }

        public DescribeListSessionsResponseBodySessions setAsset(String asset) {
            this.asset = asset;
            return this;
        }
        public String getAsset() {
            return this.asset;
        }

    }

}
