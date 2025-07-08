// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateNewRequest extends TeaModel {
    @NameInMap("IsSmsSign")
    public Boolean isSmsSign;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsTemplateIds")
    public String smsTemplateIds;

    public static DeleteSmsTemplateNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateNewRequest self = new DeleteSmsTemplateNewRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateNewRequest setIsSmsSign(Boolean isSmsSign) {
        this.isSmsSign = isSmsSign;
        return this;
    }
    public Boolean getIsSmsSign() {
        return this.isSmsSign;
    }

    public DeleteSmsTemplateNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSmsTemplateNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DeleteSmsTemplateNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSmsTemplateNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteSmsTemplateNewRequest setSmsTemplateIds(String smsTemplateIds) {
        this.smsTemplateIds = smsTemplateIds;
        return this;
    }
    public String getSmsTemplateIds() {
        return this.smsTemplateIds;
    }

}
