// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationStatusResponseBody extends TeaModel {
    /**
     * <p>The command ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz01v8x80o3****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>An array of execution statuses. An entry is returned for each node.</p>
     */
    @NameInMap("InvokeInstances")
    public ListInvocationStatusResponseBodyInvokeInstances invokeInstances;

    /**
     * <p>The status of the command. Valid values:</p>
     * <ul>
     * <li>Finished: The execution of the command finished.</li>
     * <li>Running: The command is being executed.</li>
     * <li>Failed: The command failed to be executed.</li>
     * <li>Stopped: The execution of the command stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInvocationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationStatusResponseBody self = new ListInvocationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvocationStatusResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public ListInvocationStatusResponseBody setInvokeInstances(ListInvocationStatusResponseBodyInvokeInstances invokeInstances) {
        this.invokeInstances = invokeInstances;
        return this;
    }
    public ListInvocationStatusResponseBodyInvokeInstances getInvokeInstances() {
        return this.invokeInstances;
    }

    public ListInvocationStatusResponseBody setInvokeStatus(String invokeStatus) {
        this.invokeStatus = invokeStatus;
        return this;
    }
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    public ListInvocationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance extends TeaModel {
        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6abz34m2714bp4****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>Finished: The running of the node finished.</li>
         * <li>Running: The node is running.</li>
         * <li>Failed: The node failed to run.</li>
         * <li>Stopped: The running of the node stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("InstanceInvokeStatus")
        public String instanceInvokeStatus;

        public static ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance self = new ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance();
            return TeaModel.build(map, self);
        }

        public ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance setInstanceInvokeStatus(String instanceInvokeStatus) {
            this.instanceInvokeStatus = instanceInvokeStatus;
            return this;
        }
        public String getInstanceInvokeStatus() {
            return this.instanceInvokeStatus;
        }

    }

    public static class ListInvocationStatusResponseBodyInvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        public java.util.List<ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance> invokeInstance;

        public static ListInvocationStatusResponseBodyInvokeInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationStatusResponseBodyInvokeInstances self = new ListInvocationStatusResponseBodyInvokeInstances();
            return TeaModel.build(map, self);
        }

        public ListInvocationStatusResponseBodyInvokeInstances setInvokeInstance(java.util.List<ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance> invokeInstance) {
            this.invokeInstance = invokeInstance;
            return this;
        }
        public java.util.List<ListInvocationStatusResponseBodyInvokeInstancesInvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

    }

}
