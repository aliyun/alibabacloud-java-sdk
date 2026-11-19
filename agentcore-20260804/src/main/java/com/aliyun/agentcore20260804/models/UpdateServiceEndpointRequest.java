// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateServiceEndpointRequest extends TeaModel {
    /**
     * <p>The service endpoint configurations to be modified in this request. Submit the supported modifiable name, bound version, invocation authentication configuration, elastic policy, or public network inbound switch based on the endpoint type. Router and hybrid ingress endpoints cannot be renamed. DEFAULT endpoints do not accept name or authentication configuration updates. When updating the elastic policy, you must specify both updateElasticity=true and clientToken.</p>
     */
    @NameInMap("body")
    public UpdateServiceEndpointRequestBody body;

    /**
     * <p>The client token. This parameter is required when updateElasticity is set to true and is verified by the server. Reuse the token and the original request for the same retry. Use a new token if the logical content changes. Passing different content with the same token returns InvalidParameter. The token must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), colons (:), and hyphens (-). The scope is the tenant and workspace. The receipt is retained for 7 days from the time of successful acceptance. Replays do not extend the retention period. After expiration, it is verified again as a new submission.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateServiceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEndpointRequest self = new UpdateServiceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEndpointRequest setBody(UpdateServiceEndpointRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceEndpointRequestBody getBody() {
        return this.body;
    }

    public UpdateServiceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateServiceEndpointRequestBodyAuthentication extends TeaModel {
        /**
         * <p>The saved invocation authentication type. Valid values:</p>
         * <ul>
         * <li>NONE: Configured to not use the endpoint API key.</li>
         * <li>API_KEY: Configured to use the endpoint API key.
         * For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent and cannot be determined solely based on this field. You must provide type when passing authentication.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateServiceEndpointRequestBodyAuthentication build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointRequestBodyAuthentication self = new UpdateServiceEndpointRequestBodyAuthentication();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointRequestBodyAuthentication setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints extends TeaModel {
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

        public static UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints self = new UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setMaxInstances(Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Integer getMaxInstances() {
            return this.maxInstances;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setMinInstances(Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Integer getMinInstances() {
            return this.minInstances;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setMonthDays(java.util.List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public java.util.List<Integer> getMonthDays() {
            return this.monthDays;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints setWeekdays(java.util.List<Integer> weekdays) {
            this.weekdays = weekdays;
            return this;
        }
        public java.util.List<Integer> getWeekdays() {
            return this.weekdays;
        }

    }

    public static class UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies extends TeaModel {
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
        public java.util.List<UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints;

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

        public static UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies self = new UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setRepeat(String repeat) {
            this.repeat = repeat;
            return this;
        }
        public String getRepeat() {
            return this.repeat;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setTimePoints(java.util.List<UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints> timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public java.util.List<UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPoliciesTimePoints> getTimePoints() {
            return this.timePoints;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

    public static class UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy extends TeaModel {
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
        public java.util.List<UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies> policies;

        public static UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy self = new UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy setPolicies(java.util.List<UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicyPolicies> getPolicies() {
            return this.policies;
        }

    }

    public static class UpdateServiceEndpointRequestBodyElasticityPolicy extends TeaModel {
        /**
         * <p>The dynamic policy configuration. It must be fully provided during creation. If omitted during an update, the original configuration is retained. If provided, it is merged by field and does not accept null. The response returns the saved complete configuration. If no historical dynamic configuration exists, it is normalized to enabled=false and policies=[].</p>
         */
        @NameInMap("dynamicPolicy")
        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy dynamicPolicy;

        /**
         * <p>Specifies whether to enable the overall automatic elasticity mode. This parameter is independent of dynamicPolicy.enabled. If omitted during an update, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The saved basic maximum number of instances. Valid values: 0 to 100. The value cannot be less than minSandboxCount. The basic upper and lower limits are used when dynamic elasticity is disabled or no candidates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The saved basic minimum number of instances. Valid values: 0 to 100. The value cannot be greater than maxSandboxCount. It must be submitted in pairs with maxSandboxCount during an update. If both are omitted, the original values are retained. It does not override dynamic results when dynamic candidates are available.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        public static UpdateServiceEndpointRequestBodyElasticityPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointRequestBodyElasticityPolicy self = new UpdateServiceEndpointRequestBodyElasticityPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicy setDynamicPolicy(UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy dynamicPolicy) {
            this.dynamicPolicy = dynamicPolicy;
            return this;
        }
        public UpdateServiceEndpointRequestBodyElasticityPolicyDynamicPolicy getDynamicPolicy() {
            return this.dynamicPolicy;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicy setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public UpdateServiceEndpointRequestBodyElasticityPolicy setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

    }

    public static class UpdateServiceEndpointRequestBody extends TeaModel {
        /**
         * <p>If not specified, the original binding is retained. If specified, it must be an exact source version that has been successfully deployed for the agent. Otherwise, ServiceEndpointTargetNotReady is returned. When rebinding a DEFAULT service endpoint of the GATEWAY_API type, ServiceEndpointTargetNotReady is also returned if the original gateway runtime instance is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("agentVersion")
        public String agentVersion;

        /**
         * <p>Updates the invocation authentication configuration saved for the service endpoint, specified by type. If not specified, the original configuration is retained. This field is prohibited for DEFAULT endpoints. For AGENT_VERSION endpoints of non-EDGE agents, the actual API key verification is determined by the current inbound authentication configuration of the agent. The management API for updating the service endpoint still uses AccessKey (AK) or Security Token Service (STS) authentication and Resource Access Management (RAM) authorization.</p>
         */
        @NameInMap("authentication")
        public UpdateServiceEndpointRequestBodyAuthentication authentication;

        /**
         * <p>Accepted only when updateElasticity is set to true. Omitting subfields indicates that the original values are retained. The basic minSandboxCount and maxSandboxCount must be submitted in pairs. dynamicPolicy.enabled and policies can be updated separately. If policies is provided, it replaces the entire list. To clear the list, you must ensure that the final dynamicPolicy.enabled is set to false. elasticityPolicy and dynamicPolicy do not accept null, and an empty patch is invalid. Only Router service endpoints and DEFAULT service endpoints of the GATEWAY_API_WITH_VPC_INGRESS or GATEWAY_API_WITH_PUBLIC_INGRESS type support elasticity updates. The server merges, verifies, and saves the complete configuration, and does not backfill basic values with the current capacity. The final basic min and max values must be between 0 and 100. If the historical basic capacity exceeds the limit, you must submit valid basic min and max values even if you only modify the dynamic policy. Silent truncation is not allowed.</p>
         */
        @NameInMap("elasticityPolicy")
        public UpdateServiceEndpointRequestBodyElasticityPolicy elasticityPolicy;

        /**
         * <p>Used to modify existing named endpoints that support renaming. If omitted, the original name is retained. Router and hybrid ingress endpoints do not support renaming. You can only omit this parameter or pass the original name. This field is prohibited for DEFAULT endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether to enable public network inbound access for the service endpoint. If not specified, the original value is retained. If set to true or false, the value is replaced. Explicitly passing null or a non-Boolean value returns InvalidParameter, and no restore inheritance semantics are provided. Modifying only this field triggers an ingress revision only and does not redeploy the runtime instance. Whether public network access is actually enabled is also subject to the public network inbound limit of the workspace. For more information, see effectivePublicAccessEnabled in the response.</p>
         */
        @NameInMap("publicAccessEnabled")
        public Boolean publicAccessEnabled;

        /**
         * <p>Specifies whether to explicitly update the elastic configuration in this request. If omitted or set to false, the elasticityPolicy carried in this request is ignored, and the saved configuration is retained. If set to true, a valid and non-empty elasticityPolicy patch and clientToken must be provided. This parameter is not persisted, returned, or passed through to the resource manager (RM), and no default value is set. Omit this parameter during normal editing and version rebinding.</p>
         */
        @NameInMap("updateElasticity")
        public Boolean updateElasticity;

        public static UpdateServiceEndpointRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointRequestBody self = new UpdateServiceEndpointRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointRequestBody setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public UpdateServiceEndpointRequestBody setAuthentication(UpdateServiceEndpointRequestBodyAuthentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public UpdateServiceEndpointRequestBodyAuthentication getAuthentication() {
            return this.authentication;
        }

        public UpdateServiceEndpointRequestBody setElasticityPolicy(UpdateServiceEndpointRequestBodyElasticityPolicy elasticityPolicy) {
            this.elasticityPolicy = elasticityPolicy;
            return this;
        }
        public UpdateServiceEndpointRequestBodyElasticityPolicy getElasticityPolicy() {
            return this.elasticityPolicy;
        }

        public UpdateServiceEndpointRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateServiceEndpointRequestBody setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public UpdateServiceEndpointRequestBody setUpdateElasticity(Boolean updateElasticity) {
            this.updateElasticity = updateElasticity;
            return this;
        }
        public Boolean getUpdateElasticity() {
            return this.updateElasticity;
        }

    }

}
