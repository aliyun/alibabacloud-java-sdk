// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListSmsTemplateRequest extends TeaModel {
    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("QueryTemplate")
    public String queryTemplate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmsTemplateRequest self = new ListSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListSmsTemplateRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ListSmsTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListSmsTemplateRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListSmsTemplateRequest setQueryTemplate(String queryTemplate) {
        this.queryTemplate = queryTemplate;
        return this;
    }
    public String getQueryTemplate() {
        return this.queryTemplate;
    }

    public ListSmsTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListSmsTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
