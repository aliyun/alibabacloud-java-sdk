// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstancesResponseBody extends TeaModel {
    /**
     * <p>Indicates information about the ApsaraDB RDS for MySQL instances that are used to store the data of the specified database.</p>
     */
    @NameInMap("DbInstances")
    public DescribeDrdsDbInstancesResponseBodyDbInstances dbInstances;

    /**
     * <p>Indicates the page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>Indicates the number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Indicates the ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2F7F8080-9132-4279-85D0-B7E5C4305162</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates the number of primary ApsaraDB RDS for MySQL instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeDrdsDbInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstancesResponseBody self = new DescribeDrdsDbInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstancesResponseBody setDbInstances(DescribeDrdsDbInstancesResponseBodyDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeDrdsDbInstancesResponseBodyDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public DescribeDrdsDbInstancesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsDbInstancesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsDbInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDbInstancesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance extends TeaModel {
        /**
         * <p>Indicates the endpoint that is used to connect to the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1t1mk5a5b******.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>Indicates the state of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The ApsaraDB RDS for MySQL instance is being created.</li>
         * <li><strong>1</strong>: The ApsaraDB RDS for MySQL instance is running.</li>
         * <li><strong>3</strong>: The ApsaraDB RDS for MySQL instance is being deleted.</li>
         * <li><strong>5</strong>: The ApsaraDB RDS for MySQL instance is being restarted.</li>
         * <li><strong>6</strong>: The ApsaraDB RDS for MySQL instance is being upgraded or downgraded.</li>
         * <li><strong>7</strong>: The ApsaraDB RDS for MySQL instance is being backed up.</li>
         * <li><strong>8</strong>: The network type of the ApsaraDB RDS for MySQL instance is being changed.</li>
         * <li><strong>9</strong>: The ApsaraDB RDS for MySQL instance is being migrated.</li>
         * <li><strong>11</strong>: The data of the ApsaraDB RDS for MySQL instance is being migrated.</li>
         * <li><strong>12</strong>: A disaster-recovery instance is being generated.</li>
         * <li><strong>13</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>14</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance from an another ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>15</strong>: A failover is being performed.</li>
         * <li><strong>16</strong>: A temporary instance is being created.</li>
         * <li><strong>17</strong>: A network is being created for the ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>18</strong>: The ApsaraDB RDS for MySQL instance is being cloned.</li>
         * <li><strong>19</strong>: The link is being changed.</li>
         * <li><strong>20</strong>: The read-only instances of the ApsaraDB RDS for MySQL instance are being migrated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>Indicates the type of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. The value is set to RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>Indicates the ID of a resource.</p>
         * 
         * <strong>example:</strong>
         * <p>dm-hbgau1zp****</p>
         */
        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        /**
         * <p>Indicates the engine of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>Indicates the engine version of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>Indicates the timestamp when the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database expires.</p>
         * 
         * <strong>example:</strong>
         * <p>123421352351234</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates the name of a read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates the network type of the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>Indicates the billing method of the read-only instance.</p>
         * <ul>
         * <li><strong>drdsPre</strong>: The instance uses the subscription billing method.</li>
         * <li><strong>drdsPost</strong>: The instance uses the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>Indicates the port that is used to connect to the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Indicates the type of the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("RdsInstType")
        public String rdsInstType;

        /**
         * <p>Indicates the read weight of the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("ReadWeight")
        public Integer readWeight;

        /**
         * <p>Indicates the number of remaining days before the read-only instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainDays")
        public Integer remainDays;

        public static DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance self = new DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

    }

    public static class DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances extends TeaModel {
        @NameInMap("ReadOnlyInstance")
        public java.util.List<DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance;

        public static DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances self = new DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances setReadOnlyInstance(java.util.List<DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance) {
            this.readOnlyInstance = readOnlyInstance;
            return this;
        }
        public java.util.List<DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance> getReadOnlyInstance() {
            return this.readOnlyInstance;
        }

    }

    public static class DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance extends TeaModel {
        /**
         * <p>Indicates the endpoint that is used to connect to an ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1t1mk5a5b******.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectUrl")
        public String connectUrl;

        /**
         * <p>Indicates the ID of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1t1mk5a5bdj****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>Indicates the state of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The ApsaraDB RDS for MySQL instance is being created.</li>
         * <li><strong>1</strong>: The ApsaraDB RDS for MySQL instance is running.</li>
         * <li><strong>3</strong>: The ApsaraDB RDS for MySQL instance is being deleted.</li>
         * <li><strong>5</strong>: The ApsaraDB RDS for MySQL instance is being restarted.</li>
         * <li><strong>6</strong>: The ApsaraDB RDS for MySQL instance is being upgraded or downgraded.</li>
         * <li><strong>7</strong>: The ApsaraDB RDS for MySQL instance is being backed up.</li>
         * <li><strong>8</strong>: The network type of the ApsaraDB RDS for MySQL instance is being changed.</li>
         * <li><strong>9</strong>: The ApsaraDB RDS for MySQL instance is being migrated.</li>
         * <li><strong>11</strong>: The data of the ApsaraDB RDS for MySQL instance is being migrated.</li>
         * <li><strong>12</strong>: A disaster-recovery instance is being generated.</li>
         * <li><strong>13</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>14</strong>: Data is being imported to the ApsaraDB RDS for MySQL instance from an another ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>15</strong>: A failover is being performed.</li>
         * <li><strong>16</strong>: A temporary instance is being created.</li>
         * <li><strong>17</strong>: A network is being created for the ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>18</strong>: The ApsaraDB RDS for MySQL instance is being cloned.</li>
         * <li><strong>19</strong>: The link is being changed.</li>
         * <li><strong>20</strong>: The read-only instances of the ApsaraDB RDS for MySQL instance are being migrated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>Indicates the type of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. The value is set to RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("DbInstType")
        public String dbInstType;

        /**
         * <p>Indicates the ID of a resource.</p>
         * 
         * <strong>example:</strong>
         * <p>dm-hbgau1zp****</p>
         */
        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        /**
         * <p>Indicates the engine of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>Indicates the engine version of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>Indicates the point in time when the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1237486127634</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates the network type of the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>Indicates the billing method of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database. Valid values:</p>
         * <ul>
         * <li><strong>drdsPre</strong>: The instance uses the subscription billing method.</li>
         * <li><strong>drdsPost</strong>: The instance uses the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>Indicates the port that is used to connect to the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Indicates whether the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database is a primary instance or a read-only instance.</p>
         * <ul>
         * <li><strong>Primary</strong>: The instance is a primary instance.</li>
         * <li><strong>Readonly</strong>: The instance is a read-only instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("RdsInstType")
        public String rdsInstType;

        /**
         * <p>Indicates information about the read-only instances of the ApsaraDB RDS for MySQL instance that is used to store the data of the specified database.</p>
         */
        @NameInMap("ReadOnlyInstances")
        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances readOnlyInstances;

        /**
         * <p>Indicates the read weight of the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ReadWeight")
        public Integer readWeight;

        /**
         * <p>Indicates the number of remaining days before a subscription instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainDays")
        public Integer remainDays;

        public static DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance self = new DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setReadOnlyInstances(DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances readOnlyInstances) {
            this.readOnlyInstances = readOnlyInstances;
            return this;
        }
        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances getReadOnlyInstances() {
            return this.readOnlyInstances;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

    }

    public static class DescribeDrdsDbInstancesResponseBodyDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        public java.util.List<DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance> dbInstance;

        public static DescribeDrdsDbInstancesResponseBodyDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseBodyDbInstances self = new DescribeDrdsDbInstancesResponseBodyDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstances setDbInstance(java.util.List<DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
