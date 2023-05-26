// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertRulesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("MatchExpressions")
    public String matchExpressions;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Tags")
    public java.util.List<ListPrometheusAlertRulesRequestTags> tags;

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

    public ListPrometheusAlertRulesRequest setTags(java.util.List<ListPrometheusAlertRulesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPrometheusAlertRulesRequestTags> getTags() {
        return this.tags;
    }

    public ListPrometheusAlertRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListPrometheusAlertRulesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListPrometheusAlertRulesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertRulesRequestTags self = new ListPrometheusAlertRulesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertRulesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusAlertRulesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
