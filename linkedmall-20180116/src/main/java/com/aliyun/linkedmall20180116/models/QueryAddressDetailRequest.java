// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressDetailRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    @NameInMap("AddressInfo")
    public String addressInfo;

    public static QueryAddressDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressDetailRequest self = new QueryAddressDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAddressDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAddressDetailRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public QueryAddressDetailRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public QueryAddressDetailRequest setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
        return this;
    }
    public String getAddressInfo() {
        return this.addressInfo;
    }

}
