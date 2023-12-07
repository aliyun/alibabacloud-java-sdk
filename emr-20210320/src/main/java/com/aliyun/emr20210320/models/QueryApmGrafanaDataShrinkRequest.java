// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class QueryApmGrafanaDataShrinkRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DashboardId")
    public String dashboardId;

    @NameInMap("End")
    public String end;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Query")
    public String query;

    @NameInMap("QueryParams")
    public QueryParams queryParams;

    @NameInMap("QueryUrl")
    public String queryUrl;

    /**
     * <p>地域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>如果存在clusterId，从Cluster中获取该值，如果clusterId为空，用户显式指定</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Start")
    public String start;

    @NameInMap("Step")
    public String step;

    @NameInMap("Time")
    public String time;

    @NameInMap("Variables")
    public String variablesShrink;

    public static QueryApmGrafanaDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApmGrafanaDataShrinkRequest self = new QueryApmGrafanaDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryApmGrafanaDataShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryApmGrafanaDataShrinkRequest setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }
    public String getDashboardId() {
        return this.dashboardId;
    }

    public QueryApmGrafanaDataShrinkRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public QueryApmGrafanaDataShrinkRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QueryApmGrafanaDataShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryApmGrafanaDataShrinkRequest setQueryParams(QueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public QueryParams getQueryParams() {
        return this.queryParams;
    }

    public QueryApmGrafanaDataShrinkRequest setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl;
        return this;
    }
    public String getQueryUrl() {
        return this.queryUrl;
    }

    public QueryApmGrafanaDataShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryApmGrafanaDataShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public QueryApmGrafanaDataShrinkRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public QueryApmGrafanaDataShrinkRequest setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

    public QueryApmGrafanaDataShrinkRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public QueryApmGrafanaDataShrinkRequest setVariablesShrink(String variablesShrink) {
        this.variablesShrink = variablesShrink;
        return this;
    }
    public String getVariablesShrink() {
        return this.variablesShrink;
    }

    public static class QueryParams extends TeaModel {
        @NameInMap("PanelId")
        public Long panelId;

        @NameInMap("RefId")
        public String refId;

        @NameInMap("VariableName")
        public String variableName;

        public static QueryParams build(java.util.Map<String, ?> map) throws Exception {
            QueryParams self = new QueryParams();
            return TeaModel.build(map, self);
        }

        public QueryParams setPanelId(Long panelId) {
            this.panelId = panelId;
            return this;
        }
        public Long getPanelId() {
            return this.panelId;
        }

        public QueryParams setRefId(String refId) {
            this.refId = refId;
            return this;
        }
        public String getRefId() {
            return this.refId;
        }

        public QueryParams setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

    }

}
