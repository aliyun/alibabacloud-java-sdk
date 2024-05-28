// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressPoolRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AddressPoolName")
    public String addressPoolName;

    @NameInMap("AddressPoolType")
    public String addressPoolType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnableStatus")
    public String enableStatus;

    @NameInMap("HealthJudgement")
    public String healthJudgement;

    @NameInMap("Remark")
    public String remark;

    public static CreateCloudGtmAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressPoolRequest self = new CreateCloudGtmAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressPoolRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmAddressPoolRequest setAddressPoolName(String addressPoolName) {
        this.addressPoolName = addressPoolName;
        return this;
    }
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    public CreateCloudGtmAddressPoolRequest setAddressPoolType(String addressPoolType) {
        this.addressPoolType = addressPoolType;
        return this;
    }
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    public CreateCloudGtmAddressPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmAddressPoolRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public CreateCloudGtmAddressPoolRequest setHealthJudgement(String healthJudgement) {
        this.healthJudgement = healthJudgement;
        return this;
    }
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public CreateCloudGtmAddressPoolRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
