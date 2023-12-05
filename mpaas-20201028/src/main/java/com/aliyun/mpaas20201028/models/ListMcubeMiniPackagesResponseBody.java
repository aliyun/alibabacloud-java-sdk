// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniPackagesResponseBody extends TeaModel {
    @NameInMap("ListMiniPackageResult")
    public ListMcubeMiniPackagesResponseBodyListMiniPackageResult listMiniPackageResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeMiniPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniPackagesResponseBody self = new ListMcubeMiniPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniPackagesResponseBody setListMiniPackageResult(ListMcubeMiniPackagesResponseBodyListMiniPackageResult listMiniPackageResult) {
        this.listMiniPackageResult = listMiniPackageResult;
        return this;
    }
    public ListMcubeMiniPackagesResponseBodyListMiniPackageResult getListMiniPackageResult() {
        return this.listMiniPackageResult;
    }

    public ListMcubeMiniPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeMiniPackagesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeMiniPackagesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AutoInstall")
        public Long autoInstall;

        @NameInMap("ClientVersionMax")
        public String clientVersionMax;

        @NameInMap("ClientVersionMin")
        public String clientVersionMin;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("FallbackBaseUrl")
        public String fallbackBaseUrl;

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
        public Long installType;

        @NameInMap("MainUrl")
        public String mainUrl;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("PackageType")
        public Long packageType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PublishPeriod")
        public Long publishPeriod;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("Status")
        public Long status;

        public static ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList self = new ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList();
            return TeaModel.build(map, self);
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setAutoInstall(Long autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Long getAutoInstall() {
            return this.autoInstall;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setClientVersionMax(String clientVersionMax) {
            this.clientVersionMax = clientVersionMax;
            return this;
        }
        public String getClientVersionMax() {
            return this.clientVersionMax;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setClientVersionMin(String clientVersionMin) {
            this.clientVersionMin = clientVersionMin;
            return this;
        }
        public String getClientVersionMin() {
            return this.clientVersionMin;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setFallbackBaseUrl(String fallbackBaseUrl) {
            this.fallbackBaseUrl = fallbackBaseUrl;
            return this;
        }
        public String getFallbackBaseUrl() {
            return this.fallbackBaseUrl;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setH5Version(String h5Version) {
            this.h5Version = h5Version;
            return this;
        }
        public String getH5Version() {
            return this.h5Version;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setInstallType(Long installType) {
            this.installType = installType;
            return this;
        }
        public Long getInstallType() {
            return this.installType;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setMainUrl(String mainUrl) {
            this.mainUrl = mainUrl;
            return this;
        }
        public String getMainUrl() {
            return this.mainUrl;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setPackageType(Long packageType) {
            this.packageType = packageType;
            return this;
        }
        public Long getPackageType() {
            return this.packageType;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setPublishPeriod(Long publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class ListMcubeMiniPackagesResponseBodyListMiniPackageResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("MiniPackageList")
        public java.util.List<ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList> miniPackageList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListMcubeMiniPackagesResponseBodyListMiniPackageResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniPackagesResponseBodyListMiniPackageResult self = new ListMcubeMiniPackagesResponseBodyListMiniPackageResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setMiniPackageList(java.util.List<ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList> miniPackageList) {
            this.miniPackageList = miniPackageList;
            return this;
        }
        public java.util.List<ListMcubeMiniPackagesResponseBodyListMiniPackageResultMiniPackageList> getMiniPackageList() {
            return this.miniPackageList;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeMiniPackagesResponseBodyListMiniPackageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
