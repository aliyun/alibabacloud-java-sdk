// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network IDs. You can specify 1 to 100 office network IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public java.util.List<String> officeSiteId;

    /**
     * <p>The type of account for the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The security protection setting for the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>SASE</p>
     */
    @NameInMap("SecurityProtection")
    public String securityProtection;

    /**
     * <p>The office network status.</p>
     * 
     * <strong>example:</strong>
     * <p>REGISTERED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeOfficeSitesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesRequest self = new DescribeOfficeSitesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DescribeOfficeSitesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeOfficeSitesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOfficeSitesRequest setOfficeSiteId(java.util.List<String> officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public java.util.List<String> getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeOfficeSitesRequest setOfficeSiteType(String officeSiteType) {
        this.officeSiteType = officeSiteType;
        return this;
    }
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    public DescribeOfficeSitesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOfficeSitesRequest setSecurityProtection(String securityProtection) {
        this.securityProtection = securityProtection;
        return this;
    }
    public String getSecurityProtection() {
        return this.securityProtection;
    }

    public DescribeOfficeSitesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeOfficeSitesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
