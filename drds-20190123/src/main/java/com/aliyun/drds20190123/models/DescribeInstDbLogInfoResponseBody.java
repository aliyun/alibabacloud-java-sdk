// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbLogInfoResponseBody extends TeaModel {
    /**
     * <p>The time range for log query.</p>
     */
    @NameInMap("LogTimeRange")
    public DescribeInstDbLogInfoResponseBodyLogTimeRange logTimeRange;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5438952-70EE-4FA5-87A9-080DB0ASD45F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstDbLogInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbLogInfoResponseBody self = new DescribeInstDbLogInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbLogInfoResponseBody setLogTimeRange(DescribeInstDbLogInfoResponseBodyLogTimeRange logTimeRange) {
        this.logTimeRange = logTimeRange;
        return this;
    }
    public DescribeInstDbLogInfoResponseBodyLogTimeRange getLogTimeRange() {
        return this.logTimeRange;
    }

    public DescribeInstDbLogInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstDbLogInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstDbLogInfoResponseBodyLogTimeRange extends TeaModel {
        /**
         * <p>The start time of the query time range.</p>
         * 
         * <strong>example:</strong>
         * <p>1568267711</p>
         */
        @NameInMap("SupportLatestTime")
        public Long supportLatestTime;

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1568367711</p>
         */
        @NameInMap("SupportOldestTime")
        public Long supportOldestTime;

        public static DescribeInstDbLogInfoResponseBodyLogTimeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstDbLogInfoResponseBodyLogTimeRange self = new DescribeInstDbLogInfoResponseBodyLogTimeRange();
            return TeaModel.build(map, self);
        }

        public DescribeInstDbLogInfoResponseBodyLogTimeRange setSupportLatestTime(Long supportLatestTime) {
            this.supportLatestTime = supportLatestTime;
            return this;
        }
        public Long getSupportLatestTime() {
            return this.supportLatestTime;
        }

        public DescribeInstDbLogInfoResponseBodyLogTimeRange setSupportOldestTime(Long supportOldestTime) {
            this.supportOldestTime = supportOldestTime;
            return this;
        }
        public Long getSupportOldestTime() {
            return this.supportOldestTime;
        }

    }

}
