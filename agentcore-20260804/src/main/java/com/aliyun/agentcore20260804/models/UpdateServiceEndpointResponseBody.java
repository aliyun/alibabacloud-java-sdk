// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateServiceEndpointResponseBody extends TeaModel {
    /**
     * <p>The response code of the request. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The service endpoint information returned after the update is accepted. This includes the binding target, saved authentication and elasticity configurations, and current status. The endpoint may still be updating.</p>
     */
    @NameInMap("data")
    public UpdateServiceEndpointResponseBodyData data;

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
     * <p>The unique identifier of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5E8F3C2A-1B4D-4F6E-9A7C-0D2B8E6F4A1C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates that the update request is accepted, but does not mean that the deployment or endpoint change is complete. You must check data.status and data.accessUrls to confirm the result.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEndpointResponseBody self = new UpdateServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateServiceEndpointResponseBody setData(UpdateServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public UpdateServiceEndpointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateServiceEndpointResponseBodyDataAccessUrls extends TeaModel {
        /**
         * <p>The access URL type. Valid values: INTERNET and VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The access URL status. Valid values: CREATING, READY, and DEGRADED.</p>
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

        public static UpdateServiceEndpointResponseBodyDataAccessUrls build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataAccessUrls self = new UpdateServiceEndpointResponseBodyDataAccessUrls();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataAccessUrls setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public UpdateServiceEndpointResponseBodyDataAccessUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateServiceEndpointResponseBodyDataAccessUrls setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public UpdateServiceEndpointResponseBodyDataAccessUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateServiceEndpointResponseBodyDataAuthentication extends TeaModel {
        /**
         * <p>The authentication method. Valid values:</p>
         * <ul>
         * <li>NONE: No authentication is required.</li>
         * <li>API_KEY: Authentication is performed by passing the API key in the x-api-key request header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateServiceEndpointResponseBodyDataAuthentication build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataAuthentication self = new UpdateServiceEndpointResponseBodyDataAuthentication();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints extends TeaModel {
        /**
         * <p>The target maximum number of instances. This parameter is required. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxInstances")
        public Integer maxInstances;

        /**
         * <p>The target minimum number of instances. This parameter is required. Valid values: 0 to 100. The value cannot be greater than maxInstances in the same item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minInstances")
        public Integer minInstances;

        /**
         * <p>The days of the month. This parameter is required only for each trigger point of monthly policies. It cannot be empty and must be deduplicated. Valid values are integers from 1 to 31. Each row is selected independently. If a date does not exist in a specific month, the policy is not triggered and is not postponed to the end of the month. This parameter must be omitted for other periods.</p>
         */
        @NameInMap("monthDays")
        public java.util.List<Integer> monthDays;

        /**
         * <p>The trigger time. This parameter is required. Format: HH:mm:ss. It is interpreted in the time zone of the associated policy, accurate to the minute, and the seconds are fixed at 00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>The days of the week. This parameter is required only for each trigger point of weekly policies. It cannot be empty and must be deduplicated. Valid values are integers from 1 to 7, where 1 represents Monday and 7 represents Sunday. Each row is selected independently. This parameter must be omitted for other periods.</p>
         */
        @NameInMap("weekdays")
        public java.util.List<Integer> weekdays;

        public static UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints self = new UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMaxInstances(Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMinInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Integer getMinInstances() {
            return this.minInstances;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMonthDays(java.util.List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setWeekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

    }

    public static class UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies extends TeaModel {
        /**
         * <p>The end time of the validity period. This parameter is required only when validity is set to range. The format is the same as startTime, and the seconds are fixed at 00. It must be later than startTime. The interval does not include the end time. If validity is set to forever, the start and end times must be omitted. Valid dates and cross-field constraints are verified by the console.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-01T00:00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The policy identifier. This parameter is required and must be unique and stable within the endpoint. It is generated by the frontend when added, and retained during editing and retries.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-weekday</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The policy priority. This parameter is required. Valid values: 5 (regular) and 10 (high priority). The default selection for a new policy is regular. You must explicitly provide this parameter upon submission, and no default value is set for the API. When the final dynamicPolicy.enabled is set to true, the validity periods of high-priority policies cannot overlap, but end-to-end connection is allowed. Long-term high-priority policies can overlap with other high-priority policies. When disabled, overlapping drafts can be saved, and the final configuration is verified when re-enabled. The validity of other fields and trigger conflicts within the policy are always verified. You must explicitly provide priority.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>The repeat period. This parameter is required. Valid values: daily (every day), weekly (every week), and monthly (every month). Only submit the fields corresponding to the specified period.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("repeat")
        public String repeat;

        /**
         * <p>The start time of the validity period. This parameter is required only when validity is set to range. Format: YYYY-MM-DDTHH:mm:ss in the policy time zone, without a time zone offset. The seconds are fixed at 00. The interval includes the start time. When editing, existing past start times are retained, and updates or retries are not rejected because the start time is earlier than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-01T00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The periodic trigger time points. This parameter is required and cannot be empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if the time is the same. weekly and monthly policies conflict only when the time is the same and the date sets intersect. This is verified by the console.</p>
         */
        @NameInMap("timePoints")
        public java.util.List<UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints;

        /**
         * <p>The policy time zone. This parameter is required and must be a valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        /**
         * <p>The policy validity period type. This parameter is required. Valid values: forever (long-term validity) and range (short-term validity). After expiration, the policy and its trigger results exit the current calculation, and the remaining policies are recalculated. If no candidates are available, the basic values are restored. The saved configuration is not automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>range</p>
         */
        @NameInMap("validity")
        public String validity;

        public static UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies self = new UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setRepeat(String repeat) {
            this.repeat = repeat;
            return this;
        }
        public String getRepeat() {
            return this.repeat;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setTimePoints(java.util.List<UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> getTimePoints() {
            return this.timePoints;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

    public static class UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy extends TeaModel {
        /**
         * <p>Specifies whether to enable dynamic policies. This parameter is required during creation. If omitted during an update, the original value is retained. Disabling it retains existing policies and restores the basic upper and lower limits. Re-enabling it triggers immediate calculation. When it is finally enabled, policies cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The complete list of dynamic policies. This parameter is required during creation. If omitted during an update, the original list is retained. If provided, it replaces the entire list and is not merged by ID. To clear the list, you must ensure that the final enabled is set to false. Each item must be complete. Conditional requirements and cross-field constraints are verified by the server. The display order does not indicate priority.</p>
         */
        @NameInMap("policies")
        public java.util.List<UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> policies;

        public static UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy self = new UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy setPolicies(java.util.List<UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> getPolicies() {
            return this.policies;
        }

    }

    public static class UpdateServiceEndpointResponseBodyDataElasticityPolicy extends TeaModel {
        /**
         * <p>The saved dynamic configuration. If the base configuration before the requirement is published lacks the dynamicPolicy parameter, it is supplemented with enabled=false and policies=[].</p>
         */
        @NameInMap("dynamicPolicy")
        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy dynamicPolicy;

        /**
         * <p>Specifies whether to enable the overall automatic elasticity mode. This parameter is independent of dynamicPolicy.enabled. If omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The saved or backfilled base maximum number of instances, which is not less than minSandboxCount. The historical value can exceed 100 and is not truncated when read. The base value is used when dynamic scaling is disabled or no candidates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The saved or backfilled base minimum number of instances, which is a non-negative integer and not greater than maxSandboxCount. The historical value can exceed 100 and is not truncated when read. A newly written complete configuration must still meet the 0 to 100 range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static UpdateServiceEndpointResponseBodyDataElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataElasticityPolicy self = new UpdateServiceEndpointResponseBodyDataElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicy setDynamicPolicy(UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy dynamicPolicy) {
            this.dynamicPolicy = dynamicPolicy;
            return this;
        }
        public UpdateServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public UpdateServiceEndpointResponseBodyDataElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class UpdateServiceEndpointResponseBodyDataTarget extends TeaModel {
        /**
         * <p>The target agent ID. This parameter is returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The target agent version. This parameter is returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>The collaboration component type. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>ELEMENT_WEB</p>
         */
        @NameInMap("collaborationComponent")
        public String collaborationComponent;

        /**
         * <p>The workspace resource binding ID associated with the target collaboration component. This parameter is returned when the target type is TEAM_COLLABORATION.</p>
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

        public static UpdateServiceEndpointResponseBodyDataTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyDataTarget self = new UpdateServiceEndpointResponseBodyDataTarget();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyDataTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateServiceEndpointResponseBodyDataTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public UpdateServiceEndpointResponseBodyDataTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public UpdateServiceEndpointResponseBodyDataTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public UpdateServiceEndpointResponseBodyDataTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateServiceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The list of access URLs for the service endpoint.</p>
         */
        @NameInMap("accessUrls")
        public java.util.List<UpdateServiceEndpointResponseBodyDataAccessUrls> accessUrls;

        /**
         * <p>The authentication configuration of the service endpoint.</p>
         */
        @NameInMap("authentication")
        public UpdateServiceEndpointResponseBodyDataAuthentication authentication;

        /**
         * <p>The creation time in UTC format compliant with RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Read-only. The Get operation queries RM sandboxPhaseCounts.RUNNING by endpoint runtimeKey. The Create and Update operations return null. The value is a non-negative integer. If the statistics are unavailable, null is returned. The value is not replaced by the base upper and lower limits, target quantity, or READY status. Unavailable statistics do not block submission.</p>
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
         * <p>The effective public access setting derived from combining publicAccessEnabled with the workspace-level public access limit. This parameter returns true only when both settings allow public access. This value only indicates the policy target and does not mean that the public endpoint has been fully published. For the actual status, refer to accessUrls and status.</p>
         */
        @NameInMap("effectivePublicAccessEnabled")
        public Boolean effectivePublicAccessEnabled;

        /**
         * <p>The elasticity configuration used for edit backfill, which is not the current effective upper and lower limits or the actual number of instances. The Get operation preferentially returns the saved configuration. If no configuration is saved, an endpoint that supports elasticity backfills the base values from the expected runtime frozen configuration or the bound version configuration when the runtime is not established. Successful publication is not required. If the source is temporarily unavailable or no applicable configuration exists, the value is null, but the status and statusReason are still returned. The Create and Update operations return only the saved configuration. If no configuration is saved, the value is null. The historical base capacity can exceed 100 and is not truncated when read.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticityPolicy")
        public UpdateServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy;

        /**
         * <p>The service endpoint type. Valid values:</p>
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
         * <p>The service endpoint name. The name must be unique within the workspace and 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-endpoint</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The expected public access setting configured by the user for the service endpoint. For historical service endpoints that have not been configured, this parameter returns true. This value only indicates the configuration expectation. For the actual availability of the public endpoint, refer to accessUrls and status.</p>
         */
        @NameInMap("publicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>The region ID of the service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The service endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>se-123456</p>
         */
        @NameInMap("serviceEndpointId")
        public String serviceEndpointId;

        /**
         * <p>The service endpoint status. Valid values: CREATING, READY, UPDATING, DEGRADED, DISABLED, and DELETING.</p>
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
        public UpdateServiceEndpointResponseBodyDataTarget target;

        /**
         * <p>The time of the last modification in UTC format compliant with RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyData self = new UpdateServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyData setAccessUrls(java.util.List<UpdateServiceEndpointResponseBodyDataAccessUrls> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }
        public java.util.List<UpdateServiceEndpointResponseBodyDataAccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        public UpdateServiceEndpointResponseBodyData setAuthentication(UpdateServiceEndpointResponseBodyDataAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public UpdateServiceEndpointResponseBodyDataAuthentication getAuthentication() {
            return this.authentication;
        }

        public UpdateServiceEndpointResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateServiceEndpointResponseBodyData setCurrentInstances(Integer currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }
        public Integer getCurrentInstances() {
            return this.currentInstances;
        }

        public UpdateServiceEndpointResponseBodyData setEffectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
            this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
            return this;
        }
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        public UpdateServiceEndpointResponseBodyData setElasticityPolicy(UpdateServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public UpdateServiceEndpointResponseBodyDataElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public UpdateServiceEndpointResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public UpdateServiceEndpointResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceEndpointResponseBodyData setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public UpdateServiceEndpointResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateServiceEndpointResponseBodyData setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public UpdateServiceEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateServiceEndpointResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public UpdateServiceEndpointResponseBodyData setTarget(UpdateServiceEndpointResponseBodyDataTarget target) {
            this.target = target;
            return this;
        }
        public UpdateServiceEndpointResponseBodyDataTarget getTarget() {
            return this.target;
        }

        public UpdateServiceEndpointResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateServiceEndpointResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
