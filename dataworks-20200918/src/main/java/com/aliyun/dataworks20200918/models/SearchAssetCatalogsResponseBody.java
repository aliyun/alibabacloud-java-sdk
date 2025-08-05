// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchAssetCatalogsResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchAssetCatalogsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchAssetCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetCatalogsResponseBody self = new SearchAssetCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAssetCatalogsResponseBody setData(SearchAssetCatalogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchAssetCatalogsResponseBodyData getData() {
        return this.data;
    }

    public SearchAssetCatalogsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchAssetCatalogsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchAssetCatalogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchAssetCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAssetCatalogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchAssetCatalogsResponseBodyDataDataList extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("ParentPath")
        public java.util.List<String> parentPath;

        @NameInMap("ParentUuid")
        public String parentUuid;

        @NameInMap("Uuid")
        public String uuid;

        public static SearchAssetCatalogsResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            SearchAssetCatalogsResponseBodyDataDataList self = new SearchAssetCatalogsResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public SearchAssetCatalogsResponseBodyDataDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setParentPath(java.util.List<String> parentPath) {
            this.parentPath = parentPath;
            return this;
        }
        public java.util.List<String> getParentPath() {
            return this.parentPath;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setParentUuid(String parentUuid) {
            this.parentUuid = parentUuid;
            return this;
        }
        public String getParentUuid() {
            return this.parentUuid;
        }

        public SearchAssetCatalogsResponseBodyDataDataList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class SearchAssetCatalogsResponseBodyData extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<SearchAssetCatalogsResponseBodyDataDataList> dataList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchAssetCatalogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchAssetCatalogsResponseBodyData self = new SearchAssetCatalogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchAssetCatalogsResponseBodyData setDataList(java.util.List<SearchAssetCatalogsResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<SearchAssetCatalogsResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public SearchAssetCatalogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAssetCatalogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAssetCatalogsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
