// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateKyuubiTokenRequest extends TeaModel {
    @NameInMap("autoExpireConfiguration")
    public CreateKyuubiTokenRequestAutoExpireConfiguration autoExpireConfiguration;

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
     * <p>rjy7ejhej9gkzjjuun49jnx2xk8if2cu</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateKyuubiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKyuubiTokenRequest self = new CreateKyuubiTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateKyuubiTokenRequest setAutoExpireConfiguration(CreateKyuubiTokenRequestAutoExpireConfiguration autoExpireConfiguration) {
        this.autoExpireConfiguration = autoExpireConfiguration;
        return this;
    }
    public CreateKyuubiTokenRequestAutoExpireConfiguration getAutoExpireConfiguration() {
        return this.autoExpireConfiguration;
    }

    public CreateKyuubiTokenRequest setMemberArns(java.util.List<String> memberArns) {
        this.memberArns = memberArns;
        return this;
    }
    public java.util.List<String> getMemberArns() {
        return this.memberArns;
    }

    public CreateKyuubiTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKyuubiTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateKyuubiTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateKyuubiTokenRequestAutoExpireConfiguration extends TeaModel {
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

        public static CreateKyuubiTokenRequestAutoExpireConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateKyuubiTokenRequestAutoExpireConfiguration self = new CreateKyuubiTokenRequestAutoExpireConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateKyuubiTokenRequestAutoExpireConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateKyuubiTokenRequestAutoExpireConfiguration setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

    }

}
