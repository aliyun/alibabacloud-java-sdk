// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListVendorsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>50。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("VendorIds")
    public String vendorIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>111。</p>
     */
    @NameInMap("VendorName")
    public String vendorName;

    /**
     * <strong>example:</strong>
     * <p>preset。</p>
     */
    @NameInMap("VendorType")
    public String vendorType;

    public static ListVendorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVendorsShrinkRequest self = new ListVendorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListVendorsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListVendorsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVendorsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVendorsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVendorsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListVendorsShrinkRequest setVendorIdsShrink(String vendorIdsShrink) {
        this.vendorIdsShrink = vendorIdsShrink;
        return this;
    }
    public String getVendorIdsShrink() {
        return this.vendorIdsShrink;
    }

    public ListVendorsShrinkRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

    public ListVendorsShrinkRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
