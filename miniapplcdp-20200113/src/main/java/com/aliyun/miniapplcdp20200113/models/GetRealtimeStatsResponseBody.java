// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetRealtimeStatsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRealtimeStatsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRealtimeStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeStatsResponseBody self = new GetRealtimeStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeStatsResponseBody setData(GetRealtimeStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealtimeStatsResponseBodyData getData() {
        return this.data;
    }

    public GetRealtimeStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealtimeStatsResponseBodyData extends TeaModel {
        @NameInMap("TodayPvCount")
        public java.util.Map<String, String> todayPvCount;

        @NameInMap("TodayUvCount")
        public java.util.Map<String, String> todayUvCount;

        @NameInMap("TotalPvCount")
        public java.util.Map<String, String> totalPvCount;

        @NameInMap("TotalUvCount")
        public java.util.Map<String, String> totalUvCount;

        public static GetRealtimeStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeStatsResponseBodyData self = new GetRealtimeStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealtimeStatsResponseBodyData setTodayPvCount(java.util.Map<String, String> todayPvCount) {
            this.todayPvCount = todayPvCount;
            return this;
        }
        public java.util.Map<String, String> getTodayPvCount() {
            return this.todayPvCount;
        }

        public GetRealtimeStatsResponseBodyData setTodayUvCount(java.util.Map<String, String> todayUvCount) {
            this.todayUvCount = todayUvCount;
            return this;
        }
        public java.util.Map<String, String> getTodayUvCount() {
            return this.todayUvCount;
        }

        public GetRealtimeStatsResponseBodyData setTotalPvCount(java.util.Map<String, String> totalPvCount) {
            this.totalPvCount = totalPvCount;
            return this;
        }
        public java.util.Map<String, String> getTotalPvCount() {
            return this.totalPvCount;
        }

        public GetRealtimeStatsResponseBodyData setTotalUvCount(java.util.Map<String, String> totalUvCount) {
            this.totalUvCount = totalUvCount;
            return this;
        }
        public java.util.Map<String, String> getTotalUvCount() {
            return this.totalUvCount;
        }

    }

}
