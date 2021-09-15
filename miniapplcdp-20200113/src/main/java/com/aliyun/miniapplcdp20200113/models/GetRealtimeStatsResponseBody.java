// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetRealtimeStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetRealtimeStatsResponseBodyData data;

    public static GetRealtimeStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeStatsResponseBody self = new GetRealtimeStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRealtimeStatsResponseBody setData(GetRealtimeStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealtimeStatsResponseBodyData getData() {
        return this.data;
    }

    public static class GetRealtimeStatsResponseBodyData extends TeaModel {
        @NameInMap("TotalUvCount")
        public java.util.Map<String, ?> totalUvCount;

        @NameInMap("TotalPvCount")
        public java.util.Map<String, ?> totalPvCount;

        @NameInMap("TodayPvCount")
        public java.util.Map<String, ?> todayPvCount;

        @NameInMap("TodayUvCount")
        public java.util.Map<String, ?> todayUvCount;

        public static GetRealtimeStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeStatsResponseBodyData self = new GetRealtimeStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealtimeStatsResponseBodyData setTotalUvCount(java.util.Map<String, ?> totalUvCount) {
            this.totalUvCount = totalUvCount;
            return this;
        }
        public java.util.Map<String, ?> getTotalUvCount() {
            return this.totalUvCount;
        }

        public GetRealtimeStatsResponseBodyData setTotalPvCount(java.util.Map<String, ?> totalPvCount) {
            this.totalPvCount = totalPvCount;
            return this;
        }
        public java.util.Map<String, ?> getTotalPvCount() {
            return this.totalPvCount;
        }

        public GetRealtimeStatsResponseBodyData setTodayPvCount(java.util.Map<String, ?> todayPvCount) {
            this.todayPvCount = todayPvCount;
            return this;
        }
        public java.util.Map<String, ?> getTodayPvCount() {
            return this.todayPvCount;
        }

        public GetRealtimeStatsResponseBodyData setTodayUvCount(java.util.Map<String, ?> todayUvCount) {
            this.todayUvCount = todayUvCount;
            return this;
        }
        public java.util.Map<String, ?> getTodayUvCount() {
            return this.todayUvCount;
        }

    }

}
