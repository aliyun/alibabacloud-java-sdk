// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    @NameInMap("admit_log")
    public DescribePolicyGovernanceInClusterResponseBodyAdmitLog admitLog;

    @NameInMap("on_state")
    public java.util.List<DescribePolicyGovernanceInClusterResponseBodyOnState> onState;

    @NameInMap("totalViolations")
    public DescribePolicyGovernanceInClusterResponseBodyTotalViolations totalViolations;

    @NameInMap("violations")
    public DescribePolicyGovernanceInClusterResponseBodyViolations violations;

    public static DescribePolicyGovernanceInClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGovernanceInClusterResponseBody self = new DescribePolicyGovernanceInClusterResponseBody();
        return TeaModel.build(map, self);
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

    public DescribePolicyGovernanceInClusterResponseBody setTotalViolations(DescribePolicyGovernanceInClusterResponseBodyTotalViolations totalViolations) {
        this.totalViolations = totalViolations;
        return this;
    }
    public DescribePolicyGovernanceInClusterResponseBodyTotalViolations getTotalViolations() {
        return this.totalViolations;
    }

    public DescribePolicyGovernanceInClusterResponseBody setViolations(DescribePolicyGovernanceInClusterResponseBodyViolations violations) {
        this.violations = violations;
        return this;
    }
    public DescribePolicyGovernanceInClusterResponseBodyViolations getViolations() {
        return this.violations;
    }

    public static class DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog extends TeaModel {
        @NameInMap("cluster_id")
        public String clusterId;

        @NameInMap("constraint_kind")
        public String constraintKind;

        @NameInMap("msg")
        public String msg;

        @NameInMap("resource_kind")
        public String resourceKind;

        @NameInMap("resource_name")
        public String resourceName;

        @NameInMap("resource_namespace")
        public String resourceNamespace;

        public static DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog self = new DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog setConstraintKind(String constraintKind) {
            this.constraintKind = constraintKind;
            return this;
        }
        public String getConstraintKind() {
            return this.constraintKind;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog setResourceKind(String resourceKind) {
            this.resourceKind = resourceKind;
            return this;
        }
        public String getResourceKind() {
            return this.resourceKind;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog setResourceNamespace(String resourceNamespace) {
            this.resourceNamespace = resourceNamespace;
            return this;
        }
        public String getResourceNamespace() {
            return this.resourceNamespace;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyAdmitLog extends TeaModel {
        @NameInMap("count")
        public Long count;

        @NameInMap("log")
        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog log;

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

        public DescribePolicyGovernanceInClusterResponseBodyAdmitLog setLog(DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog log) {
            this.log = log;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog getLog() {
            return this.log;
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
        @NameInMap("enabled_count")
        public Integer enabledCount;

        @NameInMap("severity")
        public String severity;

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

    public static class DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny extends TeaModel {
        @NameInMap("severity")
        public String severity;

        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny self = new DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn extends TeaModel {
        @NameInMap("severity")
        public String severity;

        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn self = new DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyTotalViolations extends TeaModel {
        @NameInMap("deny")
        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny deny;

        @NameInMap("warn")
        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn warn;

        public static DescribePolicyGovernanceInClusterResponseBodyTotalViolations build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyTotalViolations self = new DescribePolicyGovernanceInClusterResponseBodyTotalViolations();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyTotalViolations setDeny(DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny deny) {
            this.deny = deny;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny getDeny() {
            return this.deny;
        }

        public DescribePolicyGovernanceInClusterResponseBodyTotalViolations setWarn(DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsWarn getWarn() {
            return this.warn;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationsDeny extends TeaModel {
        @NameInMap("policyDescription")
        public String policyDescription;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("severity")
        public String severity;

        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationsDeny build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationsDeny self = new DescribePolicyGovernanceInClusterResponseBodyViolationsDeny();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolationsWarn extends TeaModel {
        @NameInMap("policyDescription")
        public String policyDescription;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("severity")
        public String severity;

        @NameInMap("violations")
        public Long violations;

        public static DescribePolicyGovernanceInClusterResponseBodyViolationsWarn build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolationsWarn self = new DescribePolicyGovernanceInClusterResponseBodyViolationsWarn();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsWarn setPolicyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
        }
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsWarn setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsWarn setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolationsWarn setViolations(Long violations) {
            this.violations = violations;
            return this;
        }
        public Long getViolations() {
            return this.violations;
        }

    }

    public static class DescribePolicyGovernanceInClusterResponseBodyViolations extends TeaModel {
        @NameInMap("deny")
        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny deny;

        @NameInMap("warn")
        public DescribePolicyGovernanceInClusterResponseBodyViolationsWarn warn;

        public static DescribePolicyGovernanceInClusterResponseBodyViolations build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGovernanceInClusterResponseBodyViolations self = new DescribePolicyGovernanceInClusterResponseBodyViolations();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolations setDeny(DescribePolicyGovernanceInClusterResponseBodyViolationsDeny deny) {
            this.deny = deny;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny getDeny() {
            return this.deny;
        }

        public DescribePolicyGovernanceInClusterResponseBodyViolations setWarn(DescribePolicyGovernanceInClusterResponseBodyViolationsWarn warn) {
            this.warn = warn;
            return this;
        }
        public DescribePolicyGovernanceInClusterResponseBodyViolationsWarn getWarn() {
            return this.warn;
        }

    }

}
