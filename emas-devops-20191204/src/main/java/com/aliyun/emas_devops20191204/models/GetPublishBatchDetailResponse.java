// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetPublishBatchDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("CreateTime")
    @Validation(required = true)
    public Long createTime;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public Long updateTime;

    @NameInMap("UpdateRemindType")
    @Validation(required = true)
    public String updateRemindType;

    @NameInMap("FinishTime")
    @Validation(required = true)
    public Long finishTime;

    @NameInMap("NotifiedCount")
    @Validation(required = true)
    public Long notifiedCount;

    @NameInMap("UpdatedCount")
    @Validation(required = true)
    public Long updatedCount;

    @NameInMap("StrategiesVO")
    @Validation(required = true)
    public GetPublishBatchDetailResponseStrategiesVO strategiesVO;

    @NameInMap("CreatorAccount")
    @Validation(required = true)
    public GetPublishBatchDetailResponseCreatorAccount creatorAccount;

    @NameInMap("ModifierAccount")
    @Validation(required = true)
    public GetPublishBatchDetailResponseModifierAccount modifierAccount;

    public static GetPublishBatchDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishBatchDetailResponse self = new GetPublishBatchDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishBatchDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublishBatchDetailResponse setBatchBid(String batchBid) {
        this.batchBid = batchBid;
        return this;
    }
    public String getBatchBid() {
        return this.batchBid;
    }

    public GetPublishBatchDetailResponse setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

    public GetPublishBatchDetailResponse setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
        return this;
    }
    public String getBatchStatus() {
        return this.batchStatus;
    }

    public GetPublishBatchDetailResponse setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public GetPublishBatchDetailResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetPublishBatchDetailResponse setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public GetPublishBatchDetailResponse setUpdateRemindType(String updateRemindType) {
        this.updateRemindType = updateRemindType;
        return this;
    }
    public String getUpdateRemindType() {
        return this.updateRemindType;
    }

    public GetPublishBatchDetailResponse setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Long getFinishTime() {
        return this.finishTime;
    }

    public GetPublishBatchDetailResponse setNotifiedCount(Long notifiedCount) {
        this.notifiedCount = notifiedCount;
        return this;
    }
    public Long getNotifiedCount() {
        return this.notifiedCount;
    }

    public GetPublishBatchDetailResponse setUpdatedCount(Long updatedCount) {
        this.updatedCount = updatedCount;
        return this;
    }
    public Long getUpdatedCount() {
        return this.updatedCount;
    }

    public GetPublishBatchDetailResponse setStrategiesVO(GetPublishBatchDetailResponseStrategiesVO strategiesVO) {
        this.strategiesVO = strategiesVO;
        return this;
    }
    public GetPublishBatchDetailResponseStrategiesVO getStrategiesVO() {
        return this.strategiesVO;
    }

    public GetPublishBatchDetailResponse setCreatorAccount(GetPublishBatchDetailResponseCreatorAccount creatorAccount) {
        this.creatorAccount = creatorAccount;
        return this;
    }
    public GetPublishBatchDetailResponseCreatorAccount getCreatorAccount() {
        return this.creatorAccount;
    }

    public GetPublishBatchDetailResponse setModifierAccount(GetPublishBatchDetailResponseModifierAccount modifierAccount) {
        this.modifierAccount = modifierAccount;
        return this;
    }
    public GetPublishBatchDetailResponseModifierAccount getModifierAccount() {
        return this.modifierAccount;
    }

    public static class GetPublishBatchDetailResponseStrategiesVO extends TeaModel {
        @NameInMap("LargerThanThisApiLevel")
        @Validation(required = true)
        public Integer largerThanThisApiLevel;

        @NameInMap("UpdateVersions")
        @Validation(required = true)
        public String updateVersions;

        @NameInMap("RemindCount")
        @Validation(required = true)
        public Integer remindCount;

        @NameInMap("PlannedNotifyCount")
        @Validation(required = true)
        public Integer plannedNotifyCount;

        @NameInMap("UpdateRemindType")
        @Validation(required = true)
        public String updateRemindType;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("RemindText")
        @Validation(required = true)
        public String remindText;

        @NameInMap("WhiteDevicesDownLoadUrl")
        @Validation(required = true)
        public String whiteDevicesDownLoadUrl;

        @NameInMap("OsVersions")
        @Validation(required = true)
        public java.util.List<String> osVersions;

        @NameInMap("Brands")
        @Validation(required = true)
        public java.util.List<String> brands;

        @NameInMap("Models")
        @Validation(required = true)
        public java.util.List<String> models;

        @NameInMap("ExcludeBrands")
        @Validation(required = true)
        public java.util.List<String> excludeBrands;

        @NameInMap("ExcludeModels")
        @Validation(required = true)
        public java.util.List<String> excludeModels;

        public static GetPublishBatchDetailResponseStrategiesVO build(java.util.Map<String, ?> map) throws Exception {
            GetPublishBatchDetailResponseStrategiesVO self = new GetPublishBatchDetailResponseStrategiesVO();
            return TeaModel.build(map, self);
        }

        public GetPublishBatchDetailResponseStrategiesVO setLargerThanThisApiLevel(Integer largerThanThisApiLevel) {
            this.largerThanThisApiLevel = largerThanThisApiLevel;
            return this;
        }
        public Integer getLargerThanThisApiLevel() {
            return this.largerThanThisApiLevel;
        }

        public GetPublishBatchDetailResponseStrategiesVO setUpdateVersions(String updateVersions) {
            this.updateVersions = updateVersions;
            return this;
        }
        public String getUpdateVersions() {
            return this.updateVersions;
        }

        public GetPublishBatchDetailResponseStrategiesVO setRemindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }
        public Integer getRemindCount() {
            return this.remindCount;
        }

        public GetPublishBatchDetailResponseStrategiesVO setPlannedNotifyCount(Integer plannedNotifyCount) {
            this.plannedNotifyCount = plannedNotifyCount;
            return this;
        }
        public Integer getPlannedNotifyCount() {
            return this.plannedNotifyCount;
        }

        public GetPublishBatchDetailResponseStrategiesVO setUpdateRemindType(String updateRemindType) {
            this.updateRemindType = updateRemindType;
            return this;
        }
        public String getUpdateRemindType() {
            return this.updateRemindType;
        }

        public GetPublishBatchDetailResponseStrategiesVO setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPublishBatchDetailResponseStrategiesVO setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPublishBatchDetailResponseStrategiesVO setRemindText(String remindText) {
            this.remindText = remindText;
            return this;
        }
        public String getRemindText() {
            return this.remindText;
        }

        public GetPublishBatchDetailResponseStrategiesVO setWhiteDevicesDownLoadUrl(String whiteDevicesDownLoadUrl) {
            this.whiteDevicesDownLoadUrl = whiteDevicesDownLoadUrl;
            return this;
        }
        public String getWhiteDevicesDownLoadUrl() {
            return this.whiteDevicesDownLoadUrl;
        }

        public GetPublishBatchDetailResponseStrategiesVO setOsVersions(java.util.List<String> osVersions) {
            this.osVersions = osVersions;
            return this;
        }
        public java.util.List<String> getOsVersions() {
            return this.osVersions;
        }

        public GetPublishBatchDetailResponseStrategiesVO setBrands(java.util.List<String> brands) {
            this.brands = brands;
            return this;
        }
        public java.util.List<String> getBrands() {
            return this.brands;
        }

        public GetPublishBatchDetailResponseStrategiesVO setModels(java.util.List<String> models) {
            this.models = models;
            return this;
        }
        public java.util.List<String> getModels() {
            return this.models;
        }

        public GetPublishBatchDetailResponseStrategiesVO setExcludeBrands(java.util.List<String> excludeBrands) {
            this.excludeBrands = excludeBrands;
            return this;
        }
        public java.util.List<String> getExcludeBrands() {
            return this.excludeBrands;
        }

        public GetPublishBatchDetailResponseStrategiesVO setExcludeModels(java.util.List<String> excludeModels) {
            this.excludeModels = excludeModels;
            return this;
        }
        public java.util.List<String> getExcludeModels() {
            return this.excludeModels;
        }

    }

    public static class GetPublishBatchDetailResponseCreatorAccount extends TeaModel {
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

        public static GetPublishBatchDetailResponseCreatorAccount build(java.util.Map<String, ?> map) throws Exception {
            GetPublishBatchDetailResponseCreatorAccount self = new GetPublishBatchDetailResponseCreatorAccount();
            return TeaModel.build(map, self);
        }

        public GetPublishBatchDetailResponseCreatorAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetPublishBatchDetailResponseCreatorAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetPublishBatchDetailResponseCreatorAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetPublishBatchDetailResponseCreatorAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class GetPublishBatchDetailResponseModifierAccount extends TeaModel {
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

        public static GetPublishBatchDetailResponseModifierAccount build(java.util.Map<String, ?> map) throws Exception {
            GetPublishBatchDetailResponseModifierAccount self = new GetPublishBatchDetailResponseModifierAccount();
            return TeaModel.build(map, self);
        }

        public GetPublishBatchDetailResponseModifierAccount setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetPublishBatchDetailResponseModifierAccount setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public GetPublishBatchDetailResponseModifierAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetPublishBatchDetailResponseModifierAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
