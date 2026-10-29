// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableActiveMetricRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests. The value can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>00000-xxxx-xxxxx--xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the availability of the webhook.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the Alibaba Cloud service that supports one-click alert rules. Valid values:</p>
     * <ul>
     * <li>ecs: Elastic Compute Service (ECS).</li>
     * <li>rds: ApsaraDB RDS.</li>
     * <li>slb: Server Load Balancer (SLB).</li>
     * <li>redis_standard: Standard architecture of open-source Redis.</li>
     * <li>redis_sharding: Cluster architecture of open-source Redis.</li>
     * <li>redis_splitrw: Read/write splitting architecture of open-source Redis.</li>
     * <li>mongodb: ApsaraDB for MongoDB (replica set).</li>
     * <li>mongodb_sharding: ApsaraDB for MongoDB (sharded cluster).</li>
     * <li>hbase: ApsaraDB for HBase.</li>
     * <li>elasticsearch: Elasticsearch.</li>
     * <li>opensearch: OpenSearch.</li>
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

    public EnableActiveMetricRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableActiveMetricRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
