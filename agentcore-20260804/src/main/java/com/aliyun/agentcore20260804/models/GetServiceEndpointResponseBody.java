// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetServiceEndpointResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The service endpoint details.</p>
     */
    @NameInMap("data")
    public GetServiceEndpointResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. Returns an error description if the request fails.</p>
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
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEndpointResponseBody self = new GetServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceEndpointResponseBody setData(GetServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public GetServiceEndpointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceEndpointResponseBodyDataAccessUrls extends TeaModel {
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
         * <p>The reason for the access URL status. Returns the specific reason when the status is abnormal.</p>
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

        public static GetServiceEndpointResponseBodyDataAccessUrls build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataAccessUrls self = new GetServiceEndpointResponseBodyDataAccessUrls();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetServiceEndpointResponseBodyDataAccessUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetServiceEndpointResponseBodyDataAuthentication extends TeaModel {
        /**
         * <p>The authentication method. NONE indicates that no authentication is required. API_KEY indicates that authentication is performed by passing an API key in the x-api-key request header.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static GetServiceEndpointResponseBodyDataAuthentication build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataAuthentication self = new GetServiceEndpointResponseBodyDataAuthentication();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceEndpointResponseBodyDataEffectiveCapacity extends TeaModel {
        /**
         * <p>Read-only. Maps to autoScalingStatus.effectiveLimits.maxSandboxes in the RM. When effectiveCapacity is not null, this value must be returned in pairs with the minimum value. The value must be non-negative and no less than the minimum value. Zero is a valid value. The read value is not truncated at the upper limit of 100 configured for writing.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>Read-only. Maps to autoScalingStatus.effectiveLimits.minSandboxes in the RM. When effectiveCapacity is not null, this value must be returned in pairs with the maximum value. The value must be non-negative and no greater than the maximum value. The read value is not truncated at the upper limit of 100 configured for writing.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static GetServiceEndpointResponseBodyDataEffectiveCapacity build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataEffectiveCapacity self = new GetServiceEndpointResponseBodyDataEffectiveCapacity();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataEffectiveCapacity setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public GetServiceEndpointResponseBodyDataEffectiveCapacity setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints extends TeaModel {
        /**
         * <p>Required. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxInstances")
        public Integer maxInstances;

        /**
         * <p>Required. Valid values: 0 to 100. The value cannot be greater than the maxInstances value in the same item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minInstances")
        public Integer minInstances;

        /**
         * <p>Required only for each trigger point of the monthly cycle. The list must be non-empty and contain unique integers from 1 to 31. Each row is selected independently. If a selected day does not exist in a specific month, the trigger does not fire and is not postponed to the end of the month. This field must be omitted for other cycles.</p>
         */
        @NameInMap("monthDays")
        public java.util.List<Integer> monthDays;

        /**
         * <p>Required. The format is HH:mm:ss, interpreted in the time zone of the associated policy. The precision is down to the minute, and the seconds are fixed at 00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>Required only for each trigger point of weekly policies. Cannot be empty and must be deduplicated. Valid values are integers from 1 to 7, where 1 represents Monday and 7 represents Sunday. Each row is selected independently. Must be omitted for other cycles.</p>
         */
        @NameInMap("weekdays")
        public java.util.List<Integer> weekdays;

        public static GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints self = new GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMaxInstances(Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMinInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Integer getMinInstances() {
            return this.minInstances;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setMonthDays(java.util.List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints setWeekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

    }

    public static class GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies extends TeaModel {
        /**
         * <p>Required only when validity is set to range. The format is the same as startTime, with seconds fixed at 00. The end time must be later than the startTime. The interval does not include the end time. If validity is set to forever, the start and end times must be omitted. Valid dates and cross-field constraints are validated by the console.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-01T00:00:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>Required. Must be unique and stable within the endpoint. Generated by the frontend when added, and retained during editing and retries.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-weekday</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Required. 5 indicates regular priority, and 10 indicates high priority. New policies default to regular priority. Must be explicitly provided during submission, as the API does not set a default value. When the final dynamicPolicy.enabled is true, the validity periods of high-priority policies must not overlap, except that end-to-end connection is allowed, and long-term high-priority policies can overlap with other high-priority policies. Overlapping drafts can be saved when disabled, but the final configuration is validated when re-enabled. The validity of other fields and trigger conflicts within the policy are always validated. The priority must be explicitly provided.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>Required. daily means every day, weekly means every week, and monthly means every month. Only submit fields corresponding to the specified cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("repeat")
        public String repeat;

        /**
         * <p>Required only when validity is set to range. The format is YYYY-MM-DDTHH:mm:ss in the policy time zone, without a time zone offset. The seconds are fixed at 00. The interval includes the start time. When editing, existing past start times are retained, and updates or retries are not rejected even if the start time is earlier than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-01T00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>Required and cannot be empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if they have the same time. Weekly and monthly policies conflict only if they have the same time and their date sets intersect. This is validated by the console.</p>
         */
        @NameInMap("timePoints")
        public java.util.List<GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints;

        /**
         * <p>Required. Must be a valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        /**
         * <p>Required. Valid values: forever for long-term validity, and range for short-term validity. After expiration, the policy and its trigger results are excluded from the current calculation, and the remaining policies are recalculated. If no candidate policy is available, the baseline value is restored. Saved configurations are not automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>range</p>
         */
        @NameInMap("validity")
        public String validity;

        public static GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies self = new GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setRepeat(String repeat) {
            this.repeat = repeat;
            return this;
        }
        public String getRepeat() {
            return this.repeat;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setTimePoints(java.util.List<GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPoliciesTimePoints> getTimePoints() {
            return this.timePoints;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

    public static class GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy extends TeaModel {
        /**
         * <p>Required during creation. If omitted during an update, the original value is retained. Disabling this feature retains existing policies and restores the base upper and lower limits. Re-enabling it triggers immediate calculation. When finally enabled, policies must not be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Required during creation. If omitted during an update, the original list is retained. If passed, the entire list is replaced rather than merged by ID. To clear the list, you must also ensure that the final enabled value is false. Each item must be complete. Conditional requirements and cross-field constraints are validated by the server. The display order does not indicate priority.</p>
         */
        @NameInMap("policies")
        public java.util.List<GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> policies;

        public static GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy self = new GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy setPolicies(java.util.List<GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicyPolicies> getPolicies() {
            return this.policies;
        }

    }

    public static class GetServiceEndpointResponseBodyDataElasticityPolicy extends TeaModel {
        /**
         * <p>Returns the saved dynamic configuration. If the base configuration before the requirement goes online lacks dynamicPolicy, it is supplemented with enabled=false and policies=[].</p>
         */
        @NameInMap("dynamicPolicy")
        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy dynamicPolicy;

        /**
         * <p>Independent of dynamicPolicy.enabled. If omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The saved or backfilled base maximum instance count. The value must be no less than minSandboxCount. Historical values can exceed 100, and the read value is not truncated. The base value is used when dynamic scaling is disabled or no candidates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The saved or backfilled base minimum instance count. The value must be non-negative and no greater than maxSandboxCount. Historical values can exceed 100, and the read value is not truncated. A newly written complete configuration must still meet the 0 to 100 range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static GetServiceEndpointResponseBodyDataElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataElasticityPolicy self = new GetServiceEndpointResponseBodyDataElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setDynamicPolicy(GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy dynamicPolicy) {
            this.dynamicPolicy = dynamicPolicy;
            return this;
        }
        public GetServiceEndpointResponseBodyDataElasticityPolicyDynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public GetServiceEndpointResponseBodyDataElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class GetServiceEndpointResponseBodyDataTarget extends TeaModel {
        /**
         * <p>The ID of the target agent. Returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The version number of the target agent. Returned when the target type is AGENT_VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>The type of the collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>ELEMENT_WEB</p>
         */
        @NameInMap("collaborationComponent")
        public String collaborationComponent;

        /**
         * <p>The ID of the workspace resource binding associated with the target collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
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

        public static GetServiceEndpointResponseBodyDataTarget build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyDataTarget self = new GetServiceEndpointResponseBodyDataTarget();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyDataTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetServiceEndpointResponseBodyDataTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public GetServiceEndpointResponseBodyDataTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public GetServiceEndpointResponseBodyDataTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public GetServiceEndpointResponseBodyDataTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetServiceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The list of access URLs for the service endpoint.</p>
         */
        @NameInMap("accessUrls")
        public java.util.List<GetServiceEndpointResponseBodyDataAccessUrls> accessUrls;

        /**
         * <p>The authentication configuration of the service endpoint.</p>
         */
        @NameInMap("authentication")
        public GetServiceEndpointResponseBodyDataAuthentication authentication;

        /**
         * <p>The creation time in UTC format based on RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Read-only. For Get operations, it queries RM sandboxPhaseCounts.RUNNING based on the Endpoint runtimeKey. For Create and Update operations, it returns null. The value is a non-negative integer. If the statistics are unavailable, it returns null. It is not replaced by the baseline upper and lower limits, target quantity, or READY status. Unavailable statistics do not block submission.</p>
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
         * <p>Read-only and returned only in detail queries. The console reads this from autoScalingStatus.effectiveLimits in the same RM detail request that queries the current instance count. It represents the upper and lower limits currently applied by the resource manager (RM), rather than the saved base configuration or the actual instance count. This value is null if it is not applicable, the running object does not exist, the identity does not match, the query fails, or the RM does not return a valid range. Configuration values are not used as a fallback, and this field is not used for edit backfill or submission.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;minSandboxCount&quot;:8,&quot;maxSandboxCount&quot;:20}</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("effectiveCapacity")
        public GetServiceEndpointResponseBodyDataEffectiveCapacity effectiveCapacity;

        /**
         * <p>The result of combining publicAccessEnabled with the public network inbound access limit of the workspace. The value is true only when both allow public access. This only indicates the policy target and does not mean that the public network entry has been published. The actual status is subject to accessUrls and status.</p>
         */
        @NameInMap("effectivePublicAccessEnabled")
        public Boolean effectivePublicAccessEnabled;

        /**
         * <p>Used for edit backfill. This is not the currently effective upper and lower limits or the actual instance count. The Get operation preferentially returns the saved configuration. If no configuration is saved, an endpoint that supports elasticity backfills the base values from the frozen configuration of the expected runtime or the bound version configuration when the runtime is not yet established. Successful publication is not required. This value is null when the source is temporarily unavailable or no applicable configuration exists, but the status and statusReason are still returned. The Create and Update operations return only the saved configuration, and return null if no configuration is saved. The historical base capacity can exceed 100, and the read value is not truncated.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticityPolicy")
        public GetServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy;

        /**
         * <p>The type of the service endpoint. DEFAULT indicates a default endpoint created and maintained by the platform. NAMED indicates a named endpoint explicitly created by a user.</p>
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
         * <p>The expected public network inbound access configured by the user on the service endpoint. For historical service endpoints where this has not been configured, true is returned. This only indicates the configuration expectation. The actual availability of the public IP address is subject to accessUrls and status.</p>
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
         * <p>The service endpoint ID.</p>
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
         * <p>The reason for the service endpoint status. Returns the specific reason when the status is abnormal.</p>
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
        public GetServiceEndpointResponseBodyDataTarget target;

        /**
         * <p>The time of the last modification in UTC format based on RFC 3339.</p>
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

        public static GetServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyData self = new GetServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyData setAccessUrls(java.util.List<GetServiceEndpointResponseBodyDataAccessUrls> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }
        public java.util.List<GetServiceEndpointResponseBodyDataAccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        public GetServiceEndpointResponseBodyData setAuthentication(GetServiceEndpointResponseBodyDataAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public GetServiceEndpointResponseBodyDataAuthentication getAuthentication() {
            return this.authentication;
        }

        public GetServiceEndpointResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetServiceEndpointResponseBodyData setCurrentInstances(Integer currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }
        public Integer getCurrentInstances() {
            return this.currentInstances;
        }

        public GetServiceEndpointResponseBodyData setEffectiveCapacity(GetServiceEndpointResponseBodyDataEffectiveCapacity effectiveCapacity) {
            this.effectiveCapacity = effectiveCapacity;
            return this;
        }
        public GetServiceEndpointResponseBodyDataEffectiveCapacity getEffectiveCapacity() {
            return this.effectiveCapacity;
        }

        public GetServiceEndpointResponseBodyData setEffectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
            this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
            return this;
        }
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        public GetServiceEndpointResponseBodyData setElasticityPolicy(GetServiceEndpointResponseBodyDataElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public GetServiceEndpointResponseBodyDataElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public GetServiceEndpointResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetServiceEndpointResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceEndpointResponseBodyData setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public GetServiceEndpointResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServiceEndpointResponseBodyData setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public GetServiceEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceEndpointResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetServiceEndpointResponseBodyData setTarget(GetServiceEndpointResponseBodyDataTarget target) {
            this.target = target;
            return this;
        }
        public GetServiceEndpointResponseBodyDataTarget getTarget() {
            return this.target;
        }

        public GetServiceEndpointResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetServiceEndpointResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
