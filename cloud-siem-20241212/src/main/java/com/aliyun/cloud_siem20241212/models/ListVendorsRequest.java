// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListVendorsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: Although the schema marks this parameter as optional, it is required when you call this operation. If you do not specify this parameter, the API returns a 400 error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
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
     * <p>The pagination token for the next query. You do not need to specify this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the perspective of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The list of vendors.</p>
     */
    @NameInMap("VendorIds")
    public java.util.List<String> vendorIds;

    /**
     * <p>The vendor name.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("VendorName")
    public String vendorName;

    /**
     * <p>The vendor type. Valid values:</p>
     * <ul>
     * <li>preset</li>
     * <li>custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preset</p>
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
