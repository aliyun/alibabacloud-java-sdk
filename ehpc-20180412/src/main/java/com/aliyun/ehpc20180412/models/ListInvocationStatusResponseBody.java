// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the command.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The list of statuses. A list is returned for each node.</p>
     */
    @NameInMap("InvokeInstances")
    public ListInvocationStatusResponseBodyInvokeInstances invokeInstances;

    /**
     * <p>The overall status of all nodes in the cluster. Valid values:</p>
     * <br>
     * <p>- Finished</p>
     * <p>- Running</p>
     * <p>- Failed</p>
     * <p>- Stopped</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The ID of the request.</p>
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
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   Finished</p>
         * <p>*   Running</p>
         * <p>*   Failed</p>
         * <p>*   Stopped</p>
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
