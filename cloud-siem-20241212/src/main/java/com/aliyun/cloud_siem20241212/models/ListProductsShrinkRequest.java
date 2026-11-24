// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListProductsShrinkRequest extends TeaModel {
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
    public String productIdsShrink;

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

    public static ListProductsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsShrinkRequest self = new ListProductsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListProductsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsShrinkRequest setProductIdsShrink(String productIdsShrink) {
        this.productIdsShrink = productIdsShrink;
        return this;
    }
    public String getProductIdsShrink() {
        return this.productIdsShrink;
    }

    public ListProductsShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListProductsShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListProductsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProductsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListProductsShrinkRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
