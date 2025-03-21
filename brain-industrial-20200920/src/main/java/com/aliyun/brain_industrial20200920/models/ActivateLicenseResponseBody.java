// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ActivateLicenseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ActivateLicenseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>65308A66-8764-53EE-8D4A-201E86CA88C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ActivateLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseResponseBody self = new ActivateLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ActivateLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActivateLicenseResponseBody setData(ActivateLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ActivateLicenseResponseBodyData getData() {
        return this.data;
    }

    public ActivateLicenseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ActivateLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActivateLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivateLicenseResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ActivateLicenseResponseBodyDataActivateRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-04-29 15:03:12</p>
         */
        @NameInMap("ActivateTime")
        public String activateTime;

        /**
         * <strong>example:</strong>
         * <p>2024-04-29 15:01:15</p>
         */
        @NameInMap("BuyTime")
        public String buyTime;

        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2025-05-01 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>activated</p>
         */
        @NameInMap("Status")
        public String status;

        public static ActivateLicenseResponseBodyDataActivateRecord build(java.util.Map<String, ?> map) throws Exception {
            ActivateLicenseResponseBodyDataActivateRecord self = new ActivateLicenseResponseBodyDataActivateRecord();
            return TeaModel.build(map, self);
        }

        public ActivateLicenseResponseBodyDataActivateRecord setActivateTime(String activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public String getActivateTime() {
            return this.activateTime;
        }

        public ActivateLicenseResponseBodyDataActivateRecord setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public ActivateLicenseResponseBodyDataActivateRecord setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ActivateLicenseResponseBodyDataActivateRecord setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ActivateLicenseResponseBodyDataActivateRecord setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public ActivateLicenseResponseBodyDataActivateRecord setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ActivateLicenseResponseBodyDataActivateRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ActivateLicenseResponseBodyData extends TeaModel {
        @NameInMap("ActivateRecord")
        public java.util.List<ActivateLicenseResponseBodyDataActivateRecord> activateRecord;

        /**
         * <strong>example:</strong>
         * <p>2024-04-29 15:03:12</p>
         */
        @NameInMap("ActivateTime")
        public String activateTime;

        @NameInMap("AllDuration")
        public String allDuration;

        @NameInMap("ApplicableSpecs")
        public String applicableSpecs;

        /**
         * <strong>example:</strong>
         * <p>2024-04-29 15:00:15</p>
         */
        @NameInMap("BuyTime")
        public String buyTime;

        /**
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("CpuLimit")
        public Integer cpuLimit;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>2024-05-01 00:00:00</p>
         */
        @NameInMap("EffectTime")
        public String effectTime;

        /**
         * <strong>example:</strong>
         * <p>2025-05-01 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>c39128fcb74e482546a72de90cdsaba3</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("LicenseSpecName")
        public String licenseSpecName;

        /**
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("MemoryLimit")
        public Integer memoryLimit;

        /**
         * <strong>example:</strong>
         * <p>activated</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UnActivateAllDuration")
        public String unActivateAllDuration;

        public static ActivateLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ActivateLicenseResponseBodyData self = new ActivateLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ActivateLicenseResponseBodyData setActivateRecord(java.util.List<ActivateLicenseResponseBodyDataActivateRecord> activateRecord) {
            this.activateRecord = activateRecord;
            return this;
        }
        public java.util.List<ActivateLicenseResponseBodyDataActivateRecord> getActivateRecord() {
            return this.activateRecord;
        }

        public ActivateLicenseResponseBodyData setActivateTime(String activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public String getActivateTime() {
            return this.activateTime;
        }

        public ActivateLicenseResponseBodyData setAllDuration(String allDuration) {
            this.allDuration = allDuration;
            return this;
        }
        public String getAllDuration() {
            return this.allDuration;
        }

        public ActivateLicenseResponseBodyData setApplicableSpecs(String applicableSpecs) {
            this.applicableSpecs = applicableSpecs;
            return this;
        }
        public String getApplicableSpecs() {
            return this.applicableSpecs;
        }

        public ActivateLicenseResponseBodyData setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public ActivateLicenseResponseBodyData setCpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        public ActivateLicenseResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ActivateLicenseResponseBodyData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ActivateLicenseResponseBodyData setEffectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public String getEffectTime() {
            return this.effectTime;
        }

        public ActivateLicenseResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ActivateLicenseResponseBodyData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public ActivateLicenseResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ActivateLicenseResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ActivateLicenseResponseBodyData setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public ActivateLicenseResponseBodyData setLicenseSpecName(String licenseSpecName) {
            this.licenseSpecName = licenseSpecName;
            return this;
        }
        public String getLicenseSpecName() {
            return this.licenseSpecName;
        }

        public ActivateLicenseResponseBodyData setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        public ActivateLicenseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ActivateLicenseResponseBodyData setUnActivateAllDuration(String unActivateAllDuration) {
            this.unActivateAllDuration = unActivateAllDuration;
            return this;
        }
        public String getUnActivateAllDuration() {
            return this.unActivateAllDuration;
        }

    }

}
