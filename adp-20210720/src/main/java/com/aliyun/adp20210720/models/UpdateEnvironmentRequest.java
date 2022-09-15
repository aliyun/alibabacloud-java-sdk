// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentRequest extends TeaModel {
    @NameInMap("advancedConfigs")
    public UpdateEnvironmentRequestAdvancedConfigs advancedConfigs;

    @NameInMap("description")
    public String description;

    @NameInMap("location")
    public String location;

    @NameInMap("vendorConfig")
    public String vendorConfig;

    public static UpdateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentRequest self = new UpdateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentRequest setAdvancedConfigs(UpdateEnvironmentRequestAdvancedConfigs advancedConfigs) {
        this.advancedConfigs = advancedConfigs;
        return this;
    }
    public UpdateEnvironmentRequestAdvancedConfigs getAdvancedConfigs() {
        return this.advancedConfigs;
    }

    public UpdateEnvironmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEnvironmentRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateEnvironmentRequest setVendorConfig(String vendorConfig) {
        this.vendorConfig = vendorConfig;
        return this;
    }
    public String getVendorConfig() {
        return this.vendorConfig;
    }

    public static class UpdateEnvironmentRequestAdvancedConfigs extends TeaModel {
        @NameInMap("enableDeploySimulation")
        public Boolean enableDeploySimulation;

        @NameInMap("enableSiteSurvey")
        public Boolean enableSiteSurvey;

        public static UpdateEnvironmentRequestAdvancedConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentRequestAdvancedConfigs self = new UpdateEnvironmentRequestAdvancedConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentRequestAdvancedConfigs setEnableDeploySimulation(Boolean enableDeploySimulation) {
            this.enableDeploySimulation = enableDeploySimulation;
            return this;
        }
        public Boolean getEnableDeploySimulation() {
            return this.enableDeploySimulation;
        }

        public UpdateEnvironmentRequestAdvancedConfigs setEnableSiteSurvey(Boolean enableSiteSurvey) {
            this.enableSiteSurvey = enableSiteSurvey;
            return this;
        }
        public Boolean getEnableSiteSurvey() {
            return this.enableSiteSurvey;
        }

    }

}
