// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("SubscriptionInstances")
    public DescribeSubscriptionInstancesResponseBodySubscriptionInstances subscriptionInstances;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSubscriptionInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstancesResponseBody self = new DescribeSubscriptionInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubscriptionInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSubscriptionInstancesResponseBody setSubscriptionInstances(DescribeSubscriptionInstancesResponseBodySubscriptionInstances subscriptionInstances) {
        this.subscriptionInstances = subscriptionInstances;
        return this;
    }
    public DescribeSubscriptionInstancesResponseBodySubscriptionInstances getSubscriptionInstances() {
        return this.subscriptionInstances;
    }

    public DescribeSubscriptionInstancesResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint extends TeaModel {
        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType extends TeaModel {
        @NameInMap("DDL")
        public Boolean DDL;

        @NameInMap("DML")
        public Boolean DML;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType setDDL(Boolean DDL) {
            this.DDL = DDL;
            return this;
        }
        public Boolean getDDL() {
            return this.DDL;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType setDML(Boolean DML) {
            this.DML = DML;
            return this;
        }
        public Boolean getDML() {
            return this.DML;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList extends TeaModel {
        @NameInMap("Table")
        public java.util.List<String> table;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList setTable(java.util.List<String> table) {
            this.table = table;
            return this;
        }
        public java.util.List<String> getTable() {
            return this.table;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("TableList")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList tableList;

        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject setTableList(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList tableList) {
            this.tableList = tableList;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList getTableList() {
            return this.tableList;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject extends TeaModel {
        @NameInMap("SynchronousObject")
        public java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject> synchronousObject;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject setSynchronousObject(java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject> synchronousObject) {
            this.synchronousObject = synchronousObject;
            return this;
        }
        public java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance extends TeaModel {
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
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubscriptionDataType")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionInstanceID")
        public String subscriptionInstanceID;

        @NameInMap("SubscriptionInstanceName")
        public String subscriptionInstanceName;

        @NameInMap("SubscriptionObject")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject subscriptionObject;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSourceEndpoint(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionDataType(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionInstanceID(String subscriptionInstanceID) {
            this.subscriptionInstanceID = subscriptionInstanceID;
            return this;
        }
        public String getSubscriptionInstanceID() {
            return this.subscriptionInstanceID;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionInstanceName(String subscriptionInstanceName) {
            this.subscriptionInstanceName = subscriptionInstanceName;
            return this;
        }
        public String getSubscriptionInstanceName() {
            return this.subscriptionInstanceName;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionObject(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject subscriptionObject) {
            this.subscriptionObject = subscriptionObject;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject getSubscriptionObject() {
            return this.subscriptionObject;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstances extends TeaModel {
        @NameInMap("SubscriptionInstance")
        public java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance> subscriptionInstance;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstances self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstances setSubscriptionInstance(java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance> subscriptionInstance) {
            this.subscriptionInstance = subscriptionInstance;
            return this;
        }
        public java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance> getSubscriptionInstance() {
            return this.subscriptionInstance;
        }

    }

}
