// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required in actual calls. If this parameter is not specified, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Explicitly pass a language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. You do not need to specify this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of product IDs.</p>
     */
    @NameInMap("ProductIds")
    public java.util.List<String> productIds;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li>preset</li>
     * <li>custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preset</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland or Hong Kong (China).</li>
     * <li>ap-southeast-1: The assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The vendor ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vd-qlsw5eocx94w9</p>
     */
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
