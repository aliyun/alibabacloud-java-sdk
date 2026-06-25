// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The list of returned results.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeInvocationsResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>440D7342-5E7C-B2DB-D0B4EAC2BDF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The time when the command finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the instance where the command was run.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>t-15775dc8****</p>
         */
        @NameInMap("InvocationId")
        public String invocationId;

        /**
         * <p>The status of the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The output of the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The time when the command started to run.</p>
         * 
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
