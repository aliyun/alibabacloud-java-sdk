// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsReadOnlyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DbInstances")
    @Validation(required = true)
    public DescribeRdsReadOnlyResponseDbInstances dbInstances;

    public static DescribeRdsReadOnlyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsReadOnlyResponse self = new DescribeRdsReadOnlyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRdsReadOnlyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsReadOnlyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRdsReadOnlyResponse setDbInstances(DescribeRdsReadOnlyResponseDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeRdsReadOnlyResponseDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public static class DescribeRdsReadOnlyResponseDbInstancesDbInstance extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DmInstanceId")
        @Validation(required = true)
        public String dmInstanceId;

        @NameInMap("ConnectUrl")
        @Validation(required = true)
        public String connectUrl;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("DbInstType")
        @Validation(required = true)
        public String dbInstType;

        @NameInMap("ReadWeight")
        @Validation(required = true)
        public Integer readWeight;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("RdsInstType")
        @Validation(required = true)
        public String rdsInstType;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("RemainDays")
        @Validation(required = true)
        public Integer remainDays;

        @NameInMap("DBInstanceClassType")
        @Validation(required = true)
        public String DBInstanceClassType;

        @NameInMap("DBInstanceCPU")
        @Validation(required = true)
        public String DBInstanceCPU;

        @NameInMap("DBInstanceMemory")
        @Validation(required = true)
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceStorage")
        @Validation(required = true)
        public Long DBInstanceStorage;

        public static DescribeRdsReadOnlyResponseDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsReadOnlyResponseDbInstancesDbInstance self = new DescribeRdsReadOnlyResponseDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeRdsReadOnlyResponseDbInstancesDbInstance setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

    }

    public static class DescribeRdsReadOnlyResponseDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        @Validation(required = true)
        public java.util.List<DescribeRdsReadOnlyResponseDbInstancesDbInstance> dbInstance;

        public static DescribeRdsReadOnlyResponseDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsReadOnlyResponseDbInstances self = new DescribeRdsReadOnlyResponseDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRdsReadOnlyResponseDbInstances setDbInstance(java.util.List<DescribeRdsReadOnlyResponseDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeRdsReadOnlyResponseDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
