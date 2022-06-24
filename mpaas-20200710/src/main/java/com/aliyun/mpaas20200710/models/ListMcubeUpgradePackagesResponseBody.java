// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

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

        @NameInMap("Md5")
        public String md5;

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

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishPeriod")
        public Integer publishPeriod;

        @NameInMap("VerificationCode")
        public String verificationCode;

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

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setChangeLog(String changeLog) {
            this.changeLog = changeLog;
            return this;
        }
        public String getChangeLog() {
            return this.changeLog;
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

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
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

        public ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }
        public String getVerificationCode() {
            return this.verificationCode;
        }

    }

    public static class ListMcubeUpgradePackagesResponseBodyListPackagesResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Packages")
        public java.util.List<ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages> packages;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMcubeUpgradePackagesResponseBodyListPackagesResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeUpgradePackagesResponseBodyListPackagesResult self = new ListMcubeUpgradePackagesResponseBodyListPackagesResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeUpgradePackagesResponseBodyListPackagesResult setPackages(java.util.List<ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<ListMcubeUpgradePackagesResponseBodyListPackagesResultPackages> getPackages() {
            return this.packages;
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

    }

}
