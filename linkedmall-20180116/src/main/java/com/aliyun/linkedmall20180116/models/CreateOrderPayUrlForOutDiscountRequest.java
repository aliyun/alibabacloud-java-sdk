// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderPayUrlForOutDiscountRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
    public String bizUid;

    @NameInMap("BuyInfo")
    public String buyInfo;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CreateOrderPayUrlForOutDiscountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderPayUrlForOutDiscountRequest self = new CreateOrderPayUrlForOutDiscountRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderPayUrlForOutDiscountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOrderPayUrlForOutDiscountRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateOrderPayUrlForOutDiscountRequest setBuyInfo(String buyInfo) {
        this.buyInfo = buyInfo;
        return this;
    }
    public String getBuyInfo() {
        return this.buyInfo;
    }

    public CreateOrderPayUrlForOutDiscountRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CreateOrderPayUrlForOutDiscountRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
