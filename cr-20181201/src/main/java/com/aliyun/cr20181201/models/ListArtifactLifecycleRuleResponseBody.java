// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactLifecycleRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F92D82F9-A4C4-5A4A-97B9-E495BF1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>_</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListArtifactLifecycleRuleResponseBodyRules> rules;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>39</p>
     */
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
        /**
         * <p>Indicates whether the lifecycle management rule is automatically executed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Auto")
        public Boolean auto;

        /**
         * <p>The time when the lifecycle management rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1638187989000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether lifecycle management is enabled for the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDeleteTag")
        public Boolean enableDeleteTag;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-brlg4cbj2yl****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the lifecycle management rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678341923385</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The time when the lifecycle management rule is next executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1638187989000</p>
         */
        @NameInMap("NextTime")
        public Long nextTime;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test_1</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The number of retained images.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RetentionTagCount")
        public Long retentionTagCount;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cralr-yqx1q5sir6d****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The execution cycle of the lifecycle management rule.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEK</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The deletion scope of artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The regular expression that indicates which image tags are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>.*-alpine</p>
         */
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
