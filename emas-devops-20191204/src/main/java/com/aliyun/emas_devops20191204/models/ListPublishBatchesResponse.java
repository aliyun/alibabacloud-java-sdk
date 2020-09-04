// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPublishBatchesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListPublishBatchesResponseItems> items;

    public static ListPublishBatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishBatchesResponse self = new ListPublishBatchesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishBatchesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublishBatchesResponse setItems(java.util.List<ListPublishBatchesResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPublishBatchesResponseItems> getItems() {
        return this.items;
    }

    public static class ListPublishBatchesResponseItemsCreatorAccount extends TeaModel {
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

        public static ListPublishBatchesResponseItemsCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            ListPublishBatchesResponseItemsCreatorAccount self = new ListPublishBatchesResponseItemsCreatorAccount();
            return TeaModel.build(map, self);
        }

        public ListPublishBatchesResponseItemsCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListPublishBatchesResponseItemsCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListPublishBatchesResponseItemsCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPublishBatchesResponseItemsCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListPublishBatchesResponseItems extends TeaModel {
        @NameInMap("BatchBid")
        @Validation(required = true)
        public String batchBid;

        @NameInMap("PlanBid")
        @Validation(required = true)
        public String planBid;

        @NameInMap("BatchStatus")
        @Validation(required = true)
        public String batchStatus;

        @NameInMap("BatchType")
        @Validation(required = true)
        public String batchType;

        @NameInMap("NotifiedCount")
        @Validation(required = true)
        public Long notifiedCount;

        @NameInMap("UpdatedCount")
        @Validation(required = true)
        public Long updatedCount;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("PlannedNotifyCount")
        @Validation(required = true)
        public Integer plannedNotifyCount;

        @NameInMap("PlannedUpdateCount")
        @Validation(required = true)
        public Integer plannedUpdateCount;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("UpdateRemindType")
        @Validation(required = true)
        public String updateRemindType;

        @NameInMap("CreatorAccount")
        @Validation(required = true)
        public ListPublishBatchesResponseItemsCreatorAccount creatorAccount;

        public static ListPublishBatchesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPublishBatchesResponseItems self = new ListPublishBatchesResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPublishBatchesResponseItems setBatchBid(String batchBid) {
            this.batchBid = batchBid;
            return this;
        }
        public String getBatchBid() {
            return this.batchBid;
        }

        public ListPublishBatchesResponseItems setPlanBid(String planBid) {
            this.planBid = planBid;
            return this;
        }
        public String getPlanBid() {
            return this.planBid;
        }

        public ListPublishBatchesResponseItems setBatchStatus(String batchStatus) {
            this.batchStatus = batchStatus;
            return this;
        }
        public String getBatchStatus() {
            return this.batchStatus;
        }

        public ListPublishBatchesResponseItems setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public ListPublishBatchesResponseItems setNotifiedCount(Long notifiedCount) {
            this.notifiedCount = notifiedCount;
            return this;
        }
        public Long getNotifiedCount() {
            return this.notifiedCount;
        }

        public ListPublishBatchesResponseItems setUpdatedCount(Long updatedCount) {
            this.updatedCount = updatedCount;
            return this;
        }
        public Long getUpdatedCount() {
            return this.updatedCount;
        }

        public ListPublishBatchesResponseItems setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListPublishBatchesResponseItems setPlannedNotifyCount(Integer plannedNotifyCount) {
            this.plannedNotifyCount = plannedNotifyCount;
            return this;
        }
        public Integer getPlannedNotifyCount() {
            return this.plannedNotifyCount;
        }

        public ListPublishBatchesResponseItems setPlannedUpdateCount(Integer plannedUpdateCount) {
            this.plannedUpdateCount = plannedUpdateCount;
            return this;
        }
        public Integer getPlannedUpdateCount() {
            return this.plannedUpdateCount;
        }

        public ListPublishBatchesResponseItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListPublishBatchesResponseItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListPublishBatchesResponseItems setUpdateRemindType(String updateRemindType) {
            this.updateRemindType = updateRemindType;
            return this;
        }
        public String getUpdateRemindType() {
            return this.updateRemindType;
        }

        public ListPublishBatchesResponseItems setCreatorAccount(ListPublishBatchesResponseItemsCreatorAccount creatorAccount) {
            this.creatorAccount = creatorAccount;
            return this;
        }
        public ListPublishBatchesResponseItemsCreatorAccount getCreatorAccount() {
            return this.creatorAccount;
        }

    }

}
