// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Session")
    public DescribeSessionResponseBodySession session;

    public static DescribeSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionResponseBody self = new DescribeSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSessionResponseBody setSession(DescribeSessionResponseBodySession session) {
        this.session = session;
        return this;
    }
    public DescribeSessionResponseBodySession getSession() {
        return this.session;
    }

    public static class DescribeSessionResponseBodySession extends TeaModel {
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

        public static DescribeSessionResponseBodySession build(java.util.Map<String, ?> map) throws Exception {
            DescribeSessionResponseBodySession self = new DescribeSessionResponseBodySession();
            return TeaModel.build(map, self);
        }

        public DescribeSessionResponseBodySession setTTL(Integer TTL) {
            this.TTL = TTL;
            return this;
        }
        public Integer getTTL() {
            return this.TTL;
        }

        public DescribeSessionResponseBodySession setExpired(Integer expired) {
            this.expired = expired;
            return this;
        }
        public Integer getExpired() {
            return this.expired;
        }

        public DescribeSessionResponseBodySession setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public DescribeSessionResponseBodySession setAliUid(Integer aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Integer getAliUid() {
            return this.aliUid;
        }

        public DescribeSessionResponseBodySession setModifiedAt(Long modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public Long getModifiedAt() {
            return this.modifiedAt;
        }

        public DescribeSessionResponseBodySession setLoginSession(String loginSession) {
            this.loginSession = loginSession;
            return this;
        }
        public String getLoginSession() {
            return this.loginSession;
        }

        public DescribeSessionResponseBodySession setSessionId(Integer sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Integer getSessionId() {
            return this.sessionId;
        }

        public DescribeSessionResponseBodySession setAsset(String asset) {
            this.asset = asset;
            return this;
        }
        public String getAsset() {
            return this.asset;
        }

    }

}
