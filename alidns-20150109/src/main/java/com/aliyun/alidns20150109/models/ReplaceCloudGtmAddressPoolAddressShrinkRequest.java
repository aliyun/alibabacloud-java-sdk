// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmAddressPoolAddressShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("Addresses")
    public String addressesShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ReplaceCloudGtmAddressPoolAddressShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmAddressPoolAddressShrinkRequest self = new ReplaceCloudGtmAddressPoolAddressShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setAddressesShrink(String addressesShrink) {
        this.addressesShrink = addressesShrink;
        return this;
    }
    public String getAddressesShrink() {
        return this.addressesShrink;
    }

    public ReplaceCloudGtmAddressPoolAddressShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
