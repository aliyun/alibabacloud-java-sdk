// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeTokenResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 1000000 indicates that the request was successful. Other values indicate that the request failed. See the message parameter for failure details.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListLivyComputeTokenResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListLivyComputeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeTokenResponseBody self = new ListLivyComputeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLivyComputeTokenResponseBody setData(ListLivyComputeTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLivyComputeTokenResponseBodyData getData() {
        return this.data;
    }

    public ListLivyComputeTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLivyComputeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLivyComputeTokenResponseBodyDataTokens extends TeaModel {
        /**
         * <p>The time when the token was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The user who created the token.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("createdby")
        public String createdby;

        /**
         * <p>The time when the token expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456994000</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <p>The time when the token was last used.</p>
         * 
         * <strong>example:</strong>
         * <p>1749456098000</p>
         */
        @NameInMap("lastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The token name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The token content.</p>
         * 
         * <strong>example:</strong>
         * <p>5d37843fb6f1e8</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The token ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lctk-xxxxxxxxxxx</p>
         */
        @NameInMap("tokenId")
        public String tokenId;

        public static ListLivyComputeTokenResponseBodyDataTokens build(java.util.Map<String, ?> map) throws Exception {
            ListLivyComputeTokenResponseBodyDataTokens self = new ListLivyComputeTokenResponseBodyDataTokens();
            return TeaModel.build(map, self);
        }

        public ListLivyComputeTokenResponseBodyDataTokens setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListLivyComputeTokenResponseBodyDataTokens setCreatedby(String createdby) {
            this.createdby = createdby;
            return this;
        }
        public String getCreatedby() {
            return this.createdby;
        }

        public ListLivyComputeTokenResponseBodyDataTokens setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListLivyComputeTokenResponseBodyDataTokens setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListLivyComputeTokenResponseBodyDataTokens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLivyComputeTokenResponseBodyDataTokens setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListLivyComputeTokenResponseBodyDataTokens setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

    public static class ListLivyComputeTokenResponseBodyData extends TeaModel {
        /**
         * <p>The list of tokens.</p>
         */
        @NameInMap("tokens")
        public java.util.List<ListLivyComputeTokenResponseBodyDataTokens> tokens;

        public static ListLivyComputeTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLivyComputeTokenResponseBodyData self = new ListLivyComputeTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLivyComputeTokenResponseBodyData setTokens(java.util.List<ListLivyComputeTokenResponseBodyDataTokens> tokens) {
            this.tokens = tokens;
            return this;
        }
        public java.util.List<ListLivyComputeTokenResponseBodyDataTokens> getTokens() {
            return this.tokens;
        }

    }

}
