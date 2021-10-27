// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsReadOnlyResponseBody extends TeaModel {
    @NameInMap("DbInstances")
    public DescribeRdsReadOnlyResponseBodyDbInstances dbInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsReadOnlyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsReadOnlyResponseBody self = new DescribeRdsReadOnlyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsReadOnlyResponseBody setDbInstances(DescribeRdsReadOnlyResponseBodyDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeRdsReadOnlyResponseBodyDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public DescribeRdsReadOnlyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsReadOnlyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance extends TeaModel {
        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        @NameInMap("DbInstType")
        public String dbInstType;

        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RdsInstType")
        public String rdsInstType;

        @NameInMap("ReadWeight")
        public Integer readWeight;

        @NameInMap("RemainDays")
        public Integer remainDays;

        public static DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance self = new DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

    }

    public static class DescribeRdsReadOnlyResponseBodyDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        public java.util.List<DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance> dbInstance;

        public static DescribeRdsReadOnlyResponseBodyDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsReadOnlyResponseBodyDbInstances self = new DescribeRdsReadOnlyResponseBodyDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRdsReadOnlyResponseBodyDbInstances setDbInstance(java.util.List<DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeRdsReadOnlyResponseBodyDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
