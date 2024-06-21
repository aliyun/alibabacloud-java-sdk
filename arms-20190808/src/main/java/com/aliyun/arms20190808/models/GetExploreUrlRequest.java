// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetExploreUrlRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c9cc4c5e220f8461f9d71b6ec6e******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The query statement that corresponds to the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>{app=&quot;buy2&quot;}</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the Grafana data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prometheus</p>
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
