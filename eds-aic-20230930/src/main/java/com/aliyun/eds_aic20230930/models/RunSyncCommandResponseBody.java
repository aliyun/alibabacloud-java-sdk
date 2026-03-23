// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunSyncCommandResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<RunSyncCommandResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static RunSyncCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSyncCommandResponseBody self = new RunSyncCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSyncCommandResponseBody setData(java.util.List<RunSyncCommandResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RunSyncCommandResponseBodyData> getData() {
        return this.data;
    }

    public RunSyncCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSyncCommandResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class RunSyncCommandResponseBodyData extends TeaModel {
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
         * <p>2022-10-11T08:53:32Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static RunSyncCommandResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunSyncCommandResponseBodyData self = new RunSyncCommandResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunSyncCommandResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public RunSyncCommandResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RunSyncCommandResponseBodyData setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public RunSyncCommandResponseBodyData setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public RunSyncCommandResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public RunSyncCommandResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
