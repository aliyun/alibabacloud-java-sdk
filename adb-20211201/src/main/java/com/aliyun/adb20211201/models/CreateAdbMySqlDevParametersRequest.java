// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateAdbMySqlDevParametersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamName")
    public String devParamName;

    @NameInMap("DevParamProps")
    public java.util.List<CreateAdbMySqlDevParametersRequestDevParamProps> devParamProps;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAdbMySqlDevParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdbMySqlDevParametersRequest self = new CreateAdbMySqlDevParametersRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdbMySqlDevParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAdbMySqlDevParametersRequest setDevParamName(String devParamName) {
        this.devParamName = devParamName;
        return this;
    }
    public String getDevParamName() {
        return this.devParamName;
    }

    public CreateAdbMySqlDevParametersRequest setDevParamProps(java.util.List<CreateAdbMySqlDevParametersRequestDevParamProps> devParamProps) {
        this.devParamProps = devParamProps;
        return this;
    }
    public java.util.List<CreateAdbMySqlDevParametersRequestDevParamProps> getDevParamProps() {
        return this.devParamProps;
    }

    public CreateAdbMySqlDevParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateAdbMySqlDevParametersRequestDevParamProps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAdbMySqlDevParametersRequestDevParamProps build(java.util.Map<String, ?> map) throws Exception {
            CreateAdbMySqlDevParametersRequestDevParamProps self = new CreateAdbMySqlDevParametersRequestDevParamProps();
            return TeaModel.build(map, self);
        }

        public CreateAdbMySqlDevParametersRequestDevParamProps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAdbMySqlDevParametersRequestDevParamProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
