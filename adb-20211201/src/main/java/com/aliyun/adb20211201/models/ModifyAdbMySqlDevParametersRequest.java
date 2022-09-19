// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAdbMySqlDevParametersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamName")
    public String devParamName;

    @NameInMap("DevParamProps")
    public java.util.List<ModifyAdbMySqlDevParametersRequestDevParamProps> devParamProps;

    @NameInMap("DevParamsId")
    public Long devParamsId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAdbMySqlDevParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdbMySqlDevParametersRequest self = new ModifyAdbMySqlDevParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdbMySqlDevParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAdbMySqlDevParametersRequest setDevParamName(String devParamName) {
        this.devParamName = devParamName;
        return this;
    }
    public String getDevParamName() {
        return this.devParamName;
    }

    public ModifyAdbMySqlDevParametersRequest setDevParamProps(java.util.List<ModifyAdbMySqlDevParametersRequestDevParamProps> devParamProps) {
        this.devParamProps = devParamProps;
        return this;
    }
    public java.util.List<ModifyAdbMySqlDevParametersRequestDevParamProps> getDevParamProps() {
        return this.devParamProps;
    }

    public ModifyAdbMySqlDevParametersRequest setDevParamsId(Long devParamsId) {
        this.devParamsId = devParamsId;
        return this;
    }
    public Long getDevParamsId() {
        return this.devParamsId;
    }

    public ModifyAdbMySqlDevParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyAdbMySqlDevParametersRequestDevParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModifyAdbMySqlDevParametersRequestDevParamProps build(java.util.Map<String, ?> map) throws Exception {
            ModifyAdbMySqlDevParametersRequestDevParamProps self = new ModifyAdbMySqlDevParametersRequestDevParamProps();
            return TeaModel.build(map, self);
        }

        public ModifyAdbMySqlDevParametersRequestDevParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAdbMySqlDevParametersRequestDevParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
