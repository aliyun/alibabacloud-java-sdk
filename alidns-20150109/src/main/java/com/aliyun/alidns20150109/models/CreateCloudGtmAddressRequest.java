// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>IP address or domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Address ownership information.</p>
     * 
     * <strong>example:</strong>
     * <p>当前版本不支持传入此参数，请不要传入参数。</p>
     */
    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>The failover mode that is used when address exceptions are identified. Valid values:</p>
     * <ul>
     * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
     * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for DNS requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("AvailableMode")
    public String availableMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Indicates the current enabled status of the address:</p>
     * <ul>
     * <li>enable: Enabled status </li>
     * <li>disable: Disabled status</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The condition for determining the health status of the address. This parameter is required when HealthTasks is specified. Valid values:</p>
     * <ul>
     * <li>any_ok: The health check results of at least one health check template are normal.</li>
     * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
     * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
     * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
     * <li>all_ok: The health check results of all health check templates are normal.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p50_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>The health check tasks associated with the address.</p>
     */
    @NameInMap("HealthTasks")
    public java.util.List<CreateCloudGtmAddressRequestHealthTasks> healthTasks;

    /**
     * <p>The availability state of the address. This parameter is required when AvailableMode is set to <strong>manual</strong>. Valid values:</p>
     * <ul>
     * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
     * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    /**
     * <p>Address name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Address-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Address type:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * <li>domain</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCloudGtmAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressRequest self = new CreateCloudGtmAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateCloudGtmAddressRequest setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public CreateCloudGtmAddressRequest setAvailableMode(String availableMode) {
        this.availableMode = availableMode;
        return this;
    }
    public String getAvailableMode() {
        return this.availableMode;
    }

    public CreateCloudGtmAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmAddressRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmAddressRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public CreateCloudGtmAddressRequest setHealthTasks(java.util.List<CreateCloudGtmAddressRequestHealthTasks> healthTasks) {
        this.healthTasks = healthTasks;
        return this;
    }
    public java.util.List<CreateCloudGtmAddressRequestHealthTasks> getHealthTasks() {
        return this.healthTasks;
    }

    public CreateCloudGtmAddressRequest setManualAvailableStatus(String manualAvailableStatus) {
        this.manualAvailableStatus = manualAvailableStatus;
        return this;
    }
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    public CreateCloudGtmAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudGtmAddressRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCloudGtmAddressRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateCloudGtmAddressRequestHealthTasks extends TeaModel {
        /**
         * <p>The service port of the address on which health check tasks are performed. If the ping protocol is used for health checks, the configuration of the service port is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the health check template associated with the address.</p>
         * 
         * <strong>example:</strong>
         * <p>mtp-89518052425100**80</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static CreateCloudGtmAddressRequestHealthTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudGtmAddressRequestHealthTasks self = new CreateCloudGtmAddressRequestHealthTasks();
            return TeaModel.build(map, self);
        }

        public CreateCloudGtmAddressRequestHealthTasks setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateCloudGtmAddressRequestHealthTasks setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
