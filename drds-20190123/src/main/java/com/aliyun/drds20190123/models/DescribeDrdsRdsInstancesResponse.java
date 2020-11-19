// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsRdsInstancesResponse extends TeaModel {
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
    public DescribeDrdsRdsInstancesResponseDbInstances dbInstances;

    public static DescribeDrdsRdsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsRdsInstancesResponse self = new DescribeDrdsRdsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsRdsInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsRdsInstancesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsRdsInstancesResponse setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsRdsInstancesResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsRdsInstancesResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeDrdsRdsInstancesResponse setDbInstances(DescribeDrdsRdsInstancesResponseDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribeDrdsRdsInstancesResponseDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public static class DescribeDrdsRdsInstancesResponseDbInstancesDbInstance extends TeaModel {
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

        public static DescribeDrdsRdsInstancesResponseDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsRdsInstancesResponseDbInstancesDbInstance self = new DescribeDrdsRdsInstancesResponseDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDmInstanceId(String dmInstanceId) {
            this.dmInstanceId = dmInstanceId;
            return this;
        }
        public String getDmInstanceId() {
            return this.dmInstanceId;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setConnectUrl(String connectUrl) {
            this.connectUrl = connectUrl;
            return this;
        }
        public String getConnectUrl() {
            return this.connectUrl;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDrdsRdsInstancesResponseDbInstancesDbInstance setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

    }

    public static class DescribeDrdsRdsInstancesResponseDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        @Validation(required = true)
        public java.util.List<DescribeDrdsRdsInstancesResponseDbInstancesDbInstance> dbInstance;

        public static DescribeDrdsRdsInstancesResponseDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsRdsInstancesResponseDbInstances self = new DescribeDrdsRdsInstancesResponseDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsRdsInstancesResponseDbInstances setDbInstance(java.util.List<DescribeDrdsRdsInstancesResponseDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribeDrdsRdsInstancesResponseDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
