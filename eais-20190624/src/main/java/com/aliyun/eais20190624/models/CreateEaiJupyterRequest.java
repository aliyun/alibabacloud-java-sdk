// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiJupyterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EaisName")
    public String eaisName;

    @NameInMap("EaisType")
    public String eaisType;

    @NameInMap("EnvironmentVar")
    public java.util.List<CreateEaiJupyterRequestEnvironmentVar> environmentVar;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiJupyterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiJupyterRequest self = new CreateEaiJupyterRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiJupyterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiJupyterRequest setEaisName(String eaisName) {
        this.eaisName = eaisName;
        return this;
    }
    public String getEaisName() {
        return this.eaisName;
    }

    public CreateEaiJupyterRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiJupyterRequest setEnvironmentVar(java.util.List<CreateEaiJupyterRequestEnvironmentVar> environmentVar) {
        this.environmentVar = environmentVar;
        return this;
    }
    public java.util.List<CreateEaiJupyterRequestEnvironmentVar> getEnvironmentVar() {
        return this.environmentVar;
    }

    public CreateEaiJupyterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiJupyterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEaiJupyterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiJupyterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiJupyterRequestEnvironmentVar extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateEaiJupyterRequestEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiJupyterRequestEnvironmentVar self = new CreateEaiJupyterRequestEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public CreateEaiJupyterRequestEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEaiJupyterRequestEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
