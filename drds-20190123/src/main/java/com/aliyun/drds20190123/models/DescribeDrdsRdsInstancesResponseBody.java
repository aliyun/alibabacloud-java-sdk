// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsRdsInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the custom ApsaraDB RDS for MySQL instances at the storage layer.</p>
     */
    @NameInMap("DbInstances")
    public DescribeDrdsRdsInstancesResponseBodyDbInstances dbInstances;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsRdsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsRdsInstancesResponseBody self = new DescribeDrdsRdsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsRdsInstancesResponseBody setDbInstances(DescribeDrdsRdsInstancesResponseBodyDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeDrdsRdsInstancesResponseBodyDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public DescribeDrdsRdsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsRdsInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance extends TeaModel {
        /**
         * <p>The internal endpoint of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>The number of CPU cores of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
         */
        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        /**
         * <p>The instance family of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
         * <br>
         * <p>*   **x**: general-purpose instance family</p>
         * <p>*   **d**: dedicated instance family</p>
         * <p>*   **h**: dedicated host instance family</p>
         */
        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        /**
         * <p>The ID of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The memory size of the custom ApsaraDB RDS for MySQL instance at the storage layer. Unit: MB.</p>
         */
        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        /**
         * <p>The status of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
         * <br>
         * <p>*   0: The instance is being created.</p>
         * <p>*   1: The instance is running.</p>
         * <p>*   3: The instance is being deleted.</p>
         * <p>*   5: The instance is being restarted.</p>
         * <p>*   6: The instance is being upgraded or downgraded.</p>
         * <p>*   7: The instance is being backed up.</p>
         * <p>*   8: The network type of the instance is being changed.</p>
         * <p>*   9: The instance is being migrated.</p>
         * <p>*   11: The data stored on the instance is being migrated.</p>
         * <p>*   12: A disaster recovery instance is being generated.</p>
         * <p>*   13: Data is being imported to the instance.</p>
         * <p>*   14: Data is being imported from another RDS instance to the instance.</p>
         * <p>*   15: A switchover is being performed.</p>
         * <p>*   16: A temporary instance is being created.</p>
         * <p>*   17: The network of the instance is being created.</p>
         * <p>*   18: The instance is being cloned.</p>
         * <p>*   19: The link is being changed.</p>
         * <p>*   20: The read-only RDS instances of the instance are being migrated.</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage space of the custom ApsaraDB RDS for MySQL instance at the storage layer. Unit: GB.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The type of the instance at the storage layer. The value is RDS.</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        /**
         * <p>The engine type of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is MySQL.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The engine version of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is 8.0.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The lock mode of the RDS instance. Valid values:</p>
         * <br>
         * <p>0: The instance is not locked.</p>
         * <br>
         * <p>1: The instance is manually locked.</p>
         * <br>
         * <p>2: The instance is automatically locked if the instance expires.</p>
         * <br>
         * <p>3: The instance is automatically locked if the instance is rolled back.</p>
         * <br>
         * <p>4: The instance is automatically locked if the storage space of the instance reaches the upper limit.</p>
         * <br>
         * <p>5: The instance is automatically locked if the storage space of the read-only instances reaches the upper limit.</p>
         */
        @NameInMap("LockMode")
        public Integer lockMode;

        /**
         * <p>The reason why the RDS instance is locked.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The network type of the custom ApsaraDB RDS for MySQL instance at the storage layer. The value is VPC.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The billing method of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
         * <br>
         * <p>*   Postpaid: pay-as-you-go</p>
         * <p>*   Prepaid: subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port used to connect to the instance over an internal network.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The type of the custom ApsaraDB RDS for MySQL instance at the storage layer. Valid values:</p>
         * <br>
         * <p>*   Primary: primary instance</p>
         * <p>*   Readonly: read-only instance</p>
         */
        @NameInMap("RdsInstType")
        public String rdsInstType;

        /**
         * <p>The read and write weights of the custom ApsaraDB RDS for MySQL instance at the storage layer.</p>
         */
        @NameInMap("ReadWeight")
        public Integer readWeight;

        public static DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance self = new DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setLockMode(Integer lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public Integer getLockMode() {
            return this.lockMode;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

    }

    public static class DescribeDrdsRdsInstancesResponseBodyDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        public java.util.List<DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance> dbInstance;

        public static DescribeDrdsRdsInstancesResponseBodyDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsRdsInstancesResponseBodyDbInstances self = new DescribeDrdsRdsInstancesResponseBodyDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsRdsInstancesResponseBodyDbInstances setDbInstance(java.util.List<DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeDrdsRdsInstancesResponseBodyDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
