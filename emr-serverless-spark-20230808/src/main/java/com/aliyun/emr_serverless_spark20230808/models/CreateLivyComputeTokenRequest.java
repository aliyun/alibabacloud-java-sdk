// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateLivyComputeTokenRequest extends TeaModel {
    /**
     * <p>The token expiration information struct.</p>
     */
    @NameInMap("autoExpireConfiguration")
    public CreateLivyComputeTokenRequestAutoExpireConfiguration autoExpireConfiguration;

    /**
     * <p>The token name.</p>
     * 
     * <strong>example:</strong>
     * <p>mytoken</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The token content. The length must be 16 or more characters.</p>
     * 
     * <strong>example:</strong>
     * <p>gs3fy75w4o7hqe5s</p>
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

    public static CreateLivyComputeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivyComputeTokenRequest self = new CreateLivyComputeTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivyComputeTokenRequest setAutoExpireConfiguration(CreateLivyComputeTokenRequestAutoExpireConfiguration autoExpireConfiguration) {
        this.autoExpireConfiguration = autoExpireConfiguration;
        return this;
    }
    public CreateLivyComputeTokenRequestAutoExpireConfiguration getAutoExpireConfiguration() {
        return this.autoExpireConfiguration;
    }

    public CreateLivyComputeTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLivyComputeTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateLivyComputeTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateLivyComputeTokenRequestAutoExpireConfiguration extends TeaModel {
        /**
         * <p>Specifies whether the token automatically expires.</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
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

        public static CreateLivyComputeTokenRequestAutoExpireConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateLivyComputeTokenRequestAutoExpireConfiguration self = new CreateLivyComputeTokenRequestAutoExpireConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateLivyComputeTokenRequestAutoExpireConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateLivyComputeTokenRequestAutoExpireConfiguration setExpireDays(Integer expireDays) {
            this.expireDays = expireDays;
            return this;
        }
        public Integer getExpireDays() {
            return this.expireDays;
        }

    }

}
