// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetExploreUrlRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The query statement that corresponds to the data source.</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the Grafana data source.</p>
     */
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
