// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbLogInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LogTimeRange")
    public DescribeInstDbLogInfoResponseBodyLogTimeRange logTimeRange;

    public static DescribeInstDbLogInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbLogInfoResponseBody self = new DescribeInstDbLogInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbLogInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstDbLogInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstDbLogInfoResponseBody setLogTimeRange(DescribeInstDbLogInfoResponseBodyLogTimeRange logTimeRange) {
        this.logTimeRange = logTimeRange;
        return this;
    }
    public DescribeInstDbLogInfoResponseBodyLogTimeRange getLogTimeRange() {
        return this.logTimeRange;
    }

    public static class DescribeInstDbLogInfoResponseBodyLogTimeRange extends TeaModel {
        @NameInMap("SupportOldestTime")
        public Long supportOldestTime;

        @NameInMap("SupportLatestTime")
        public Long supportLatestTime;

        public static DescribeInstDbLogInfoResponseBodyLogTimeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstDbLogInfoResponseBodyLogTimeRange self = new DescribeInstDbLogInfoResponseBodyLogTimeRange();
            return TeaModel.build(map, self);
        }

        public DescribeInstDbLogInfoResponseBodyLogTimeRange setSupportOldestTime(Long supportOldestTime) {
            this.supportOldestTime = supportOldestTime;
            return this;
        }
        public Long getSupportOldestTime() {
            return this.supportOldestTime;
        }

        public DescribeInstDbLogInfoResponseBodyLogTimeRange setSupportLatestTime(Long supportLatestTime) {
            this.supportLatestTime = supportLatestTime;
            return this;
        }
        public Long getSupportLatestTime() {
            return this.supportLatestTime;
        }

    }

}
