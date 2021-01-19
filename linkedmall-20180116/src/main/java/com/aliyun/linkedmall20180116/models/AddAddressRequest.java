// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddAddressRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    @NameInMap("AddressInfo")
    @Validation(required = true)
    public String addressInfo;

    public static AddAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressRequest self = new AddAddressRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddAddressRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public AddAddressRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public AddAddressRequest setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public String getAddressInfo() {
        return this.addressInfo;
    }

}
