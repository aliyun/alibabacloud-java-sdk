// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    /**
     * <p>The ID of the command execution. You can use the command execution ID to query the output of a command.</p>
     * 
     * <strong>example:</strong>
     * <p>t-gov2ujrk32v4****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>440D7342-5E7C-B2DB-D0B4EAC2BDF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunCommandInfos")
    public java.util.List<RunCommandResponseBodyRunCommandInfos> runCommandInfos;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCommandResponseBody setRunCommandInfos(java.util.List<RunCommandResponseBodyRunCommandInfos> runCommandInfos) {
        this.runCommandInfos = runCommandInfos;
        return this;
    }
    public java.util.List<RunCommandResponseBodyRunCommandInfos> getRunCommandInfos() {
        return this.runCommandInfos;
    }

    public static class RunCommandResponseBodyRunCommandInfos extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvokeId")
        public String invokeId;

        public static RunCommandResponseBodyRunCommandInfos build(java.util.Map<String, ?> map) throws Exception {
            RunCommandResponseBodyRunCommandInfos self = new RunCommandResponseBodyRunCommandInfos();
            return TeaModel.build(map, self);
        }

        public RunCommandResponseBodyRunCommandInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RunCommandResponseBodyRunCommandInfos setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

    }

}
