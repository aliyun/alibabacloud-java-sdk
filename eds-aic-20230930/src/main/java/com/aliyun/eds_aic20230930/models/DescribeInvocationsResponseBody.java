// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeInvocationsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>440D7342-5E7C-B2DB-D0B4EAC2BDF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponseBody self = new DescribeInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsResponseBody setData(java.util.List<DescribeInvocationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInvocationsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvocationsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInvocationsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>t-15775dc8****</p>
         */
        @NameInMap("InvocationId")
        public String invocationId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeInvocationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyData self = new DescribeInvocationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInvocationsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInvocationsResponseBodyData setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public DescribeInvocationsResponseBodyData setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
