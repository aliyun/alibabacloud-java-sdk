// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US (default): English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The IP address or domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The attribution information of the address.</p>
     * 
     * <strong>example:</strong>
     * <p>当前版本不支持传入此参数，请不要传入参数。</p>
     */
    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>The switchover mode for the address when a health check is abnormal. Valid values:</p>
     * <ul>
     * <li><p>auto: The system automatically manages the address status based on health check results. If an address is unhealthy, DNS resolution for it stops. If the address becomes healthy, DNS resolution resumes.</p>
     * </li>
     * <li><p>manual: You manually manage the address status. If you set an address to abnormal, DNS resolution for it stops. It does not resume even if the address becomes healthy. If you set an address to normal, DNS resolution for it resumes. If a healthy address becomes unhealthy, the system sends an alert but does not stop DNS resolution.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("AvailableMode")
    public String availableMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Make sure that the token is unique for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The status of the address. Valid values:</p>
     * <ul>
     * <li><p>enable: The address is enabled.</p>
     * </li>
     * <li><p>disable: The address is disabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The condition for determining the health of the address. This parameter is required if you specify HealthTasks. Valid values:</p>
     * <ul>
     * <li><p>any_ok: At least one health check is successful.</p>
     * </li>
     * <li><p>p30_ok: At least 30% of health checks are successful.</p>
     * </li>
     * <li><p>p50_ok: At least 50% of health checks are successful.</p>
     * </li>
     * <li><p>p70_ok: At least 70% of health checks are successful.</p>
     * </li>
     * <li><p>all_ok: All health checks are successful.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p50_ok</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    /**
     * <p>The health check tasks for the address.</p>
     */
    @NameInMap("HealthTasks")
    public java.util.List<CreateCloudGtmAddressRequestHealthTasks> healthTasks;

    /**
     * <p>The availability status of the address when the health check-based switchover mode is set to <strong>manual</strong>. Valid values:</p>
     * <ul>
     * <li><p>available: The address is available. In this state, DNS resolution for the address is normal. If a health check is abnormal, the system only sends an alert and does not stop DNS resolution.</p>
     * </li>
     * <li><p>unavailable: The address is unavailable. In this state, DNS resolution for the address is stopped. DNS resolution is not resumed even if a health check is normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    /**
     * <p>The name of the address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Address-1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks about the address.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The type of the address. Valid values:</p>
     * <ul>
     * <li><p>IPv4</p>
     * </li>
     * <li><p>IPv6</p>
     * </li>
     * <li><p>domain</p>
     * </li>
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
         * <p>The service port of the destination address for the health check. This parameter is not supported for health checks that use the ping protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>mtp-89518052425100****</p>
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
