// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UpdateAddressRequest extends TeaModel {
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

    public static UpdateAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAddressRequest self = new UpdateAddressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAddressRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAddressRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public UpdateAddressRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public UpdateAddressRequest setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public String getAddressInfo() {
        return this.addressInfo;
    }

}
