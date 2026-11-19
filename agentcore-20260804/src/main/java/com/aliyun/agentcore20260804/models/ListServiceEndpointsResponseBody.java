// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of service endpoints.</p>
     */
    @NameInMap("items")
    public java.util.List<ListServiceEndpointsResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page that takes effect in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. Returns an error description if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page. This parameter is empty if there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>djE6YWdlbnRjb3JlLnNlcnZpY2UtZW5kcG9pbnQubGlzdDoyMA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of service endpoints that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEndpointsResponseBody self = new ListServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceEndpointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceEndpointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListServiceEndpointsResponseBody setItems(java.util.List<ListServiceEndpointsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListServiceEndpointsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListServiceEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEndpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceEndpointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServiceEndpointsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceEndpointsResponseBodyItemsAccessUrls extends TeaModel {
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

        public static ListServiceEndpointsResponseBodyItemsAccessUrls build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsAccessUrls self = new ListServiceEndpointsResponseBodyItemsAccessUrls();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListServiceEndpointsResponseBodyItemsAccessUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsAuthentication extends TeaModel {
        /**
         * <p>The authentication method. NONE indicates that no authentication is required. API_KEY indicates that authentication is performed by passing an API key in the x-api-key request header.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static ListServiceEndpointsResponseBodyItemsAuthentication build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsAuthentication self = new ListServiceEndpointsResponseBodyItemsAuthentication();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints extends TeaModel {
        /**
         * <p>Required. The value ranges from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxInstances")
        public Integer maxInstances;

        /**
         * <p>Required. The value ranges from 0 to 100 and must not be greater than the maxInstances value in the same item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minInstances")
        public Integer minInstances;

        /**
         * <p>Required only for each trigger point of the monthly cycle. Must be non-empty and contain unique integers from 1 to 31. Each row is selected independently. If a date does not exist in a specific month, the trigger does not occur and is not postponed to the end of the month. Must be omitted for other cycles.</p>
         */
        @NameInMap("monthDays")
        public java.util.List<Integer> monthDays;

        /**
         * <p>Required. The format is HH:mm:ss. The time is interpreted based on the time zone of the associated policy. The precision is down to the minute, and the seconds are fixed at 00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <p>Required only for each trigger point of weekly policies. It must be non-empty and deduplicated. Valid values are integers from 1 to 7, where 1 represents Monday and 7 represents Sunday. Each row is selected independently. It must be omitted for other cycles.</p>
         */
        @NameInMap("weekdays")
        public java.util.List<Integer> weekdays;

        public static ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints self = new ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints setMaxInstances(Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints setMinInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Integer getMinInstances() {
            return this.minInstances;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints setMonthDays(java.util.List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints setWeekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies extends TeaModel {
        /**
         * <p>Required only when validity is set to range. The format is the same as startTime, and the seconds are fixed at 00. The value must be later than startTime. The interval does not include the end time. If validity is set to forever, the start and end times must be omitted. Valid dates and cross-field constraints are verified by the console.</p>
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
         * <p>Required. Valid values: 5 for regular and 10 for high priority. New policies default to regular priority. It must be explicitly provided during submission, and no default value is set by the API. When dynamicPolicy.enabled is finally true, the validity periods of high-priority policies must not overlap, except for end-to-end connections. Long-term high-priority policies can overlap with other high-priority policies. Overlapping drafts can be saved when disabled, and the final configuration is validated when re-enabled. The validity of other fields and trigger conflicts within the policy are always validated. The priority must be explicitly provided.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public Integer priority;

        /**
         * <p>Required. Valid values: daily for every day, weekly for every week, and monthly for every month. Only submit the fields corresponding to the specified cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>weekly</p>
         */
        @NameInMap("repeat")
        public String repeat;

        /**
         * <p>Required only when validity is set to range. The format is YYYY-MM-DDTHH:mm:ss in the time zone of the policy, without a time zone offset. The seconds are fixed at 00. The interval includes the start time. When editing, the existing past start time is retained, and updates or retries are not rejected even if it is earlier than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-01T00:00:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>Required and non-empty. Each item must be complete. The day of the week or day of the month is configured independently for each item. Within the same policy, daily policies conflict if they have the same time. Weekly and monthly policies conflict only if they have the same time and their date sets intersect. This is validated by the console.</p>
         */
        @NameInMap("timePoints")
        public java.util.List<ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints;

        /**
         * <p>Required. It must be a valid IANA time zone. All dates and times in this policy are interpreted in this time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        /**
         * <p>Required. Valid values: forever: The policy is permanently valid. range: The policy is valid for a specific period. After expiration, the policy and its trigger results exit the current calculation, and the remaining policies are recalculated. If no candidates are available, the baseline values are restored, and the saved configurations are not automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>range</p>
         */
        @NameInMap("validity")
        public String validity;

        public static ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies self = new ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setRepeat(String repeat) {
            this.repeat = repeat;
            return this;
        }
        public String getRepeat() {
            return this.repeat;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setTimePoints(java.util.List<ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPoliciesTimePoints> getTimePoints() {
            return this.timePoints;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy extends TeaModel {
        /**
         * <p>Required during creation. If omitted during an update, the original value is retained. Disabling it retains existing policies and restores the basic upper and lower limits. Enabling it again triggers immediate calculation. When finally enabled, policies must not be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Required during creation. If omitted during an update, the original list is retained. If provided, it replaces the entire list and is not merged by ID. To clear the list, you must also ensure that the final enabled status is false. Each item must be complete. Conditional requirements and cross-field constraints are validated by the server. The display order does not indicate priority.</p>
         */
        @NameInMap("policies")
        public java.util.List<ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies> policies;

        public static ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy self = new ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy setPolicies(java.util.List<ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicyPolicies> getPolicies() {
            return this.policies;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsElasticityPolicy extends TeaModel {
        /**
         * <p>Returns the saved dynamic configuration. If the basic configuration lacks dynamicPolicy before the feature is released, it is supplemented with enabled=false and policies=[].</p>
         */
        @NameInMap("dynamicPolicy")
        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy dynamicPolicy;

        /**
         * <p>Independent of dynamicPolicy.enabled. If omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The saved or backfilled basic maximum number of instances. It must not be less than minSandboxCount. Historical values can exceed 100 and are not truncated when read. The basic value is used when dynamic scaling is disabled or no candidates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The saved or backfilled basic minimum number of instances. It must be a non-negative integer and not greater than maxSandboxCount. Historical values can exceed 100 and are not truncated when read. However, newly written complete configurations must still meet the 0 to 100 range.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static ListServiceEndpointsResponseBodyItemsElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsElasticityPolicy self = new ListServiceEndpointsResponseBodyItemsElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setDynamicPolicy(ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy dynamicPolicy) {
            this.dynamicPolicy = dynamicPolicy;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsElasticityPolicyDynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public ListServiceEndpointsResponseBodyItemsElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsTarget extends TeaModel {
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
         * <p>The workspace resource binding ID associated with the target collaboration component. Returned when the target type is TEAM_COLLABORATION.</p>
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

        public static ListServiceEndpointsResponseBodyItemsTarget build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsTarget self = new ListServiceEndpointsResponseBodyItemsTarget();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsTarget setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setCollaborationComponent(String collaborationComponent) {
            this.collaborationComponent = collaborationComponent;
            return this;
        }
        public String getCollaborationComponent() {
            return this.collaborationComponent;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setResourceBindingId(String resourceBindingId) {
            this.resourceBindingId = resourceBindingId;
            return this;
        }
        public String getResourceBindingId() {
            return this.resourceBindingId;
        }

        public ListServiceEndpointsResponseBodyItemsTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListServiceEndpointsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of access URLs for the service endpoint.</p>
         */
        @NameInMap("accessUrls")
        public java.util.List<ListServiceEndpointsResponseBodyItemsAccessUrls> accessUrls;

        /**
         * <p>The authentication configuration of the service endpoint.</p>
         */
        @NameInMap("authentication")
        public ListServiceEndpointsResponseBodyItemsAuthentication authentication;

        /**
         * <p>The creation time in UTC format compliant with RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Read-only. This is a shared response field. The list operation does not query RM row by row and returns null. For details, call the GetServiceEndpoint operation to query sandboxPhaseCounts.RUNNING based on the endpoint runtimeKey. Do not replace it with the baseline upper and lower limits, target quantity, or READY status.</p>
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
         * <p>The result of combining publicAccessEnabled with the public inbound access upper limit of the workspace. The value is true only when both allow public inbound access. This only indicates the policy target and does not mean that the public endpoint has been published. The actual status is subject to accessUrls and status.</p>
         */
        @NameInMap("effectivePublicAccessEnabled")
        public Boolean effectivePublicAccessEnabled;

        /**
         * <p>Includes the enabled status, basic minSandboxCount and maxSandboxCount, and dynamicPolicy. This does not represent the currently effective limits or the actual number of instances. If the basic configuration lacks dynamicPolicy before the feature is released, it is supplemented with enabled=false and policies=[]. This parameter is null if the endpoint configuration is not saved, and the list does not backfill the version source. Historical basic capacity can exceed 100. Retrieve the details again when you open the edit page.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("elasticityPolicy")
        public ListServiceEndpointsResponseBodyItemsElasticityPolicy elasticityPolicy;

        /**
         * <p>The type of the service endpoint. DEFAULT indicates a default endpoint created and maintained by the platform. NAMED indicates a named endpoint explicitly created by a user.</p>
         * 
         * <strong>example:</strong>
         * <p>NAMED</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The name of the service endpoint. The name must be unique within the workspace and 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-endpoint</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The expected public inbound access configured by the user on the service endpoint. For historical service endpoints that have not been configured, true is returned. This only indicates the configuration expectation. The actual availability of the public IP address is subject to accessUrls and status.</p>
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
        public ListServiceEndpointsResponseBodyItemsTarget target;

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

        public static ListServiceEndpointsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItems self = new ListServiceEndpointsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItems setAccessUrls(java.util.List<ListServiceEndpointsResponseBodyItemsAccessUrls> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }
        public java.util.List<ListServiceEndpointsResponseBodyItemsAccessUrls> getAccessUrls() {
            return this.accessUrls;
        }

        public ListServiceEndpointsResponseBodyItems setAuthentication(ListServiceEndpointsResponseBodyItemsAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsAuthentication getAuthentication() {
            return this.authentication;
        }

        public ListServiceEndpointsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListServiceEndpointsResponseBodyItems setCurrentInstances(Integer currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }
        public Integer getCurrentInstances() {
            return this.currentInstances;
        }

        public ListServiceEndpointsResponseBodyItems setEffectivePublicAccessEnabled(Boolean effectivePublicAccessEnabled) {
            this.effectivePublicAccessEnabled = effectivePublicAccessEnabled;
            return this;
        }
        public Boolean getEffectivePublicAccessEnabled() {
            return this.effectivePublicAccessEnabled;
        }

        public ListServiceEndpointsResponseBodyItems setElasticityPolicy(ListServiceEndpointsResponseBodyItemsElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public ListServiceEndpointsResponseBodyItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListServiceEndpointsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceEndpointsResponseBodyItems setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public ListServiceEndpointsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListServiceEndpointsResponseBodyItems setServiceEndpointId(String serviceEndpointId) {
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }
        public String getServiceEndpointId() {
            return this.serviceEndpointId;
        }

        public ListServiceEndpointsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceEndpointsResponseBodyItems setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListServiceEndpointsResponseBodyItems setTarget(ListServiceEndpointsResponseBodyItemsTarget target) {
            this.target = target;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsTarget getTarget() {
            return this.target;
        }

        public ListServiceEndpointsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListServiceEndpointsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
