// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaResourceResponseBody extends TeaModel {
    @NameInMap("GetNebulaResourceResult")
    public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult getNebulaResourceResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMcubeNebulaResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaResourceResponseBody self = new GetMcubeNebulaResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaResourceResponseBody setGetNebulaResourceResult(GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult getNebulaResourceResult) {
        this.getNebulaResourceResult = getNebulaResourceResult;
        return this;
    }
    public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult getGetNebulaResourceResult() {
        return this.getNebulaResourceResult;
    }

    public GetMcubeNebulaResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcubeNebulaResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMcubeNebulaResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AutoInstall")
        public Integer autoInstall;

        @NameInMap("ClientVersionMax")
        public String clientVersionMax;

        @NameInMap("ClientVersionMin")
        public String clientVersionMin;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("FallbackBaseUrl")
        public String fallbackBaseUrl;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("H5Version")
        public String h5Version;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstallType")
        public Integer installType;

        @NameInMap("MainUrl")
        public String mainUrl;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("MetaId")
        public Long metaId;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("PackageType")
        public Integer packageType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PublishPeriod")
        public Integer publishPeriod;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Vhost")
        public String vhost;

        public static GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo self = new GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo();
            return TeaModel.build(map, self);
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setAutoInstall(Integer autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Integer getAutoInstall() {
            return this.autoInstall;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setClientVersionMax(String clientVersionMax) {
            this.clientVersionMax = clientVersionMax;
            return this;
        }
        public String getClientVersionMax() {
            return this.clientVersionMax;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setClientVersionMin(String clientVersionMin) {
            this.clientVersionMin = clientVersionMin;
            return this;
        }
        public String getClientVersionMin() {
            return this.clientVersionMin;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setFallbackBaseUrl(String fallbackBaseUrl) {
            this.fallbackBaseUrl = fallbackBaseUrl;
            return this;
        }
        public String getFallbackBaseUrl() {
            return this.fallbackBaseUrl;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setH5Version(String h5Version) {
            this.h5Version = h5Version;
            return this;
        }
        public String getH5Version() {
            return this.h5Version;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setInstallType(Integer installType) {
            this.installType = installType;
            return this;
        }
        public Integer getInstallType() {
            return this.installType;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setMainUrl(String mainUrl) {
            this.mainUrl = mainUrl;
            return this;
        }
        public String getMainUrl() {
            return this.mainUrl;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setMetaId(Long metaId) {
            this.metaId = metaId;
            return this;
        }
        public Long getMetaId() {
            return this.metaId;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setPackageType(Integer packageType) {
            this.packageType = packageType;
            return this;
        }
        public Integer getPackageType() {
            return this.packageType;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setPublishPeriod(Integer publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo setVhost(String vhost) {
            this.vhost = vhost;
            return this;
        }
        public String getVhost() {
            return this.vhost;
        }

    }

    public static class GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("NebulaResourceInfo")
        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo nebulaResourceInfo;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult self = new GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult();
            return TeaModel.build(map, self);
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult setNebulaResourceInfo(GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo nebulaResourceInfo) {
            this.nebulaResourceInfo = nebulaResourceInfo;
            return this;
        }
        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResultNebulaResourceInfo getNebulaResourceInfo() {
            return this.nebulaResourceInfo;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetMcubeNebulaResourceResponseBodyGetNebulaResourceResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
