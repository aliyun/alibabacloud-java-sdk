// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSourceFailureTrendGraphResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrendGraph")
    public java.util.List<DescribeSourceFailureTrendGraphResponseBodyTrendGraph> trendGraph;

    public static DescribeSourceFailureTrendGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSourceFailureTrendGraphResponseBody self = new DescribeSourceFailureTrendGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSourceFailureTrendGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSourceFailureTrendGraphResponseBody setTrendGraph(java.util.List<DescribeSourceFailureTrendGraphResponseBodyTrendGraph> trendGraph) {
        this.trendGraph = trendGraph;
        return this;
    }
    public java.util.List<DescribeSourceFailureTrendGraphResponseBodyTrendGraph> getTrendGraph() {
        return this.trendGraph;
    }

    public static class DescribeSourceFailureTrendGraphResponseBodyTrendGraph extends TeaModel {
        @NameInMap("Index")
        public Long index;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeSourceFailureTrendGraphResponseBodyTrendGraph build(java.util.Map<String, ?> map) throws Exception {
            DescribeSourceFailureTrendGraphResponseBodyTrendGraph self = new DescribeSourceFailureTrendGraphResponseBodyTrendGraph();
            return TeaModel.build(map, self);
        }

        public DescribeSourceFailureTrendGraphResponseBodyTrendGraph setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeSourceFailureTrendGraphResponseBodyTrendGraph setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
