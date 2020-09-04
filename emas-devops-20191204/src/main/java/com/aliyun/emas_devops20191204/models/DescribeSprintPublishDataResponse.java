// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribeSprintPublishDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SprintBid")
    @Validation(required = true)
    public String sprintBid;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("UpdateData")
    @Validation(required = true)
    public DescribeSprintPublishDataResponseUpdateData updateData;

    public static DescribeSprintPublishDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSprintPublishDataResponse self = new DescribeSprintPublishDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSprintPublishDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSprintPublishDataResponse setSprintBid(String sprintBid) {
        this.sprintBid = sprintBid;
        return this;
    }
    public String getSprintBid() {
        return this.sprintBid;
    }

    public DescribeSprintPublishDataResponse setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

    public DescribeSprintPublishDataResponse setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeSprintPublishDataResponse setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public DescribeSprintPublishDataResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeSprintPublishDataResponse setUpdateData(DescribeSprintPublishDataResponseUpdateData updateData) {
        this.updateData = updateData;
        return this;
    }
    public DescribeSprintPublishDataResponseUpdateData getUpdateData() {
        return this.updateData;
    }

    public static class DescribeSprintPublishDataResponseUpdateData extends TeaModel {
        @NameInMap("NotifiedCount")
        @Validation(required = true)
        public Long notifiedCount;

        @NameInMap("UpdatedCount")
        @Validation(required = true)
        public Long updatedCount;

        public static DescribeSprintPublishDataResponseUpdateData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSprintPublishDataResponseUpdateData self = new DescribeSprintPublishDataResponseUpdateData();
            return TeaModel.build(map, self);
        }

        public DescribeSprintPublishDataResponseUpdateData setNotifiedCount(Long notifiedCount) {
            this.notifiedCount = notifiedCount;
            return this;
        }
        public Long getNotifiedCount() {
            return this.notifiedCount;
        }

        public DescribeSprintPublishDataResponseUpdateData setUpdatedCount(Long updatedCount) {
            this.updatedCount = updatedCount;
            return this;
        }
        public Long getUpdatedCount() {
            return this.updatedCount;
        }

    }

}
