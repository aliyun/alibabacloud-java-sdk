// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribePolicyGovernanceInClusterResponseBody extends TeaModel {
    // 集群当前策略治理审计日志
    @NameInMap("admit_log")
    public DescribePolicyGovernanceInClusterResponseBodyAdmitLog admitLog;

    // 当前集群中开启的不同等级策略计数统计
    @NameInMap("on_state")
    public java.util.List<DescribePolicyGovernanceInClusterResponseBodyOnState> onState;

    // 集群中当前被拦截和告警两种处理类型下不同治理等级的违规计数。
    @NameInMap("totalViolations")
    public DescribePolicyGovernanceInClusterResponseBodyTotalViolations totalViolations;

    // 集群中针对不同策略类型的拦截和告警的审计计数统计列表
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
        // 目标集群ID
        @NameInMap("cluster_id")
        public String clusterId;

        // 策略类型名称
        @NameInMap("constraint_kind")
        public String constraintKind;

        // 策略治理审计日志信息
        @NameInMap("msg")
        public String msg;

        // 目标资源类型
        @NameInMap("resource_kind")
        public String resourceKind;

        // 目标资源名称
        @NameInMap("resource_name")
        public String resourceName;

        // 目标资源命名空间
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
        // 当前查询到的日志总数
        @NameInMap("count")
        public Long count;

        // 策略治理审计日志内容
        @NameInMap("log")
        public DescribePolicyGovernanceInClusterResponseBodyAdmitLogLog log;

        // 查询结果的状态
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
        // 当前开启的策略种类计数
        @NameInMap("enabled_count")
        public Integer enabledCount;

        // 策略治理等级
        @NameInMap("severity")
        public String severity;

        // 该等级下策略种类总数
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
        // 策略治理等级
        @NameInMap("severity")
        public String severity;

        // 被拦截的事件计数
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
        // 策略治理等级
        @NameInMap("severity")
        public String severity;

        // 告警的事件计数
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
        // 被拦截的不同治理等级的违规计数统计
        @NameInMap("deny")
        public DescribePolicyGovernanceInClusterResponseBodyTotalViolationsDeny deny;

        // 告警模式下不同治理等级的违规计数统计
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
        // 策略描述
        @NameInMap("policyDescription")
        public String policyDescription;

        // 策略名称
        @NameInMap("policyName")
        public String policyName;

        // 策略治理等级
        @NameInMap("severity")
        public String severity;

        // 对应规则的事件计数
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
        // 策略描述
        @NameInMap("policyDescription")
        public String policyDescription;

        // 策略名称
        @NameInMap("policyName")
        public String policyName;

        // 策略治理等级
        @NameInMap("severity")
        public String severity;

        // 对应规则的事件计数
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
        // 被拦截的不同策略类型的审计计数
        @NameInMap("deny")
        public DescribePolicyGovernanceInClusterResponseBodyViolationsDeny deny;

        // 告警的不同策略类型审计计数
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
