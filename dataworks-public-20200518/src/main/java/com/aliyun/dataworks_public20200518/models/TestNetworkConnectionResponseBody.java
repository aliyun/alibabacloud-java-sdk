// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about the connectivity test.</p>
     */
    @NameInMap("TaskList")
    public TestNetworkConnectionResponseBodyTaskList taskList;

    public static TestNetworkConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestNetworkConnectionResponseBody self = new TestNetworkConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public TestNetworkConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestNetworkConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TestNetworkConnectionResponseBody setTaskList(TestNetworkConnectionResponseBodyTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public TestNetworkConnectionResponseBodyTaskList getTaskList() {
        return this.taskList;
    }

    public static class TestNetworkConnectionResponseBodyTaskList extends TeaModel {
        /**
         * <p>The reason why the data source and resource group failed the connectivity test. If data source and the resource group passed the connectivity test, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Connectable</p>
         */
        @NameInMap("ConnectMessage")
        public String connectMessage;

        /**
         * <p>The result of the connectivity test. Valid values:</p>
         * <ul>
         * <li>true: The data source and the resource group passed the connectivity test.</li>
         * <li>false: The data source and the resource group failed the connectivity test. You can troubleshoot issues based on the ConnectMessage parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConnectStatus")
        public Boolean connectStatus;

        public static TestNetworkConnectionResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            TestNetworkConnectionResponseBodyTaskList self = new TestNetworkConnectionResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public TestNetworkConnectionResponseBodyTaskList setConnectMessage(String connectMessage) {
            this.connectMessage = connectMessage;
            return this;
        }
        public String getConnectMessage() {
            return this.connectMessage;
        }

        public TestNetworkConnectionResponseBodyTaskList setConnectStatus(Boolean connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Boolean getConnectStatus() {
            return this.connectStatus;
        }

    }

}
