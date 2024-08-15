// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetResourceStatisticsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetResourceStatisticsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("alertCount")
        public Integer alertCount;

        /**
         * <strong>example:</strong>
         * <p>1331</p>
         */
        @NameInMap("incidentCount")
        public Integer incidentCount;

        /**
         * <strong>example:</strong>
         * <p>2211</p>
         */
        @NameInMap("integrationCount")
        public Integer integrationCount;

        /**
         * <strong>example:</strong>
         * <p>221</p>
         */
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
