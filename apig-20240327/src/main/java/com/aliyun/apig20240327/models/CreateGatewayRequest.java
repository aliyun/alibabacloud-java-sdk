// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    /**
     * <p>The billing method. This parameter is required for Serverless instances and must be set to POSTPAY.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The gateway instance edition. Valid values:</p>
     * <ul>
     * <li><p>Professional: Standard instance.</p>
     * </li>
     * <li><p>Serverless: Serverless instance.</p>
     * </li>
     * <li><p>MultiTenantServerless: Multi-tenant Serverless instance.</p>
     * </li>
     * <li><p>Unknown: Unknown.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Professional</p>
     */
    @NameInMap("gatewayEdition")
    public String gatewayEdition;

    /**
     * <p>The operation mode for AI multi-tenant V2. The default value is ENTERPRISE. This parameter is only allowed for AI and MultiTenantServerless gateways.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("gatewayMode")
    public String gatewayMode;

    /**
     * <p>The gateway type. This parameter must be explicitly set to AI for AI Serverless or multi-tenant gateways.</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The log configuration for the gateway.</p>
     */
    @NameInMap("logConfig")
    public CreateGatewayRequestLogConfig logConfig;

    /**
     * <p>The name of the gateway. This parameter is required for all gateway types.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ceshi</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network access configuration. This parameter is actually required. If it is not provided, the service returns InvalidParameter.IsEmpty (400).</p>
     */
    @NameInMap("networkAccessConfig")
    public CreateGatewayRequestNetworkAccessConfig networkAccessConfig;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ahr5uil8raz0rq3b</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The node specifications. This parameter is required for Serverless instances.</p>
     * 
     * <strong>example:</strong>
     * <p>apigw.dev.x1</p>
     */
    @NameInMap("spec")
    public String spec;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<CreateGatewayRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC). This parameter is required for all gateway types.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-zm0x16tomfiat1mk9f6rs</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The zone configuration. This parameter is required for all gateway types.</p>
     */
    @NameInMap("zoneConfig")
    public CreateGatewayRequestZoneConfig zoneConfig;

    public static CreateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRequest self = new CreateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateGatewayRequest setGatewayEdition(String gatewayEdition) {
        this.gatewayEdition = gatewayEdition;
        return this;
    }
    public String getGatewayEdition() {
        return this.gatewayEdition;
    }

    public CreateGatewayRequest setGatewayMode(String gatewayMode) {
        this.gatewayMode = gatewayMode;
        return this;
    }
    public String getGatewayMode() {
        return this.gatewayMode;
    }

    public CreateGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public CreateGatewayRequest setLogConfig(CreateGatewayRequestLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public CreateGatewayRequestLogConfig getLogConfig() {
        return this.logConfig;
    }

    public CreateGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGatewayRequest setNetworkAccessConfig(CreateGatewayRequestNetworkAccessConfig networkAccessConfig) {
        this.networkAccessConfig = networkAccessConfig;
        return this;
    }
    public CreateGatewayRequestNetworkAccessConfig getNetworkAccessConfig() {
        return this.networkAccessConfig;
    }

    public CreateGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGatewayRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateGatewayRequest setTag(java.util.List<CreateGatewayRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateGatewayRequestTag> getTag() {
        return this.tag;
    }

    public CreateGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateGatewayRequest setZoneConfig(CreateGatewayRequestZoneConfig zoneConfig) {
        this.zoneConfig = zoneConfig;
        return this;
    }
    public CreateGatewayRequestZoneConfig getZoneConfig() {
        return this.zoneConfig;
    }

    public static class CreateGatewayRequestLogConfigSls extends TeaModel {
        /**
         * <p>Specifies whether to enable SLS.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static CreateGatewayRequestLogConfigSls build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestLogConfigSls self = new CreateGatewayRequestLogConfigSls();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestLogConfigSls setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class CreateGatewayRequestLogConfig extends TeaModel {
        /**
         * <p>The Simple Log Service (SLS) configuration used to control gateway log collection.</p>
         */
        @NameInMap("sls")
        public CreateGatewayRequestLogConfigSls sls;

        public static CreateGatewayRequestLogConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestLogConfig self = new CreateGatewayRequestLogConfig();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestLogConfig setSls(CreateGatewayRequestLogConfigSls sls) {
            this.sls = sls;
            return this;
        }
        public CreateGatewayRequestLogConfigSls getSls() {
            return this.sls;
        }

    }

    public static class CreateGatewayRequestNetworkAccessConfig extends TeaModel {
        /**
         * <p>The ID of the endpoint security group. This parameter is required when a multi-tenant API gateway or multi-tenant AI gateway Enterprise Edition uses private network or dual-entry access, and must be a non-managed security group in your VPC. Do not specify this parameter for public network requests.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1example123456789</p>
         */
        @NameInMap("endpointSecurityGroupId")
        public String endpointSecurityGroupId;

        /**
         * <p>The network access type.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateGatewayRequestNetworkAccessConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestNetworkAccessConfig self = new CreateGatewayRequestNetworkAccessConfig();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestNetworkAccessConfig setEndpointSecurityGroupId(String endpointSecurityGroupId) {
            this.endpointSecurityGroupId = endpointSecurityGroupId;
            return this;
        }
        public String getEndpointSecurityGroupId() {
            return this.endpointSecurityGroupId;
        }

        public CreateGatewayRequestNetworkAccessConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateGatewayRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateGatewayRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestTag self = new CreateGatewayRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGatewayRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateGatewayRequestZoneConfigZones extends TeaModel {
        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xx</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static CreateGatewayRequestZoneConfigZones build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestZoneConfigZones self = new CreateGatewayRequestZoneConfigZones();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestZoneConfigZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateGatewayRequestZoneConfigZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateGatewayRequestZoneConfig extends TeaModel {
        /**
         * <p>The zone option.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("selectOption")
        public String selectOption;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("vSwitchId")
        public String vSwitchId;

        /**
         * <p>The list of supported zones. At least two zones are required.</p>
         */
        @NameInMap("zones")
        public java.util.List<CreateGatewayRequestZoneConfigZones> zones;

        public static CreateGatewayRequestZoneConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestZoneConfig self = new CreateGatewayRequestZoneConfig();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestZoneConfig setSelectOption(String selectOption) {
            this.selectOption = selectOption;
            return this;
        }
        public String getSelectOption() {
            return this.selectOption;
        }

        public CreateGatewayRequestZoneConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateGatewayRequestZoneConfig setZones(java.util.List<CreateGatewayRequestZoneConfigZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<CreateGatewayRequestZoneConfigZones> getZones() {
            return this.zones;
        }

    }

}
