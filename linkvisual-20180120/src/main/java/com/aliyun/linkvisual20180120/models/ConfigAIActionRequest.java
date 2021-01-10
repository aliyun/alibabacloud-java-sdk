// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ConfigAIActionRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ActionId")
    public String actionId;

    @NameInMap("DataTypeConfigList")
    public java.util.List<ConfigAIActionRequestDataTypeConfigList> dataTypeConfigList;

    @NameInMap("AlgoConfig")
    public String algoConfig;

    public static ConfigAIActionRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigAIActionRequest self = new ConfigAIActionRequest();
        return TeaModel.build(map, self);
    }

    public ConfigAIActionRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ConfigAIActionRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ConfigAIActionRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public ConfigAIActionRequest setDataTypeConfigList(java.util.List<ConfigAIActionRequestDataTypeConfigList> dataTypeConfigList) {
        this.dataTypeConfigList = dataTypeConfigList;
        return this;
    }
    public java.util.List<ConfigAIActionRequestDataTypeConfigList> getDataTypeConfigList() {
        return this.dataTypeConfigList;
    }

    public ConfigAIActionRequest setAlgoConfig(String algoConfig) {
        this.algoConfig = algoConfig;
        return this;
    }
    public String getAlgoConfig() {
        return this.algoConfig;
    }

    public static class ConfigAIActionRequestDataTypeConfigList extends TeaModel {
        @NameInMap("Configs")
        public String configs;

        @NameInMap("DataType")
        public String dataType;

        public static ConfigAIActionRequestDataTypeConfigList build(java.util.Map<String, ?> map) throws Exception {
            ConfigAIActionRequestDataTypeConfigList self = new ConfigAIActionRequestDataTypeConfigList();
            return TeaModel.build(map, self);
        }

        public ConfigAIActionRequestDataTypeConfigList setConfigs(String configs) {
            this.configs = configs;
            return this;
        }
        public String getConfigs() {
            return this.configs;
        }

        public ConfigAIActionRequestDataTypeConfigList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

    }

}
