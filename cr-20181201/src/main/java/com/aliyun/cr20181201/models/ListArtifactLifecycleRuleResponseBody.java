// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<ListArtifactLifecycleRuleResponseBodyRules> rules;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListArtifactLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactLifecycleRuleResponseBody self = new ListArtifactLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactLifecycleRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListArtifactLifecycleRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListArtifactLifecycleRuleResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListArtifactLifecycleRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListArtifactLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArtifactLifecycleRuleResponseBody setRules(java.util.List<ListArtifactLifecycleRuleResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListArtifactLifecycleRuleResponseBodyRules> getRules() {
        return this.rules;
    }

    public ListArtifactLifecycleRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListArtifactLifecycleRuleResponseBodyRules extends TeaModel {
        @NameInMap("Auto")
        public Boolean auto;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnableDeleteTag")
        public Boolean enableDeleteTag;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("NextTime")
        public Long nextTime;

        @NameInMap("RepoName")
        public String repoName;

        @NameInMap("RetentionTagCount")
        public Long retentionTagCount;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("TagRegexp")
        public String tagRegexp;

        public static ListArtifactLifecycleRuleResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactLifecycleRuleResponseBodyRules self = new ListArtifactLifecycleRuleResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListArtifactLifecycleRuleResponseBodyRules setAuto(Boolean auto) {
            this.auto = auto;
            return this;
        }
        public Boolean getAuto() {
            return this.auto;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setEnableDeleteTag(Boolean enableDeleteTag) {
            this.enableDeleteTag = enableDeleteTag;
            return this;
        }
        public Boolean getEnableDeleteTag() {
            return this.enableDeleteTag;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setRetentionTagCount(Long retentionTagCount) {
            this.retentionTagCount = retentionTagCount;
            return this;
        }
        public Long getRetentionTagCount() {
            return this.retentionTagCount;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListArtifactLifecycleRuleResponseBodyRules setTagRegexp(String tagRegexp) {
            this.tagRegexp = tagRegexp;
            return this;
        }
        public String getTagRegexp() {
            return this.tagRegexp;
        }

    }

}
