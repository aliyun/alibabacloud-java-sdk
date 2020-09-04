// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePublishPlanDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("CreatorAccount")
    @Validation(required = true)
    public DescribePublishPlanDetailResponseCreatorAccount creatorAccount;

    public static DescribePublishPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishPlanDetailResponse self = new DescribePublishPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublishPlanDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublishPlanDetailResponse setPublishPlanBid(String publishPlanBid) {
        this.publishPlanBid = publishPlanBid;
        return this;
    }
    public String getPublishPlanBid() {
        return this.publishPlanBid;
    }

    public DescribePublishPlanDetailResponse setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public DescribePublishPlanDetailResponse setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public DescribePublishPlanDetailResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribePublishPlanDetailResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribePublishPlanDetailResponse setPlanStatus(String planStatus) {
        this.planStatus = planStatus;
        return this;
    }
    public String getPlanStatus() {
        return this.planStatus;
    }

    public DescribePublishPlanDetailResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribePublishPlanDetailResponse setCreatorAccount(DescribePublishPlanDetailResponseCreatorAccount creatorAccount) {
        this.creatorAccount = creatorAccount;
        return this;
    }
    public DescribePublishPlanDetailResponseCreatorAccount getCreatorAccount() {
        return this.creatorAccount;
    }

    public static class DescribePublishPlanDetailResponseCreatorAccount extends TeaModel {
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

        public static DescribePublishPlanDetailResponseCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishPlanDetailResponseCreatorAccount self = new DescribePublishPlanDetailResponseCreatorAccount();
            return TeaModel.build(map, self);
        }

        public DescribePublishPlanDetailResponseCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribePublishPlanDetailResponseCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribePublishPlanDetailResponseCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePublishPlanDetailResponseCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
