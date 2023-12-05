// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeUpgradePackagesResponseBody extends TeaModel {
    @NameInMap("ListPackagesResult")
    public ListMcubeUpgradePackagesResponseBodyListPackagesResult listPackagesResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeUpgradePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeUpgradePackagesResponseBody self = new ListMcubeUpgradePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeUpgradePackagesResponseBody setListPackagesResult(ListMcubeUpgradePackagesResponseBodyListPackagesResult listPackagesResult) {
        this.listPackagesResult = listPackagesResult;
        return this;
    }
    public ListMcubeUpgradePackagesResponseBodyListPackagesResult getListPackagesResult() {
        return this.listPackagesResult;
    }

    public ListMcubeUpgradePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeUpgradePackagesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeUpgradePackagesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages extends TeaModel {
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

        public static ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages self = new ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages();
            return TeaModel.build(map, self);
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setAllowCreateTask(Boolean allowCreateTask) {
            this.allowCreateTask = allowCreateTask;
            return this;
        }
        public Boolean getAllowCreateTask() {
            return this.allowCreateTask;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setAppstoreUrl(String appstoreUrl) {
            this.appstoreUrl = appstoreUrl;
            return this;
        }
        public String getAppstoreUrl() {
            return this.appstoreUrl;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setBackLog(String backLog) {
            this.backLog = backLog;
            return this;
        }
        public String getBackLog() {
            return this.backLog;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setClientFileSize(Integer clientFileSize) {
            this.clientFileSize = clientFileSize;
            return this;
        }
        public Integer getClientFileSize() {
            return this.clientFileSize;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setCpId(String cpId) {
            this.cpId = cpId;
            return this;
        }
        public String getCpId() {
            return this.cpId;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGlobalVariables(String globalVariables) {
            this.globalVariables = globalVariables;
            return this;
        }
        public String getGlobalVariables() {
            return this.globalVariables;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setInnerVersion(String innerVersion) {
            this.innerVersion = innerVersion;
            return this;
        }
        public String getInnerVersion() {
            return this.innerVersion;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setIosSymbol(String iosSymbol) {
            this.iosSymbol = iosSymbol;
            return this;
        }
        public String getIosSymbol() {
            return this.iosSymbol;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setIsRc(Integer isRc) {
            this.isRc = isRc;
            return this;
        }
        public Integer getIsRc() {
            return this.isRc;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setIsRelease(Integer isRelease) {
            this.isRelease = isRelease;
            return this;
        }
        public Integer getIsRelease() {
            return this.isRelease;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setNeedCheck(Integer needCheck) {
            this.needCheck = needCheck;
            return this;
        }
        public Integer getNeedCheck() {
            return this.needCheck;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setPublishPeriod(Integer publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setQrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setReleaseWindow(String releaseWindow) {
            this.releaseWindow = releaseWindow;
            return this;
        }
        public String getReleaseWindow() {
            return this.releaseWindow;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setScmDownloadUrl(String scmDownloadUrl) {
            this.scmDownloadUrl = scmDownloadUrl;
            return this;
        }
        public String getScmDownloadUrl() {
            return this.scmDownloadUrl;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setServerVersion(Integer serverVersion) {
            this.serverVersion = serverVersion;
            return this;
        }
        public Integer getServerVersion() {
            return this.serverVersion;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setVerifyResult(Integer verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Integer getVerifyResult() {
            return this.verifyResult;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class ListMcubeUpgradePackagesResponseBodyListPackagesResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("Packages")
        public java.util.List<ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages> packages;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMcubeUpgradePackagesResponseBodyListPackagesResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeUpgradePackagesResponseBodyListPackagesResult self = new ListMcubeUpgradePackagesResponseBodyListPackagesResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setPackages(java.util.List<ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages> getPackages() {
            return this.packages;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
