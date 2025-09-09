// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateKyuubiTokenRequest extends TeaModel {
    @NameInMap("autoExpireConfiguration")
    public UpdateKyuubiTokenRequestAutoExpireConfiguration autoExpireConfiguration;

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

    public static UpdateKyuubiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKyuubiTokenRequest self = new UpdateKyuubiTokenRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKyuubiTokenRequest setAutoExpireConfiguration(UpdateKyuubiTokenRequestAutoExpireConfiguration autoExpireConfiguration) {
        this.autoExpireConfiguration = autoExpireConfiguration;
        return this;
    }
    public UpdateKyuubiTokenRequestAutoExpireConfiguration getAutoExpireConfiguration() {
        return this.autoExpireConfiguration;
    }

    public UpdateKyuubiTokenRequest setMemberArns(java.util.List<String> memberArns) {
        this.memberArns = memberArns;
        return this;
    }
    public java.util.List<String> getMemberArns() {
        return this.memberArns;
    }

    public UpdateKyuubiTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKyuubiTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateKyuubiTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateKyuubiTokenRequestAutoExpireConfiguration extends TeaModel {
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

        public static UpdateKyuubiTokenRequestAutoExpireConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateKyuubiTokenRequestAutoExpireConfiguration self = new UpdateKyuubiTokenRequestAutoExpireConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateKyuubiTokenRequestAutoExpireConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateKyuubiTokenRequestAutoExpireConfiguration setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

    }

}
