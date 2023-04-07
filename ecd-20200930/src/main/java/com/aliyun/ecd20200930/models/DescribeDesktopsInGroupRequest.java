// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopsInGroupRequest extends TeaModel {
    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether to ignore the deleted cloud desktops.</p>
     */
    @NameInMap("IgnoreDeleted")
    public Boolean ignoreDeleted;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If you do not specify this parameter, null is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The billing method of the desktop group.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDesktopsInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopsInGroupRequest self = new DescribeDesktopsInGroupRequest();
        return TeaModel.build(map, self);
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
