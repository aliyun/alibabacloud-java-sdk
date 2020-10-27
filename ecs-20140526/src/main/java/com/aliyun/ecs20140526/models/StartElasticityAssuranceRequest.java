// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartElasticityAssuranceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PrivatePoolOptions")
    public StartElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    public static StartElasticityAssuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartElasticityAssuranceRequest self = new StartElasticityAssuranceRequest();
        return TeaModel.build(map, self);
    }

    public StartElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartElasticityAssuranceRequest setPrivatePoolOptions(StartElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public StartElasticityAssuranceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public static class StartElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static StartElasticityAssuranceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            StartElasticityAssuranceRequestPrivatePoolOptions self = new StartElasticityAssuranceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public StartElasticityAssuranceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
