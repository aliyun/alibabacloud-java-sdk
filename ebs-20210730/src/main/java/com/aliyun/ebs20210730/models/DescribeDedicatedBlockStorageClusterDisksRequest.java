// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDedicatedBlockStorageClusterDisksRequest extends TeaModel {
    @NameInMap("DbscId")
    public String dbscId;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDedicatedBlockStorageClusterDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedBlockStorageClusterDisksRequest self = new DescribeDedicatedBlockStorageClusterDisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setDbscId(String dbscId) {
        this.dbscId = dbscId;
        return this;
    }
    public String getDbscId() {
        return this.dbscId;
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedBlockStorageClusterDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
