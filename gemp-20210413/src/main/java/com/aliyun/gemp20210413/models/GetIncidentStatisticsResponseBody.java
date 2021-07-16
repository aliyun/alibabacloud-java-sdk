// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentStatisticsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public GetIncidentStatisticsResponseBodyData data;

    public static GetIncidentStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentStatisticsResponseBody self = new GetIncidentStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIncidentStatisticsResponseBody setData(GetIncidentStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIncidentStatisticsResponseBodyData getData() {
        return this.data;
    }

    public static class GetIncidentStatisticsResponseBodyData extends TeaModel {
        // 我的 待响应
        @NameInMap("myResponse")
        public Integer myResponse;

        // 我的 完结
        @NameInMap("myFinish")
        public Integer myFinish;

        // 所有 待响应
        @NameInMap("allResponse")
        public Integer allResponse;

        // 所有 完结
        @NameInMap("allFinish")
        public Integer allFinish;

        public static GetIncidentStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentStatisticsResponseBodyData self = new GetIncidentStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIncidentStatisticsResponseBodyData setMyResponse(Integer myResponse) {
            this.myResponse = myResponse;
            return this;
        }
        public Integer getMyResponse() {
            return this.myResponse;
        }

        public GetIncidentStatisticsResponseBodyData setMyFinish(Integer myFinish) {
            this.myFinish = myFinish;
            return this;
        }
        public Integer getMyFinish() {
            return this.myFinish;
        }

        public GetIncidentStatisticsResponseBodyData setAllResponse(Integer allResponse) {
            this.allResponse = allResponse;
            return this;
        }
        public Integer getAllResponse() {
            return this.allResponse;
        }

        public GetIncidentStatisticsResponseBodyData setAllFinish(Integer allFinish) {
            this.allFinish = allFinish;
            return this;
        }
        public Integer getAllFinish() {
            return this.allFinish;
        }

    }

}
