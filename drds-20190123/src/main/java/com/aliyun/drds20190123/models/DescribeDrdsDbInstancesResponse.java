// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("DbInstances")
    @Validation(required = true)
    public DescribeDrdsDbInstancesResponseDbInstances dbInstances;

    public static DescribeDrdsDbInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstancesResponse self = new DescribeDrdsDbInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbInstancesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDbInstancesResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsDbInstancesResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsDbInstancesResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeDrdsDbInstancesResponse setDbInstances(DescribeDrdsDbInstancesResponseDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeDrdsDbInstancesResponseDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public static class DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance extends TeaModel {
        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

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

        public static DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance self = new DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

    }

    public static class DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances extends TeaModel {
        @NameInMap("ReadOnlyInstance")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance;

        public static DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances self = new DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances setReadOnlyInstance(java.util.List<DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance> readOnlyInstance) {
            this.readOnlyInstance = readOnlyInstance;
            return this;
        }
        public java.util.List<DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance> getReadOnlyInstance() {
            return this.readOnlyInstance;
        }

    }

    public static class DescribeDrdsDbInstancesResponseDbInstancesDbInstance extends TeaModel {
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

        @NameInMap("ReadOnlyInstances")
        @Validation(required = true)
        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances readOnlyInstances;

        public static DescribeDrdsDbInstancesResponseDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseDbInstancesDbInstance self = new DescribeDrdsDbInstancesResponseDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbInstancesResponseDbInstancesDbInstance setReadOnlyInstances(DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances readOnlyInstances) {
            this.readOnlyInstances = readOnlyInstances;
            return this;
        }
        public DescribeDrdsDbInstancesResponseDbInstancesDbInstanceReadOnlyInstances getReadOnlyInstances() {
            return this.readOnlyInstances;
        }

    }

    public static class DescribeDrdsDbInstancesResponseDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDbInstancesResponseDbInstancesDbInstance> dbInstance;

        public static DescribeDrdsDbInstancesResponseDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseDbInstances self = new DescribeDrdsDbInstancesResponseDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseDbInstances setDbInstance(java.util.List<DescribeDrdsDbInstancesResponseDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeDrdsDbInstancesResponseDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
