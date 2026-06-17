// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleRequest extends TeaModel {
    /**
     * <p>The cloud service for which you want to enable initiative alert. Valid values:</p>
     * <ul>
     * <li><p>ECS: Elastic Compute Service (ECS)</p>
     * </li>
     * <li><p>rds: ApsaraDB RDS</p>
     * </li>
     * <li><p>slb: Server Load Balancer (SLB)</p>
     * </li>
     * <li><p>redis_standard: Redis Open-Source Edition (standard architecture)</p>
     * </li>
     * <li><p>redis_sharding: Redis Open-Source Edition (cluster architecture)</p>
     * </li>
     * <li><p>redis_splitrw: Redis Open-Source Edition (read/write splitting architecture)</p>
     * </li>
     * <li><p>mongodb: ApsaraDB for MongoDB of the replica set architecture</p>
     * </li>
     * <li><p>mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</p>
     * </li>
     * <li><p>hbase: ApsaraDB for HBase</p>
     * </li>
     * <li><p>elasticsearch: Elasticsearch</p>
     * </li>
     * <li><p>opensearch: OpenSearch</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableActiveMetricRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableActiveMetricRuleRequest self = new EnableActiveMetricRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableActiveMetricRuleRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public EnableActiveMetricRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
