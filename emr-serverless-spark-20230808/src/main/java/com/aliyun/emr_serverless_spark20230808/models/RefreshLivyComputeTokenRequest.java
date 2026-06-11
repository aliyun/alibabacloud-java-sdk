// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class RefreshLivyComputeTokenRequest extends TeaModel {
    /**
     * <p>The information about token expiration.</p>
     */
    @NameInMap("autoExpireConfiguration")
    public RefreshLivyComputeTokenRequestAutoExpireConfiguration autoExpireConfiguration;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The token must be 16 or more characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>fe86812667f04v343</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static RefreshLivyComputeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshLivyComputeTokenRequest self = new RefreshLivyComputeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshLivyComputeTokenRequest setAutoExpireConfiguration(RefreshLivyComputeTokenRequestAutoExpireConfiguration autoExpireConfiguration) {
        this.autoExpireConfiguration = autoExpireConfiguration;
        return this;
    }
    public RefreshLivyComputeTokenRequestAutoExpireConfiguration getAutoExpireConfiguration() {
        return this.autoExpireConfiguration;
    }

    public RefreshLivyComputeTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RefreshLivyComputeTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RefreshLivyComputeTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class RefreshLivyComputeTokenRequestAutoExpireConfiguration extends TeaModel {
        /**
         * <p>Specifies whether the token automatically expires.</p>
         * <ul>
         * <li><p>true: The token automatically expires.</p>
         * </li>
         * <li><p>false: The token does not automatically expire.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The expiration period in days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("expireDays")
        public Integer expireDays;

        public static RefreshLivyComputeTokenRequestAutoExpireConfiguration build(java.util.Map<String, ?> map) throws Exception {
            RefreshLivyComputeTokenRequestAutoExpireConfiguration self = new RefreshLivyComputeTokenRequestAutoExpireConfiguration();
            return TeaModel.build(map, self);
        }

        public RefreshLivyComputeTokenRequestAutoExpireConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public RefreshLivyComputeTokenRequestAutoExpireConfiguration setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

    }

}
