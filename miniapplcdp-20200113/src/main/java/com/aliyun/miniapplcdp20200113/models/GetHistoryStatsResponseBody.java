// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetHistoryStatsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetHistoryStatsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHistoryStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryStatsResponseBody self = new GetHistoryStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryStatsResponseBody setData(GetHistoryStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoryStatsResponseBodyData getData() {
        return this.data;
    }

    public GetHistoryStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHistoryStatsResponseBodyData extends TeaModel {
        @NameInMap("HistoryPv")
        public java.util.Map<String, String> historyPv;

        @NameInMap("HistoryUv")
        public java.util.Map<String, String> historyUv;

        public static GetHistoryStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryStatsResponseBodyData self = new GetHistoryStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoryStatsResponseBodyData setHistoryPv(java.util.Map<String, String> historyPv) {
            this.historyPv = historyPv;
            return this;
        }
        public java.util.Map<String, String> getHistoryPv() {
            return this.historyPv;
        }

        public GetHistoryStatsResponseBodyData setHistoryUv(java.util.Map<String, String> historyUv) {
            this.historyUv = historyUv;
            return this;
        }
        public java.util.Map<String, String> getHistoryUv() {
            return this.historyUv;
        }

    }

}
