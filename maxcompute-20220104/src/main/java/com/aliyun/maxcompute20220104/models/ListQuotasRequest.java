// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasRequest extends TeaModel {
    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>subscription</p>
     */
    @NameInMap("billingType")
    public String billingType;

    /**
     * <p>The marker after which the results are returned in alphabetical order.</p>
     * 
     * <strong>example:</strong>
     * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of items to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxItem")
    public Long maxItem;

    @NameInMap("productId")
    @Deprecated
    public String productId;

    @NameInMap("region")
    @Deprecated
    public String region;

    /**
     * <p>The billing tags used to filter quota objects. Billing tags are created by users for cloud products.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag&quot;:&quot;this_is_tag_demo&quot;}</p>
     */
    @NameInMap("saleTags")
    public String saleTags;

    @NameInMap("tenantId")
    @Deprecated
    public String tenantId;

    public static ListQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasRequest self = new ListQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotasRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public ListQuotasRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListQuotasRequest setMaxItem(Long maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Long getMaxItem() {
        return this.maxItem;
    }

    @Deprecated
    public ListQuotasRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    @Deprecated
    public ListQuotasRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListQuotasRequest setSaleTags(String saleTags) {
        this.saleTags = saleTags;
        return this;
    }
    public String getSaleTags() {
        return this.saleTags;
    }

    @Deprecated
    public ListQuotasRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
