// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolLbStrategyRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressLbStrategy")
    public String addressLbStrategy;

    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("SequenceLbStrategyMode")
    public String sequenceLbStrategyMode;

    public static UpdateCloudGtmAddressPoolLbStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolLbStrategyRequest self = new UpdateCloudGtmAddressPoolLbStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setAddressLbStrategy(String addressLbStrategy) {
        this.addressLbStrategy = addressLbStrategy;
        return this;
    }
    public String getAddressLbStrategy() {
        return this.addressLbStrategy;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressPoolLbStrategyRequest setSequenceLbStrategyMode(String sequenceLbStrategyMode) {
        this.sequenceLbStrategyMode = sequenceLbStrategyMode;
        return this;
    }
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

}
