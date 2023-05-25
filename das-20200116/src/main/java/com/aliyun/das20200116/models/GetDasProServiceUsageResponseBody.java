// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasProServiceUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetDasProServiceUsageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDasProServiceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDasProServiceUsageResponseBody self = new GetDasProServiceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDasProServiceUsageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDasProServiceUsageResponseBody setData(GetDasProServiceUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDasProServiceUsageResponseBodyData getData() {
        return this.data;
    }

    public GetDasProServiceUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDasProServiceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDasProServiceUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDasProServiceUsageResponseBodyData extends TeaModel {
        @NameInMap("commodityInstanceId")
        public String commodityInstanceId;

        @NameInMap("engine")
        public String engine;

        @NameInMap("expireTime")
        public Long expireTime;

        @NameInMap("instanceAlias")
        public String instanceAlias;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("ip")
        public String ip;

        @NameInMap("isSpare")
        public Boolean isSpare;

        @NameInMap("migrationPredictRemainingTime")
        public Long migrationPredictRemainingTime;

        @NameInMap("port")
        public Integer port;

        @NameInMap("region")
        public String region;

        @NameInMap("serviceUnitId")
        public String serviceUnitId;

        @NameInMap("sqlRetention")
        public String sqlRetention;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("storageFreeQuotaInMB")
        public Double storageFreeQuotaInMB;

        @NameInMap("storageUsed")
        public Long storageUsed;

        @NameInMap("userId")
        public String userId;

        @NameInMap("vpcId")
        public String vpcId;

        public static GetDasProServiceUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDasProServiceUsageResponseBodyData self = new GetDasProServiceUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDasProServiceUsageResponseBodyData setCommodityInstanceId(String commodityInstanceId) {
            this.commodityInstanceId = commodityInstanceId;
            return this;
        }
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        public GetDasProServiceUsageResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetDasProServiceUsageResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetDasProServiceUsageResponseBodyData setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetDasProServiceUsageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDasProServiceUsageResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetDasProServiceUsageResponseBodyData setIsSpare(Boolean isSpare) {
            this.isSpare = isSpare;
            return this;
        }
        public Boolean getIsSpare() {
            return this.isSpare;
        }

        public GetDasProServiceUsageResponseBodyData setMigrationPredictRemainingTime(Long migrationPredictRemainingTime) {
            this.migrationPredictRemainingTime = migrationPredictRemainingTime;
            return this;
        }
        public Long getMigrationPredictRemainingTime() {
            return this.migrationPredictRemainingTime;
        }

        public GetDasProServiceUsageResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetDasProServiceUsageResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDasProServiceUsageResponseBodyData setServiceUnitId(String serviceUnitId) {
            this.serviceUnitId = serviceUnitId;
            return this;
        }
        public String getServiceUnitId() {
            return this.serviceUnitId;
        }

        public GetDasProServiceUsageResponseBodyData setSqlRetention(String sqlRetention) {
            this.sqlRetention = sqlRetention;
            return this;
        }
        public String getSqlRetention() {
            return this.sqlRetention;
        }

        public GetDasProServiceUsageResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDasProServiceUsageResponseBodyData setStorageFreeQuotaInMB(Double storageFreeQuotaInMB) {
            this.storageFreeQuotaInMB = storageFreeQuotaInMB;
            return this;
        }
        public Double getStorageFreeQuotaInMB() {
            return this.storageFreeQuotaInMB;
        }

        public GetDasProServiceUsageResponseBodyData setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public GetDasProServiceUsageResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDasProServiceUsageResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
