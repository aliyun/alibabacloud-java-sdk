// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceStatusResponseBody extends TeaModel {
    @NameInMap("BeginTimestamp")
    public String beginTimestamp;

    @NameInMap("ConsumptionCheckpoint")
    public String consumptionCheckpoint;

    @NameInMap("ConsumptionClient")
    public String consumptionClient;

    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("SourceEndpoint")
    public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint sourceEndpoint;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubscriptionDataType")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType subscriptionDataType;

    @NameInMap("SubscriptionInstanceID")
    public String subscriptionInstanceID;

    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    @NameInMap("SubscriptionObject")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject subscriptionObject;

    public static DescribeSubscriptionInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstanceStatusResponseBody self = new DescribeSubscriptionInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstanceStatusResponseBody setBeginTimestamp(String beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }
    public String getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setConsumptionCheckpoint(String consumptionCheckpoint) {
        this.consumptionCheckpoint = consumptionCheckpoint;
        return this;
    }
    public String getConsumptionCheckpoint() {
        return this.consumptionCheckpoint;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setConsumptionClient(String consumptionClient) {
        this.consumptionClient = consumptionClient;
        return this;
    }
    public String getConsumptionClient() {
        return this.consumptionClient;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSourceEndpoint(DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionDataType(DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType subscriptionDataType) {
        this.subscriptionDataType = subscriptionDataType;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType getSubscriptionDataType() {
        return this.subscriptionDataType;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionInstanceID(String subscriptionInstanceID) {
        this.subscriptionInstanceID = subscriptionInstanceID;
        return this;
    }
    public String getSubscriptionInstanceID() {
        return this.subscriptionInstanceID;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setSubscriptionObject(DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject subscriptionObject) {
        this.subscriptionObject = subscriptionObject;
        return this;
    }
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint extends TeaModel {
        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint self = new DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType extends TeaModel {
        @NameInMap("DDL")
        public Boolean DDL;

        @NameInMap("DML")
        public Boolean DML;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType setDDL(Boolean DDL) {
            this.DDL = DDL;
            return this;
        }
        public Boolean getDDL() {
            return this.DDL;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType setDML(Boolean DML) {
            this.DML = DML;
            return this;
        }
        public Boolean getDML() {
            return this.DML;
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

        @NameInMap("TableList")
        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList tableList;

        @NameInMap("WholeDatabase")
        public String wholeDatabase;

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

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject setTableList(DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList getTableList() {
            return this.tableList;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
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
