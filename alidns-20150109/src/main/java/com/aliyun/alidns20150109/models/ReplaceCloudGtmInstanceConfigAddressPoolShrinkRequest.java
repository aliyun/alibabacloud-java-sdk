// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPools")
    public String addressPoolsShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest self = new ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest setAddressPoolsShrink(String addressPoolsShrink) {
        this.addressPoolsShrink = addressPoolsShrink;
        return this;
    }
    public String getAddressPoolsShrink() {
        return this.addressPoolsShrink;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
