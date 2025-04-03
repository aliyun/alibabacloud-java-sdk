// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The objects that are returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeInvocationsResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>440D7342-5E7C-B2DB-D0B4EAC2BDF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The end time of the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-11 17:45:03</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the cloud phone instance on which the command is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>t-15775dc8****</p>
         */
        @NameInMap("InvocationId")
        public String invocationId;

        /**
         * <p>The execution state of the command.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Failed: The execution of the command failed.</li>
         * <li>Timeout: The execution of the command timed out.</li>
         * <li>Running: The command is being executed.</li>
         * <li>Success: The execution of the command is successful.</li>
         * <li>Pending: The command is waiting to be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
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
         * <p>The start time of the command execution.</p>
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
