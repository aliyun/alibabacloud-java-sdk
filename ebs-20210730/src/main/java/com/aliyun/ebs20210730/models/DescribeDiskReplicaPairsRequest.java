// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PairIds")
    public String pairIds;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    // production或backup，表示数据从主或备站点获取，默认为production。
    @NameInMap("Site")
    public String site;

    public static DescribeDiskReplicaPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairsRequest self = new DescribeDiskReplicaPairsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskReplicaPairsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaPairsRequest setPairIds(String pairIds) {
        this.pairIds = pairIds;
        return this;
    }
    public String getPairIds() {
        return this.pairIds;
    }

    public DescribeDiskReplicaPairsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskReplicaPairsRequest setReplicaGroupId(String replicaGroupId) {
        this.replicaGroupId = replicaGroupId;
        return this;
    }
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    public DescribeDiskReplicaPairsRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
