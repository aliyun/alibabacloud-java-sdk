// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusIntegrationRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance. Only a Prometheus instance for Container Service or a Prometheus instance for ECS is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The exporter ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2893</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The type of the integration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kafka, mysql, redis, snmp, emr, nubela, and tidb</p>
     */
    @NameInMap("IntegrationType")
    public String integrationType;

    /**
     * <p>The configurations of the exporter. The value is a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;port&quot;: &quot;5554&quot;,
     *       &quot;name&quot;: &quot;kafka-test12&quot;,
     *       &quot;kafka_instance&quot;: &quot;kafka-test&quot;,
     *       &quot;__label_value&quot;: &quot;kafka-test&quot;,
     *       &quot;scrape_interval&quot;: 33,
     *       &quot;metrics_path&quot;: &quot;/metrics&quot;,
     *       &quot;__label_key&quot;: &quot;kafka-test&quot;
     * }</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdatePrometheusIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusIntegrationRequest self = new UpdatePrometheusIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusIntegrationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusIntegrationRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public UpdatePrometheusIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public UpdatePrometheusIntegrationRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public UpdatePrometheusIntegrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
