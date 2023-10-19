// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductCatalogRequest extends TeaModel {
    /**
     * <p>The cursor that points to the end of the page of the returned data.</p>
     */
    @NameInMap("After")
    public String after;

    /**
     * <p>The cursor that points to the beginning of the page of the returned data.</p>
     */
    @NameInMap("Before")
    public String before;

    /**
     * <p>The Business Manager ID.</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The fields. Separate multiple fields with commas (,).</p>
     * <p>see  [catalog fields](~~2579419~~)</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The number of catalogs to be queried. Valid values: 1 to 1000.</p>
     */
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
