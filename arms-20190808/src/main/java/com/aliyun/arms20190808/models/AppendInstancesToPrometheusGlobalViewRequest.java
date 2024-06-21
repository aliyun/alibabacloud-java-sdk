// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AppendInstancesToPrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>The list of global aggregation instances. The value is a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;sourceName&quot;: &quot;Data source name- ArmsPrometheus No.1&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;userId&quot;:&quot;UserID&quot;, &quot;clusterId&quot;:&quot;ClusterId&quot;, }, { &quot;sourceName&quot;: &quot;Data source name - MetrcStore No.2&quot;, &quot;sourceType&quot;:&quot;MetricStore&quot;, &quot;dataSource&quot;:&quot;Remote read endpoint of the MetricStore&quot;, &quot;extras&quot;:{ &quot;username&quot;:&quot;BasicAuthUsername&quot;, &quot;password&quot;:&quot;BasicAuthPassword&quot; } }, { &quot;sourceName&quot;: &quot;Custom &quot;, &quot;sourceType&quot;:&quot;CustomPrometheus&quot;, &quot;dataSource&quot;:&quot;Remote read endpoint of the self-managed Prometheus data source&quot;, &quot;extras&quot;:{ &quot;username&quot;:&quot;BasicAuthUsername&quot;, &quot;password&quot;:&quot;BasicAuthPassword&quot; } }, { &quot;sourceName&quot;: &quot;Other one &quot;, &quot;sourceType&quot;:&quot;Others&quot;, &quot;dataSource&quot;:&quot;Endpoint of another data source such as Tencent remote read&quot;, &quot;headers&quot;:{ &quot;AnyHeaderToFill&quot;:&quot;Headers to be filled&quot; }, &quot;extras&quot;:{ &quot;username&quot;:&quot;BasicAuthUsername&quot;, &quot;password&quot;:&quot;BasicAuthPassword&quot; } } // ....... more addre ]</p>
     */
    @NameInMap("Clusters")
    public String clusters;

    /**
     * <p>The ID of the global aggregation instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>global-v2-cn-1670100631025794-6gjc0qgb</p>
     */
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    /**
     * <p>The name of the global aggregation instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zyGlobalView</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AppendInstancesToPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendInstancesToPrometheusGlobalViewRequest self = new AppendInstancesToPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public AppendInstancesToPrometheusGlobalViewRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public AppendInstancesToPrometheusGlobalViewRequest setGlobalViewClusterId(String globalViewClusterId) {
        this.globalViewClusterId = globalViewClusterId;
        return this;
    }
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    public AppendInstancesToPrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AppendInstancesToPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
