// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The start of the time range for change tracking. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-15T08:25:34Z</p>
     */
    @NameInMap("BeginTimestamp")
    public String beginTimestamp;

    /**
     * <p>The consumption checkpoint of the change tracking instance. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-23T07:30:31Z</p>
     */
    @NameInMap("ConsumptionCheckpoint")
    public String consumptionCheckpoint;

    /**
     * <p>The downstream client information, in the following format: \<IP address of the downstream client>:\<Random ID generated by DTS>.</p>
     * 
     * <strong>example:</strong>
     * <p>114.<em><strong>.</strong></em>.<strong>:dts</strong>******</p>
     */
    @NameInMap("ConsumptionClient")
    public String consumptionClient;

    /**
     * <p>The end of the time range for change tracking. The time is displayed in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-26T14:03:21Z</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if change tracking failed.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The billing method of the change tracking instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E0845D0A-6D36-4EEB-BE26-CF191E1A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The connection settings of the source instance.</p>
     */
    @NameInMap("SourceEndpoint")
    public DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint sourceEndpoint;

    /**
     * <p>The status of the change tracking task. Valid values:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Prechecking</strong>: The task is being prechecked.</li>
     * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
     * <li><strong>Starting</strong>: The task is being started.</li>
     * <li><strong>Normal</strong>: The task is running as expected.</li>
     * <li><strong>Abnormal</strong>: The task is not running as expected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The topic of the change tracking instance.</p>
     * <blockquote>
     * <p> This parameter is returned only if your change tracking instance is of the new version and you have called the <a href="https://help.aliyun.com/document_detail/122863.html">CreateConsumerGroup</a> operation to create a consumer group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn_hangzhou_rm_bp1162kryivb8****_dtstest_version2</p>
     */
    @NameInMap("SubscribeTopic")
    public String subscribeTopic;

    /**
     * <p>The types of operations that are tracked by the task.</p>
     */
    @NameInMap("SubscriptionDataType")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionDataType subscriptionDataType;

    /**
     * <p>The endpoint of the change tracking instance.</p>
     */
    @NameInMap("SubscriptionHost")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost subscriptionHost;

    /**
     * <p>The ID of the change tracking instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1162kryivb8****</p>
     */
    @NameInMap("SubscriptionInstanceID")
    public String subscriptionInstanceID;

    /**
     * <p>The name of the change tracking instance.</p>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    /**
     * <p>The objects for change tracking.</p>
     */
    @NameInMap("SubscriptionObject")
    public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObject subscriptionObject;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The ID of the change tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>y0zz3t13h7d****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

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

    public DescribeSubscriptionInstanceStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
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

    public DescribeSubscriptionInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeSubscriptionInstanceStatusResponseBody setSubscribeTopic(String subscribeTopic) {
        this.subscribeTopic = subscribeTopic;
        return this;
    }
    public String getSubscribeTopic() {
        return this.subscribeTopic;
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

    public DescribeSubscriptionInstanceStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSubscriptionInstanceStatusResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class DescribeSubscriptionInstanceStatusResponseBodySourceEndpoint extends TeaModel {
        /**
         * <p>The ID of the instance that hosts the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1162kryivb8****</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The instance type of the source database.</p>
         * <blockquote>
         * <p> This parameter is returned only for change tracking instances of the new version.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
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
        /**
         * <p>Indicates whether data definition language (DDL) operations are tracked. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DDL")
        public Boolean DDL;

        /**
         * <p>Indicates whether data manipulation language (DML) operations are tracked. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

    public static class DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost extends TeaModel {
        /**
         * <p>The private endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-cn-****-internal.aliyuncs.com:18002</p>
         */
        @NameInMap("PrivateHost")
        public String privateHost;

        /**
         * <p>The public endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-cn-****.aliyuncs.com:18001</p>
         */
        @NameInMap("PublicHost")
        public String publicHost;

        /**
         * <p>The virtual private cloud (VPC) endpoint of the change tracking instance. The format is <code>&lt;Address&gt;:&lt;Port number&gt;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-cn-****-vpc.aliyuncs.com:18003</p>
         */
        @NameInMap("VPCHost")
        public String VPCHost;

        public static DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost self = new DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionHost setVPCHost(String VPCHost) {
            this.VPCHost = VPCHost;
            return this;
        }
        public String getVPCHost() {
            return this.VPCHost;
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
        /**
         * <p>The name of the database to which the object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableList")
        public DescribeSubscriptionInstanceStatusResponseBodySubscriptionObjectSynchronousObjectTableList tableList;

        /**
         * <p>Indicates whether the data of an entire database is tracked. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
