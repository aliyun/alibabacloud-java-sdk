// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaResourcesResponseBody extends TeaModel {
    @NameInMap("ListMcubeNebulaResourceResult")
    public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult listMcubeNebulaResourceResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeNebulaResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeNebulaResourcesResponseBody self = new ListMcubeNebulaResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeNebulaResourcesResponseBody setListMcubeNebulaResourceResult(ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult listMcubeNebulaResourceResult) {
        this.listMcubeNebulaResourceResult = listMcubeNebulaResourceResult;
        return this;
    }
    public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult getListMcubeNebulaResourceResult() {
        return this.listMcubeNebulaResourceResult;
    }

    public ListMcubeNebulaResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeNebulaResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeNebulaResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo extends TeaModel {
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

        @NameInMap("DebugUrl")
        public String debugUrl;

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

        @NameInMap("LazyLoad")
        public Integer lazyLoad;

        @NameInMap("MainUrl")
        public String mainUrl;

        @NameInMap("Md5")
        public String md5;

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

        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Vhost")
        public String vhost;

        public static ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo self = new ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo();
            return TeaModel.build(map, self);
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setAutoInstall(Integer autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Integer getAutoInstall() {
            return this.autoInstall;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setClientVersionMax(String clientVersionMax) {
            this.clientVersionMax = clientVersionMax;
            return this;
        }
        public String getClientVersionMax() {
            return this.clientVersionMax;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setClientVersionMin(String clientVersionMin) {
            this.clientVersionMin = clientVersionMin;
            return this;
        }
        public String getClientVersionMin() {
            return this.clientVersionMin;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }
        public String getDebugUrl() {
            return this.debugUrl;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setFallbackBaseUrl(String fallbackBaseUrl) {
            this.fallbackBaseUrl = fallbackBaseUrl;
            return this;
        }
        public String getFallbackBaseUrl() {
            return this.fallbackBaseUrl;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setH5Version(String h5Version) {
            this.h5Version = h5Version;
            return this;
        }
        public String getH5Version() {
            return this.h5Version;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setInstallType(Integer installType) {
            this.installType = installType;
            return this;
        }
        public Integer getInstallType() {
            return this.installType;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setLazyLoad(Integer lazyLoad) {
            this.lazyLoad = lazyLoad;
            return this;
        }
        public Integer getLazyLoad() {
            return this.lazyLoad;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setMainUrl(String mainUrl) {
            this.mainUrl = mainUrl;
            return this;
        }
        public String getMainUrl() {
            return this.mainUrl;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setMetaId(Long metaId) {
            this.metaId = metaId;
            return this;
        }
        public Long getMetaId() {
            return this.metaId;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setPackageType(Integer packageType) {
            this.packageType = packageType;
            return this;
        }
        public Integer getPackageType() {
            return this.packageType;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setPublishPeriod(Integer publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo setVhost(String vhost) {
            this.vhost = vhost;
            return this;
        }
        public String getVhost() {
            return this.vhost;
        }

    }

    public static class ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("NebulaResourceInfo")
        public java.util.List<ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo> nebulaResourceInfo;

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

        public static ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult self = new ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setNebulaResourceInfo(java.util.List<ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo> nebulaResourceInfo) {
            this.nebulaResourceInfo = nebulaResourceInfo;
            return this;
        }
        public java.util.List<ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResultNebulaResourceInfo> getNebulaResourceInfo() {
            return this.nebulaResourceInfo;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeNebulaResourcesResponseBodyListMcubeNebulaResourceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
