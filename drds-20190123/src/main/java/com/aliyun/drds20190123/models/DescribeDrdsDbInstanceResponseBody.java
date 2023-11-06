// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstanceResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the returned custom ApsaraDB RDS for MySQL instance.</p>
     */
    @NameInMap("DbInstance")
    public DescribeDrdsDbInstanceResponseBodyDbInstance dbInstance;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDbInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstanceResponseBody self = new DescribeDrdsDbInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstanceResponseBody setDbInstance(DescribeDrdsDbInstanceResponseBodyDbInstance dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }
    public DescribeDrdsDbInstanceResponseBodyDbInstance getDbInstance() {
        return this.dbInstance;
    }

    public DescribeDrdsDbInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance extends TeaModel {
        /**
         * <p>The URL used to connect to the read-only instance.</p>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The ID of the read-only instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The state of the read-only instance.</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The role of the read-only instance.</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        /**
         * <p>The engine of the database that is run on the read-only instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version of the database that is run on the read-only instance.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The timestamp that indicates when the read-only instance expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The network type of the read-only instance.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The billing method of the read-only instance.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port used to connect to the read-only instance.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("RdsInstType")
        public String rdsInstType;

        /**
         * <p>The read ratio of the read-only instance.</p>
         */
        @NameInMap("ReadWeight")
        public Integer readWeight;

        /**
         * <p>The number of remaining days before the read-only instance expires.</p>
         */
        @NameInMap("RemainDays")
        public String remainDays;

        /**
         * <p>This parameter is unavailable for read-only instances.</p>
         */
        @NameInMap("VersionAction")
        public Integer versionAction;

        public static DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance self = new DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setRemainDays(String remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public String getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance setVersionAction(Integer versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public Integer getVersionAction() {
            return this.versionAction;
        }

    }

    public static class DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances extends TeaModel {
        @NameInMap("ReadOnlyInstance")
        public java.util.List<DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance;

        public static DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances self = new DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances setReadOnlyInstance(java.util.List<DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance) {
            this.readOnlyInstance = readOnlyInstance;
            return this;
        }
        public java.util.List<DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstancesReadOnlyInstance> getReadOnlyInstance() {
            return this.readOnlyInstance;
        }

    }

    public static class DescribeDrdsDbInstanceResponseBodyDbInstance extends TeaModel {
        /**
         * <p>The URL used to connect to the custom ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The state of the instance.</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The role of the instance. Valid values:</p>
         * <br>
         * <p>*   **Primary**: The instance is a primary instance.</p>
         * <p>*   **ReadOnly**: The instance is a read-only instance.</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        /**
         * <p>The engine of the database that is run on the instance. Valid value: **MySQL**.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version of the database that is run on the instance. Valid values: **5.7**.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the custom ApsaraDB RDS for MySQL instance expires. The value of this parameter is a UNIX timestamp. Unit: seconds.</p>
         * <br>
         * <p>>  This parameter is returned only when the custom ApsaraDB RDS for MySQL instance is a subscription instance.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The type of the network. Valid values: **VPC**.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The billing method of the custom ApsaraDB RDS for MySQL instance. Valid values:</p>
         * <br>
         * <p>*   **Prepaid**: subscription</p>
         * <p>*   **Postaid**: pay-as-you-go</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port used to connect to the custom ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the instance.</p>
         */
        @NameInMap("RdsInstType")
        public String rdsInstType;

        /**
         * <p>The list of read-only ApsaraDB RDS for MySQL instances.</p>
         */
        @NameInMap("ReadOnlyInstances")
        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances readOnlyInstances;

        /**
         * <p>The read ratio of the instance.</p>
         */
        @NameInMap("ReadWeight")
        public Integer readWeight;

        /**
         * <p>The number of remaining days before the instance expires.</p>
         */
        @NameInMap("RemainDays")
        public String remainDays;

        public static DescribeDrdsDbInstanceResponseBodyDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstanceResponseBodyDbInstance self = new DescribeDrdsDbInstanceResponseBodyDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setReadOnlyInstances(DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances readOnlyInstances) {
            this.readOnlyInstances = readOnlyInstances;
            return this;
        }
        public DescribeDrdsDbInstanceResponseBodyDbInstanceReadOnlyInstances getReadOnlyInstances() {
            return this.readOnlyInstances;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstanceResponseBodyDbInstance setRemainDays(String remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public String getRemainDays() {
            return this.remainDays;
        }

    }

}
