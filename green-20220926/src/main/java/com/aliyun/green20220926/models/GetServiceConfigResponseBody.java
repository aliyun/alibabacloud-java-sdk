// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetServiceConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetServiceConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfigResponseBody self = new GetServiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceConfigResponseBody setData(GetServiceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceConfigResponseBodyData getData() {
        return this.data;
    }

    public GetServiceConfigResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetServiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig extends TeaModel {
        @NameInMap("AuditRiskLevels")
        public java.util.List<String> auditRiskLevels;

        @NameInMap("CallbackId")
        public Long callbackId;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("ManualService")
        public String manualService;

        public static GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig self = new GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig();
            return TeaModel.build(map, self);
        }

        public GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig setAuditRiskLevels(java.util.List<String> auditRiskLevels) {
            this.auditRiskLevels = auditRiskLevels;
            return this;
        }
        public java.util.List<String> getAuditRiskLevels() {
            return this.auditRiskLevels;
        }

        public GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig setCallbackId(Long callbackId) {
            this.callbackId = callbackId;
            return this;
        }
        public Long getCallbackId() {
            return this.callbackId;
        }

        public GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig setManualService(String manualService) {
            this.manualService = manualService;
            return this;
        }
        public String getManualService() {
            return this.manualService;
        }

    }

    public static class GetServiceConfigResponseBodyDataCustomServiceConf extends TeaModel {
        @NameInMap("KeywordFilterLibs")
        public java.util.List<String> keywordFilterLibs;

        @NameInMap("KeywordHitLibs")
        public java.util.List<String> keywordHitLibs;

        @NameInMap("ManualMachineConfig")
        public GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig manualMachineConfig;

        @NameInMap("SimilarTextHitLibs")
        public java.util.List<String> similarTextHitLibs;

        public static GetServiceConfigResponseBodyDataCustomServiceConf build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConfigResponseBodyDataCustomServiceConf self = new GetServiceConfigResponseBodyDataCustomServiceConf();
            return TeaModel.build(map, self);
        }

        public GetServiceConfigResponseBodyDataCustomServiceConf setKeywordFilterLibs(java.util.List<String> keywordFilterLibs) {
            this.keywordFilterLibs = keywordFilterLibs;
            return this;
        }
        public java.util.List<String> getKeywordFilterLibs() {
            return this.keywordFilterLibs;
        }

        public GetServiceConfigResponseBodyDataCustomServiceConf setKeywordHitLibs(java.util.List<String> keywordHitLibs) {
            this.keywordHitLibs = keywordHitLibs;
            return this;
        }
        public java.util.List<String> getKeywordHitLibs() {
            return this.keywordHitLibs;
        }

        public GetServiceConfigResponseBodyDataCustomServiceConf setManualMachineConfig(GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig manualMachineConfig) {
            this.manualMachineConfig = manualMachineConfig;
            return this;
        }
        public GetServiceConfigResponseBodyDataCustomServiceConfManualMachineConfig getManualMachineConfig() {
            return this.manualMachineConfig;
        }

        public GetServiceConfigResponseBodyDataCustomServiceConf setSimilarTextHitLibs(java.util.List<String> similarTextHitLibs) {
            this.similarTextHitLibs = similarTextHitLibs;
            return this;
        }
        public java.util.List<String> getSimilarTextHitLibs() {
            return this.similarTextHitLibs;
        }

    }

    public static class GetServiceConfigResponseBodyData extends TeaModel {
        @NameInMap("CustomServiceConf")
        public GetServiceConfigResponseBodyDataCustomServiceConf customServiceConf;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 03:07:44</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>nickname_detection</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>165379****31937</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static GetServiceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConfigResponseBodyData self = new GetServiceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceConfigResponseBodyData setCustomServiceConf(GetServiceConfigResponseBodyDataCustomServiceConf customServiceConf) {
            this.customServiceConf = customServiceConf;
            return this;
        }
        public GetServiceConfigResponseBodyDataCustomServiceConf getCustomServiceConf() {
            return this.customServiceConf;
        }

        public GetServiceConfigResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetServiceConfigResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetServiceConfigResponseBodyData setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetServiceConfigResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
