// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetAssetInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAssetInstanceResponseBodyData data;

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

    public static GetAssetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetInstanceResponseBody self = new GetAssetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetInstanceResponseBody setData(GetAssetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAssetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetAssetInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAssetInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAssetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAssetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAssetInstanceResponseBodyData extends TeaModel {
        @NameInMap("CategoryPathNameList")
        public java.util.List<String> categoryPathNameList;

        @NameInMap("CategoryUuid")
        public String categoryUuid;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("CustomInfo")
        public java.util.Map<String, ?> customInfo;

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

        public static GetAssetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssetInstanceResponseBodyData self = new GetAssetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAssetInstanceResponseBodyData setCategoryPathNameList(java.util.List<String> categoryPathNameList) {
            this.categoryPathNameList = categoryPathNameList;
            return this;
        }
        public java.util.List<String> getCategoryPathNameList() {
            return this.categoryPathNameList;
        }

        public GetAssetInstanceResponseBodyData setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public GetAssetInstanceResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetAssetInstanceResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetAssetInstanceResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetAssetInstanceResponseBodyData setCustomInfo(java.util.Map<String, ?> customInfo) {
            this.customInfo = customInfo;
            return this;
        }
        public java.util.Map<String, ?> getCustomInfo() {
            return this.customInfo;
        }

        public GetAssetInstanceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAssetInstanceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAssetInstanceResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAssetInstanceResponseBodyData setGmtOnline(Long gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public Long getGmtOnline() {
            return this.gmtOnline;
        }

        public GetAssetInstanceResponseBodyData setGmtStorage(Long gmtStorage) {
            this.gmtStorage = gmtStorage;
            return this;
        }
        public Long getGmtStorage() {
            return this.gmtStorage;
        }

        public GetAssetInstanceResponseBodyData setMetricsMap(java.util.Map<String, ?> metricsMap) {
            this.metricsMap = metricsMap;
            return this;
        }
        public java.util.Map<String, ?> getMetricsMap() {
            return this.metricsMap;
        }

        public GetAssetInstanceResponseBodyData setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetAssetInstanceResponseBodyData setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetAssetInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAssetInstanceResponseBodyData setObjectDefineShowName(String objectDefineShowName) {
            this.objectDefineShowName = objectDefineShowName;
            return this;
        }
        public String getObjectDefineShowName() {
            return this.objectDefineShowName;
        }

        public GetAssetInstanceResponseBodyData setObjectDefineUuid(String objectDefineUuid) {
            this.objectDefineUuid = objectDefineUuid;
            return this;
        }
        public String getObjectDefineUuid() {
            return this.objectDefineUuid;
        }

        public GetAssetInstanceResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetAssetInstanceResponseBodyData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetAssetInstanceResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
