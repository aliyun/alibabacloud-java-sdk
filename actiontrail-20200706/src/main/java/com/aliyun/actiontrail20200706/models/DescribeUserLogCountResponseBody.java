// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserLogCountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeUserLogCountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90D6CC31-947F-5D8A-BEDC-F312EE9B31EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserLogCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogCountResponseBody self = new DescribeUserLogCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogCountResponseBody setData(DescribeUserLogCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserLogCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserLogCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserLogCountResponseBodyData extends TeaModel {
        /**
         * <p>The statistics returned.</p>
         */
        @NameInMap("Counts")
        public java.util.List<Long> counts;

        /**
         * <p>The dates of logs.</p>
         */
        @NameInMap("Dates")
        public java.util.List<String> dates;

        public static DescribeUserLogCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserLogCountResponseBodyData self = new DescribeUserLogCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserLogCountResponseBodyData setCounts(java.util.List<Long> counts) {
            this.counts = counts;
            return this;
        }
        public java.util.List<Long> getCounts() {
            return this.counts;
        }

        public DescribeUserLogCountResponseBodyData setDates(java.util.List<String> dates) {
            this.dates = dates;
            return this;
        }
        public java.util.List<String> getDates() {
            return this.dates;
        }

    }

}
