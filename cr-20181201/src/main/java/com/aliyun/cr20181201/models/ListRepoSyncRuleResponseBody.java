// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The synchronization rules.</p>
     */
    @NameInMap("SyncRules")
    public java.util.List<ListRepoSyncRuleResponseBodySyncRules> syncRules;

    /**
     * <p>The total number of returned entries.</p>
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
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether images are synchronized across Alibaba Cloud accounts. Valid values:</p>
         * <br>
         * <p>*   `true`: Images are synchronized across Alibaba Cloud accounts.</p>
         * <p>*   `false`: Images are synchronized within the same Alibaba Cloud account.</p>
         * <br>
         * <p>Default value: `false`</p>
         */
        @NameInMap("CrossUser")
        public Boolean crossUser;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("LocalInstanceId")
        public String localInstanceId;

        /**
         * <p>The namespace name of the source instance.</p>
         */
        @NameInMap("LocalNamespaceName")
        public String localNamespaceName;

        /**
         * <p>The region ID of the source instance.</p>
         */
        @NameInMap("LocalRegionId")
        public String localRegionId;

        /**
         * <p>The image repository name of the source instance.</p>
         */
        @NameInMap("LocalRepoName")
        public String localRepoName;

        /**
         * <p>The time when the synchronization rule was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <br>
         * <p>*   `FROM`: Images are synchronized from the source instance to the destination instance.</p>
         * <p>*   `TO`: Images are synchronized from the destination instance to the source instance.</p>
         */
        @NameInMap("SyncDirection")
        public String syncDirection;

        /**
         * <p>The ID of the synchronization rule.</p>
         */
        @NameInMap("SyncRuleId")
        public String syncRuleId;

        /**
         * <p>The name of the synchronization rule.</p>
         */
        @NameInMap("SyncRuleName")
        public String syncRuleName;

        /**
         * <p>The synchronization scope. Valid values:</p>
         * <br>
         * <p>*   `NAMESPACE`: synchronizes the image tags in a namespace that meet the synchronization rule.</p>
         * <p>*   `REPO`: synchronizes the image tags in an image repository that meet the synchronization rule.</p>
         */
        @NameInMap("SyncScope")
        public String syncScope;

        /**
         * <p>The policy that is applied to trigger the synchronization rule. Valid values:</p>
         * <br>
         * <p>*   `INITIATIVE`: The synchronization rule is positively triggered.</p>
         * <p>*   `PASSIVE`: The synchronization rule is passively triggered.</p>
         */
        @NameInMap("SyncTrigger")
        public String syncTrigger;

        /**
         * <p>The regular expression that is used to filter image tags.</p>
         */
        @NameInMap("TagFilter")
        public String tagFilter;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The namespace name of the destination instance.</p>
         */
        @NameInMap("TargetNamespaceName")
        public String targetNamespaceName;

        /**
         * <p>The region ID of the destination instance.</p>
         */
        @NameInMap("TargetRegionId")
        public String targetRegionId;

        /**
         * <p>The image repository name of the destination instance.</p>
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
