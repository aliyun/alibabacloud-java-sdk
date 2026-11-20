// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RunAppInstanceCommandResponseBody extends TeaModel {
    /**
     * <p>The command issuance result.</p>
     */
    @NameInMap("CommandResultModel")
    public RunAppInstanceCommandResponseBodyCommandResultModel commandResultModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunAppInstanceCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunAppInstanceCommandResponseBody self = new RunAppInstanceCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunAppInstanceCommandResponseBody setCommandResultModel(RunAppInstanceCommandResponseBodyCommandResultModel commandResultModel) {
        this.commandResultModel = commandResultModel;
        return this;
    }
    public RunAppInstanceCommandResponseBodyCommandResultModel getCommandResultModel() {
        return this.commandResultModel;
    }

    public RunAppInstanceCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunAppInstanceCommandResponseBodyCommandResultModel extends TeaModel {
        /**
         * <p>The command execution ID. Only one execution ID is returned even when commands are issued in batches to multiple delivery groups. You can use this ID to call ListCommandInvocationResults to query the command execution results on each session.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        @NameInMap("InvocationId")
        public String invocationId;

        public static RunAppInstanceCommandResponseBodyCommandResultModel build(java.util.Map<String, ?> map) throws Exception {
            RunAppInstanceCommandResponseBodyCommandResultModel self = new RunAppInstanceCommandResponseBodyCommandResultModel();
            return TeaModel.build(map, self);
        }

        public RunAppInstanceCommandResponseBodyCommandResultModel setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

    }

}
