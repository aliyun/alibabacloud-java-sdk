// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetHistogramsResponseBody extends TeaModel {
    /**
     * <p>The data of the charts.</p>
     */
    @NameInMap("Data")
    public GetHistogramsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHistogramsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistogramsResponseBody self = new GetHistogramsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistogramsResponseBody setData(GetHistogramsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistogramsResponseBodyData getData() {
        return this.data;
    }

    public GetHistogramsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHistogramsResponseBodyDataHistograms extends TeaModel {
        /**
         * <p>Indicates whether the query results within the subinterval is complete. Valid values:</p>
         * <br>
         * <p>*   true: The query is complete and the returned result is complete.</p>
         * <p>*   false: The query is complete but the returned result is incomplete. You must repeat the request to obtain the complete result.</p>
         */
        @NameInMap("CompletedOrNot")
        public Boolean completedOrNot;

        /**
         * <p>The number of logs within the subinterval.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("From")
        public Integer from;

        /**
         * <p>The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("To")
        public Integer to;

        public static GetHistogramsResponseBodyDataHistograms build(java.util.Map<String, ?> map) throws Exception {
            GetHistogramsResponseBodyDataHistograms self = new GetHistogramsResponseBodyDataHistograms();
            return TeaModel.build(map, self);
        }

        public GetHistogramsResponseBodyDataHistograms setCompletedOrNot(Boolean completedOrNot) {
            this.completedOrNot = completedOrNot;
            return this;
        }
        public Boolean getCompletedOrNot() {
            return this.completedOrNot;
        }

        public GetHistogramsResponseBodyDataHistograms setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetHistogramsResponseBodyDataHistograms setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public GetHistogramsResponseBodyDataHistograms setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class GetHistogramsResponseBodyData extends TeaModel {
        /**
         * <p>The distribution of logs.</p>
         */
        @NameInMap("Histograms")
        public java.util.List<GetHistogramsResponseBodyDataHistograms> histograms;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("Server")
        public String server;

        /**
         * <p>The number of logs that are generated within the subinterval.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetHistogramsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistogramsResponseBodyData self = new GetHistogramsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistogramsResponseBodyData setHistograms(java.util.List<GetHistogramsResponseBodyDataHistograms> histograms) {
            this.histograms = histograms;
            return this;
        }
        public java.util.List<GetHistogramsResponseBodyDataHistograms> getHistograms() {
            return this.histograms;
        }

        public GetHistogramsResponseBodyData setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public GetHistogramsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
