// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

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

        @NameInMap("BackLog")
        public String backLog;

        @NameInMap("ChangeLog")
        public String changeLog;

        @NameInMap("ClientFileSize")
        public Integer clientFileSize;

        @NameInMap("ClientName")
        public String clientName;

        @NameInMap("CpId")
        public String cpId;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("GlobalVariables")
        public String globalVariables;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InnerVersion")
        public String innerVersion;

        @NameInMap("IosSymbol")
        public String iosSymbol;

        @NameInMap("IsEnterprise")
        public Integer isEnterprise;

        @NameInMap("IsRc")
        public Integer isRc;

        @NameInMap("IsRelease")
        public Integer isRelease;

        @NameInMap("MaxVersion")
        public String maxVersion;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("NeedCheck")
        public Integer needCheck;

        @NameInMap("OssPath")
        public String ossPath;

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

        @NameInMap("QrcodeUrl")
        public String qrcodeUrl;

        @NameInMap("ReleaseType")
        public String releaseType;

        @NameInMap("ReleaseWindow")
        public String releaseWindow;

        @NameInMap("ScmDownloadUrl")
        public String scmDownloadUrl;

        @NameInMap("ServerVersion")
        public Integer serverVersion;

        @NameInMap("VerificationCode")
        public String verificationCode;

        @NameInMap("VerifyResult")
        public Integer verifyResult;

        @NameInMap("VersionCode")
        public String versionCode;

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

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setBackLog(String backLog) {
            this.backLog = backLog;
            return this;
        }
        public String getBackLog() {
            return this.backLog;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setClientFileSize(Integer clientFileSize) {
            this.clientFileSize = clientFileSize;
            return this;
        }
        public Integer getClientFileSize() {
            return this.clientFileSize;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setCpId(String cpId) {
            this.cpId = cpId;
            return this;
        }
        public String getCpId() {
            return this.cpId;
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

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGlobalVariables(String globalVariables) {
            this.globalVariables = globalVariables;
            return this;
        }
        public String getGlobalVariables() {
            return this.globalVariables;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setInnerVersion(String innerVersion) {
            this.innerVersion = innerVersion;
            return this;
        }
        public String getInnerVersion() {
            return this.innerVersion;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setIosSymbol(String iosSymbol) {
            this.iosSymbol = iosSymbol;
            return this;
        }
        public String getIosSymbol() {
            return this.iosSymbol;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setIsRc(Integer isRc) {
            this.isRc = isRc;
            return this;
        }
        public Integer getIsRc() {
            return this.isRc;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setIsRelease(Integer isRelease) {
            this.isRelease = isRelease;
            return this;
        }
        public Integer getIsRelease() {
            return this.isRelease;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
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

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
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

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setQrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setReleaseWindow(String releaseWindow) {
            this.releaseWindow = releaseWindow;
            return this;
        }
        public String getReleaseWindow() {
            return this.releaseWindow;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setScmDownloadUrl(String scmDownloadUrl) {
            this.scmDownloadUrl = scmDownloadUrl;
            return this;
        }
        public String getScmDownloadUrl() {
            return this.scmDownloadUrl;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setServerVersion(Integer serverVersion) {
            this.serverVersion = serverVersion;
            return this;
        }
        public Integer getServerVersion() {
            return this.serverVersion;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setVerifyResult(Integer verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Integer getVerifyResult() {
            return this.verifyResult;
        }

        public GetMcubeUpgradePackageInfoResponseBodyGetPackageResultPackageInfoUpgradeBaseInfoDO setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
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
