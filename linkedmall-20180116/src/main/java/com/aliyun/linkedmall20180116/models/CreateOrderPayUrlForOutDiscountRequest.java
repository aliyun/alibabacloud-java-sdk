// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderPayUrlForOutDiscountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20****201229</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20882****3220453</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;addressId&quot;:&quot;158<em><strong><strong>11&quot;,&quot;deliveryInfoId&quot;:&quot;20&quot;,&quot;extJson&quot;:{&quot;subBizCode&quot;:&quot;defaultSubBizCode&quot;},&quot;orderItems&quot;:[{&quot;lmItemId&quot;:&quot;1002</strong></strong>123-67150<strong><strong>12&quot;,&quot;number&quot;:1,&quot;outDiscountFee&quot;:&quot;0&quot;,&quot;price&quot;:&quot;1&quot;,&quot;skuId&quot;:4830321</strong></strong></em>}],&quot;outDiscountInfos&quot;:{&quot;promotionInfos&quot;:[],&quot;totalDiscountFee&quot;:&quot;0&quot;},&quot;postFee&quot;:0,&quot;serviceType&quot;:-4}</p>
     */
    @NameInMap("BuyInfo")
    public String buyInfo;

    /**
     * <strong>example:</strong>
     * <p>2088****23220453</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
