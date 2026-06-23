// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    /**
     * <p>The policy violation information aggregated by severity level.</p>
     */
    @NameInMap("Violation")
    public DescribePolicyGovernanceInClusterResponseBodyViolation violation;

    /**
     * <p>The policy governance audit logs of the current cluster.</p>
     */
    @NameInMap("admit_log")
    public DescribePolicyGovernanceInClusterResponseBodyAdmitLog admitLog;

    /**
     * <p>The count of enabled policies at different severity levels in the current cluster.</p>
     */
    @NameInMap("on_state")
    public java.util.List<DescribePolicyGovernanceInClusterResponseBodyOnState> onState;

    public static DescribePolicyGovernanceInClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGovernanceInClusterResponseBody self = new DescribePolicyGovernanceInClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGovernanceInClusterResponseBody setViolation(DescribePolicyGovernanceInClusterResponseBodyViolation violation) {
        this.violation = violation;
        return this;
    }
    public DescribePolicyGovernanceInClusterResponseBodyViolation getViolation() {
        return this.violation;
    }

    public DescribePolicyGovernanceInClusterResponseBody setAdmitLog(DescribePolicyGovernanceInClusterResponseBodyAdmitLog admitLog) {
        this.admitLog = admitLog;
        return this;
    }
    public DescribePolicyGovernanceInClusterResponseBodyAdmitLog getAdmitLog() {
        return this.admitLog;
    }

    public DescribePolicyGovernanceInClusterResponseBody setOnState(java.util.List<DescribePolicyGovernanceInClusterResponseBodyOnState> onState) {
        this.onState = onState;
        return this;
    }
    public java.util.List<DescribePolicyGovernanceInClusterResponseBodyOnState> getOnState() {
        return this.onState;
    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny extends TeaModel {
        /**
         * <p>The severity level. Valid values: low, medium, and high.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The number of violations.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("violations")
        public String violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny self = new DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny setViolations(String violations) {
            this.violations = violations;
            return this;
        }
        public String getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn extends TeaModel {
        /**
         * <p>The summary of severity levels.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The total number of violations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn self = new DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations extends TeaModel {
        /**
         * <p>The summary of block records.</p>
         */
        @NameInMap("deny")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny> deny;

        /**
         * <p>The summary of alert records.</p>
         */
        @NameInMap("warn")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn> warn;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations self = new DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations setDeny(java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny> deny) {
            this.deny = deny;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny> getDeny() {
            return this.deny;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations setWarn(java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn> warn) {
            this.warn = warn;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsWarn> getWarn() {
            return this.warn;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny extends TeaModel {
        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Prevent specific namespaces from being deleted.</p>
         */
        @NameInMap("policyDescription")
        public String policyDescription;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKNamespacesDeleteProtection</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The number of violations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny self = new DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn extends TeaModel {
        /**
         * <p>The policy description.</p>
         */
        @NameInMap("policyDescription")
        public String policyDescription;

        /**
         * <p>The policy name.</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The severity level.</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The number of violations.</p>
         */
        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn self = new DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationViolations extends TeaModel {
        /**
         * <p>The summary of block records.</p>
         */
        @NameInMap("deny")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny> deny;

        /**
         * <p>The summary of alert information.</p>
         */
        @NameInMap("warn")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn> warn;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationViolations build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationViolations self = new DescribePolicyGovernanceInClusterResponseBodyViolationViolations();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolations setDeny(java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny> deny) {
            this.deny = deny;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny> getDeny() {
            return this.deny;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationViolations setWarn(java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn> warn) {
            this.warn = warn;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsWarn> getWarn() {
            return this.warn;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolation extends TeaModel {
        /**
         * <p>The summary information.</p>
         */
        @NameInMap("totalViolations")
        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations totalViolations;

        /**
         * <p>The violation records aggregated by policy name.</p>
         */
        @NameInMap("violations")
        public DescribePolicyGovernanceInClusterResponseBodyViolationViolations violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolation build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolation self = new DescribePolicyGovernanceInClusterResponseBodyViolation();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolation setTotalViolations(DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations getTotalViolations() {
            return this.totalViolations;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolation setViolations(DescribePolicyGovernanceInClusterResponseBodyViolationViolations violations) {
            this.violations = violations;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyViolationViolations getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hash code</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>The action taken by the policy, including alert (warn) and block (deny). Valid values:</p>
         * <ul>
         * <li>warn: Only alerts on behaviors that violate the policy without actually blocking the request.</li>
         * <li>deny: Blocks requests that violate the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("constraint_action")
        public String constraintAction;

        /**
         * <p>The API version of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>v1beta1</p>
         */
        @NameInMap("constraint_api_version")
        public String constraintApiVersion;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>cis-k8s</p>
         */
        @NameInMap("constraint_category")
        public String constraintCategory;

        /**
         * <p>The API group of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>constraints.gatekeeper.sh</p>
         */
        @NameInMap("constraint_group")
        public String constraintGroup;

        /**
         * <p>The policy name in policy management.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKNamespacesDeleteProtection</p>
         */
        @NameInMap("constraint_kind")
        public String constraintKind;

        /**
         * <p>The policy instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace-delete-protection-jpjwv</p>
         */
        @NameInMap("constraint_name")
        public String constraintName;

        /**
         * <p>The detailed information about the policy action.</p>
         * 
         * <strong>example:</strong>
         * <p>Admission webhook \&quot;validation.gatekeeper.sh\&quot; denied request, Resource Namespace: , Constraint: namespace-delete-protection-jpjwv, Message: not allow to delete protection namespace test.</p>
         */
        @NameInMap("event_msg")
        public String eventMsg;

        /**
         * <p>The type of event triggered by the policy, such as violation.</p>
         * 
         * <strong>example:</strong>
         * <p>violation</p>
         */
        @NameInMap("event_type")
        public String eventType;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hash code</p>
         */
        @NameInMap("request_uid")
        public String requestUid;

        /**
         * <p>The information about the user whose request violated the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>account id</p>
         */
        @NameInMap("request_userinfo")
        public String requestUserinfo;

        /**
         * <p>The name of the user whose request violated the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>account user name</p>
         */
        @NameInMap("request_username")
        public String requestUsername;

        /**
         * <p>The type of resource that violated the policy. For example, if a request to operate on a Namespace is rejected, this field is set to Namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Namespace</p>
         */
        @NameInMap("resource_kind")
        public String resourceKind;

        /**
         * <p>The name of the resource that violated the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("resource_name")
        public String resourceName;

        /**
         * <p>The time when the policy violation occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-27T11:31:40Z</p>
         */
        @NameInMap("time")
        public String time;

        public static DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs self = new DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setConstraintAction(String constraintAction) {
            this.constraintAction = constraintAction;
            return this;
        }
        public String getConstraintAction() {
            return this.constraintAction;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setConstraintApiVersion(String constraintApiVersion) {
            this.constraintApiVersion = constraintApiVersion;
            return this;
        }
        public String getConstraintApiVersion() {
            return this.constraintApiVersion;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setConstraintCategory(String constraintCategory) {
            this.constraintCategory = constraintCategory;
            return this;
        }
        public String getConstraintCategory() {
            return this.constraintCategory;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setConstraintGroup(String constraintGroup) {
            this.constraintGroup = constraintGroup;
            return this;
        }
        public String getConstraintGroup() {
            return this.constraintGroup;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setConstraintKind(String constraintKind) {
            this.constraintKind = constraintKind;
            return this;
        }
        public String getConstraintKind() {
            return this.constraintKind;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setConstraintName(String constraintName) {
            this.constraintName = constraintName;
            return this;
        }
        public String getConstraintName() {
            return this.constraintName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setEventMsg(String eventMsg) {
            this.eventMsg = eventMsg;
            return this;
        }
        public String getEventMsg() {
            return this.eventMsg;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setRequestUid(String requestUid) {
            this.requestUid = requestUid;
            return this;
        }
        public String getRequestUid() {
            return this.requestUid;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setRequestUserinfo(String requestUserinfo) {
            this.requestUserinfo = requestUserinfo;
            return this;
        }
        public String getRequestUserinfo() {
            return this.requestUserinfo;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setRequestUsername(String requestUsername) {
            this.requestUsername = requestUsername;
            return this;
        }
        public String getRequestUsername() {
            return this.requestUsername;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyAdmitLog extends TeaModel {
        /**
         * <p>The total number of logs returned by the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("count")
        public Long count;

        /**
         * <p>The log project that stores policy action information.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-clusterid</p>
         */
        @NameInMap("log_project")
        public String logProject;

        /**
         * <p>The Logstore that stores policy action information.</p>
         * 
         * <strong>example:</strong>
         * <p>policyadmit-clusterid</p>
         */
        @NameInMap("log_store")
        public String logStore;

        /**
         * <p>The log entries for policy violations.</p>
         */
        @NameInMap("logs")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs> logs;

        /**
         * <p>The status of the query result. Valid values:</p>
         * <ul>
         * <li><code>Complete</code>: The query is complete and the returned result is the complete result.</li>
         * <li><code>Incomplete</code>: The query is complete but the returned result is incomplete. Repeat the request to obtain the complete result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        public static DescribePolicyGovernanceInClusterResponseBodyAdmitLog build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyAdmitLog self = new DescribePolicyGovernanceInClusterResponseBodyAdmitLog();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLog setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLog setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLog setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLog setLogs(java.util.List<DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs> getLogs() {
            return this.logs;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLog setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyOnState extends TeaModel {
        /**
         * <p>The number of enabled policy types.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("enabled_count")
        public Integer enabledCount;

        /**
         * <p>The policy governance severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The total number of policy types at this severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("total")
        public Integer total;

        public static DescribePolicyGovernanceInClusterResponseBodyOnState build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyOnState self = new DescribePolicyGovernanceInClusterResponseBodyOnState();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyOnState setEnabledCount(Integer enabledCount) {
            this.enabledCount = enabledCount;
            return this;
        }
        public Integer getEnabledCount() {
            return this.enabledCount;
        }

        public DescribePolicyGovernanceInClusterResponseBodyOnState setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyOnState setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
