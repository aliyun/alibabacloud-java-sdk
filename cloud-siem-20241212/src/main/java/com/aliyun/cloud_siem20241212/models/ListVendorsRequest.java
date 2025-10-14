// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListVendorsRequest extends TeaModel {
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
    public java.util.List<String> vendorIds;

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

    public static ListVendorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVendorsRequest self = new ListVendorsRequest();
        return TeaModel.build(map, self);
    }

    public ListVendorsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListVendorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVendorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVendorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVendorsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListVendorsRequest setVendorIds(java.util.List<String> vendorIds) {
        this.vendorIds = vendorIds;
        return this;
    }
    public java.util.List<String> getVendorIds() {
        return this.vendorIds;
    }

    public ListVendorsRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

    public ListVendorsRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
