// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaGroupsRequest extends TeaModel {
    @NameInMap("GroupIds")
    public String groupIds;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    // production或backup，表示数据从主或备站点获取，默认为production。
    @NameInMap("Site")
    public String site;

    public static DescribeDiskReplicaGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaGroupsRequest self = new DescribeDiskReplicaGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaGroupsRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public DescribeDiskReplicaGroupsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiskReplicaGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskReplicaGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiskReplicaGroupsRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
