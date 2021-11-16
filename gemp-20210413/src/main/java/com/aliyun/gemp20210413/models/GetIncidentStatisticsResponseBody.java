// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentStatisticsResponseBody extends TeaModel {
    @NameInMap("data")
    public GetIncidentStatisticsResponseBodyData data;

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
        // 所有 完结
        @NameInMap("allFinish")
        public Integer allFinish;

        // 所有 待响应
        @NameInMap("allResponse")
        public Integer allResponse;

        // 我的 完结
        @NameInMap("myFinish")
        public Integer myFinish;

        // 我的 待响应
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
