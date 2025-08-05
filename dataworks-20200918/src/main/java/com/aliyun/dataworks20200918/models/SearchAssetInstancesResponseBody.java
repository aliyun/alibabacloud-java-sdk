// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchAssetInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchAssetInstancesResponseBodyData data;

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

    public static SearchAssetInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetInstancesResponseBody self = new SearchAssetInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAssetInstancesResponseBody setData(SearchAssetInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchAssetInstancesResponseBodyData getData() {
        return this.data;
    }

    public SearchAssetInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchAssetInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchAssetInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchAssetInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAssetInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchAssetInstancesResponseBodyDataDataList extends TeaModel {
        @NameInMap("CategoryPathNameList")
        public java.util.List<String> categoryPathNameList;

        @NameInMap("CategoryUuid")
        public String categoryUuid;

        @NameInMap("Code")
        public String code;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GmtOnline")
        public Long gmtOnline;

        @NameInMap("GmtStorage")
        public Long gmtStorage;

        @NameInMap("MetricsMap")
        public java.util.Map<String, ?> metricsMap;

        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("ModifierName")
        public String modifierName;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectDefineShowName")
        public String objectDefineShowName;

        @NameInMap("ObjectDefineUuid")
        public String objectDefineUuid;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("Uuid")
        public String uuid;

        public static SearchAssetInstancesResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            SearchAssetInstancesResponseBodyDataDataList self = new SearchAssetInstancesResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public SearchAssetInstancesResponseBodyDataDataList setCategoryPathNameList(java.util.List<String> categoryPathNameList) {
            this.categoryPathNameList = categoryPathNameList;
            return this;
        }
        public java.util.List<String> getCategoryPathNameList() {
            return this.categoryPathNameList;
        }

        public SearchAssetInstancesResponseBodyDataDataList setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public SearchAssetInstancesResponseBodyDataDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SearchAssetInstancesResponseBodyDataDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchAssetInstancesResponseBodyDataDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchAssetInstancesResponseBodyDataDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SearchAssetInstancesResponseBodyDataDataList setGmtOnline(Long gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public Long getGmtOnline() {
            return this.gmtOnline;
        }

        public SearchAssetInstancesResponseBodyDataDataList setGmtStorage(Long gmtStorage) {
            this.gmtStorage = gmtStorage;
            return this;
        }
        public Long getGmtStorage() {
            return this.gmtStorage;
        }

        public SearchAssetInstancesResponseBodyDataDataList setMetricsMap(java.util.Map<String, ?> metricsMap) {
            this.metricsMap = metricsMap;
            return this;
        }
        public java.util.Map<String, ?> getMetricsMap() {
            return this.metricsMap;
        }

        public SearchAssetInstancesResponseBodyDataDataList setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public SearchAssetInstancesResponseBodyDataDataList setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public SearchAssetInstancesResponseBodyDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchAssetInstancesResponseBodyDataDataList setObjectDefineShowName(String objectDefineShowName) {
            this.objectDefineShowName = objectDefineShowName;
            return this;
        }
        public String getObjectDefineShowName() {
            return this.objectDefineShowName;
        }

        public SearchAssetInstancesResponseBodyDataDataList setObjectDefineUuid(String objectDefineUuid) {
            this.objectDefineUuid = objectDefineUuid;
            return this;
        }
        public String getObjectDefineUuid() {
            return this.objectDefineUuid;
        }

        public SearchAssetInstancesResponseBodyDataDataList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SearchAssetInstancesResponseBodyDataDataList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public SearchAssetInstancesResponseBodyDataDataList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class SearchAssetInstancesResponseBodyData extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<SearchAssetInstancesResponseBodyDataDataList> dataList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchAssetInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchAssetInstancesResponseBodyData self = new SearchAssetInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchAssetInstancesResponseBodyData setDataList(java.util.List<SearchAssetInstancesResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<SearchAssetInstancesResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public SearchAssetInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchAssetInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchAssetInstancesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
