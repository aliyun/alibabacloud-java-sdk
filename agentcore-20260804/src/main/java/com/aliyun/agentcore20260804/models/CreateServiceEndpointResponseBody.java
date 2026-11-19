// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateServiceEndpointResponseBody extends TeaModel {
    /**
     * <p>The response code of the request. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The service endpoint information returned after a successful creation, including the binding target, saved authentication and elasticity configurations, and current status. The endpoint may still be in the creating state.</p>
     */
    @NameInMap("data")
    public CreateServiceEndpointResponseBodyData data;

    /**
     * <p>The HTTP status code of the request. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message of the request. The value is success if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request, used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates that the creation request is accepted, but it does not mean that the endpoint deployment is complete. To confirm the deployment result, check data.status and data.accessUrls.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEndpointResponseBody self = new CreateServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceEndpointResponseBody setData(CreateServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceEndpointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateServiceEndpointResponseBodyDataAccessUrls extends TeaModel {
        /**
         * <p>The type of the access URL. Valid values: INTERNET and VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The status of the access URL. Valid values: CREATING, READY, and DEGRADED.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the access URL status. The specific reason is returned when the status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://endpoint.example.com">https://endpoint.example.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CreateServiceEndpointResponseBodyDataAccessUrls build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataAccessUrls self = new CreateServiceEndpointResponseBodyDataAccessUrls();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataAccessUrls setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public CreateServiceEndpointResponseBodyDataAccessUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateServiceEndpointResponseBodyDataAccessUrls setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public CreateServiceEndpointResponseBodyDataAccessUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateServiceEndpointResponseBodyDataAuthentication extends TeaModel {
        /**
         * <p>The authentication method. Valid values:</p>
         * <ul>
         * <li>NONE: No authentication is required.</li>
         * <li>API_KEY: Authentication is performed by passing an API key in the x-api-key request header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateServiceEndpointResponseBodyDataAuthentication build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataAuthentication self = new CreateServiceEndpointResponseBodyDataAuthentication();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints extends TeaModel {
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

        public static CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints self = new CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMaxInstances(Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMinInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Integer getMinInstances() {
            return this.minInstances;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMonthDays(java.util.List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setWeekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

    }

    public static class CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies extends TeaModel {
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
        public java.util.List<CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints;

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

        public static CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies self = new CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setRepeat(String repeat) {
            this.repeat = repeat;
            return this;
        }
        public String getRepeat() {
            return this.repeat;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setTimePoints(java.util.List<CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> getTimePoints() {
            return this.timePoints;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

    public static class CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy extends TeaModel {
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
        public java.util.List<CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> policies;

        public static CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy self = new CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy setPolicies(java.util.List<CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> getPolicies() {
            return this.policies;
        }

    }

    public static class CreateServiceEndpointResponseBodyDataElasticityPolicy extends TeaModel {
        /**
         * <p>The saved dynamic configuration. If the base configuration before the requirement goes online lacks dynamicPolicy, it is supplemented with enabled=false and policies=[].</p>
         */
        @NameInMap("dynamicPolicy")
        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy dynamicPolicy;

        /**
         * <p>Indicates whether the elasticity policy is enabled. This parameter is independent of dynamicPolicy.enabled. If this parameter is omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The saved or backfilled base maximum number of instances, which is not less than minSandboxCount. The historical value may exceed 100, and the read value is not truncated. The base value is used when dynamic scaling is disabled or no candidates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The saved or backfilled base minimum number of instances, which is a non-negative integer and not greater than maxSandboxCount. The historical value may exceed 100, and the read value is not truncated. A newly written complete configuration must still meet the requirement of 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static CreateServiceEndpointResponseBodyDataElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataElasticityPolicy self = new CreateServiceEndpointResponseBodyDataElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicy setDynamicPolicy(CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy dynamicPolicy) {
            this.dynamicPolicy = dynamicPolicy;
            return this;
        }
        public CreateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public CreateServiceEndpointResponseBodyDataElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class CreateServiceEndpointResponseBodyDataTarget extends TeaModel {
        /**
         * <p>The ID of the target agent. This parameter is returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The version number of the target agent. This parameter is returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>The type of the collaboration component. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>ELEMENT_WEB</p>
         */
        @NameInMap("collaborationComponent")
        public String collaborationComponent;

        /**
         * <p>The ID of the workspace resource binding associated with the target collaboration component. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>wrb-123456</p>
         */
        @NameInMap("resourceBindingId")
        public String resourceBindingId;

        /**
         * <p>The target type. Valid values: AGENT_VERSION and TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT_VERSION</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static CreateServiceEndpointResponseBodyDataTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyDataTarget self = new CreateServiceEndpointResponseBodyDataTarget();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyDataTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateServiceEndpointResponseBodyDataTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public CreateServiceEndpointResponseBodyDataTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public CreateServiceEndpointResponseBodyDataTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public CreateServiceEndpointResponseBodyDataTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateServiceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The list of access URLs for the service endpoint.</p>
         */
        @NameInMap("accessUrls")
        public java.util.List<CreateServiceEndpointResponseBodyDataAccessUrls> accessUrls;

        /**
         * <p>The authentication configuration of the service endpoint.</p>
         */
        @NameInMap("authentication")
        public CreateServiceEndpointResponseBodyDataAuthentication authentication;

        /**
         * <p>The creation time in UTC format compliant with RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The current number of instances. This parameter is read-only. The Get operation queries RM sandboxPhaseCounts.RUNNING based on the endpoint runtimeKey. The Create and Update operations return null. The value is a non-negative integer. If the statistics are unavailable, null is returned. This parameter is not replaced by the base upper and lower limits, target quantity, or READY status. Unavailable statistics do not block submission.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("currentInstances")
        public Integer currentInstances;

        /**
         * <p>The combined result of publicAccessEnabled and the workspace-level public access limit. The value is true only when both allow public access. This value only indicates the policy target and does not mean that the public endpoint has been fully provisioned. For the actual status, refer to accessUrls and status.</p>
         */
        @NameInMap("effectivePublicAccessEnabled")
        public Boolean effectivePublicAccessEnabled;

        /**
         * <p>The configuration used for edit backfill, which is not the currently effective upper and lower limits or the actual number of instances. The Get operation preferentially returns the saved configuration. If no configuration is saved, an endpoint that supports elasticity backfills the base values from the expected runtime frozen configuration or the bound version configuration when the runtime is not yet established, without requiring a successful publication. The value is null when the source is temporarily unavailable or no applicable configuration exists, but the status and statusReason are still returned. The Create and Update operations return only the saved configuration, and the value is null if no configuration is saved. The historical base capacity may exceed 100, and the read value is not truncated.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticityPolicy")
        public CreateServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy;

        /**
         * <p>The type of the service endpoint. Valid values:</p>
         * <ul>
         * <li>DEFAULT: The default endpoint created and maintained by the platform.</li>
         * <li>NAMED: The named endpoint explicitly created by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAMED</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The name of the service endpoint. The name must be unique within the workspace and be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-endpoint</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The expected public access setting configured by the user on the service endpoint. For historical service endpoints that have not been configured, this parameter returns true. This value only indicates the configuration expectation. To check whether the actual public endpoint is available, refer to accessUrls and status.</p>
         */
        @NameInMap("publicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>The ID of the region where the service endpoint resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The ID of the service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>se-123456</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The status of the service endpoint. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, and DELETING.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the service endpoint status. The specific reason is returned when the status is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceEndpoint.Provider.Unavailable: no provider for the target type</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The target routing configuration of the service endpoint.</p>
         */
        @NameInMap("target")
        public CreateServiceEndpointResponseBodyDataTarget target;

        /**
         * <p>The time of the last modification in UTC format compliant with RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyData self = new CreateServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyData setAccessUrls(java.util.List<CreateServiceEndpointResponseBodyDataAccessUrls> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }
        public java.util.List<CreateServiceEndpointResponseBodyDataAccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        public CreateServiceEndpointResponseBodyData setAuthentication(CreateServiceEndpointResponseBodyDataAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public CreateServiceEndpointResponseBodyDataAuthentication getAuthentication() {
            return this.authentication;
        }

        public CreateServiceEndpointResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateServiceEndpointResponseBodyData setCurrentInstances(Integer currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }
        public Integer getCurrentInstances() {
            return this.currentInstances;
        }

        public CreateServiceEndpointResponseBodyData setEffectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
            this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
            return this;
        }
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        public CreateServiceEndpointResponseBodyData setElasticityPolicy(CreateServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public CreateServiceEndpointResponseBodyDataElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public CreateServiceEndpointResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public CreateServiceEndpointResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceEndpointResponseBodyData setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public CreateServiceEndpointResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateServiceEndpointResponseBodyData setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public CreateServiceEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateServiceEndpointResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public CreateServiceEndpointResponseBodyData setTarget(CreateServiceEndpointResponseBodyDataTarget target) {
            this.target = target;
            return this;
        }
        public CreateServiceEndpointResponseBodyDataTarget getTarget() {
            return this.target;
        }

        public CreateServiceEndpointResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateServiceEndpointResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
