// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserTrailCountResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeUserTrailCountResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>EDDEBA6B-FFE2-4EF6-8BAB-2A6B98DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserTrailCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTrailCountResponseBody self = new DescribeUserTrailCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTrailCountResponseBody setData(DescribeUserTrailCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserTrailCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserTrailCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserTrailCountResponseBodyData extends TeaModel {
        @NameInMap("Counts")
        public java.util.List<Long> counts;

        @NameInMap("Dates")
        public java.util.List<String> dates;

        public static DescribeUserTrailCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTrailCountResponseBodyData self = new DescribeUserTrailCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserTrailCountResponseBodyData setCounts(java.util.List<Long> counts) {
            this.counts = counts;
            return this;
        }
        public java.util.List<Long> getCounts() {
            return this.counts;
        }

        public DescribeUserTrailCountResponseBodyData setDates(java.util.List<String> dates) {
            this.dates = dates;
            return this;
        }
        public java.util.List<String> getDates() {
            return this.dates;
        }

    }

}
