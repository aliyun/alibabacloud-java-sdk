// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetLicenseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
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
    public GetLicenseResponseBodyData data;

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
     * <strong>example:</strong>
     * <p>68738E75-43C1-5AE5-9F3A-AFEF576D7B5F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseResponseBody self = new GetLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLicenseResponseBody setData(GetLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLicenseResponseBodyData getData() {
        return this.data;
    }

    public GetLicenseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLicenseResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetLicenseResponseBodyDataActivateRecord extends TeaModel {
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
         * <p>XXXX</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        /**
         * <strong>example:</strong>
         * <p>1040b91765d14ad1a40ff22589070342</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>activated</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetLicenseResponseBodyDataActivateRecord build(java.util.Map<String, ?> map) throws Exception {
            GetLicenseResponseBodyDataActivateRecord self = new GetLicenseResponseBodyDataActivateRecord();
            return TeaModel.build(map, self);
        }

        public GetLicenseResponseBodyDataActivateRecord setActivateTime(String activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public String getActivateTime() {
            return this.activateTime;
        }

        public GetLicenseResponseBodyDataActivateRecord setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public GetLicenseResponseBodyDataActivateRecord setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetLicenseResponseBodyDataActivateRecord setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetLicenseResponseBodyDataActivateRecord setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public GetLicenseResponseBodyDataActivateRecord setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetLicenseResponseBodyDataActivateRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLicenseResponseBodyData extends TeaModel {
        @NameInMap("ActivateRecord")
        public java.util.List<GetLicenseResponseBodyDataActivateRecord> activateRecord;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-29 15:03:12</p>
         */
        @NameInMap("ActivateTime")
        public String activateTime;

        @NameInMap("AdaptiveMachine")
        public String adaptiveMachine;

        @NameInMap("AllDuration")
        public String allDuration;

        @NameInMap("ApplicableSpecs")
        public String applicableSpecs;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-29 15:01:15</p>
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
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>c31238fcb74e482588a72de90cd7dba3</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("LicenseCode")
        public String licenseCode;

        @NameInMap("LicenseSpecCode")
        public String licenseSpecCode;

        /**
         * <p>代表资源组的资源属性字段</p>
         */
        @NameInMap("LicenseSpecName")
        public String licenseSpecName;

        @NameInMap("LicenseSpecType")
        public String licenseSpecType;

        /**
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("MemoryLimit")
        public Integer memoryLimit;

        @NameInMap("Proposal")
        public String proposal;

        /**
         * <strong>example:</strong>
         * <p>activated</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UnActivateAllDuration")
        public String unActivateAllDuration;

        public static GetLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLicenseResponseBodyData self = new GetLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLicenseResponseBodyData setActivateRecord(java.util.List<GetLicenseResponseBodyDataActivateRecord> activateRecord) {
            this.activateRecord = activateRecord;
            return this;
        }
        public java.util.List<GetLicenseResponseBodyDataActivateRecord> getActivateRecord() {
            return this.activateRecord;
        }

        public GetLicenseResponseBodyData setActivateTime(String activateTime) {
            this.activateTime = activateTime;
            return this;
        }
        public String getActivateTime() {
            return this.activateTime;
        }

        public GetLicenseResponseBodyData setAdaptiveMachine(String adaptiveMachine) {
            this.adaptiveMachine = adaptiveMachine;
            return this;
        }
        public String getAdaptiveMachine() {
            return this.adaptiveMachine;
        }

        public GetLicenseResponseBodyData setAllDuration(String allDuration) {
            this.allDuration = allDuration;
            return this;
        }
        public String getAllDuration() {
            return this.allDuration;
        }

        public GetLicenseResponseBodyData setApplicableSpecs(String applicableSpecs) {
            this.applicableSpecs = applicableSpecs;
            return this;
        }
        public String getApplicableSpecs() {
            return this.applicableSpecs;
        }

        public GetLicenseResponseBodyData setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public GetLicenseResponseBodyData setCpuLimit(Integer cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        public GetLicenseResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLicenseResponseBodyData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetLicenseResponseBodyData setEffectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public String getEffectTime() {
            return this.effectTime;
        }

        public GetLicenseResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetLicenseResponseBodyData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public GetLicenseResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLicenseResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetLicenseResponseBodyData setLicenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }
        public String getLicenseCode() {
            return this.licenseCode;
        }

        public GetLicenseResponseBodyData setLicenseSpecCode(String licenseSpecCode) {
            this.licenseSpecCode = licenseSpecCode;
            return this;
        }
        public String getLicenseSpecCode() {
            return this.licenseSpecCode;
        }

        public GetLicenseResponseBodyData setLicenseSpecName(String licenseSpecName) {
            this.licenseSpecName = licenseSpecName;
            return this;
        }
        public String getLicenseSpecName() {
            return this.licenseSpecName;
        }

        public GetLicenseResponseBodyData setLicenseSpecType(String licenseSpecType) {
            this.licenseSpecType = licenseSpecType;
            return this;
        }
        public String getLicenseSpecType() {
            return this.licenseSpecType;
        }

        public GetLicenseResponseBodyData setMemoryLimit(Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetLicenseResponseBodyData setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public GetLicenseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLicenseResponseBodyData setUnActivateAllDuration(String unActivateAllDuration) {
            this.unActivateAllDuration = unActivateAllDuration;
            return this;
        }
        public String getUnActivateAllDuration() {
            return this.unActivateAllDuration;
        }

    }

}
