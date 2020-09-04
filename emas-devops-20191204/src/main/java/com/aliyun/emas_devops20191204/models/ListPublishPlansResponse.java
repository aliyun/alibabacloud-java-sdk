// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPublishPlansResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListPublishPlansResponseItems> items;

    public static ListPublishPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishPlansResponse self = new ListPublishPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishPlansResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishPlansResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPublishPlansResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishPlansResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListPublishPlansResponse setItems(java.util.List<ListPublishPlansResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPublishPlansResponseItems> getItems() {
        return this.items;
    }

    public static class ListPublishPlansResponseItemsCreatorAccount extends TeaModel {
        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Username")
        @Validation(required = true)
        public String username;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static ListPublishPlansResponseItemsCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            ListPublishPlansResponseItemsCreatorAccount self = new ListPublishPlansResponseItemsCreatorAccount();
            return TeaModel.build(map, self);
        }

        public ListPublishPlansResponseItemsCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListPublishPlansResponseItemsCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListPublishPlansResponseItemsCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPublishPlansResponseItemsCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListPublishPlansResponseItems extends TeaModel {
        @NameInMap("PublishPlanBid")
        @Validation(required = true)
        public String publishPlanBid;

        @NameInMap("PipelineId")
        @Validation(required = true)
        public String pipelineId;

        @NameInMap("PlanName")
        @Validation(required = true)
        public String planName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("PlanStatus")
        @Validation(required = true)
        public String planStatus;

        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("AppPlatform")
        @Validation(required = true)
        public Integer appPlatform;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("CreatorAccount")
        @Validation(required = true)
        public ListPublishPlansResponseItemsCreatorAccount creatorAccount;

        public static ListPublishPlansResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPublishPlansResponseItems self = new ListPublishPlansResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPublishPlansResponseItems setPublishPlanBid(String publishPlanBid) {
            this.publishPlanBid = publishPlanBid;
            return this;
        }
        public String getPublishPlanBid() {
            return this.publishPlanBid;
        }

        public ListPublishPlansResponseItems setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPublishPlansResponseItems setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListPublishPlansResponseItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListPublishPlansResponseItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPublishPlansResponseItems setPlanStatus(String planStatus) {
            this.planStatus = planStatus;
            return this;
        }
        public String getPlanStatus() {
            return this.planStatus;
        }

        public ListPublishPlansResponseItems setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListPublishPlansResponseItems setAppPlatform(Integer appPlatform) {
            this.appPlatform = appPlatform;
            return this;
        }
        public Integer getAppPlatform() {
            return this.appPlatform;
        }

        public ListPublishPlansResponseItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPublishPlansResponseItems setCreatorAccount(ListPublishPlansResponseItemsCreatorAccount creatorAccount) {
            this.creatorAccount = creatorAccount;
            return this;
        }
        public ListPublishPlansResponseItemsCreatorAccount getCreatorAccount() {
            return this.creatorAccount;
        }

    }

}
