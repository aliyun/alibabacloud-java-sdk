// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyOverviewStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTopologyOverviewStatisticsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyOverviewStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyOverviewStatisticsResponseBody self = new QueryTopologyOverviewStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyOverviewStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyOverviewStatisticsResponseBody setData(QueryTopologyOverviewStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTopologyOverviewStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryTopologyOverviewStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyOverviewStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyOverviewStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyOverviewStatisticsResponseBodyData extends TeaModel {
        @NameInMap("chaosScenarios")
        public Integer chaosScenarios;

        @NameInMap("flowLimitApps")
        public Integer flowLimitApps;

        public static QueryTopologyOverviewStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyOverviewStatisticsResponseBodyData self = new QueryTopologyOverviewStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyOverviewStatisticsResponseBodyData setChaosScenarios(Integer chaosScenarios) {
            this.chaosScenarios = chaosScenarios;
            return this;
        }
        public Integer getChaosScenarios() {
            return this.chaosScenarios;
        }

        public QueryTopologyOverviewStatisticsResponseBodyData setFlowLimitApps(Integer flowLimitApps) {
            this.flowLimitApps = flowLimitApps;
            return this;
        }
        public Integer getFlowLimitApps() {
            return this.flowLimitApps;
        }

    }

}
