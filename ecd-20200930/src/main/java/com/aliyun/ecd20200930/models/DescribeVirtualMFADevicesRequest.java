// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVirtualMFADevicesRequest extends TeaModel {
    /**
     * <p>>  This parameter is in invitational preview and unavailable for public use.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The number of consecutive failures to bind the virtual MFA device, or the number of MFA failures based on the virtual MFA device.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the AD user.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The operation that you want to perform. Set the value to DescribeVirtualMFADevices.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The token that determines the start point of the query. Set the value to the NextToken value returned in the last call.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeVirtualMFADevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualMFADevicesRequest self = new DescribeVirtualMFADevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualMFADevicesRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public DescribeVirtualMFADevicesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVirtualMFADevicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVirtualMFADevicesRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeVirtualMFADevicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
