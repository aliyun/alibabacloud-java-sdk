// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiTokenResponseBody extends TeaModel {
    @NameInMap("data")
    public ListKyuubiTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListKyuubiTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiTokenResponseBody self = new ListKyuubiTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKyuubiTokenResponseBody setData(ListKyuubiTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKyuubiTokenResponseBodyData getData() {
        return this.data;
    }

    public ListKyuubiTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKyuubiTokenResponseBodyDataTokens extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-02-11T02:23:02Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <strong>example:</strong>
         * <p>1740366769165</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>1740366232121</p>
         */
        @NameInMap("lastUsedTime")
        public Long lastUsedTime;

        /**
         * <strong>example:</strong>
         * <p>dev_serveless_spark</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>f14c1347-dcfd-4082-b101-77aa96b5de36</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>Token ID。</p>
         * 
         * <strong>example:</strong>
         * <p>f14c1347-dcfd-4082-b101-77aa96b5de36</p>
         */
        @NameInMap("tokenId")
        public String tokenId;

        public static ListKyuubiTokenResponseBodyDataTokens build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiTokenResponseBodyDataTokens self = new ListKyuubiTokenResponseBodyDataTokens();
            return TeaModel.build(map, self);
        }

        public ListKyuubiTokenResponseBodyDataTokens setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKyuubiTokenResponseBodyDataTokens setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListKyuubiTokenResponseBodyDataTokens setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListKyuubiTokenResponseBodyDataTokens setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListKyuubiTokenResponseBodyDataTokens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKyuubiTokenResponseBodyDataTokens setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListKyuubiTokenResponseBodyDataTokens setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

    public static class ListKyuubiTokenResponseBodyData extends TeaModel {
        @NameInMap("tokens")
        public java.util.List<ListKyuubiTokenResponseBodyDataTokens> tokens;

        public static ListKyuubiTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKyuubiTokenResponseBodyData self = new ListKyuubiTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKyuubiTokenResponseBodyData setTokens(java.util.List<ListKyuubiTokenResponseBodyDataTokens> tokens) {
            this.tokens = tokens;
            return this;
        }
        public java.util.List<ListKyuubiTokenResponseBodyDataTokens> getTokens() {
            return this.tokens;
        }

    }

}
