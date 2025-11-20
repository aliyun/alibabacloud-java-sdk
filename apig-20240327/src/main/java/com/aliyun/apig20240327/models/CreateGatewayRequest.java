// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>POSTPAY</li>
     * <li>PREPAY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The gateway edition.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("gatewayEdition")
    public String gatewayEdition;

    /**
     * <p>The type of the gateway.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AI</li>
     * <li>API</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The logging configurations.</p>
     */
    @NameInMap("logConfig")
    public CreateGatewayRequestLogConfig logConfig;

    /**
     * <p>The name of the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test-ceshi</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network access configuration.</p>
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
     * <p>The specifications of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>apigw.dev.x2</p>
     */
    @NameInMap("spec")
    public String spec;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<CreateGatewayRequestTag> tag;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-zm0x16tomfiat1mk9f6rs</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    /**
     * <p>The zone settings.</p>
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
         * <p>Indicates if enabled.</p>
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
         * <p>The Simple Log Service configurations.</p>
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
         * <p>The network access type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>InternetAndIntranet</li>
         * <li>Intranet</li>
         * <li>Internet</li>
         * </ul>
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
         * <p>cn-wulanchabu-a</p>
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
         * <p>The option for selecting the zone.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Auto</li>
         * <li>Manual</li>
         * </ul>
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
         * <p>The supported zones.</p>
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
