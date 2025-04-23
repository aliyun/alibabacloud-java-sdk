// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRamPolicyExportTaskVersionResponseBody extends TeaModel {
    @NameInMap("ramPolicyExportTaskVersion")
    public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion ramPolicyExportTaskVersion;

    /**
     * <strong>example:</strong>
     * <p>E2D0E863-1651-5E58-823F-B451C8C24615</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRamPolicyExportTaskVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRamPolicyExportTaskVersionResponseBody self = new GetRamPolicyExportTaskVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRamPolicyExportTaskVersionResponseBody setRamPolicyExportTaskVersion(GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion ramPolicyExportTaskVersion) {
        this.ramPolicyExportTaskVersion = ramPolicyExportTaskVersion;
        return this;
    }
    public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion getRamPolicyExportTaskVersion() {
        return this.ramPolicyExportTaskVersion;
    }

    public GetRamPolicyExportTaskVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion extends TeaModel {
        @NameInMap("authorizationAccountIds")
        public java.util.List<Long> authorizationAccountIds;

        @NameInMap("authorizationActions")
        public java.util.List<String> authorizationActions;

        @NameInMap("authorizationRegionIds")
        public java.util.List<String> authorizationRegionIds;

        /**
         * <strong>example:</strong>
         * <p>2022-07-18T06:32:06Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("exportVersion")
        public String exportVersion;

        /**
         * <strong>example:</strong>
         * <p>the ram policy export task has time out, The maximum running time is 1 hour</p>
         */
        @NameInMap("failedReason")
        public String failedReason;

        @NameInMap("missingActions")
        public java.util.List<String> missingActions;

        /**
         * <strong>example:</strong>
         * <p>mod-4357ffeebf6b577c4afa</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("noSupportResourceTypes")
        public java.util.List<String> noSupportResourceTypes;

        /**
         * <strong>example:</strong>
         * <p>&quot;{
         *     &quot;version&quot;: &quot;1&quot;,
         *     &quot;statement&quot;: [
         *       {
         *         &quot;effect&quot;: &quot;Allow&quot;,
         *         &quot;action&quot;: [
         *           &quot;ecs:<em>&quot;
         *         ],
         *         &quot;resource&quot;: [
         *           &quot;</em>&quot;
         *         ],
         *         &quot;condition&quot;: null,
         *         &quot;supportVariables&quot;: []
         *       }
         *     ]
         *   }&quot;</p>
         */
        @NameInMap("policyDocument")
        public String policyDocument;

        /**
         * <strong>example:</strong>
         * <p>rpe-43ffe0252e48f9286a</p>
         */
        @NameInMap("ramPolicyExportTaskId")
        public String ramPolicyExportTaskId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        @NameInMap("unauthorizedActions")
        public java.util.List<String> unauthorizedActions;

        @NameInMap("warnMessage")
        public String warnMessage;

        public static GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion build(java.util.Map<String, ?> map) throws Exception {
            GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion self = new GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion();
            return TeaModel.build(map, self);
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setAuthorizationAccountIds(java.util.List<Long> authorizationAccountIds) {
            this.authorizationAccountIds = authorizationAccountIds;
            return this;
        }
        public java.util.List<Long> getAuthorizationAccountIds() {
            return this.authorizationAccountIds;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setAuthorizationActions(java.util.List<String> authorizationActions) {
            this.authorizationActions = authorizationActions;
            return this;
        }
        public java.util.List<String> getAuthorizationActions() {
            return this.authorizationActions;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setAuthorizationRegionIds(java.util.List<String> authorizationRegionIds) {
            this.authorizationRegionIds = authorizationRegionIds;
            return this;
        }
        public java.util.List<String> getAuthorizationRegionIds() {
            return this.authorizationRegionIds;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setExportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }
        public String getExportVersion() {
            return this.exportVersion;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setMissingActions(java.util.List<String> missingActions) {
            this.missingActions = missingActions;
            return this;
        }
        public java.util.List<String> getMissingActions() {
            return this.missingActions;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setNoSupportResourceTypes(java.util.List<String> noSupportResourceTypes) {
            this.noSupportResourceTypes = noSupportResourceTypes;
            return this;
        }
        public java.util.List<String> getNoSupportResourceTypes() {
            return this.noSupportResourceTypes;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setRamPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setUnauthorizedActions(java.util.List<String> unauthorizedActions) {
            this.unauthorizedActions = unauthorizedActions;
            return this;
        }
        public java.util.List<String> getUnauthorizedActions() {
            return this.unauthorizedActions;
        }

        public GetRamPolicyExportTaskVersionResponseBodyRamPolicyExportTaskVersion setWarnMessage(String warnMessage) {
            this.warnMessage = warnMessage;
            return this;
        }
        public String getWarnMessage() {
            return this.warnMessage;
        }

    }

}
