// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryModelUsageInfoResponseBody extends TeaModel {
    /**
     * <p>The model usage summary corresponding to the selected business, statistical window, and model type. If no statistical results are available for <code>24h</code> or <code>1d</code> queries without specified start and end dates, each metric returns 0. If no statistical results are available for other windows or custom date ranges, no valid metric values are provided. In this case, do not treat it as zero usage.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ActiveModelCount&quot;:10,&quot;CallCount&quot;:13280,&quot;PointsConsumption&quot;:120}</p>
     */
    @NameInMap("Data")
    public QueryModelUsageInfoResponseBodyData data;

    /**
     * <p>The unique identifier of the current request, which is used to locate and troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryModelUsageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryModelUsageInfoResponseBody self = new QueryModelUsageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryModelUsageInfoResponseBody setData(QueryModelUsageInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryModelUsageInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryModelUsageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryModelUsageInfoResponseBodyData extends TeaModel {
        /**
         * <p>The number of distinct models that have been called at least once within the query range. Unit: models. The value is deduplicated by model code. It may not be equal to <code>TotalCount</code> in the model usage list, because the latter may also include models that have not been called within the current query range.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ActiveModelCount")
        public Long activeModelCount;

        /**
         * <p>The total number of model calls within the query range. Unit: calls. This includes both successful and failed calls.</p>
         * 
         * <strong>example:</strong>
         * <p>13280</p>
         */
        @NameInMap("CallCount")
        public Long callCount;

        /**
         * <p>The actual points consumed within the query range. Unit: points. The returned value can be displayed directly without further conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("PointsConsumption")
        public Double pointsConsumption;

        public static QueryModelUsageInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryModelUsageInfoResponseBodyData self = new QueryModelUsageInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryModelUsageInfoResponseBodyData setActiveModelCount(Long activeModelCount) {
            this.activeModelCount = activeModelCount;
            return this;
        }
        public Long getActiveModelCount() {
            return this.activeModelCount;
        }

        public QueryModelUsageInfoResponseBodyData setCallCount(Long callCount) {
            this.callCount = callCount;
            return this;
        }
        public Long getCallCount() {
            return this.callCount;
        }

        public QueryModelUsageInfoResponseBodyData setPointsConsumption(Double pointsConsumption) {
            this.pointsConsumption = pointsConsumption;
            return this;
        }
        public Double getPointsConsumption() {
            return this.pointsConsumption;
        }

    }

}
