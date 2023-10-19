// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductRequest extends TeaModel {
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
     * <p>The ID of the product catalog.</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The fields. Separate multiple fields with commas (,).</p>
     * <br>
     * <p> see [product fields](~~2579419~~)</p>
     */
    @NameInMap("Fields")
    public String fields;

    /**
     * <p>The number of products to be queried. Valid values: 1 to 1000.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the WhatsApp Business account (WABA).</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static ListProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductRequest self = new ListProductRequest();
        return TeaModel.build(map, self);
    }

    public ListProductRequest setAfter(String after) {
        this.after = after;
        return this;
    }
    public String getAfter() {
        return this.after;
    }

    public ListProductRequest setBefore(String before) {
        this.before = before;
        return this;
    }
    public String getBefore() {
        return this.before;
    }

    public ListProductRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListProductRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListProductRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListProductRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListProductRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListProductRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListProductRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListProductRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
