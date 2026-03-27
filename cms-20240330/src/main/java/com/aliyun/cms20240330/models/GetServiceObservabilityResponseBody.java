// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceObservabilityResponseBody extends TeaModel {
    /**
     * <p>Endpoint and Authentication Information</p>
     */
    @NameInMap("entryPointInfo")
    public GetServiceObservabilityResponseBodyEntryPointInfo entryPointInfo;

    /**
     * <p>Billing Type</p>
     * 
     * <strong>example:</strong>
     * <p>arms=serverless;xtrace=serverless</p>
     */
    @NameInMap("feeType")
    public String feeType;

    /**
     * <p>Quota Configuration</p>
     */
    @NameInMap("quotas")
    public java.util.Map<String, String> quotas;

    /**
     * <p>Region</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>4852B9B5-345C-5CBC-A15F-786D83ECCBBA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>System Configuration</p>
     */
    @NameInMap("settings")
    public java.util.Map<String, String> settings;

    /**
     * <p>Resource Initialization Status</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Application Observability Type</p>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Workspace Name</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1654218***343050-cn-hangzhou</p>
     */
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
        /**
         * <p>Authentication Token for Data Reporting</p>
         * 
         * <strong>example:</strong>
         * <p>gaddp****@de20f2<em><strong>1ce</strong></em></p>
         */
        @NameInMap("authToken")
        public String authToken;

        /**
         * <p>Private Network Access Address</p>
         * 
         * <strong>example:</strong>
         * <p>project-xtrace-xxxx-cn-hangzhou.cn-hangzhou-intranet.log.aliyuncs.com</p>
         */
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

        /**
         * <p>Public Network Access Address</p>
         * 
         * <strong>example:</strong>
         * <p>project-xtrace-xxxx-cn-hangzhou.cn-hangzhou.log.aliyuncs.com</p>
         */
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
