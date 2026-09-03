// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListVirtualBridgesRequest extends TeaModel {
    /**
     * <p>The list of virtual bridge IDs.</p>
     */
    @NameInMap("BridgeId")
    public java.util.List<String> bridgeId;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 500.
     * Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. If NextToken is empty, no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mnFXZiT7NdvGNgkInJ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network ID.</p>
     * <blockquote>
     * <p>The <code>DirectoryId</code> parameter will be deprecated. Use this parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListVirtualBridgesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualBridgesRequest self = new ListVirtualBridgesRequest();
        return TeaModel.build(map, self);
    }

    public ListVirtualBridgesRequest setBridgeId(java.util.List<String> bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public java.util.List<String> getBridgeId() {
        return this.bridgeId;
    }

    public ListVirtualBridgesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVirtualBridgesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualBridgesRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListVirtualBridgesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
