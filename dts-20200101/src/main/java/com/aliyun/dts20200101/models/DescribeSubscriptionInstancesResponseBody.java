// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstancesResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public String success;

    @NameInMap("SubscriptionInstances")
    public DescribeSubscriptionInstancesResponseBodySubscriptionInstances subscriptionInstances;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeSubscriptionInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstancesResponseBody self = new DescribeSubscriptionInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstancesResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSubscriptionInstancesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSubscriptionInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubscriptionInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSubscriptionInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSubscriptionInstancesResponseBody setSubscriptionInstances(DescribeSubscriptionInstancesResponseBodySubscriptionInstances subscriptionInstances) {
        this.subscriptionInstances = subscriptionInstances;
        return this;
    }
    public DescribeSubscriptionInstancesResponseBodySubscriptionInstances getSubscriptionInstances() {
        return this.subscriptionInstances;
    }

    public DescribeSubscriptionInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag> tag;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags setTag(java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag> getTag() {
            return this.tag;
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
        @NameInMap("WholeDatabase")
        public String wholeDatabase;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("TableList")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList tableList;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObject setWholeDatabase(String wholeDatabase) {
            this.wholeDatabase = wholeDatabase;
            return this;
        }
        public String getWholeDatabase() {
            return this.wholeDatabase;
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

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost extends TeaModel {
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("VPCHost")
        public String VPCHost;

        @NameInMap("PublicHost")
        public String publicHost;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost setVPCHost(String VPCHost) {
            this.VPCHost = VPCHost;
            return this;
        }
        public String getVPCHost() {
            return this.VPCHost;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

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
        @NameInMap("DML")
        public Boolean DML;

        @NameInMap("DDL")
        public Boolean DDL;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType setDML(Boolean DML) {
            this.DML = DML;
            return this;
        }
        public Boolean getDML() {
            return this.DML;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType setDDL(Boolean DDL) {
            this.DDL = DDL;
            return this;
        }
        public Boolean getDDL() {
            return this.DDL;
        }

    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Tags")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags tags;

        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        @NameInMap("SubscriptionObject")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject subscriptionObject;

        @NameInMap("SubscriptionHost")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost subscriptionHost;

        @NameInMap("EndTimestamp")
        public String endTimestamp;

        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        @NameInMap("SubscribeTopic")
        public String subscribeTopic;

        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        @NameInMap("SourceEndpoint")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint sourceEndpoint;

        @NameInMap("SubscriptionDataType")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType subscriptionDataType;

        @NameInMap("SubscriptionInstanceName")
        public String subscriptionInstanceName;

        @NameInMap("SubscriptionInstanceID")
        public String subscriptionInstanceID;

        public static DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance self = new DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setTags(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags getTags() {
            return this.tags;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setConsumptionClient(String consumptionClient) {
            this.consumptionClient = consumptionClient;
            return this;
        }
        public String getConsumptionClient() {
            return this.consumptionClient;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionObject(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject subscriptionObject) {
            this.subscriptionObject = subscriptionObject;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject getSubscriptionObject() {
            return this.subscriptionObject;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionHost(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setEndTimestamp(String endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public String getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setConsumptionCheckpoint(String consumptionCheckpoint) {
            this.consumptionCheckpoint = consumptionCheckpoint;
            return this;
        }
        public String getConsumptionCheckpoint() {
            return this.consumptionCheckpoint;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setBeginTimestamp(String beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
            return this;
        }
        public String getBeginTimestamp() {
            return this.beginTimestamp;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSourceEndpoint(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionDataType(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionInstanceName(String subscriptionInstanceName) {
            this.subscriptionInstanceName = subscriptionInstanceName;
            return this;
        }
        public String getSubscriptionInstanceName() {
            return this.subscriptionInstanceName;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionInstanceID(String subscriptionInstanceID) {
            this.subscriptionInstanceID = subscriptionInstanceID;
            return this;
        }
        public String getSubscriptionInstanceID() {
            return this.subscriptionInstanceID;
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
