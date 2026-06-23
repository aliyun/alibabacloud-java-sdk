// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeHotpatchResourcesResponseBody extends TeaModel {
    @NameInMap("ListHotpatchResourceResult")
    public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult listHotpatchResourceResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeHotpatchResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeHotpatchResourcesResponseBody self = new ListMcubeHotpatchResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeHotpatchResourcesResponseBody setListHotpatchResourceResult(ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult listHotpatchResourceResult) {
        this.listHotpatchResourceResult = listHotpatchResourceResult;
        return this;
    }
    public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult getListHotpatchResourceResult() {
        return this.listHotpatchResourceResult;
    }

    public ListMcubeHotpatchResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeHotpatchResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeHotpatchResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HotpatchVersion")
        public String hotpatchVersion;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("PackageId")
        public Long packageId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishPeriod")
        public Long publishPeriod;

        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("SourceName")
        public String sourceName;

        public static ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo self = new ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo();
            return TeaModel.build(map, self);
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setHotpatchVersion(String hotpatchVersion) {
            this.hotpatchVersion = hotpatchVersion;
            return this;
        }
        public String getHotpatchVersion() {
            return this.hotpatchVersion;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setPublishPeriod(Long publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

    }

    public static class ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("HotpatchResourceInfo")
        public java.util.List<ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo> hotpatchResourceInfo;

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

        public static ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult self = new ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setHotpatchResourceInfo(java.util.List<ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo> hotpatchResourceInfo) {
            this.hotpatchResourceInfo = hotpatchResourceInfo;
            return this;
        }
        public java.util.List<ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResultHotpatchResourceInfo> getHotpatchResourceInfo() {
            return this.hotpatchResourceInfo;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeHotpatchResourcesResponseBodyListHotpatchResourceResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
