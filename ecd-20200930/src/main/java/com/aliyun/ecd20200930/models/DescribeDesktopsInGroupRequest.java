// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupRequest extends TeaModel {
    @NameInMap("CustomEndTimePeriod")
    public Long customEndTimePeriod;

    @NameInMap("CustomStartTimePeriod")
    public Long customStartTimePeriod;

    /**
     * <p>The ID of the desktop group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether to return deleted desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreDeleted")
    public Boolean ignoreDeleted;

    /**
     * <p>The maximum number of entries to return on a single page.</p>
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
     * <p>The token that is used to start the next query. If this parameter is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDesktopsInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsInGroupRequest self = new DescribeDesktopsInGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopsInGroupRequest setCustomEndTimePeriod(Long customEndTimePeriod) {
        this.customEndTimePeriod = customEndTimePeriod;
        return this;
    }
    public Long getCustomEndTimePeriod() {
        return this.customEndTimePeriod;
    }

    public DescribeDesktopsInGroupRequest setCustomStartTimePeriod(Long customStartTimePeriod) {
        this.customStartTimePeriod = customStartTimePeriod;
        return this;
    }
    public Long getCustomStartTimePeriod() {
        return this.customStartTimePeriod;
    }

    public DescribeDesktopsInGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeDesktopsInGroupRequest setIgnoreDeleted(Boolean ignoreDeleted) {
        this.ignoreDeleted = ignoreDeleted;
        return this;
    }
    public Boolean getIgnoreDeleted() {
        return this.ignoreDeleted;
    }

    public DescribeDesktopsInGroupRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopsInGroupRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopsInGroupRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDesktopsInGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
