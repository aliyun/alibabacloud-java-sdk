// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupRequest extends TeaModel {
    /**
     * <p>The end time of the custom time range.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("CustomEndTimePeriod")
    public Long customEndTimePeriod;

    /**
     * <p>The start time of the custom time range.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CustomStartTimePeriod")
    public Long customStartTimePeriod;

    /**
     * <p>The ID of the shared cloud desktop.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether to ignore the deletion flag.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreDeleted")
    public Boolean ignoreDeleted;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. An empty value indicates that no more results exist.</p>
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
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
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
