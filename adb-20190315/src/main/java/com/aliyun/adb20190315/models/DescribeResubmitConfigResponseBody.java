// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeResubmitConfigResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeResubmitConfigResponseBodyRules> rules;

    public static DescribeResubmitConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResubmitConfigResponseBody self = new DescribeResubmitConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResubmitConfigResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeResubmitConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResubmitConfigResponseBody setRules(java.util.List<DescribeResubmitConfigResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeResubmitConfigResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeResubmitConfigResponseBodyRules extends TeaModel {
        @NameInMap("ExceedMemoryException")
        public Boolean exceedMemoryException;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("PeakMemory")
        public String peakMemory;

        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static DescribeResubmitConfigResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeResubmitConfigResponseBodyRules self = new DescribeResubmitConfigResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeResubmitConfigResponseBodyRules setExceedMemoryException(Boolean exceedMemoryException) {
            this.exceedMemoryException = exceedMemoryException;
            return this;
        }
        public Boolean getExceedMemoryException() {
            return this.exceedMemoryException;
        }

        public DescribeResubmitConfigResponseBodyRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeResubmitConfigResponseBodyRules setPeakMemory(String peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public String getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeResubmitConfigResponseBodyRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeResubmitConfigResponseBodyRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

}
