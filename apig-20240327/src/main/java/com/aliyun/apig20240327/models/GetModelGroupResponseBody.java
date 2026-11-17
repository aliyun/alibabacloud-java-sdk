// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetModelGroupResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetModelGroupResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetModelGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelGroupResponseBody self = new GetModelGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetModelGroupResponseBody setData(GetModelGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelGroupResponseBodyData getData() {
        return this.data;
    }

    public GetModelGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModelGroupResponseBodyDataConfigurationDeployment extends TeaModel {
        /**
         * <p>The operation ID of the group configuration task, which is used for tracking only. It cannot be used in GetLogicalModelDeployment or RetryLogicalModelDeployment.</p>
         * 
         * <strong>example:</strong>
         * <p>op-xxxxxxxx</p>
         */
        @NameInMap("operationId")
        public String operationId;

        /**
         * <p>The model group version corresponding to the task, which may be earlier than the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("revision")
        public Long revision;

        /**
         * <p>The configuration deployment status. Valid values: Pending, Running, Succeeded, Failed, and PartiallyFailed.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        public static GetModelGroupResponseBodyDataConfigurationDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetModelGroupResponseBodyDataConfigurationDeployment self = new GetModelGroupResponseBodyDataConfigurationDeployment();
            return TeaModel.build(map, self);
        }

        public GetModelGroupResponseBodyDataConfigurationDeployment setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetModelGroupResponseBodyDataConfigurationDeployment setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

        public GetModelGroupResponseBodyDataConfigurationDeployment setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetModelGroupResponseBodyDataEntitlementState extends TeaModel {
        /**
         * <p>The applied entitlement revision.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("appliedRevision")
        public Long appliedRevision;

        /**
         * <p>The desired entitlement revision.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("desiredRevision")
        public Long desiredRevision;

        /**
         * <p>The error message when entitlement fails. This parameter is not returned when no error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Entitlement synchronization failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The entitlement status. Valid values: Pending, Applying, Committed, and Failed. Committed only indicates that the control plane has successfully submitted and read back the status, and does not mean that all nodes have acknowledged it.</p>
         * 
         * <strong>example:</strong>
         * <p>Committed</p>
         */
        @NameInMap("status")
        public String status;

        public static GetModelGroupResponseBodyDataEntitlementState build(java.util.Map<String, ?> map) throws Exception {
            GetModelGroupResponseBodyDataEntitlementState self = new GetModelGroupResponseBodyDataEntitlementState();
            return TeaModel.build(map, self);
        }

        public GetModelGroupResponseBodyDataEntitlementState setAppliedRevision(Long appliedRevision) {
            this.appliedRevision = appliedRevision;
            return this;
        }
        public Long getAppliedRevision() {
            return this.appliedRevision;
        }

        public GetModelGroupResponseBodyDataEntitlementState setDesiredRevision(Long desiredRevision) {
            this.desiredRevision = desiredRevision;
            return this;
        }
        public Long getDesiredRevision() {
            return this.desiredRevision;
        }

        public GetModelGroupResponseBodyDataEntitlementState setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetModelGroupResponseBodyDataEntitlementState setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetModelGroupResponseBodyData extends TeaModel {
        /**
         * <p>The summary of the latest group configuration deployment, which is independent of API release and entitlement status. This parameter is not returned when no deployment task exists, and its return does not indicate success. It represents the current version only when the revision matches the current version. List operations do not guarantee that this parameter is populated.</p>
         */
        @NameInMap("configurationDeployment")
        public GetModelGroupResponseBodyDataConfigurationDeployment configurationDeployment;

        /**
         * <p>The description of the model group.</p>
         * 
         * <strong>example:</strong>
         * <p>A model group for conversational scenarios</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The entitlement status information.</p>
         */
        @NameInMap("entitlementState")
        public GetModelGroupResponseBodyDataEntitlementState entitlementState;

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The list of model card IDs included in the model group.</p>
         */
        @NameInMap("modelCardIds")
        public java.util.List<String> modelCardIds;

        /**
         * <p>The ID of the model group.</p>
         * 
         * <strong>example:</strong>
         * <p>mg-xxxxxxxx</p>
         */
        @NameInMap("modelGroupId")
        public String modelGroupId;

        /**
         * <p>The name of the model group.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-group</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The last update time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The version number of the model group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Long version;

        public static GetModelGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelGroupResponseBodyData self = new GetModelGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelGroupResponseBodyData setConfigurationDeployment(GetModelGroupResponseBodyDataConfigurationDeployment configurationDeployment) {
            this.configurationDeployment = configurationDeployment;
            return this;
        }
        public GetModelGroupResponseBodyDataConfigurationDeployment getConfigurationDeployment() {
            return this.configurationDeployment;
        }

        public GetModelGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelGroupResponseBodyData setEntitlementState(GetModelGroupResponseBodyDataEntitlementState entitlementState) {
            this.entitlementState = entitlementState;
            return this;
        }
        public GetModelGroupResponseBodyDataEntitlementState getEntitlementState() {
            return this.entitlementState;
        }

        public GetModelGroupResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetModelGroupResponseBodyData setModelCardIds(java.util.List<String> modelCardIds) {
            this.modelCardIds = modelCardIds;
            return this;
        }
        public java.util.List<String> getModelCardIds() {
            return this.modelCardIds;
        }

        public GetModelGroupResponseBodyData setModelGroupId(String modelGroupId) {
            this.modelGroupId = modelGroupId;
            return this;
        }
        public String getModelGroupId() {
            return this.modelGroupId;
        }

        public GetModelGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModelGroupResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetModelGroupResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
