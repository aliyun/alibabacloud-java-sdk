// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolBasicConfigRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("AddressPoolName")
    public String addressPoolName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("HealthJudgement")
    public String healthJudgement;

    public static UpdateCloudGtmAddressPoolBasicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolBasicConfigRequest self = new UpdateCloudGtmAddressPoolBasicConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmAddressPoolBasicConfigRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

}
