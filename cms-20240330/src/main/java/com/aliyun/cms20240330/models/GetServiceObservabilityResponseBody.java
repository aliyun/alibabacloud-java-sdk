// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceObservabilityResponseBody extends TeaModel {
    @NameInMap("entryPointInfo")
    public GetServiceObservabilityResponseBodyEntryPointInfo entryPointInfo;

    @NameInMap("feeType")
    public String feeType;

    @NameInMap("quotas")
    public java.util.Map<String, String> quotas;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>4852B9B5-345C-5CBC-A15F-786D83ECCBBA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("settings")
    public java.util.Map<String, String> settings;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("workspace")
    public String workspace;

    public static GetServiceObservabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceObservabilityResponseBody self = new GetServiceObservabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceObservabilityResponseBody setEntryPointInfo(GetServiceObservabilityResponseBodyEntryPointInfo entryPointInfo) {
        this.entryPointInfo = entryPointInfo;
        return this;
    }
    public GetServiceObservabilityResponseBodyEntryPointInfo getEntryPointInfo() {
        return this.entryPointInfo;
    }

    public GetServiceObservabilityResponseBody setFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }
    public String getFeeType() {
        return this.feeType;
    }

    public GetServiceObservabilityResponseBody setQuotas(java.util.Map<String, String> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.Map<String, String> getQuotas() {
        return this.quotas;
    }

    public GetServiceObservabilityResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetServiceObservabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceObservabilityResponseBody setSettings(java.util.Map<String, String> settings) {
        this.settings = settings;
        return this;
    }
    public java.util.Map<String, String> getSettings() {
        return this.settings;
    }

    public GetServiceObservabilityResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceObservabilityResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetServiceObservabilityResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetServiceObservabilityResponseBodyEntryPointInfo extends TeaModel {
        @NameInMap("authToken")
        public String authToken;

        @NameInMap("privateDomain")
        public String privateDomain;

        /**
         * <p>SLS Project</p>
         * 
         * <strong>example:</strong>
         * <p>proj-xtrace-xxxxx</p>
         */
        @NameInMap("project")
        public String project;

        @NameInMap("publicDomain")
        public String publicDomain;

        public static GetServiceObservabilityResponseBodyEntryPointInfo build(java.util.Map<String, ?> map) throws Exception {
            GetServiceObservabilityResponseBodyEntryPointInfo self = new GetServiceObservabilityResponseBodyEntryPointInfo();
            return TeaModel.build(map, self);
        }

        public GetServiceObservabilityResponseBodyEntryPointInfo setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public GetServiceObservabilityResponseBodyEntryPointInfo setPrivateDomain(String privateDomain) {
            this.privateDomain = privateDomain;
            return this;
        }
        public String getPrivateDomain() {
            return this.privateDomain;
        }

        public GetServiceObservabilityResponseBodyEntryPointInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetServiceObservabilityResponseBodyEntryPointInfo setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

    }

}
