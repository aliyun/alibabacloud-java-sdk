// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleRequest extends TeaModel {
    /**
     * <p>The cloud service for which you want to enable initiative alert. Valid values:</p>
     * <ul>
     * <li>ECS: Elastic Compute Service (ECS)</li>
     * <li>rds: ApsaraDB RDS</li>
     * <li>slb: Server Load Balancer (SLB)</li>
     * <li>redis_standard: Redis Open-Source Edition (standard architecture)</li>
     * <li>redis_sharding: Redis Open-Source Edition (cluster architecture)</li>
     * <li>redis_splitrw: Redis Open-Source Edition (read/write splitting architecture)</li>
     * <li>mongodb: ApsaraDB for MongoDB of the replica set architecture</li>
     * <li>mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</li>
     * <li>hbase: ApsaraDB for HBase</li>
     * <li>elasticsearch: Elasticsearch</li>
     * <li>opensearch: OpenSearch</li>
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
