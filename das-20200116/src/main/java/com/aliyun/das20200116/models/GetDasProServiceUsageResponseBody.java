// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasProServiceUsageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{         &quot;storageFreeQuotaInMB&quot;: 5120,         &quot;ip&quot;: &quot;rm-2ze8g2am97624****.mysql.<strong><strong>.com&quot;,         &quot;custinsId&quot;: 12448331,         &quot;userId&quot;: &quot;196278346919</strong></strong>&quot;,         &quot;uuid&quot;: &quot;hdm_b0ae36343407609bf3e8df8709d8****&quot;,         &quot;expireTime&quot;: 1924963200000,         &quot;instanceId&quot;: &quot;rm-2ze8g2am97624****&quot;,         &quot;storageUsed&quot;: 10773752667393,         &quot;engine&quot;: &quot;MySQL&quot;,         &quot;instanceAlias&quot;: &quot;TESTDB01_PROD&quot;,         &quot;port&quot;: 3310,         &quot;vpcId&quot;: &quot;hdm_****&quot;,         &quot;commodityInstanceId&quot;: &quot;daspro-****&quot;,         &quot;startTime&quot;: 1606381940000,         &quot;isSpare&quot;: false,         &quot;region&quot;: &quot;cn-shanghai&quot;,         &quot;serviceUnitId&quot;: &quot;5&quot;,         &quot;sqlRetention&quot;: 30     }</p>
     */
    @NameInMap("Data")
    public GetDasProServiceUsageResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7172BECE-588A-5961-8126-C216E16B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the DAS Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>daspro-cn-v0h1l6i****</p>
         */
        @NameInMap("commodityInstanceId")
        public String commodityInstanceId;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The point of time when DAS Enterprise Edition for the database instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1648742400000</p>
         */
        @NameInMap("expireTime")
        public Long expireTime;

        /**
         * <p>The name of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TESTDB01</p>
         */
        @NameInMap("instanceAlias")
        public String instanceAlias;

        /**
         * <p>The database instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The endpoint of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****.mysql.****.com</p>
         */
        @NameInMap("ip")
        public String ip;

        /**
         * <p>Indicates whether DAS Enterprise Edition for the database instance has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isSpare")
        public Boolean isSpare;

        /**
         * <p>The estimated remaining time for migrating the data generated by the SQL Explorer and Audit feature from the previous version to the new version. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This parameter is returned only when the SQL Explorer and Audit feature is migrated from the previous version to the new version.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("migrationPredictRemainingTime")
        public Long migrationPredictRemainingTime;

        /**
         * <p>The port number that is used to connect to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The region in which the database instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The service unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("serviceUnitId")
        public String serviceUnitId;

        /**
         * <p>The storage duration of SQL Explorer data. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("sqlRetention")
        public String sqlRetention;

        /**
         * <p>The time when DAS Enterprise Edition was enabled for the database instance. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1646100892000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The SQL Explorer storage space that is offered free-of-charge. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("storageFreeQuotaInMB")
        public Double storageFreeQuotaInMB;

        /**
         * <p>The storage usage of SQL Explorer of the database instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>35903498</p>
         */
        @NameInMap("storageUsed")
        public Long storageUsed;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>196278346919****</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zentqj1sk4qmolci****</p>
         */
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
