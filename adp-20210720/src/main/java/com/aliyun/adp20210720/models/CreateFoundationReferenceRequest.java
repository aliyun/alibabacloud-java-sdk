// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateFoundationReferenceRequest extends TeaModel {
    @NameInMap("clusterConfig")
    public String clusterConfig;

    @NameInMap("componentConfigs")
    public java.util.List<CreateFoundationReferenceRequestComponentConfigs> componentConfigs;

    @NameInMap("foundationReferenceConfigs")
    public java.util.List<CreateFoundationReferenceRequestFoundationReferenceConfigs> foundationReferenceConfigs;

    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    @NameInMap("originFoundationReferenceUID")
    public String originFoundationReferenceUID;

    public static CreateFoundationReferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFoundationReferenceRequest self = new CreateFoundationReferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFoundationReferenceRequest setClusterConfig(String clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    public CreateFoundationReferenceRequest setComponentConfigs(java.util.List<CreateFoundationReferenceRequestComponentConfigs> componentConfigs) {
        this.componentConfigs = componentConfigs;
        return this;
    }
    public java.util.List<CreateFoundationReferenceRequestComponentConfigs> getComponentConfigs() {
        return this.componentConfigs;
    }

    public CreateFoundationReferenceRequest setFoundationReferenceConfigs(java.util.List<CreateFoundationReferenceRequestFoundationReferenceConfigs> foundationReferenceConfigs) {
        this.foundationReferenceConfigs = foundationReferenceConfigs;
        return this;
    }
    public java.util.List<CreateFoundationReferenceRequestFoundationReferenceConfigs> getFoundationReferenceConfigs() {
        return this.foundationReferenceConfigs;
    }

    public CreateFoundationReferenceRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    public CreateFoundationReferenceRequest setOriginFoundationReferenceUID(String originFoundationReferenceUID) {
        this.originFoundationReferenceUID = originFoundationReferenceUID;
        return this;
    }
    public String getOriginFoundationReferenceUID() {
        return this.originFoundationReferenceUID;
    }

    public static class CreateFoundationReferenceRequestComponentConfigs extends TeaModel {
        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("orchestrationValues")
        public String orchestrationValues;

        public static CreateFoundationReferenceRequestComponentConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateFoundationReferenceRequestComponentConfigs self = new CreateFoundationReferenceRequestComponentConfigs();
            return TeaModel.build(map, self);
        }

        public CreateFoundationReferenceRequestComponentConfigs setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public CreateFoundationReferenceRequestComponentConfigs setOrchestrationValues(String orchestrationValues) {
            this.orchestrationValues = orchestrationValues;
            return this;
        }
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

    }

    public static class CreateFoundationReferenceRequestFoundationReferenceConfigs extends TeaModel {
        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("configType")
        public String configType;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static CreateFoundationReferenceRequestFoundationReferenceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateFoundationReferenceRequestFoundationReferenceConfigs self = new CreateFoundationReferenceRequestFoundationReferenceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateFoundationReferenceRequestFoundationReferenceConfigs setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public CreateFoundationReferenceRequestFoundationReferenceConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public CreateFoundationReferenceRequestFoundationReferenceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFoundationReferenceRequestFoundationReferenceConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
