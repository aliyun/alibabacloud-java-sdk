// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateServiceEndpointRequest extends TeaModel {
    /**
     * <p>The name, routing target, and invocation authentication configuration of the service endpoint to be created, along with the optional initial elasticity configuration and public access switch.</p>
     */
    @NameInMap("body")
    public CreateServiceEndpointRequestBody body;

    /**
     * <p>Required when elasticity initialization is included. It is verified by the server. The same token and original request are reused for the same retry. If the logical content changes, a new token is used. The same token with different content returns InvalidParameter. The token must be 1 to 128 characters in length and can contain letters, digits, and the following special characters: . _ : -. The scope is the tenant and workspace. The receipt is retained for 7 days from the time of successful acceptance. Replays do not extend the retention period. After expiration, it is verified again as a new submission.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateServiceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEndpointRequest self = new CreateServiceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceEndpointRequest setBody(CreateServiceEndpointRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceEndpointRequestBody getBody() {
        return this.body;
    }

    public CreateServiceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateServiceEndpointRequestBodyAuthentication extends TeaModel {
        /**
         * <p>The saved invocation authentication type. NONE indicates that the endpoint API key is not used. API_KEY indicates that the endpoint API key is used. For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent and cannot be determined solely based on this field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateServiceEndpointRequestBodyAuthentication build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBodyAuthentication self = new CreateServiceEndpointRequestBodyAuthentication();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBodyAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints extends TeaModel {
        /**
         * <p>Required. The value ranges from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxInstances")
        public Integer maxInstances;

        /**
         * <p>Required. The value ranges from 0 to 100 and must not be greater than maxInstances in the same item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minInstances")
        public Integer minInstances;

        /**
         * <p>Required only for each trigger point of monthly. It must be non-empty and deduplicated. The values are integers from 1 to 31. Each row is selected independently. If a date does not exist in a month, it is not triggered and is not postponed to the end of the month. It must be omitted for other cycles.</p>
         */
        @NameInMap("monthDays")
        public java.util.List<Integer> monthDays;

        /**
         * <p>Required. The format is HH:mm:ss. It is interpreted in the time zone of the policy, accurate to the minute, and the seconds are fixed at 00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>Required only for each trigger point of weekly. It must be non-empty and deduplicated. The values are integers from 1 to 7, where 1 indicates Monday and 7 indicates Sunday. Each row is selected independently. It must be omitted for other cycles.</p>
         */
        @NameInMap("weekdays")
        public java.util.List<Integer> weekdays;

        public static CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints self = new CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setMaxInstances(Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setMinInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Integer getMinInstances() {
            return this.minInstances;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setMonthDays(java.util.List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setWeekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

    }

    public static class CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies extends TeaModel {
        /**
         * <p>Required only when validity is set to range. The format is the same as startTime, the seconds are fixed at 00, and it must be later than startTime. The interval does not include the end time. For forever, the start and end times must be omitted. Valid dates and cross-field constraints are verified by the console.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-01T00:00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>Required. It must be unique and stable within the endpoint. It is generated by the frontend when added, and retained during editing and retries.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-weekday</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Required. 5 indicates normal, and 10 indicates high priority. New policies default to normal. It must be explicitly provided during submission, and no default value is set for the operation. When the final dynamicPolicy.enabled is true, the validity periods of high-priority policies must not overlap, but end-to-end connection is allowed. Long-term high-priority policies can overlap with other high-priority policies. When disabled, overlapping drafts can be saved, and the final configuration is verified when re-enabled. The validity of other fields and trigger conflicts within the policy are always verified. The priority must be explicitly provided.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>Required. daily means every day, weekly means every week, and monthly means every month. Only submit the fields corresponding to the cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("repeat")
        public String repeat;

        /**
         * <p>Required only when validity is set to range. The format is YYYY-MM-DDTHH:mm:ss in the policy time zone, without a time zone offset, and the seconds are fixed at 00. The interval includes the start time. Editing retains the existing past start time and does not reject updates or retries because it is earlier than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-01T00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>Required and non-empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if the time is the same. Weekly and monthly policies conflict only if the time is the same and the date sets intersect. This is verified by the console.</p>
         */
        @NameInMap("timePoints")
        public java.util.List<CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints;

        /**
         * <p>Required. A valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        /**
         * <p>Required. forever indicates long-term validity, and range indicates short-term validity. After expiration, the policy and its trigger results exit the current calculation, and the remaining policies are recalculated. If there are no candidates, the basic values are restored, and the saved configurations are not automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>range</p>
         */
        @NameInMap("validity")
        public String validity;

        public static CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies self = new CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setRepeat(String repeat) {
            this.repeat = repeat;
            return this;
        }
        public String getRepeat() {
            return this.repeat;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setTimePoints(java.util.List<CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints> getTimePoints() {
            return this.timePoints;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

    public static class CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy extends TeaModel {
        /**
         * <p>Specifies whether to enable dynamic policies. Required during creation. If omitted during an update, the original value is retained. Disabling it retains existing policies and restores the basic upper and lower limits. Re-enabling it triggers immediate calculation. When finally enabled, policies must not be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Required during creation. If omitted during an update, the original list is retained. If passed, the entire list is replaced and not merged by ID. To clear the list, you must also ensure that the final enabled value is false. Each item must be complete. Conditional requirements and cross-field constraints are verified by the server. The display order does not indicate priority.</p>
         */
        @NameInMap("policies")
        public java.util.List<CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies> policies;

        public static CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy self = new CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy setPolicies(java.util.List<CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies> getPolicies() {
            return this.policies;
        }

    }

    public static class CreateServiceEndpointRequestBodyElasticityPolicy extends TeaModel {
        /**
         * <p>Required. It must include enabled and policies, and is verified by the server. It is independent of the overall automatic elasticity switch.</p>
         */
        @NameInMap("dynamicPolicy")
        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy dynamicPolicy;

        /**
         * <p>Specifies whether to enable the entire automatic elasticity mode. It must be provided when elasticityPolicy is passed and is verified by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to enable the entire automatic elasticity mode. It must be provided when elasticityPolicy is passed and is verified by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>Specifies whether to enable the entire automatic elasticity mode. It must be provided when elasticityPolicy is passed and is verified by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static CreateServiceEndpointRequestBodyElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBodyElasticityPolicy self = new CreateServiceEndpointRequestBodyElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBodyElasticityPolicy setDynamicPolicy(CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy dynamicPolicy) {
            this.dynamicPolicy = dynamicPolicy;
            return this;
        }
        public CreateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public CreateServiceEndpointRequestBodyElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class CreateServiceEndpointRequestBodyTarget extends TeaModel {
        /**
         * <p>The ID of the agent associated with the AGENT_VERSION routing target. The agent is located in the workspace specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The version of the agent associated with the AGENT_VERSION routing target. Use the agentVersion returned by CreateAgentVersion or ListAgentVersions, which is different from the version name versionName.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>The component associated with the TEAM_COLLABORATION routing target. MATRIX_CLIENT indicates the Matrix client ingress, MATRIX_FEDERATION indicates the Matrix federation ingress, and ELEMENT_WEB indicates the Element Web ingress. Service endpoints for collaboration components are created internally by the platform. Do not pass this field when publicly creating an AGENT_VERSION endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>MATRIX_CLIENT</p>
         */
        @NameInMap("collaborationComponent")
        public String collaborationComponent;

        /**
         * <p>The ID of the resource binding associated with the TEAM_COLLABORATION routing target. It is maintained internally by the platform and generated in the format of wrb- followed by a 32-character hexadecimal UUID. Do not pass this field when publicly creating an AGENT_VERSION endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>wrb-0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("resourceBindingId")
        public String resourceBindingId;

        /**
         * <p>The public create operation only supports AGENT_VERSION, which indicates routing to a specified agent version. TEAM_COLLABORATION indicates a collaboration component. Service endpoints for collaboration components are created internally by the platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT_VERSION</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static CreateServiceEndpointRequestBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBodyTarget self = new CreateServiceEndpointRequestBodyTarget();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBodyTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateServiceEndpointRequestBodyTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public CreateServiceEndpointRequestBodyTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public CreateServiceEndpointRequestBodyTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public CreateServiceEndpointRequestBodyTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateServiceEndpointRequestBody extends TeaModel {
        /**
         * <p>Sets the invocation authentication configuration saved for the service endpoint, specified by type. For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent. The management operation for creating service endpoints still uses AccessKey or STS authentication and RAM authorization.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("authentication")
        public CreateServiceEndpointRequestBodyAuthentication authentication;

        /**
         * <p>Explicitly provided when creating a service endpoint with elasticity capabilities. The capability scope follows existing rules. Null or partial patches are not accepted. It must include enabled, the basic minSandboxCount and maxSandboxCount, and the complete dynamicPolicy. The basic upper and lower limits are both 0 to 100, and min must be less than or equal to max. To disable dynamic scaling without policies, pass enabled=false and policies=[]. When elasticity initialization is included, clientToken must be provided, and updateElasticity is not passed. Conditional requirements and cross-field constraints are verified by the server.</p>
         */
        @NameInMap("elasticityPolicy")
        public CreateServiceEndpointRequestBodyElasticityPolicy elasticityPolicy;

        /**
         * <p>The name of the named service endpoint to be created. For the Router type, the name must be 1 to 128 characters in length and can contain lowercase letters, digits, underscores, and hyphens. It must start with a letter or a digit, cannot use the reserved name default, and must be unique within the same agent. The names of Router and hybrid ingress endpoints cannot be changed after creation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether to enable public network inbound access for the service endpoint. If omitted, it is initialized to true. If true or false is passed, the passed value is saved. An explicit null or non-boolean value returns InvalidParameter. Whether public network access is actually enabled is also subject to the public network inbound access limit of the workspace. For more information, see effectivePublicAccessEnabled in the response.</p>
         */
        @NameInMap("publicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>Specifies the agent and its version associated with the service endpoint. The routing targets for collaboration components are maintained internally by the platform.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("target")
        public CreateServiceEndpointRequestBodyTarget target;

        public static CreateServiceEndpointRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointRequestBody self = new CreateServiceEndpointRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointRequestBody setAuthentication(CreateServiceEndpointRequestBodyAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public CreateServiceEndpointRequestBodyAuthentication getAuthentication() {
            return this.authentication;
        }

        public CreateServiceEndpointRequestBody setElasticityPolicy(CreateServiceEndpointRequestBodyElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public CreateServiceEndpointRequestBodyElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public CreateServiceEndpointRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceEndpointRequestBody setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public CreateServiceEndpointRequestBody setTarget(CreateServiceEndpointRequestBodyTarget target) {
            this.target = target;
            return this;
        }
        public CreateServiceEndpointRequestBodyTarget getTarget() {
            return this.target;
        }

    }

}
