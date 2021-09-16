// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("ConsumptionClient")
    public String consumptionClient;

    @NameInMap("ConsumptionCheckpoint")
    public String consumptionCheckpoint;

    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("BeginTimestamp")
    public String beginTimestamp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscribeTopic")
    public String subscribeTopic;

    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    @NameInMap("SubscriptionInstanceID")
    public String subscriptionInstanceID;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("SourceEndpoint")
    public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint sourceEndpoint;

    @NameInMap("SubscriptionDataType")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionHost")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost subscriptionHost;

    @NameInMap("SubscriptionObject")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject subscriptionObject;

    public static DescribeSubscriptionInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstanceStatusResponseBody self = new DescribeSubscriptionInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstanceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setConsumptionClient(String consumptionClient) {
        this.consumptionClient = consumptionClient;
        return this;
    }
    public String getConsumptionClient() {
        return this.consumptionClient;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setConsumptionCheckpoint(String consumptionCheckpoint) {
        this.consumptionCheckpoint = consumptionCheckpoint;
        return this;
    }
    public String getConsumptionCheckpoint() {
        return this.consumptionCheckpoint;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setBeginTimestamp(String beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }
    public String getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscribeTopic(String subscribeTopic) {
        this.subscribeTopic = subscribeTopic;
        return this;
    }
    public String getSubscribeTopic() {
        return this.subscribeTopic;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionInstanceID(String subscriptionInstanceID) {
        this.subscriptionInstanceID = subscriptionInstanceID;
        return this;
    }
    public String getSubscriptionInstanceID() {
        return this.subscriptionInstanceID;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSourceEndpoint(DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionDataType(DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionHost(DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost subscriptionHost) {
        this.subscriptionHost = subscriptionHost;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost getSubscriptionHost() {
        return this.subscriptionHost;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionObject(DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject subscriptionObject) {
        this.subscriptionObject = subscriptionObject;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceID")
        public String instanceID;

        public static DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint self = new DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType extends TeaModel {
        @NameInMap("DML")
        public Boolean DML;

        @NameInMap("DDL")
        public Boolean DDL;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType setDML(Boolean DML) {
            this.DML = DML;
            return this;
        }
        public Boolean getDML() {
            return this.DML;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType setDDL(Boolean DDL) {
            this.DDL = DDL;
            return this;
        }
        public Boolean getDDL() {
            return this.DDL;
        }

    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost extends TeaModel {
        @NameInMap("VPCHost")
        public String VPCHost;

        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("PrivateHost")
        public String privateHost;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost setVPCHost(String VPCHost) {
            this.VPCHost = VPCHost;
            return this;
        }
        public String getVPCHost() {
            return this.VPCHost;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        @NameInMap("TableList")
        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList tableList;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject setTableList(DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList getTableList() {
            return this.tableList;
        }

    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject extends TeaModel {
        @NameInMap("SynchronousObject")
        public java.util.List<DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject> synchronousObject;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject setSynchronousObject(java.util.List<DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject> synchronousObject) {
            this.synchronousObject = synchronousObject;
            return this;
        }
        public java.util.List<DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

    }

}
