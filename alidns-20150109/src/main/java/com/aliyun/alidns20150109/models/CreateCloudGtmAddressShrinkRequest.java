// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressShrinkRequest extends TeaModel {
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
     * <p>This parameter is not supported in the version. Do not enter this parameter</p>
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
    public String healthTasksShrink;

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

    public static CreateCloudGtmAddressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressShrinkRequest self = new CreateCloudGtmAddressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmAddressShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateCloudGtmAddressShrinkRequest setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public CreateCloudGtmAddressShrinkRequest setAvailableMode(String availableMode) {
        this.availableMode = availableMode;
        return this;
    }
    public String getAvailableMode() {
        return this.availableMode;
    }

    public CreateCloudGtmAddressShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmAddressShrinkRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmAddressShrinkRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public CreateCloudGtmAddressShrinkRequest setHealthTasksShrink(String healthTasksShrink) {
        this.healthTasksShrink = healthTasksShrink;
        return this;
    }
    public String getHealthTasksShrink() {
        return this.healthTasksShrink;
    }

    public CreateCloudGtmAddressShrinkRequest setManualAvailableStatus(String manualAvailableStatus) {
        this.manualAvailableStatus = manualAvailableStatus;
        return this;
    }
    public String getManualAvailableStatus() {
        return this.manualAvailableStatus;
    }

    public CreateCloudGtmAddressShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudGtmAddressShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateCloudGtmAddressShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
