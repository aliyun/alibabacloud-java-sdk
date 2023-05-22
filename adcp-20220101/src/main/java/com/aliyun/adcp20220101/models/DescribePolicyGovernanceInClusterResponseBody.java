// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the policies.</p>
     */
    @NameInMap("PolicyGovernances")
    public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances> policyGovernances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyGovernanceInClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGovernanceInClusterResponseBody self = new DescribePolicyGovernanceInClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGovernanceInClusterResponseBody setPolicyGovernances(java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances> policyGovernances) {
        this.policyGovernances = policyGovernances;
        return this;
    }
    public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances> getPolicyGovernances() {
        return this.policyGovernances;
    }

    public DescribePolicyGovernanceInClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster extends TeaModel {
        /**
         * <p>The ID of the associated cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The specifications of the associated cluster.</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <p>The type of the associated cluster.</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The name of the associated cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The identifier of the associated cluster.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The region ID of the associated cluster.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the associated cluster.</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog extends TeaModel {
        /**
         * <p>The number of log entries in the query result.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the Log Service project.</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The name of the Logstore.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The content of the audit log.</p>
         */
        @NameInMap("Logs")
        public java.util.List<java.util.Map<String, String>> logs;

        /**
         * <p>The status of the query. Valid values:</p>
         * <br>
         * <p>*   Complete: The query is successful, and the complete result is returned.</p>
         * <p>*   Incomplete: The query is successful, but the query result is incomplete. To obtain the complete result, you must call the operation again.</p>
         */
        @NameInMap("Progress")
        public String progress;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog setLogs(java.util.List<java.util.Map<String, String>> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getLogs() {
            return this.logs;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState extends TeaModel {
        /**
         * <p>The types of policies that are enabled in the associated cluster.</p>
         */
        @NameInMap("EnabledCount")
        public Long enabledCount;

        /**
         * <p>The severity level.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The types of policies of each severity level.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState setEnabledCount(Long enabledCount) {
            this.enabledCount = enabledCount;
            return this;
        }
        public Long getEnabledCount() {
            return this.enabledCount;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny extends TeaModel {
        /**
         * <p>The severity level.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The number of deployments that are blocked.</p>
         */
        @NameInMap("Violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn extends TeaModel {
        /**
         * <p>The severity level.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The number of deployments that have triggered alerting.</p>
         */
        @NameInMap("Violations")
        public String violations;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn setViolations(String violations) {
            this.violations = violations;
            return this;
        }
        public String getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations extends TeaModel {
        /**
         * <p>The information about the deployments that are blocked.</p>
         */
        @NameInMap("Deny")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny> deny;

        /**
         * <p>The information about the deployments that have triggered alerting.</p>
         */
        @NameInMap("Warn")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn> warn;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations setDeny(java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny> deny) {
            this.deny = deny;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsDeny> getDeny() {
            return this.deny;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations setWarn(java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn> warn) {
            this.warn = warn;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolationsWarn> getWarn() {
            return this.warn;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny extends TeaModel {
        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The severity level of the policy.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The number of times that the policy blocks deployments.</p>
         */
        @NameInMap("Violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn extends TeaModel {
        /**
         * <p>The description of the policy.</p>
         */
        @NameInMap("PolicyDescription")
        public String policyDescription;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The severity level of the policy.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The number of times that the policy generates alerts.</p>
         */
        @NameInMap("Violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations extends TeaModel {
        /**
         * <p>The information about the deployments that are blocked.</p>
         */
        @NameInMap("Deny")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny> deny;

        /**
         * <p>The information about the deployments that have triggered alerting.</p>
         */
        @NameInMap("Warn")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn> warn;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations setDeny(java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny> deny) {
            this.deny = deny;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsDeny> getDeny() {
            return this.deny;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations setWarn(java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn> warn) {
            this.warn = warn;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolationsWarn> getWarn() {
            return this.warn;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation extends TeaModel {
        /**
         * <p>The number of deployments that match the policies in the associated cluster, including deployments that are blocked and deployments that have triggered alerting. The deployments are classified by severity level.</p>
         */
        @NameInMap("TotalViolations")
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations totalViolations;

        /**
         * <p>The number of deployments that match the policies in the associated cluster, including deployments that are blocked and deployments that have triggered alerting. The deployments are classified by policy type.</p>
         */
        @NameInMap("Violations")
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations violations;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation setTotalViolations(DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations totalViolations) {
            this.totalViolations = totalViolations;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationTotalViolations getTotalViolations() {
            return this.totalViolations;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation setViolations(DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations violations) {
            this.violations = violations;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolationViolations getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance extends TeaModel {
        /**
         * <p>The audit log generated by the associated cluster.</p>
         */
        @NameInMap("AdmitLog")
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog admitLog;

        /**
         * <p>The number of policies of each severity level enabled in the associated cluster.</p>
         */
        @NameInMap("OnState")
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState> onState;

        /**
         * <p>The number of deployments that match the policies in the associated cluster, including deployments that are blocked and deployments that have triggered alerting.</p>
         */
        @NameInMap("Violation")
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation violation;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance setAdmitLog(DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog admitLog) {
            this.admitLog = admitLog;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceAdmitLog getAdmitLog() {
            return this.admitLog;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance setOnState(java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState> onState) {
            this.onState = onState;
            return this;
        }
        public java.util.List<DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceOnState> getOnState() {
            return this.onState;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance setViolation(DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation violation) {
            this.violation = violation;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernanceViolation getViolation() {
            return this.violation;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances extends TeaModel {
        /**
         * <p>The information about the associated clusters in which the policies are deployed.</p>
         */
        @NameInMap("Cluster")
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster cluster;

        /**
         * <p>The detailed policy information.</p>
         */
        @NameInMap("PolicyGovernance")
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance policyGovernance;

        public static DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances self = new DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances setCluster(DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesCluster getCluster() {
            return this.cluster;
        }

        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernances setPolicyGovernance(DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance policyGovernance) {
            this.policyGovernance = policyGovernance;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyPolicyGovernancesPolicyGovernance getPolicyGovernance() {
            return this.policyGovernance;
        }

    }

}
