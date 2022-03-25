// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryOneAppResponseBody extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("AsyncToken")
    public String asyncToken;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public OrderQueryOneAppResponseBodyResultObj resultObj;

    @NameInMap("Retry")
    public Boolean retry;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static OrderQueryOneAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryOneAppResponseBody self = new OrderQueryOneAppResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderQueryOneAppResponseBody setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public OrderQueryOneAppResponseBody setAsyncToken(String asyncToken) {
        this.asyncToken = asyncToken;
        return this;
    }
    public String getAsyncToken() {
        return this.asyncToken;
    }

    public OrderQueryOneAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OrderQueryOneAppResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OrderQueryOneAppResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OrderQueryOneAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderQueryOneAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderQueryOneAppResponseBody setResultObj(OrderQueryOneAppResponseBodyResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public OrderQueryOneAppResponseBodyResultObj getResultObj() {
        return this.resultObj;
    }

    public OrderQueryOneAppResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public OrderQueryOneAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OrderQueryOneAppResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class OrderQueryOneAppResponseBodyResultObjBackExtInfo extends TeaModel {
        @NameInMap("BackInfoMap")
        public java.util.Map<String, ?> backInfoMap;

        public static OrderQueryOneAppResponseBodyResultObjBackExtInfo build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObjBackExtInfo self = new OrderQueryOneAppResponseBodyResultObjBackExtInfo();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObjBackExtInfo setBackInfoMap(java.util.Map<String, ?> backInfoMap) {
            this.backInfoMap = backInfoMap;
            return this;
        }
        public java.util.Map<String, ?> getBackInfoMap() {
            return this.backInfoMap;
        }

    }

    public static class OrderQueryOneAppResponseBodyResultObjCreateUser extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("AliyunUidType")
        public String aliyunUidType;

        @NameInMap("Delete")
        public Boolean delete;

        @NameInMap("Email")
        public String email;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentUid")
        public String parentUid;

        @NameInMap("Phone")
        public String phone;

        public static OrderQueryOneAppResponseBodyResultObjCreateUser build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObjCreateUser self = new OrderQueryOneAppResponseBodyResultObjCreateUser();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setAliyunUidType(String aliyunUidType) {
            this.aliyunUidType = aliyunUidType;
            return this;
        }
        public String getAliyunUidType() {
            return this.aliyunUidType;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public OrderQueryOneAppResponseBodyResultObjCreateUser setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class OrderQueryOneAppResponseBodyResultObjExtraInfo extends TeaModel {
        @NameInMap("CheckRequirements")
        public String checkRequirements;

        @NameInMap("ExtInfoMap")
        public java.util.Map<String, ?> extInfoMap;

        @NameInMap("ObjectDescription")
        public String objectDescription;

        @NameInMap("PhotoShowThingsCnt")
        public String photoShowThingsCnt;

        @NameInMap("ProcessRequirements")
        public String processRequirements;

        @NameInMap("UploadRequirements")
        public String uploadRequirements;

        @NameInMap("VideoNumber")
        public String videoNumber;

        public static OrderQueryOneAppResponseBodyResultObjExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObjExtraInfo self = new OrderQueryOneAppResponseBodyResultObjExtraInfo();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setCheckRequirements(String checkRequirements) {
            this.checkRequirements = checkRequirements;
            return this;
        }
        public String getCheckRequirements() {
            return this.checkRequirements;
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setExtInfoMap(java.util.Map<String, ?> extInfoMap) {
            this.extInfoMap = extInfoMap;
            return this;
        }
        public java.util.Map<String, ?> getExtInfoMap() {
            return this.extInfoMap;
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setObjectDescription(String objectDescription) {
            this.objectDescription = objectDescription;
            return this;
        }
        public String getObjectDescription() {
            return this.objectDescription;
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setPhotoShowThingsCnt(String photoShowThingsCnt) {
            this.photoShowThingsCnt = photoShowThingsCnt;
            return this;
        }
        public String getPhotoShowThingsCnt() {
            return this.photoShowThingsCnt;
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setProcessRequirements(String processRequirements) {
            this.processRequirements = processRequirements;
            return this;
        }
        public String getProcessRequirements() {
            return this.processRequirements;
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setUploadRequirements(String uploadRequirements) {
            this.uploadRequirements = uploadRequirements;
            return this;
        }
        public String getUploadRequirements() {
            return this.uploadRequirements;
        }

        public OrderQueryOneAppResponseBodyResultObjExtraInfo setVideoNumber(String videoNumber) {
            this.videoNumber = videoNumber;
            return this;
        }
        public String getVideoNumber() {
            return this.videoNumber;
        }

    }

    public static class OrderQueryOneAppResponseBodyResultObjPhotoContact extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Username")
        public String username;

        public static OrderQueryOneAppResponseBodyResultObjPhotoContact build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObjPhotoContact self = new OrderQueryOneAppResponseBodyResultObjPhotoContact();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObjPhotoContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public OrderQueryOneAppResponseBodyResultObjPhotoContact setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public OrderQueryOneAppResponseBodyResultObjPhotoContact setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class OrderQueryOneAppResponseBodyResultObjProject extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BuildStatus")
        public String buildStatus;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("FunctionStatus")
        public String functionStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HighmodelAssignedTime")
        public String highmodelAssignedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsvAssignedTime")
        public String isvAssignedTime;

        @NameInMap("LatestPipelineUsageInstanceStatus")
        public java.util.Map<String, ?> latestPipelineUsageInstanceStatus;

        @NameInMap("ModelConfirmedTime")
        public String modelConfirmedTime;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectStatus")
        public String projectStatus;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("RecentBuildTime")
        public String recentBuildTime;

        @NameInMap("RecentPublishTime")
        public String recentPublishTime;

        @NameInMap("UploadStatus")
        public String uploadStatus;

        public static OrderQueryOneAppResponseBodyResultObjProject build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObjProject self = new OrderQueryOneAppResponseBodyResultObjProject();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObjProject setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setBuildStatus(String buildStatus) {
            this.buildStatus = buildStatus;
            return this;
        }
        public String getBuildStatus() {
            return this.buildStatus;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setFunctionStatus(String functionStatus) {
            this.functionStatus = functionStatus;
            return this;
        }
        public String getFunctionStatus() {
            return this.functionStatus;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setHighmodelAssignedTime(String highmodelAssignedTime) {
            this.highmodelAssignedTime = highmodelAssignedTime;
            return this;
        }
        public String getHighmodelAssignedTime() {
            return this.highmodelAssignedTime;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setIsvAssignedTime(String isvAssignedTime) {
            this.isvAssignedTime = isvAssignedTime;
            return this;
        }
        public String getIsvAssignedTime() {
            return this.isvAssignedTime;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setLatestPipelineUsageInstanceStatus(java.util.Map<String, ?> latestPipelineUsageInstanceStatus) {
            this.latestPipelineUsageInstanceStatus = latestPipelineUsageInstanceStatus;
            return this;
        }
        public java.util.Map<String, ?> getLatestPipelineUsageInstanceStatus() {
            return this.latestPipelineUsageInstanceStatus;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setModelConfirmedTime(String modelConfirmedTime) {
            this.modelConfirmedTime = modelConfirmedTime;
            return this;
        }
        public String getModelConfirmedTime() {
            return this.modelConfirmedTime;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setProjectStatus(String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public String getProjectStatus() {
            return this.projectStatus;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setRecentBuildTime(String recentBuildTime) {
            this.recentBuildTime = recentBuildTime;
            return this;
        }
        public String getRecentBuildTime() {
            return this.recentBuildTime;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setRecentPublishTime(String recentPublishTime) {
            this.recentPublishTime = recentPublishTime;
            return this;
        }
        public String getRecentPublishTime() {
            return this.recentPublishTime;
        }

        public OrderQueryOneAppResponseBodyResultObjProject setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

    }

    public static class OrderQueryOneAppResponseBodyResultObjScanUser extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("AliyunUidType")
        public String aliyunUidType;

        @NameInMap("Delete")
        public Boolean delete;

        @NameInMap("Email")
        public String email;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentUid")
        public String parentUid;

        @NameInMap("Phone")
        public String phone;

        public static OrderQueryOneAppResponseBodyResultObjScanUser build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObjScanUser self = new OrderQueryOneAppResponseBodyResultObjScanUser();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setAliyunUidType(String aliyunUidType) {
            this.aliyunUidType = aliyunUidType;
            return this;
        }
        public String getAliyunUidType() {
            return this.aliyunUidType;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public OrderQueryOneAppResponseBodyResultObjScanUser setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class OrderQueryOneAppResponseBodyResultObj extends TeaModel {
        @NameInMap("BackExtInfo")
        public OrderQueryOneAppResponseBodyResultObjBackExtInfo backExtInfo;

        @NameInMap("BackReason")
        public String backReason;

        @NameInMap("BillTime")
        public String billTime;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CloudTbLongId")
        public Long cloudTbLongId;

        @NameInMap("CloudTbPhone")
        public String cloudTbPhone;

        @NameInMap("CloudUserId")
        public Long cloudUserId;

        @NameInMap("CreateUser")
        public OrderQueryOneAppResponseBodyResultObjCreateUser createUser;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("DemandContent")
        public String demandContent;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("EstimatedCost")
        public Double estimatedCost;

        @NameInMap("ExpectedOnlineTime")
        public String expectedOnlineTime;

        @NameInMap("ExtraInfo")
        public OrderQueryOneAppResponseBodyResultObjExtraInfo extraInfo;

        @NameInMap("FeeState")
        public String feeState;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("IsvUserMap")
        public java.util.Map<String, ?> isvUserMap;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("OrderName")
        public String orderName;

        @NameInMap("OrderState")
        public String orderState;

        @NameInMap("OutBizNo")
        public String outBizNo;

        @NameInMap("PanoramaSize")
        public Double panoramaSize;

        @NameInMap("PhotoAddress")
        public String photoAddress;

        @NameInMap("PhotoCity")
        public String photoCity;

        @NameInMap("PhotoContact")
        public java.util.List<OrderQueryOneAppResponseBodyResultObjPhotoContact> photoContact;

        @NameInMap("PhotoEnvironment")
        public String photoEnvironment;

        @NameInMap("PhotoFloorNum")
        public Long photoFloorNum;

        @NameInMap("PhotoProvince")
        public String photoProvince;

        @NameInMap("PhotoSize")
        public Double photoSize;

        @NameInMap("PhotoTime")
        public String photoTime;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PlatformAccount")
        public String platformAccount;

        @NameInMap("PlatformAccountType")
        public String platformAccountType;

        @NameInMap("Project")
        public OrderQueryOneAppResponseBodyResultObjProject project;

        @NameInMap("ScanUser")
        public OrderQueryOneAppResponseBodyResultObjScanUser scanUser;

        @NameInMap("SpecialRequirements")
        public String specialRequirements;

        @NameInMap("VrLink")
        public String vrLink;

        public static OrderQueryOneAppResponseBodyResultObj build(java.util.Map<String, ?> map) throws Exception {
            OrderQueryOneAppResponseBodyResultObj self = new OrderQueryOneAppResponseBodyResultObj();
            return TeaModel.build(map, self);
        }

        public OrderQueryOneAppResponseBodyResultObj setBackExtInfo(OrderQueryOneAppResponseBodyResultObjBackExtInfo backExtInfo) {
            this.backExtInfo = backExtInfo;
            return this;
        }
        public OrderQueryOneAppResponseBodyResultObjBackExtInfo getBackExtInfo() {
            return this.backExtInfo;
        }

        public OrderQueryOneAppResponseBodyResultObj setBackReason(String backReason) {
            this.backReason = backReason;
            return this;
        }
        public String getBackReason() {
            return this.backReason;
        }

        public OrderQueryOneAppResponseBodyResultObj setBillTime(String billTime) {
            this.billTime = billTime;
            return this;
        }
        public String getBillTime() {
            return this.billTime;
        }

        public OrderQueryOneAppResponseBodyResultObj setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public OrderQueryOneAppResponseBodyResultObj setCloudTbLongId(Long cloudTbLongId) {
            this.cloudTbLongId = cloudTbLongId;
            return this;
        }
        public Long getCloudTbLongId() {
            return this.cloudTbLongId;
        }

        public OrderQueryOneAppResponseBodyResultObj setCloudTbPhone(String cloudTbPhone) {
            this.cloudTbPhone = cloudTbPhone;
            return this;
        }
        public String getCloudTbPhone() {
            return this.cloudTbPhone;
        }

        public OrderQueryOneAppResponseBodyResultObj setCloudUserId(Long cloudUserId) {
            this.cloudUserId = cloudUserId;
            return this;
        }
        public Long getCloudUserId() {
            return this.cloudUserId;
        }

        public OrderQueryOneAppResponseBodyResultObj setCreateUser(OrderQueryOneAppResponseBodyResultObjCreateUser createUser) {
            this.createUser = createUser;
            return this;
        }
        public OrderQueryOneAppResponseBodyResultObjCreateUser getCreateUser() {
            return this.createUser;
        }

        public OrderQueryOneAppResponseBodyResultObj setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public OrderQueryOneAppResponseBodyResultObj setDemandContent(String demandContent) {
            this.demandContent = demandContent;
            return this;
        }
        public String getDemandContent() {
            return this.demandContent;
        }

        public OrderQueryOneAppResponseBodyResultObj setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public OrderQueryOneAppResponseBodyResultObj setEstimatedCost(Double estimatedCost) {
            this.estimatedCost = estimatedCost;
            return this;
        }
        public Double getEstimatedCost() {
            return this.estimatedCost;
        }

        public OrderQueryOneAppResponseBodyResultObj setExpectedOnlineTime(String expectedOnlineTime) {
            this.expectedOnlineTime = expectedOnlineTime;
            return this;
        }
        public String getExpectedOnlineTime() {
            return this.expectedOnlineTime;
        }

        public OrderQueryOneAppResponseBodyResultObj setExtraInfo(OrderQueryOneAppResponseBodyResultObjExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public OrderQueryOneAppResponseBodyResultObjExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public OrderQueryOneAppResponseBodyResultObj setFeeState(String feeState) {
            this.feeState = feeState;
            return this;
        }
        public String getFeeState() {
            return this.feeState;
        }

        public OrderQueryOneAppResponseBodyResultObj setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public OrderQueryOneAppResponseBodyResultObj setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public OrderQueryOneAppResponseBodyResultObj setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public OrderQueryOneAppResponseBodyResultObj setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public OrderQueryOneAppResponseBodyResultObj setIsvUserMap(java.util.Map<String, ?> isvUserMap) {
            this.isvUserMap = isvUserMap;
            return this;
        }
        public java.util.Map<String, ?> getIsvUserMap() {
            return this.isvUserMap;
        }

        public OrderQueryOneAppResponseBodyResultObj setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public OrderQueryOneAppResponseBodyResultObj setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }
        public String getOrderName() {
            return this.orderName;
        }

        public OrderQueryOneAppResponseBodyResultObj setOrderState(String orderState) {
            this.orderState = orderState;
            return this;
        }
        public String getOrderState() {
            return this.orderState;
        }

        public OrderQueryOneAppResponseBodyResultObj setOutBizNo(String outBizNo) {
            this.outBizNo = outBizNo;
            return this;
        }
        public String getOutBizNo() {
            return this.outBizNo;
        }

        public OrderQueryOneAppResponseBodyResultObj setPanoramaSize(Double panoramaSize) {
            this.panoramaSize = panoramaSize;
            return this;
        }
        public Double getPanoramaSize() {
            return this.panoramaSize;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoAddress(String photoAddress) {
            this.photoAddress = photoAddress;
            return this;
        }
        public String getPhotoAddress() {
            return this.photoAddress;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoCity(String photoCity) {
            this.photoCity = photoCity;
            return this;
        }
        public String getPhotoCity() {
            return this.photoCity;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoContact(java.util.List<OrderQueryOneAppResponseBodyResultObjPhotoContact> photoContact) {
            this.photoContact = photoContact;
            return this;
        }
        public java.util.List<OrderQueryOneAppResponseBodyResultObjPhotoContact> getPhotoContact() {
            return this.photoContact;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoEnvironment(String photoEnvironment) {
            this.photoEnvironment = photoEnvironment;
            return this;
        }
        public String getPhotoEnvironment() {
            return this.photoEnvironment;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoFloorNum(Long photoFloorNum) {
            this.photoFloorNum = photoFloorNum;
            return this;
        }
        public Long getPhotoFloorNum() {
            return this.photoFloorNum;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoProvince(String photoProvince) {
            this.photoProvince = photoProvince;
            return this;
        }
        public String getPhotoProvince() {
            return this.photoProvince;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoSize(Double photoSize) {
            this.photoSize = photoSize;
            return this;
        }
        public Double getPhotoSize() {
            return this.photoSize;
        }

        public OrderQueryOneAppResponseBodyResultObj setPhotoTime(String photoTime) {
            this.photoTime = photoTime;
            return this;
        }
        public String getPhotoTime() {
            return this.photoTime;
        }

        public OrderQueryOneAppResponseBodyResultObj setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public OrderQueryOneAppResponseBodyResultObj setPlatformAccount(String platformAccount) {
            this.platformAccount = platformAccount;
            return this;
        }
        public String getPlatformAccount() {
            return this.platformAccount;
        }

        public OrderQueryOneAppResponseBodyResultObj setPlatformAccountType(String platformAccountType) {
            this.platformAccountType = platformAccountType;
            return this;
        }
        public String getPlatformAccountType() {
            return this.platformAccountType;
        }

        public OrderQueryOneAppResponseBodyResultObj setProject(OrderQueryOneAppResponseBodyResultObjProject project) {
            this.project = project;
            return this;
        }
        public OrderQueryOneAppResponseBodyResultObjProject getProject() {
            return this.project;
        }

        public OrderQueryOneAppResponseBodyResultObj setScanUser(OrderQueryOneAppResponseBodyResultObjScanUser scanUser) {
            this.scanUser = scanUser;
            return this;
        }
        public OrderQueryOneAppResponseBodyResultObjScanUser getScanUser() {
            return this.scanUser;
        }

        public OrderQueryOneAppResponseBodyResultObj setSpecialRequirements(String specialRequirements) {
            this.specialRequirements = specialRequirements;
            return this;
        }
        public String getSpecialRequirements() {
            return this.specialRequirements;
        }

        public OrderQueryOneAppResponseBodyResultObj setVrLink(String vrLink) {
            this.vrLink = vrLink;
            return this;
        }
        public String getVrLink() {
            return this.vrLink;
        }

    }

}
