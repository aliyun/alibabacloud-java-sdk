// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("DbInstances")
    public DescribeDrdsDbInstancesResponseBodyDbInstances dbInstances;

    public static DescribeDrdsDbInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbInstancesResponseBody self = new DescribeDrdsDbInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbInstancesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsDbInstancesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsDbInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDbInstancesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeDrdsDbInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDbInstancesResponseBody setDbInstances(DescribeDrdsDbInstancesResponseBodyDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeDrdsDbInstancesResponseBodyDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public static class DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("ReadWeight")
        public Integer readWeight;

        @NameInMap("RdsInstType")
        public String rdsInstType;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("RemainDays")
        public Integer remainDays;

        @NameInMap("DbInstType")
        public String dbInstType;

        @NameInMap("Engine")
        public String engine;

        public static DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance self = new DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstancesReadOnlyInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
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
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("DmInstanceId")
        public String dmInstanceId;

        @NameInMap("ConnectUrl")
        public String connectUrl;

        @NameInMap("ReadWeight")
        public Integer readWeight;

        @NameInMap("RdsInstType")
        public String rdsInstType;

        @NameInMap("RemainDays")
        public Integer remainDays;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DbInstType")
        public String dbInstType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ReadOnlyInstances")
        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances readOnlyInstances;

        public static DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance self = new DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstance setReadOnlyInstances(DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances readOnlyInstances) {
            this.readOnlyInstances = readOnlyInstances;
            return this;
        }
        public DescribeDrdsDbInstancesResponseBodyDbInstancesDbInstanceReadOnlyInstances getReadOnlyInstances() {
            return this.readOnlyInstances;
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
