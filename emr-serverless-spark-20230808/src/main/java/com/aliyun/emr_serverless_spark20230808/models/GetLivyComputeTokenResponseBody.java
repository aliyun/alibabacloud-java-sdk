// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetLivyComputeTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetLivyComputeTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>484D9DDA-300D-525E-AF7A-0CCCA5C64A7A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetLivyComputeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLivyComputeTokenResponseBody self = new GetLivyComputeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLivyComputeTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLivyComputeTokenResponseBody setData(GetLivyComputeTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLivyComputeTokenResponseBodyData getData() {
        return this.data;
    }

    public GetLivyComputeTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLivyComputeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("expireDays")
        public Integer expireDays;

        public static GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration self = new GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration();
            return TeaModel.build(map, self);
        }

        public GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

    }

    public static class GetLivyComputeTokenResponseBodyData extends TeaModel {
        @NameInMap("autoExpireConfiguration")
        public GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration autoExpireConfiguration;

        /**
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <strong>example:</strong>
         * <p>1749457994000</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>1749456098000</p>
         */
        @NameInMap("lastUsedTime")
        public Long lastUsedTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>d25561157a635bb</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>Token ID。</p>
         * 
         * <strong>example:</strong>
         * <p>lctk-xxxxxxxxxx</p>
         */
        @NameInMap("tokenId")
        public String tokenId;

        public static GetLivyComputeTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLivyComputeTokenResponseBodyData self = new GetLivyComputeTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLivyComputeTokenResponseBodyData setAutoExpireConfiguration(GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration autoExpireConfiguration) {
            this.autoExpireConfiguration = autoExpireConfiguration;
            return this;
        }
        public GetLivyComputeTokenResponseBodyDataAutoExpireConfiguration getAutoExpireConfiguration() {
            return this.autoExpireConfiguration;
        }

        public GetLivyComputeTokenResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLivyComputeTokenResponseBodyData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetLivyComputeTokenResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetLivyComputeTokenResponseBodyData setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public GetLivyComputeTokenResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLivyComputeTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetLivyComputeTokenResponseBodyData setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
