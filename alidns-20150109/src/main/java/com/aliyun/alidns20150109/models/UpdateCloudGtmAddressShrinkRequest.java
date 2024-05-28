// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Address")
    public String address;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    @NameInMap("AttributeInfo")
    public String attributeInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("HealthJudgement")
    public String healthJudgement;

    @NameInMap("HealthTasks")
    public String healthTasksShrink;

    @NameInMap("Name")
    public String name;

    public static UpdateCloudGtmAddressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressShrinkRequest self = new UpdateCloudGtmAddressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateCloudGtmAddressShrinkRequest setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public UpdateCloudGtmAddressShrinkRequest setAttributeInfo(String attributeInfo) {
        this.attributeInfo = attributeInfo;
        return this;
    }
    public String getAttributeInfo() {
        return this.attributeInfo;
    }

    public UpdateCloudGtmAddressShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressShrinkRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public UpdateCloudGtmAddressShrinkRequest setHealthTasksShrink(String healthTasksShrink) {
        this.healthTasksShrink = healthTasksShrink;
        return this;
    }
    public String getHealthTasksShrink() {
        return this.healthTasksShrink;
    }

    public UpdateCloudGtmAddressShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
