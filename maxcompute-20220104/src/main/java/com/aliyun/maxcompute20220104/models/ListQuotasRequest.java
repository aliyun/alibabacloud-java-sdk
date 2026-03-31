// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasRequest extends TeaModel {
    /**
     * <p>The billing method of the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>subscription</p>
     */
    @NameInMap("billingType")
    public String billingType;

    /**
     * <p>Specifies the marker after which the returned list begins.</p>
     * 
     * <strong>example:</strong>
     * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxItem")
    public Long maxItem;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS</p>
     */
    @NameInMap("productId")
    @Deprecated
    public String productId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    @Deprecated
    public String region;

    /**
     * <p>The cost tag. You can filter out quota objects based on the cost tag. The cost tag is created when you tag a service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tag&quot;:&quot;this_is_tag_demo&quot;}</p>
     */
    @NameInMap("saleTags")
    public String saleTags;

    /**
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>280747109771520</p>
     */
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
