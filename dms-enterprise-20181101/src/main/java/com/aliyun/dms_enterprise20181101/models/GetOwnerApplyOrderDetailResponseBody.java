// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOwnerApplyOrderDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("OwnerApplyOrderDetail")
    public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail ownerApplyOrderDetail;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOwnerApplyOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerApplyOrderDetailResponseBody self = new GetOwnerApplyOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOwnerApplyOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOwnerApplyOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOwnerApplyOrderDetailResponseBody setOwnerApplyOrderDetail(GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail ownerApplyOrderDetail) {
        this.ownerApplyOrderDetail = ownerApplyOrderDetail;
        return this;
    }
    public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail getOwnerApplyOrderDetail() {
        return this.ownerApplyOrderDetail;
    }

    public GetOwnerApplyOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOwnerApplyOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail extends TeaModel {
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("OwnerIds")
        public java.util.List<Long> ownerIds;

        @NameInMap("OwnerNickNames")
        public java.util.List<String> ownerNickNames;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("TableName")
        public String tableName;

        public static GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail self = new GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail();
            return TeaModel.build(map, self);
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail setOwnerIds(java.util.List<Long> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail setOwnerNickNames(java.util.List<String> ownerNickNames) {
            this.ownerNickNames = ownerNickNames;
            return this;
        }
        public java.util.List<String> getOwnerNickNames() {
            return this.ownerNickNames;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources extends TeaModel {
        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("ResourceDetail")
        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail resourceDetail;

        @NameInMap("TargetId")
        public String targetId;

        public static GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources build(java.util.Map<String, ?> map) throws Exception {
            GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources self = new GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources();
            return TeaModel.build(map, self);
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources setResourceDetail(GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail resourceDetail) {
            this.resourceDetail = resourceDetail;
            return this;
        }
        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResourcesResourceDetail getResourceDetail() {
            return this.resourceDetail;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

    public static class GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail extends TeaModel {
        @NameInMap("ApplyType")
        public String applyType;

        @NameInMap("Resources")
        public java.util.List<GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources> resources;

        public static GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail self = new GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail setApplyType(String applyType) {
            this.applyType = applyType;
            return this;
        }
        public String getApplyType() {
            return this.applyType;
        }

        public GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetail setResources(java.util.List<GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<GetOwnerApplyOrderDetailResponseBodyOwnerApplyOrderDetailResources> getResources() {
            return this.resources;
        }

    }

}
