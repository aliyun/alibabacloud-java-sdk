// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetExploreUrlRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The query language corresponding to the data source.
    @NameInMap("Expression")
    public String expression;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the Grafana data source.
    @NameInMap("Type")
    public String type;

    public static GetExploreUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExploreUrlRequest self = new GetExploreUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetExploreUrlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetExploreUrlRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public GetExploreUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetExploreUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
