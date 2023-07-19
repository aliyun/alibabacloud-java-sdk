// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries that can be displayed on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of change tracking instances and the details of each instance.</p>
     */
    @NameInMap("SubscriptionInstances")
    public DescribeSubscriptionInstancesResponseBodySubscriptionInstances subscriptionInstances;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of change tracking instances that belong to your Alibaba Cloud account.</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSubscriptionInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstancesResponseBody self = new DescribeSubscriptionInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSubscriptionInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
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

    public DescribeSubscriptionInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionInstancesResponseBody setSubscriptionInstances(DescribeSubscriptionInstancesResponseBodySubscriptionInstances subscriptionInstances) {
        this.subscriptionInstances = subscriptionInstances;
        return this;
    }
    public DescribeSubscriptionInstancesResponseBodySubscriptionInstances getSubscriptionInstances() {
        return this.subscriptionInstances;
    }

    public DescribeSubscriptionInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSubscriptionInstancesResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint extends TeaModel {
        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The type of the source instance.</p>
         * <br>
         * <p>>  This parameter is returned only for change tracking instances of the new version.</p>
         */
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
        /**
         * <p>Indicates whether data definition language (DDL) operations are tracked. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("DDL")
        public Boolean DDL;

        /**
         * <p>Indicates whether data manipulation language (DML) operations are tracked. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
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

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost extends TeaModel {
        /**
         * <p>The private endpoint of the change tracking instance. The format is `<Address>:<Port number>`.</p>
         */
        @NameInMap("PrivateHost")
        public String privateHost;

        /**
         * <p>The public endpoint of the change tracking instance. The format is `<Address>:<Port number>`.</p>
         */
        @NameInMap("PublicHost")
        public String publicHost;

        /**
         * <p>The virtual private cloud (VPC) endpoint of the change tracking instance. The format is `<Address>:<Port number>`.</p>
         */
        @NameInMap("VPCHost")
        public String VPCHost;

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

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost setVPCHost(String VPCHost) {
            this.VPCHost = VPCHost;
            return this;
        }
        public String getVPCHost() {
            return this.VPCHost;
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
        /**
         * <p>The name of the database to which the object belongs.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableList")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObjectSynchronousObjectTableList tableList;

        /**
         * <p>Indicates whether the data of an entire database is tracked. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
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

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key.</p>
         */
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

    public static class DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance extends TeaModel {
        /**
         * <p>The start of the time range for change tracking. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.</p>
         */
        @NameInMap("BeginTimestamp")
        public String beginTimestamp;

        /**
         * <p>The consumption checkpoint of the change tracking instance. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.</p>
         */
        @NameInMap("ConsumptionCheckpoint")
        public String consumptionCheckpoint;

        /**
         * <p>The downstream client information, in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.</p>
         */
        @NameInMap("ConsumptionClient")
        public String consumptionClient;

        /**
         * <p>The end of the time range for change tracking. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.</p>
         */
        @NameInMap("EndTimestamp")
        public String endTimestamp;

        /**
         * <p>The error message returned if change tracking failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the change tracking instance was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
         */
        @NameInMap("InstanceCreateTime")
        public String instanceCreateTime;

        /**
         * <p>The time when the change tracking task was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.</p>
         */
        @NameInMap("JobCreateTime")
        public String jobCreateTime;

        /**
         * <p>The billing method of the change tracking instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The connection settings of the source instance.</p>
         */
        @NameInMap("SourceEndpoint")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSourceEndpoint sourceEndpoint;

        /**
         * <p>The status of the change tracking task. Valid values:</p>
         * <br>
         * <p>*   **NotStarted**: The task is not started.</p>
         * <p>*   **Prechecking**: The task is being prechecked.</p>
         * <p>*   **PrecheckFailed**: The task failed to pass the precheck.</p>
         * <p>*   **Starting**: The task is being started.</p>
         * <p>*   **Normal**: The task is running as expected.</p>
         * <p>*   **Abnormal**: The task is not running as expected.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The topic of the change tracking instance.</p>
         * <br>
         * <p>>  This parameter is returned only if your change tracking instances are of the new version and you have called the [CreateConsumerGroup](~~122863~~) operation to create a consumer group.</p>
         */
        @NameInMap("SubscribeTopic")
        public String subscribeTopic;

        /**
         * <p>The types of operations that are tracked by the task.</p>
         */
        @NameInMap("SubscriptionDataType")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType subscriptionDataType;

        /**
         * <p>The endpoint of the change tracking instance.</p>
         */
        @NameInMap("SubscriptionHost")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost subscriptionHost;

        /**
         * <p>The ID of the change tracking instance.</p>
         */
        @NameInMap("SubscriptionInstanceID")
        public String subscriptionInstanceID;

        /**
         * <p>The name of the change tracking instance.</p>
         */
        @NameInMap("SubscriptionInstanceName")
        public String subscriptionInstanceName;

        /**
         * <p>The objects for change tracking.</p>
         */
        @NameInMap("SubscriptionObject")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionObject subscriptionObject;

        /**
         * <p>The collection of tags.</p>
         */
        @NameInMap("Tags")
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags tags;

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

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setInstanceCreateTime(String instanceCreateTime) {
            this.instanceCreateTime = instanceCreateTime;
            return this;
        }
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setJobCreateTime(String jobCreateTime) {
            this.jobCreateTime = jobCreateTime;
            return this;
        }
        public String getJobCreateTime() {
            return this.jobCreateTime;
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

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscribeTopic(String subscribeTopic) {
            this.subscribeTopic = subscribeTopic;
            return this;
        }
        public String getSubscribeTopic() {
            return this.subscribeTopic;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionDataType(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType subscriptionDataType) {
            this.subscriptionDataType = subscriptionDataType;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionDataType getSubscriptionDataType() {
            return this.subscriptionDataType;
        }

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setSubscriptionHost(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost subscriptionHost) {
            this.subscriptionHost = subscriptionHost;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceSubscriptionHost getSubscriptionHost() {
            return this.subscriptionHost;
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

        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstance setTags(DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSubscriptionInstancesResponseBodySubscriptionInstancesSubscriptionInstanceTags getTags() {
            return this.tags;
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
