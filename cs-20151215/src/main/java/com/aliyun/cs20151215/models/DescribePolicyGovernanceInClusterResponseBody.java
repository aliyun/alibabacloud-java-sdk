// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    @NameInMap("Violation")
    public DescribePolicyGovernanceInClusterResponseBodyViolation violation;

    /**
     * <p>The audit logs of the policies in the cluster.</p>
     */
    @NameInMap("admit_log")
    public DescribePolicyGovernanceInClusterResponseBodyAdmitLog admitLog;

    /**
     * <p>Details about the policies of different severity levels that are enabled for the cluster.</p>
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
        @NameInMap("severity")
        public String severity;

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
        @NameInMap("severity")
        public String severity;

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
        @NameInMap("deny")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolationsDeny> deny;

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
        @NameInMap("policyDescription")
        public String policyDescription;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("severity")
        public String severity;

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
        @NameInMap("policyDescription")
        public String policyDescription;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("severity")
        public String severity;

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
        @NameInMap("deny")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyViolationViolationsDeny> deny;

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
        @NameInMap("totalViolations")
        public DescribePolicyGovernanceInClusterResponseBodyViolationTotalViolations totalViolations;

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
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("constraint_action")
        public String constraintAction;

        @NameInMap("constraint_api_version")
        public String constraintApiVersion;

        @NameInMap("constraint_category")
        public String constraintCategory;

        @NameInMap("constraint_group")
        public String constraintGroup;

        @NameInMap("constraint_kind")
        public String constraintKind;

        @NameInMap("constraint_name")
        public String constraintName;

        @NameInMap("event_msg")
        public String eventMsg;

        @NameInMap("event_type")
        public String eventType;

        @NameInMap("request_uid")
        public String requestUid;

        @NameInMap("request_userinfo")
        public String requestUserinfo;

        @NameInMap("request_username")
        public String requestUsername;

        @NameInMap("resource_kind")
        public String resourceKind;

        @NameInMap("resource_name")
        public String resourceName;

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
         * <p>The number of audit log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("count")
        public Long count;

        @NameInMap("log_project")
        public String logProject;

        @NameInMap("log_store")
        public String logStore;

        @NameInMap("logs")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyAdmitLogLogs> logs;

        /**
         * <p>The status of the query. Valid values:</p>
         * <ul>
         * <li><code>Complete</code>: The query succeeded and the complete query result is returned.</li>
         * <li><code>Incomplete</code>: The query succeeded but the query result is incomplete. To obtain the complete query result, you must repeat the request.</li>
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
         * <p>The number of policies that are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("enabled_count")
        public Integer enabledCount;

        /**
         * <p>The severity level of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("severity")
        public String severity;

        /**
         * <p>The total number of policies of the severity level.</p>
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
