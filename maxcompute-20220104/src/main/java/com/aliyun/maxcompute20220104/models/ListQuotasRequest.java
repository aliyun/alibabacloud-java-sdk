// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasRequest extends TeaModel {
    @NameInMap("billingType")
    public String billingType;

    @NameInMap("marker")
    public String marker;

    @NameInMap("maxItem")
    public Long maxItem;

    @NameInMap("productId")
    public String productId;

    @NameInMap("region")
    public String region;

    @NameInMap("saleTags")
    public String saleTags;

    @NameInMap("tenantId")
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

    public ListQuotasRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

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

    public ListQuotasRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
