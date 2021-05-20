// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskList")
    @Validation(required = true)
    public TestNetworkConnectionResponseTaskList taskList;

    public static TestNetworkConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        TestNetworkConnectionResponse self = new TestNetworkConnectionResponse();
        return TeaModel.build(map, self);
    }

    public TestNetworkConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestNetworkConnectionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TestNetworkConnectionResponse setTaskList(TestNetworkConnectionResponseTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public TestNetworkConnectionResponseTaskList getTaskList() {
        return this.taskList;
    }

    public static class TestNetworkConnectionResponseTaskList extends TeaModel {
        @NameInMap("ConnectStatus")
        @Validation(required = true)
        public Boolean connectStatus;

        @NameInMap("ConnectMessage")
        @Validation(required = true)
        public String connectMessage;

        public static TestNetworkConnectionResponseTaskList build(java.util.Map<String, ?> map) throws Exception {
            TestNetworkConnectionResponseTaskList self = new TestNetworkConnectionResponseTaskList();
            return TeaModel.build(map, self);
        }

        public TestNetworkConnectionResponseTaskList setConnectStatus(Boolean connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Boolean getConnectStatus() {
            return this.connectStatus;
        }

        public TestNetworkConnectionResponseTaskList setConnectMessage(String connectMessage) {
            this.connectMessage = connectMessage;
            return this;
        }
        public String getConnectMessage() {
            return this.connectMessage;
        }

    }

}
