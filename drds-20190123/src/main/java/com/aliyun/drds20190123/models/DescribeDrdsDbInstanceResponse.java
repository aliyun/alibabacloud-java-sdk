// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DbInstance")
    @Validation(required = true)
    public DescribeDrdsDbInstanceResponseDbInstance dbInstance;

    public static DescribeDrdsDbInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstanceResponse self = new DescribeDrdsDbInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDbInstanceResponse setDbInstance(DescribeDrdsDbInstanceResponseDbInstance dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }
    public DescribeDrdsDbInstanceResponseDbInstance getDbInstance() {
        return this.dbInstance;
    }

    public static class DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance extends TeaModel {
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
        public String remainDays;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("VersionAction")
        @Validation(required = true)
        public Integer versionAction;

        public static DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance self = new DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setRemainDays(String remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public String getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance setVersionAction(Integer versionAction) {
            this.versionAction = versionAction;
            return this;
        }
        public Integer getVersionAction() {
            return this.versionAction;
        }

    }

    public static class DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances extends TeaModel {
        @NameInMap("ReadOnlyInstance")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance;

        public static DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances self = new DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances setReadOnlyInstance(java.util.List<DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance) {
            this.readOnlyInstance = readOnlyInstance;
            return this;
        }
        public java.util.List<DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstancesReadOnlyInstance> getReadOnlyInstance() {
            return this.readOnlyInstance;
        }

    }

    public static class DescribeDrdsDbInstanceResponseDbInstance extends TeaModel {
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
        public String remainDays;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("ReadOnlyInstances")
        @Validation(required = true)
        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances readOnlyInstances;

        public static DescribeDrdsDbInstanceResponseDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstanceResponseDbInstance self = new DescribeDrdsDbInstanceResponseDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstanceResponseDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setRemainDays(String remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public String getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstanceResponseDbInstance setReadOnlyInstances(DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances readOnlyInstances) {
            this.readOnlyInstances = readOnlyInstances;
            return this;
        }
        public DescribeDrdsDbInstanceResponseDbInstanceReadOnlyInstances getReadOnlyInstances() {
            return this.readOnlyInstances;
        }

    }

}
