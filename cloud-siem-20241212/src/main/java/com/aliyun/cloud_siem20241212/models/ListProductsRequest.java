// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProductIds")
    public java.util.List<String> productIds;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("VendorId")
    public String vendorId;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListProductsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsRequest setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public ListProductsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListProductsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListProductsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProductsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListProductsRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
