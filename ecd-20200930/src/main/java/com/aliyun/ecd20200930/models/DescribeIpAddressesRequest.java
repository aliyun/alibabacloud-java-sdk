// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeIpAddressesRequest extends TeaModel {
    @NameInMap("EipId")
    public String eipId;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpAddressesRequest self = new DescribeIpAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpAddressesRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public DescribeIpAddressesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpAddressesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeIpAddressesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeIpAddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
