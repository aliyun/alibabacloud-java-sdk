// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairsRequest extends TeaModel {
    // 分页查询时每页的最大条目数。取值范围：1~500
    // 
    // 默认值：10
    @NameInMap("MaxResults")
    public Long maxResults;

    // 查询凭证（Token）。取值为上一次调用该接口返回的NextToken参数值，初次调用接口时无需设置该参数。
    @NameInMap("NextToken")
    public String nextToken;

    // 异步复制关系ID列表。您可以指定一个或多个异步复制关系ID进行查询。格式为：pair-cn-dsa****,pair-cn-asd****。
    // 
    // 默认值为空，表示查询当前地域下所有的异步复制关系。
    @NameInMap("PairIds")
    public String pairIds;

    @NameInMap("RegionId")
    public String regionId;

    // 所属复制组id。
    @NameInMap("ReplicaGroupId")
    public String replicaGroupId;

    // production或backup，表示获取本地为主站点或备站点的复制对数据，默认为production。
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
