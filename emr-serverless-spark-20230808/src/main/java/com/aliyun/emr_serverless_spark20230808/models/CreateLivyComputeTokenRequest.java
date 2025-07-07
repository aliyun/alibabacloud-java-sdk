// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateLivyComputeTokenRequest extends TeaModel {
    @NameInMap("autoExpireConfiguration")
    public CreateLivyComputeTokenRequestAutoExpireConfiguration autoExpireConfiguration;

    /**
     * <strong>example:</strong>
     * <p>mytoken</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>gs3fy75w4o7hqe5s</p>
     */
    @NameInMap("token")
    public String token;

    /**
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
