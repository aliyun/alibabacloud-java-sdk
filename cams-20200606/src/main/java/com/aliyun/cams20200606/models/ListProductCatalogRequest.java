// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductCatalogRequest extends TeaModel {
    @NameInMap("After")
    public String after;

    @NameInMap("Before")
    public String before;

    @NameInMap("BusinessId")
    public Long businessId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListProductCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductCatalogRequest self = new ListProductCatalogRequest();
        return TeaModel.build(map, self);
    }

    public ListProductCatalogRequest setAfter(String after) {
        this.after = after;
        return this;
    }
    public String getAfter() {
        return this.after;
    }

    public ListProductCatalogRequest setBefore(String before) {
        this.before = before;
        return this;
    }
    public String getBefore() {
        return this.before;
    }

    public ListProductCatalogRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public ListProductCatalogRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListProductCatalogRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListProductCatalogRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListProductCatalogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListProductCatalogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListProductCatalogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
