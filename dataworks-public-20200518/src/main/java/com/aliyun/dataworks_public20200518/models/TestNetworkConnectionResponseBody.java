// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public TestNetworkConnectionResponseBodyTaskList taskList;

    public static TestNetworkConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestNetworkConnectionResponseBody self = new TestNetworkConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public TestNetworkConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TestNetworkConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestNetworkConnectionResponseBody setTaskList(TestNetworkConnectionResponseBodyTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public TestNetworkConnectionResponseBodyTaskList getTaskList() {
        return this.taskList;
    }

    public static class TestNetworkConnectionResponseBodyTaskList extends TeaModel {
        @NameInMap("ConnectMessage")
        public String connectMessage;

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
