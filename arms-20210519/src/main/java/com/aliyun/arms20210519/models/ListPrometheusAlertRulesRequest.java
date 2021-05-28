// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("MatchExpressions")
    public String matchExpressions;

    public static ListPrometheusAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertRulesRequest self = new ListPrometheusAlertRulesRequest();
        return TeaModel.build(map, self);
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

    public ListPrometheusAlertRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListPrometheusAlertRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListPrometheusAlertRulesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListPrometheusAlertRulesRequest setMatchExpressions(String matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public String getMatchExpressions() {
        return this.matchExpressions;
    }

}
