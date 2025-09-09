// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetKyuubiTokenResponseBody extends TeaModel {
    @NameInMap("data")
    public GetKyuubiTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetKyuubiTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKyuubiTokenResponseBody self = new GetKyuubiTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKyuubiTokenResponseBody setData(GetKyuubiTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKyuubiTokenResponseBodyData getData() {
        return this.data;
    }

    public GetKyuubiTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetKyuubiTokenResponseBodyDataAutoExpireConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("expireDays")
        public Integer expireDays;

        public static GetKyuubiTokenResponseBodyDataAutoExpireConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetKyuubiTokenResponseBodyDataAutoExpireConfiguration self = new GetKyuubiTokenResponseBodyDataAutoExpireConfiguration();
            return TeaModel.build(map, self);
        }

        public GetKyuubiTokenResponseBodyDataAutoExpireConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetKyuubiTokenResponseBodyDataAutoExpireConfiguration setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

    }

    public static class GetKyuubiTokenResponseBodyData extends TeaModel {
        @NameInMap("autoExpireConfiguration")
        public GetKyuubiTokenResponseBodyDataAutoExpireConfiguration autoExpireConfiguration;

        /**
         * <strong>example:</strong>
         * <p>1749456094000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <strong>example:</strong>
         * <p>1753932319390</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>1749456098000</p>
         */
        @NameInMap("lastUsedTime")
        public Long lastUsedTime;

        @NameInMap("memberArns")
        public java.util.List<String> memberArns;

        /**
         * <strong>example:</strong>
         * <p>dev_serverless_spark</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>dxj**********wfg</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>Token ID。</p>
         * 
         * <strong>example:</strong>
         * <p>tk-zpi0*****hdv4y</p>
         */
        @NameInMap("tokenId")
        public String tokenId;

        public static GetKyuubiTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKyuubiTokenResponseBodyData self = new GetKyuubiTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKyuubiTokenResponseBodyData setAutoExpireConfiguration(GetKyuubiTokenResponseBodyDataAutoExpireConfiguration autoExpireConfiguration) {
            this.autoExpireConfiguration = autoExpireConfiguration;
            return this;
        }
        public GetKyuubiTokenResponseBodyDataAutoExpireConfiguration getAutoExpireConfiguration() {
            return this.autoExpireConfiguration;
        }

        public GetKyuubiTokenResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetKyuubiTokenResponseBodyData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetKyuubiTokenResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetKyuubiTokenResponseBodyData setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public GetKyuubiTokenResponseBodyData setMemberArns(java.util.List<String> memberArns) {
            this.memberArns = memberArns;
            return this;
        }
        public java.util.List<String> getMemberArns() {
            return this.memberArns;
        }

        public GetKyuubiTokenResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKyuubiTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetKyuubiTokenResponseBodyData setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
