// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoSyncRuleResponseBody extends TeaModel {
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

    @NameInMap("SyncRules")
    public java.util.List<ListRepoSyncRuleResponseBodySyncRules> syncRules;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CrossUser")
        public Boolean crossUser;

        @NameInMap("LocalInstanceId")
        public String localInstanceId;

        @NameInMap("LocalNamespaceName")
        public String localNamespaceName;

        @NameInMap("LocalRegionId")
        public String localRegionId;

        @NameInMap("LocalRepoName")
        public String localRepoName;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("SyncDirection")
        public String syncDirection;

        @NameInMap("SyncRuleId")
        public String syncRuleId;

        @NameInMap("SyncRuleName")
        public String syncRuleName;

        @NameInMap("SyncScope")
        public String syncScope;

        @NameInMap("SyncTrigger")
        public String syncTrigger;

        @NameInMap("TagFilter")
        public String tagFilter;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("TargetNamespaceName")
        public String targetNamespaceName;

        @NameInMap("TargetRegionId")
        public String targetRegionId;

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
