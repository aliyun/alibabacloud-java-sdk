// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactSubscriptionRuleResponseBody extends TeaModel {
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
     * <li><code>true</code></li>
     * <li><code>false</code></li>
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
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>07FC5654-C82A-59FA-A9D1-78B4EE443F86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried artifact subscription rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<ListArtifactSubscriptionRuleResponseBodyRules> rules;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListArtifactSubscriptionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactSubscriptionRuleResponseBody self = new ListArtifactSubscriptionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactSubscriptionRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListArtifactSubscriptionRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListArtifactSubscriptionRuleResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListArtifactSubscriptionRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListArtifactSubscriptionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArtifactSubscriptionRuleResponseBody setRules(java.util.List<ListArtifactSubscriptionRuleResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<ListArtifactSubscriptionRuleResponseBodyRules> getRules() {
        return this.rules;
    }

    public ListArtifactSubscriptionRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListArtifactSubscriptionRuleResponseBodyRules extends TeaModel {
        /**
         * <p>Indicates whether an acceleration link is enabled for image subscription. The subscription acceleration feature is in public preview. The feature is optimized based on scheduling policies and network links to accelerate image subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Accelerate")
        public Boolean accelerate;

        /**
         * <p>The time when the subscription rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1638187989000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-brlg4cbj2yl****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the subscription rule was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678341923385</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The name of the source namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>Indicates whether the original image is overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Override")
        public Boolean override;

        /**
         * <p>The operating system and architecture. If the source repository contains a multi-arch image, only the images with the specified operating system and architecture are subscribed to the destination repository of the Enterprise Edition instance.</p>
         */
        @NameInMap("Platform")
        public java.util.List<String> platform;

        /**
         * <p>The name of the source repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crasr-mdbpung4i1rm****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The source namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        @NameInMap("SourceNamespaceName")
        public String sourceNamespaceName;

        /**
         * <p>The source of the artifact.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DOCKER_HUB: Docker Hub</li>
         * <li>GCR: GCR</li>
         * <li>QUAY: Quay.io</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOCKER_HUB</p>
         */
        @NameInMap("SourceProvider")
        public String sourceProvider;

        /**
         * <p>The source repository.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("SourceRepoName")
        public String sourceRepoName;

        /**
         * <p>The number of subscribed images.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagCount")
        public Long tagCount;

        /**
         * <p>The image tag in the subscription source repository. Regular expressions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>release.*</p>
         */
        @NameInMap("TagRegexp")
        public String tagRegexp;

        public static ListArtifactSubscriptionRuleResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactSubscriptionRuleResponseBodyRules self = new ListArtifactSubscriptionRuleResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setAccelerate(Boolean accelerate) {
            this.accelerate = accelerate;
            return this;
        }
        public Boolean getAccelerate() {
            return this.accelerate;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setOverride(Boolean override) {
            this.override = override;
            return this;
        }
        public Boolean getOverride() {
            return this.override;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setPlatform(java.util.List<String> platform) {
            this.platform = platform;
            return this;
        }
        public java.util.List<String> getPlatform() {
            return this.platform;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setSourceNamespaceName(String sourceNamespaceName) {
            this.sourceNamespaceName = sourceNamespaceName;
            return this;
        }
        public String getSourceNamespaceName() {
            return this.sourceNamespaceName;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setSourceProvider(String sourceProvider) {
            this.sourceProvider = sourceProvider;
            return this;
        }
        public String getSourceProvider() {
            return this.sourceProvider;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setSourceRepoName(String sourceRepoName) {
            this.sourceRepoName = sourceRepoName;
            return this;
        }
        public String getSourceRepoName() {
            return this.sourceRepoName;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setTagCount(Long tagCount) {
            this.tagCount = tagCount;
            return this;
        }
        public Long getTagCount() {
            return this.tagCount;
        }

        public ListArtifactSubscriptionRuleResponseBodyRules setTagRegexp(String tagRegexp) {
            this.tagRegexp = tagRegexp;
            return this;
        }
        public String getTagRegexp() {
            return this.tagRegexp;
        }

    }

}
