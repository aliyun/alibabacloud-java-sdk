// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class QueryApmGrafanaDataRequest extends TeaModel {
    /**
     * <p>The name of the monitoring dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>spark-all</p>
     */
    @NameInMap("componentName")
    public String componentName;

    /**
     * <p>The dashboard ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ex2tTKoNz</p>
     */
    @NameInMap("dashboardId")
    public String dashboardId;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1697033783</p>
     */
    @NameInMap("end")
    public String end;

    /**
     * <p>The datasource provider.</p>
     * 
     * <strong>example:</strong>
     * <p>spark</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The PromQL query expression.</p>
     * 
     * <strong>example:</strong>
     * <p>bizType:</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The panel-level query parameters.</p>
     */
    @NameInMap("queryParams")
    public QueryApmGrafanaDataRequestQueryParams queryParams;

    /**
     * <p>The Grafana datasource proxy path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/datasources/proxy/1/api/v1/query_range</p>
     */
    @NameInMap("queryUrl")
    public String queryUrl;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1697030183</p>
     */
    @NameInMap("start")
    public String start;

    /**
     * <p>The query step, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("step")
    public String step;

    /**
     * <p>The time point for an instant query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1697033783</p>
     */
    @NameInMap("time")
    public String time;

    /**
     * <p>The dashboard variables, as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fenix_job_runId&quot;:&quot;jr-b5059689bb50f360&quot;}</p>
     */
    @NameInMap("variables")
    public String variables;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-d2d82aa09155****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static QueryApmGrafanaDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApmGrafanaDataRequest self = new QueryApmGrafanaDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryApmGrafanaDataRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public QueryApmGrafanaDataRequest setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }
    public String getDashboardId() {
        return this.dashboardId;
    }

    public QueryApmGrafanaDataRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public QueryApmGrafanaDataRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QueryApmGrafanaDataRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryApmGrafanaDataRequest setQueryParams(QueryApmGrafanaDataRequestQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public QueryApmGrafanaDataRequestQueryParams getQueryParams() {
        return this.queryParams;
    }

    public QueryApmGrafanaDataRequest setQueryUrl(String queryUrl) {
        this.queryUrl = queryUrl;
        return this;
    }
    public String getQueryUrl() {
        return this.queryUrl;
    }

    public QueryApmGrafanaDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryApmGrafanaDataRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public QueryApmGrafanaDataRequest setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

    public QueryApmGrafanaDataRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public QueryApmGrafanaDataRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public QueryApmGrafanaDataRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class QueryApmGrafanaDataRequestQueryParams extends TeaModel {
        /**
         * <p>The panel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("panelId")
        public Long panelId;

        /**
         * <p>The query reference ID in the panel.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("refId")
        public String refId;

        /**
         * <p>The variable name. Used when querying the dropdown values of dashboard variables.</p>
         * 
         * <strong>example:</strong>
         * <p>job_oss_download_bandwidth</p>
         */
        @NameInMap("variableName")
        public String variableName;

        public static QueryApmGrafanaDataRequestQueryParams build(java.util.Map<String, ?> map) throws Exception {
            QueryApmGrafanaDataRequestQueryParams self = new QueryApmGrafanaDataRequestQueryParams();
            return TeaModel.build(map, self);
        }

        public QueryApmGrafanaDataRequestQueryParams setPanelId(Long panelId) {
            this.panelId = panelId;
            return this;
        }
        public Long getPanelId() {
            return this.panelId;
        }

        public QueryApmGrafanaDataRequestQueryParams setRefId(String refId) {
            this.refId = refId;
            return this;
        }
        public String getRefId() {
            return this.refId;
        }

        public QueryApmGrafanaDataRequestQueryParams setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

    }

}
