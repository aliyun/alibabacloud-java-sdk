// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Address")
    public String address;

    @NameInMap("AttributeInfo")
    public String attributeInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AvailableMode")
    public String availableMode;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HealthJudgement")
    public String healthJudgement;

    @NameInMap("HealthTasks")
    public String healthTasksShrink;

    @NameInMap("ManualAvailableStatus")
    public String manualAvailableStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
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
