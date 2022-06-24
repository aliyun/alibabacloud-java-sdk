// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class GetMcubeUpgradePackageInfoResponseBody extends TeaModel {
    @NameInMap("GetPackageResult")
    public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult getPackageResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMcubeUpgradePackageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeUpgradePackageInfoResponseBody self = new GetMcubeUpgradePackageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcubeUpgradePackageInfoResponseBody setGetPackageResult(GetMcubeUpgradePackageInfoResponseBodyGetPackageResult getPackageResult) {
        this.getPackageResult = getPackageResult;
        return this;
    }
    public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult getGetPackageResult() {
        return this.getPackageResult;
    }

    public GetMcubeUpgradePackageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcubeUpgradePackageInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMcubeUpgradePackageInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstallAmount")
        public Integer installAmount;

        @NameInMap("InvalidTime")
        public String invalidTime;

        @NameInMap("UpgradeId")
        public Long upgradeId;

        public static GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO self = new GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO setInstallAmount(Integer installAmount) {
            this.installAmount = installAmount;
            return this;
        }
        public Integer getInstallAmount() {
            return this.installAmount;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO setInvalidTime(String invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public String getInvalidTime() {
            return this.invalidTime;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO setUpgradeId(Long upgradeId) {
            this.upgradeId = upgradeId;
            return this;
        }
        public Long getUpgradeId() {
            return this.upgradeId;
        }

    }

    public static class GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO extends TeaModel {
        @NameInMap("AllowCreateTask")
        public Boolean allowCreateTask;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppstoreUrl")
        public String appstoreUrl;

        @NameInMap("ChangeLog")
        public String changeLog;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsEnterprise")
        public Integer isEnterprise;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("NeedCheck")
        public Integer needCheck;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishPeriod")
        public Integer publishPeriod;

        @NameInMap("VerificationCode")
        public String verificationCode;

        public static GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO self = new GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setAllowCreateTask(Boolean allowCreateTask) {
            this.allowCreateTask = allowCreateTask;
            return this;
        }
        public Boolean getAllowCreateTask() {
            return this.allowCreateTask;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setAppstoreUrl(String appstoreUrl) {
            this.appstoreUrl = appstoreUrl;
            return this;
        }
        public String getAppstoreUrl() {
            return this.appstoreUrl;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setNeedCheck(Integer needCheck) {
            this.needCheck = needCheck;
            return this;
        }
        public Integer getNeedCheck() {
            return this.needCheck;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setPublishPeriod(Integer publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }
        public String getVerificationCode() {
            return this.verificationCode;
        }

    }

    public static class GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo extends TeaModel {
        @NameInMap("MobileTestFlightConfigDO")
        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO mobileTestFlightConfigDO;

        @NameInMap("UpgradeBaseInfoDO")
        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO upgradeBaseInfoDO;

        public static GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo self = new GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo setMobileTestFlightConfigDO(GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO mobileTestFlightConfigDO) {
            this.mobileTestFlightConfigDO = mobileTestFlightConfigDO;
            return this;
        }
        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoMobileTestFlightConfigDO getMobileTestFlightConfigDO() {
            return this.mobileTestFlightConfigDO;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo setUpgradeBaseInfoDO(GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO upgradeBaseInfoDO) {
            this.upgradeBaseInfoDO = upgradeBaseInfoDO;
            return this;
        }
        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO getUpgradeBaseInfoDO() {
            return this.upgradeBaseInfoDO;
        }

    }

    public static class GetMcubeUpgradePackageInfoResponseBodyGetPackageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("PackageInfo")
        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo packageInfo;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static GetMcubeUpgradePackageInfoResponseBodyGetPackageResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradePackageInfoResponseBodyGetPackageResult self = new GetMcubeUpgradePackageInfoResponseBodyGetPackageResult();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult setPackageInfo(GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }
        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfo getPackageInfo() {
            return this.packageInfo;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
