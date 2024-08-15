// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentStatisticsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetIncidentStatisticsResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetIncidentStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentStatisticsResponseBody self = new GetIncidentStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentStatisticsResponseBody setData(GetIncidentStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIncidentStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetIncidentStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIncidentStatisticsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>113</p>
         */
        @NameInMap("allFinish")
        public Integer allFinish;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("allResponse")
        public Integer allResponse;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("myFinish")
        public Integer myFinish;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("myResponse")
        public Integer myResponse;

        public static GetIncidentStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentStatisticsResponseBodyData self = new GetIncidentStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIncidentStatisticsResponseBodyData setAllFinish(Integer allFinish) {
            this.allFinish = allFinish;
            return this;
        }
        public Integer getAllFinish() {
            return this.allFinish;
        }

        public GetIncidentStatisticsResponseBodyData setAllResponse(Integer allResponse) {
            this.allResponse = allResponse;
            return this;
        }
        public Integer getAllResponse() {
            return this.allResponse;
        }

        public GetIncidentStatisticsResponseBodyData setMyFinish(Integer myFinish) {
            this.myFinish = myFinish;
            return this;
        }
        public Integer getMyFinish() {
            return this.myFinish;
        }

        public GetIncidentStatisticsResponseBodyData setMyResponse(Integer myResponse) {
            this.myResponse = myResponse;
            return this;
        }
        public Integer getMyResponse() {
            return this.myResponse;
        }

    }

}
