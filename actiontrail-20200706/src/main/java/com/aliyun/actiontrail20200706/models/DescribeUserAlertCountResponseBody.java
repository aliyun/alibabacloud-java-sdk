// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserAlertCountResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeUserAlertCountResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90D6CC31-947F-5D8A-BEDC-F312EE9B31EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserAlertCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAlertCountResponseBody self = new DescribeUserAlertCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAlertCountResponseBody setData(DescribeUserAlertCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserAlertCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserAlertCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserAlertCountResponseBodyData extends TeaModel {
        /**
         * <p>The statistics returned.</p>
         */
        @NameInMap("Counts")
        public java.util.List<Long> counts;

        /**
         * <p>The dates of alerts.</p>
         */
        @NameInMap("Dates")
        public java.util.List<String> dates;

        public static DescribeUserAlertCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAlertCountResponseBodyData self = new DescribeUserAlertCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserAlertCountResponseBodyData setCounts(java.util.List<Long> counts) {
            this.counts = counts;
            return this;
        }
        public java.util.List<Long> getCounts() {
            return this.counts;
        }

        public DescribeUserAlertCountResponseBodyData setDates(java.util.List<String> dates) {
            this.dates = dates;
            return this;
        }
        public java.util.List<String> getDates() {
            return this.dates;
        }

    }

}
