// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
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
     * <p>838D1602-6D8F-47FB-B60A-656645D2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried synchronization rules.</p>
     */
    @NameInMap("SyncRules")
    public java.util.List<ListRepoSyncRuleResponseBodySyncRules> syncRules;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRepoSyncRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoSyncRuleResponseBody self = new ListRepoSyncRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoSyncRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoSyncRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoSyncRuleResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoSyncRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoSyncRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoSyncRuleResponseBody setSyncRules(java.util.List<ListRepoSyncRuleResponseBodySyncRules> syncRules) {
        this.syncRules = syncRules;
        return this;
    }
    public java.util.List<ListRepoSyncRuleResponseBodySyncRules> getSyncRules() {
        return this.syncRules;
    }

    public ListRepoSyncRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRepoSyncRuleResponseBodySyncRules extends TeaModel {
        /**
         * <p>The time when the synchronization rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1572604642000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the synchronization is performed across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Images are synchronized across Alibaba Cloud accounts.</li>
         * <li><code>false</code>: Images are synchronized within the same Alibaba Cloud account.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CrossUser")
        public Boolean crossUser;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        @NameInMap("LocalInstanceId")
        public String localInstanceId;

        /**
         * <p>The name of the namespace in the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LocalNamespaceName")
        public String localNamespaceName;

        /**
         * <p>The region ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("LocalRegionId")
        public String localRegionId;

        /**
         * <p>The name of the repository in the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo-local</p>
         */
        @NameInMap("LocalRepoName")
        public String localRepoName;

        /**
         * <p>The time when the synchronization rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1572604642000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The regular expression that is used to filter repositories.</p>
         * <blockquote>
         * <p> This parameter is valid only when SyncScope is set to <code>NAMESPACE</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        @NameInMap("RepoNameFilter")
        public String repoNameFilter;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><code>FROM</code>: Images are synchronized from the source instance to the destination instance.</li>
         * <li><code>TO</code>: Images are synchronized from the destination instance to the source instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FROM</p>
         */
        @NameInMap("SyncDirection")
        public String syncDirection;

        /**
         * <p>The ID of the synchronization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>crsr-7lph66uloi6h****</p>
         */
        @NameInMap("SyncRuleId")
        public String syncRuleId;

        /**
         * <p>The name of the synchronization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>sync-rule-1</p>
         */
        @NameInMap("SyncRuleName")
        public String syncRuleName;

        /**
         * <p>The synchronization scope. Valid values:</p>
         * <ul>
         * <li><code>NAMESPACE</code>: synchronizes the image tags in a namespace that meet the synchronization rule.</li>
         * <li><code>REPO</code>: synchronizes the image tags in an image repository that meet the synchronization rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAMESPACE</p>
         */
        @NameInMap("SyncScope")
        public String syncScope;

        /**
         * <p>The policy that is applied to trigger the synchronization rule. Valid values:</p>
         * <ul>
         * <li><code>INITIATIVE</code>: The synchronization rule is positively triggered.</li>
         * <li><code>PASSIVE</code>: The synchronization rule is passively triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSIVE</p>
         */
        @NameInMap("SyncTrigger")
        public String syncTrigger;

        /**
         * <p>The regular expression that is used to filter image tags.</p>
         * 
         * <strong>example:</strong>
         * <p>.*</p>
         */
        @NameInMap("TagFilter")
        public String tagFilter;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-k77rd2eo9ztt****</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The name of the namespace in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TargetNamespaceName")
        public String targetNamespaceName;

        /**
         * <p>The region ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("TargetRegionId")
        public String targetRegionId;

        /**
         * <p>The name of the repository in the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo-target</p>
         */
        @NameInMap("TargetRepoName")
        public String targetRepoName;

        public static ListRepoSyncRuleResponseBodySyncRules build(java.util.Map<String, ?> map) throws Exception {
            ListRepoSyncRuleResponseBodySyncRules self = new ListRepoSyncRuleResponseBodySyncRules();
            return TeaModel.build(map, self);
        }

        public ListRepoSyncRuleResponseBodySyncRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRepoSyncRuleResponseBodySyncRules setCrossUser(Boolean crossUser) {
            this.crossUser = crossUser;
            return this;
        }
        public Boolean getCrossUser() {
            return this.crossUser;
        }

        public ListRepoSyncRuleResponseBodySyncRules setLocalInstanceId(String localInstanceId) {
            this.localInstanceId = localInstanceId;
            return this;
        }
        public String getLocalInstanceId() {
            return this.localInstanceId;
        }

        public ListRepoSyncRuleResponseBodySyncRules setLocalNamespaceName(String localNamespaceName) {
            this.localNamespaceName = localNamespaceName;
            return this;
        }
        public String getLocalNamespaceName() {
            return this.localNamespaceName;
        }

        public ListRepoSyncRuleResponseBodySyncRules setLocalRegionId(String localRegionId) {
            this.localRegionId = localRegionId;
            return this;
        }
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        public ListRepoSyncRuleResponseBodySyncRules setLocalRepoName(String localRepoName) {
            this.localRepoName = localRepoName;
            return this;
        }
        public String getLocalRepoName() {
            return this.localRepoName;
        }

        public ListRepoSyncRuleResponseBodySyncRules setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRepoSyncRuleResponseBodySyncRules setRepoNameFilter(String repoNameFilter) {
            this.repoNameFilter = repoNameFilter;
            return this;
        }
        public String getRepoNameFilter() {
            return this.repoNameFilter;
        }

        public ListRepoSyncRuleResponseBodySyncRules setSyncDirection(String syncDirection) {
            this.syncDirection = syncDirection;
            return this;
        }
        public String getSyncDirection() {
            return this.syncDirection;
        }

        public ListRepoSyncRuleResponseBodySyncRules setSyncRuleId(String syncRuleId) {
            this.syncRuleId = syncRuleId;
            return this;
        }
        public String getSyncRuleId() {
            return this.syncRuleId;
        }

        public ListRepoSyncRuleResponseBodySyncRules setSyncRuleName(String syncRuleName) {
            this.syncRuleName = syncRuleName;
            return this;
        }
        public String getSyncRuleName() {
            return this.syncRuleName;
        }

        public ListRepoSyncRuleResponseBodySyncRules setSyncScope(String syncScope) {
            this.syncScope = syncScope;
            return this;
        }
        public String getSyncScope() {
            return this.syncScope;
        }

        public ListRepoSyncRuleResponseBodySyncRules setSyncTrigger(String syncTrigger) {
            this.syncTrigger = syncTrigger;
            return this;
        }
        public String getSyncTrigger() {
            return this.syncTrigger;
        }

        public ListRepoSyncRuleResponseBodySyncRules setTagFilter(String tagFilter) {
            this.tagFilter = tagFilter;
            return this;
        }
        public String getTagFilter() {
            return this.tagFilter;
        }

        public ListRepoSyncRuleResponseBodySyncRules setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListRepoSyncRuleResponseBodySyncRules setTargetNamespaceName(String targetNamespaceName) {
            this.targetNamespaceName = targetNamespaceName;
            return this;
        }
        public String getTargetNamespaceName() {
            return this.targetNamespaceName;
        }

        public ListRepoSyncRuleResponseBodySyncRules setTargetRegionId(String targetRegionId) {
            this.targetRegionId = targetRegionId;
            return this;
        }
        public String getTargetRegionId() {
            return this.targetRegionId;
        }

        public ListRepoSyncRuleResponseBodySyncRules setTargetRepoName(String targetRepoName) {
            this.targetRepoName = targetRepoName;
            return this;
        }
        public String getTargetRepoName() {
            return this.targetRepoName;
        }

    }

}
