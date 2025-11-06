// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListMdsCubeResourcesResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMdsCubeResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeResourcesResponseBody self = new ListMdsCubeResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMdsCubeResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMdsCubeResourcesResponseBody setResultContent(ListMdsCubeResourcesResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListMdsCubeResourcesResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListMdsCubeResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMdsCubeResourcesResponseBodyResultContentDataContentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("AndroidMaxVersion")
        public String androidMaxVersion;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("AndroidMinVersion")
        public String androidMinVersion;

        /**
         * <strong>example:</strong>
         * <p>570DA89281533-default</p>
         */
        @NameInMap("AppCode")
        public String appCode;

        /**
         * <strong>example:</strong>
         * <p>1fbfd6c422762c7083f3bb01c638e48e</p>
         */
        @NameInMap("BinFileMd5")
        public String binFileMd5;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("BinPrivateFileUrl")
        public String binPrivateFileUrl;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("BinPublicFileUrl")
        public String binPublicFileUrl;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <strong>example:</strong>
         * <p>2025-10-24 16:42:45</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-10-24 16:42:45</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("IosMaxVersion")
        public String iosMaxVersion;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("IosMinVersion")
        public String iosMinVersion;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("JsonPrivateFileUrl")
        public String jsonPrivateFileUrl;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("JsonPublicFileUrl")
        public String jsonPublicFileUrl;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("MinCubeSdkVersion")
        public String minCubeSdkVersion;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("MockDataDownloadUrl")
        public String mockDataDownloadUrl;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>Android</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("PreviewPictureUrl")
        public String previewPictureUrl;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ResourceStatus")
        public Long resourceStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>test_template</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>resource desc</p>
         */
        @NameInMap("TemplateResourceDesc")
        public String templateResourceDesc;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("TemplateResourceVersion")
        public String templateResourceVersion;

        public static ListMdsCubeResourcesResponseBodyResultContentDataContentList build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeResourcesResponseBodyResultContentDataContentList self = new ListMdsCubeResourcesResponseBodyResultContentDataContentList();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setAndroidMaxVersion(String androidMaxVersion) {
            this.androidMaxVersion = androidMaxVersion;
            return this;
        }
        public String getAndroidMaxVersion() {
            return this.androidMaxVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setAndroidMinVersion(String androidMinVersion) {
            this.androidMinVersion = androidMinVersion;
            return this;
        }
        public String getAndroidMinVersion() {
            return this.androidMinVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setBinFileMd5(String binFileMd5) {
            this.binFileMd5 = binFileMd5;
            return this;
        }
        public String getBinFileMd5() {
            return this.binFileMd5;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setBinPrivateFileUrl(String binPrivateFileUrl) {
            this.binPrivateFileUrl = binPrivateFileUrl;
            return this;
        }
        public String getBinPrivateFileUrl() {
            return this.binPrivateFileUrl;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setBinPublicFileUrl(String binPublicFileUrl) {
            this.binPublicFileUrl = binPublicFileUrl;
            return this;
        }
        public String getBinPublicFileUrl() {
            return this.binPublicFileUrl;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setIosMaxVersion(String iosMaxVersion) {
            this.iosMaxVersion = iosMaxVersion;
            return this;
        }
        public String getIosMaxVersion() {
            return this.iosMaxVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setIosMinVersion(String iosMinVersion) {
            this.iosMinVersion = iosMinVersion;
            return this;
        }
        public String getIosMinVersion() {
            return this.iosMinVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setJsonPrivateFileUrl(String jsonPrivateFileUrl) {
            this.jsonPrivateFileUrl = jsonPrivateFileUrl;
            return this;
        }
        public String getJsonPrivateFileUrl() {
            return this.jsonPrivateFileUrl;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setJsonPublicFileUrl(String jsonPublicFileUrl) {
            this.jsonPublicFileUrl = jsonPublicFileUrl;
            return this;
        }
        public String getJsonPublicFileUrl() {
            return this.jsonPublicFileUrl;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setMinCubeSdkVersion(String minCubeSdkVersion) {
            this.minCubeSdkVersion = minCubeSdkVersion;
            return this;
        }
        public String getMinCubeSdkVersion() {
            return this.minCubeSdkVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setMockDataDownloadUrl(String mockDataDownloadUrl) {
            this.mockDataDownloadUrl = mockDataDownloadUrl;
            return this;
        }
        public String getMockDataDownloadUrl() {
            return this.mockDataDownloadUrl;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setPreviewPictureUrl(String previewPictureUrl) {
            this.previewPictureUrl = previewPictureUrl;
            return this;
        }
        public String getPreviewPictureUrl() {
            return this.previewPictureUrl;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setResourceStatus(Long resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public Long getResourceStatus() {
            return this.resourceStatus;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setTemplateResourceDesc(String templateResourceDesc) {
            this.templateResourceDesc = templateResourceDesc;
            return this;
        }
        public String getTemplateResourceDesc() {
            return this.templateResourceDesc;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContentList setTemplateResourceVersion(String templateResourceVersion) {
            this.templateResourceVersion = templateResourceVersion;
            return this;
        }
        public String getTemplateResourceVersion() {
            return this.templateResourceVersion;
        }

    }

    public static class ListMdsCubeResourcesResponseBodyResultContentDataContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("CurrentMaxAndroidVersion")
        public String currentMaxAndroidVersion;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.1</p>
         */
        @NameInMap("CurrentMaxIosVersion")
        public String currentMaxIosVersion;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FirstPage")
        public Boolean firstPage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FirstResult")
        public Long firstResult;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LastPage")
        public Boolean lastPage;

        @NameInMap("List")
        public java.util.List<ListMdsCubeResourcesResponseBodyResultContentDataContentList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextPage")
        public Long nextPage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrePage")
        public Long prePage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMdsCubeResourcesResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeResourcesResponseBodyResultContentDataContent self = new ListMdsCubeResourcesResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setCurrentMaxAndroidVersion(String currentMaxAndroidVersion) {
            this.currentMaxAndroidVersion = currentMaxAndroidVersion;
            return this;
        }
        public String getCurrentMaxAndroidVersion() {
            return this.currentMaxAndroidVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setCurrentMaxIosVersion(String currentMaxIosVersion) {
            this.currentMaxIosVersion = currentMaxIosVersion;
            return this;
        }
        public String getCurrentMaxIosVersion() {
            return this.currentMaxIosVersion;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setFirstPage(Boolean firstPage) {
            this.firstPage = firstPage;
            return this;
        }
        public Boolean getFirstPage() {
            return this.firstPage;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setFirstResult(Long firstResult) {
            this.firstResult = firstResult;
            return this;
        }
        public Long getFirstResult() {
            return this.firstResult;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setLastPage(Boolean lastPage) {
            this.lastPage = lastPage;
            return this;
        }
        public Boolean getLastPage() {
            return this.lastPage;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setList(java.util.List<ListMdsCubeResourcesResponseBodyResultContentDataContentList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMdsCubeResourcesResponseBodyResultContentDataContentList> getList() {
            return this.list;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setNextPage(Long nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Long getNextPage() {
            return this.nextPage;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setPrePage(Long prePage) {
            this.prePage = prePage;
            return this;
        }
        public Long getPrePage() {
            return this.prePage;
        }

        public ListMdsCubeResourcesResponseBodyResultContentDataContent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListMdsCubeResourcesResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public ListMdsCubeResourcesResponseBodyResultContentDataContent content;

        /**
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ListMdsCubeResourcesResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeResourcesResponseBodyResultContentData self = new ListMdsCubeResourcesResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeResourcesResponseBodyResultContentData setContent(ListMdsCubeResourcesResponseBodyResultContentDataContent content) {
            this.content = content;
            return this;
        }
        public ListMdsCubeResourcesResponseBodyResultContentDataContent getContent() {
            return this.content;
        }

        public ListMdsCubeResourcesResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMdsCubeResourcesResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMdsCubeResourcesResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMdsCubeResourcesResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ListMdsCubeResourcesResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ListMdsCubeResourcesResponseBodyResultContentData data;

        /**
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static ListMdsCubeResourcesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeResourcesResponseBodyResultContent self = new ListMdsCubeResourcesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeResourcesResponseBodyResultContent setData(ListMdsCubeResourcesResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ListMdsCubeResourcesResponseBodyResultContentData getData() {
            return this.data;
        }

        public ListMdsCubeResourcesResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
