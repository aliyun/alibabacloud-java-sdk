// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddAddressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddressInfo")
    public String addressInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL202202100002</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static AddAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressRequest self = new AddAddressRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressRequest setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public String getAddressInfo() {
        return this.addressInfo;
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

}
