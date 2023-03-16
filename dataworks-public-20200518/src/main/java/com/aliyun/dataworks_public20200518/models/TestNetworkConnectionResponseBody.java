// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
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
         */
        @NameInMap("ConnectMessage")
        public String connectMessage;

        /**
         * <p>The result of the connectivity test. Valid values:</p>
         * <br>
         * <p>*   true: The data source and the resource group passed the connectivity test.</p>
         * <p>*   false: The data source and the resource group failed the connectivity test. You can troubleshoot issues based on the ConnectMessage parameter.</p>
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
