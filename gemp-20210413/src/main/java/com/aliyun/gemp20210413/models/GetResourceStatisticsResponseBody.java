// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetResourceStatisticsResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetResourceStatisticsResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetResourceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceStatisticsResponseBody self = new GetResourceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceStatisticsResponseBody setData(GetResourceStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetResourceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceStatisticsResponseBodyData extends TeaModel {
        // 报警总数
        @NameInMap("alertCount")
        public Integer alertCount;

        // 事件总数
        @NameInMap("incidentCount")
        public Integer incidentCount;

        // 集成总数
        @NameInMap("integrationCount")
        public Integer integrationCount;

        // 故障总数
        @NameInMap("problemCount")
        public Integer problemCount;

        public static GetResourceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceStatisticsResponseBodyData self = new GetResourceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceStatisticsResponseBodyData setAlertCount(Integer alertCount) {
            this.alertCount = alertCount;
            return this;
        }
        public Integer getAlertCount() {
            return this.alertCount;
        }

        public GetResourceStatisticsResponseBodyData setIncidentCount(Integer incidentCount) {
            this.incidentCount = incidentCount;
            return this;
        }
        public Integer getIncidentCount() {
            return this.incidentCount;
        }

        public GetResourceStatisticsResponseBodyData setIntegrationCount(Integer integrationCount) {
            this.integrationCount = integrationCount;
            return this;
        }
        public Integer getIntegrationCount() {
            return this.integrationCount;
        }

        public GetResourceStatisticsResponseBodyData setProblemCount(Integer problemCount) {
            this.problemCount = problemCount;
            return this;
        }
        public Integer getProblemCount() {
            return this.problemCount;
        }

    }

}
