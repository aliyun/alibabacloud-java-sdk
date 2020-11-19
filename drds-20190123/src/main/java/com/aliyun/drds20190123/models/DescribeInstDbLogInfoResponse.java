// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbLogInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("LogTimeRange")
    @Validation(required = true)
    public DescribeInstDbLogInfoResponseLogTimeRange logTimeRange;

    public static DescribeInstDbLogInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbLogInfoResponse self = new DescribeInstDbLogInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbLogInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstDbLogInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstDbLogInfoResponse setLogTimeRange(DescribeInstDbLogInfoResponseLogTimeRange logTimeRange) {
        this.logTimeRange = logTimeRange;
        return this;
    }
    public DescribeInstDbLogInfoResponseLogTimeRange getLogTimeRange() {
        return this.logTimeRange;
    }

    public static class DescribeInstDbLogInfoResponseLogTimeRange extends TeaModel {
        @NameInMap("SupportOldestTime")
        @Validation(required = true)
        public Long supportOldestTime;

        @NameInMap("SupportLatestTime")
        @Validation(required = true)
        public Long supportLatestTime;

        public static DescribeInstDbLogInfoResponseLogTimeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstDbLogInfoResponseLogTimeRange self = new DescribeInstDbLogInfoResponseLogTimeRange();
            return TeaModel.build(map, self);
        }

        public DescribeInstDbLogInfoResponseLogTimeRange setSupportOldestTime(Long supportOldestTime) {
            this.supportOldestTime = supportOldestTime;
            return this;
        }
        public Long getSupportOldestTime() {
            return this.supportOldestTime;
        }

        public DescribeInstDbLogInfoResponseLogTimeRange setSupportLatestTime(Long supportLatestTime) {
            this.supportLatestTime = supportLatestTime;
            return this;
        }
        public Long getSupportLatestTime() {
            return this.supportLatestTime;
        }

    }

}
