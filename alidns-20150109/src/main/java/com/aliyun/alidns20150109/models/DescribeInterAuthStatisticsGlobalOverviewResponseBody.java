// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsGlobalOverviewResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeInterAuthStatisticsGlobalOverviewResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInterAuthStatisticsGlobalOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsGlobalOverviewResponseBody self = new DescribeInterAuthStatisticsGlobalOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsGlobalOverviewResponseBody setData(DescribeInterAuthStatisticsGlobalOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInterAuthStatisticsGlobalOverviewResponseBodyData getData() {
        return this.data;
    }

    public DescribeInterAuthStatisticsGlobalOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInterAuthStatisticsGlobalOverviewResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("AvgSuccessRatio")
        public Long avgSuccessRatio;

        /**
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("AvgSuccessRatioTrend")
        public Long avgSuccessRatioTrend;

        /**
         * <strong>example:</strong>
         * <p>18349</p>
         */
        @NameInMap("TotalResolveCount")
        public Long totalResolveCount;

        /**
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("TotalResolveCountTrend")
        public Long totalResolveCountTrend;

        public static DescribeInterAuthStatisticsGlobalOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInterAuthStatisticsGlobalOverviewResponseBodyData self = new DescribeInterAuthStatisticsGlobalOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInterAuthStatisticsGlobalOverviewResponseBodyData setAvgSuccessRatio(Long avgSuccessRatio) {
            this.avgSuccessRatio = avgSuccessRatio;
            return this;
        }
        public Long getAvgSuccessRatio() {
            return this.avgSuccessRatio;
        }

        public DescribeInterAuthStatisticsGlobalOverviewResponseBodyData setAvgSuccessRatioTrend(Long avgSuccessRatioTrend) {
            this.avgSuccessRatioTrend = avgSuccessRatioTrend;
            return this;
        }
        public Long getAvgSuccessRatioTrend() {
            return this.avgSuccessRatioTrend;
        }

        public DescribeInterAuthStatisticsGlobalOverviewResponseBodyData setTotalResolveCount(Long totalResolveCount) {
            this.totalResolveCount = totalResolveCount;
            return this;
        }
        public Long getTotalResolveCount() {
            return this.totalResolveCount;
        }

        public DescribeInterAuthStatisticsGlobalOverviewResponseBodyData setTotalResolveCountTrend(Long totalResolveCountTrend) {
            this.totalResolveCountTrend = totalResolveCountTrend;
            return this;
        }
        public Long getTotalResolveCountTrend() {
            return this.totalResolveCountTrend;
        }

    }

}
