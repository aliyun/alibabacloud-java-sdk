// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreatePayUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20*****0001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9f99f38030254728***</p>
     */
    @NameInMap("BizUid")
    public String bizUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BuyInfo")
    public String buyInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CreatePayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePayUrlRequest self = new CreatePayUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreatePayUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreatePayUrlRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreatePayUrlRequest setBuyInfo(String buyInfo) {
        this.buyInfo = buyInfo;
        return this;
    }
    public String getBuyInfo() {
        return this.buyInfo;
    }

    public CreatePayUrlRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CreatePayUrlRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
