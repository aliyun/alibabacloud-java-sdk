// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesRequest extends TeaModel {
    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The tag match conditions that are described in a JSON string. For more information about this parameter, see the **Additional description of the MatchExpressions parameter** section.
    @NameInMap("MatchExpressions")
    public String matchExpressions;

    // The name of the alert rule.
    @NameInMap("Name")
    public String name;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether the alert rule is enabled. Valid values:
    // 
    // *   `1`: The alert rule is enabled.
    // *   `0`: The alert rule is disabled.
    @NameInMap("Status")
    public Integer status;

    // The type of the alert rule.
    @NameInMap("Type")
    public String type;

    public static ListPrometheusAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertRulesRequest self = new ListPrometheusAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPrometheusAlertRulesRequest setMatchExpressions(String matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public String getMatchExpressions() {
        return this.matchExpressions;
    }

    public ListPrometheusAlertRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPrometheusAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPrometheusAlertRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListPrometheusAlertRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
