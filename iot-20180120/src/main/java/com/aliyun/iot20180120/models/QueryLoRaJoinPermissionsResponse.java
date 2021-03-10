// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLoRaJoinPermissionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("JoinPermissions")
    @Validation(required = true)
    public QueryLoRaJoinPermissionsResponseJoinPermissions joinPermissions;

    public static QueryLoRaJoinPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoRaJoinPermissionsResponse self = new QueryLoRaJoinPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoRaJoinPermissionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLoRaJoinPermissionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLoRaJoinPermissionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLoRaJoinPermissionsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLoRaJoinPermissionsResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryLoRaJoinPermissionsResponse setJoinPermissions(QueryLoRaJoinPermissionsResponseJoinPermissions joinPermissions) {
        this.joinPermissions = joinPermissions;
        return this;
    }
    public QueryLoRaJoinPermissionsResponseJoinPermissions getJoinPermissions() {
        return this.joinPermissions;
    }

    public static class QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission extends TeaModel {
        @NameInMap("JoinPermissionId")
        @Validation(required = true)
        public String joinPermissionId;

        @NameInMap("JoinPermissionName")
        @Validation(required = true)
        public String joinPermissionName;

        @NameInMap("JoinPermissionType")
        @Validation(required = true)
        public String joinPermissionType;

        @NameInMap("OwnerAliyunPk")
        @Validation(required = true)
        public String ownerAliyunPk;

        @NameInMap("Enabled")
        @Validation(required = true)
        public Boolean enabled;

        @NameInMap("ClassMode")
        @Validation(required = true)
        public String classMode;

        public static QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission build(java.util.Map<String, ?> map) throws Exception {
            QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission self = new QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission();
            return TeaModel.build(map, self);
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission setJoinPermissionId(String joinPermissionId) {
            this.joinPermissionId = joinPermissionId;
            return this;
        }
        public String getJoinPermissionId() {
            return this.joinPermissionId;
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission setJoinPermissionName(String joinPermissionName) {
            this.joinPermissionName = joinPermissionName;
            return this;
        }
        public String getJoinPermissionName() {
            return this.joinPermissionName;
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission setJoinPermissionType(String joinPermissionType) {
            this.joinPermissionType = joinPermissionType;
            return this;
        }
        public String getJoinPermissionType() {
            return this.joinPermissionType;
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission setOwnerAliyunPk(String ownerAliyunPk) {
            this.ownerAliyunPk = ownerAliyunPk;
            return this;
        }
        public String getOwnerAliyunPk() {
            return this.ownerAliyunPk;
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission setClassMode(String classMode) {
            this.classMode = classMode;
            return this;
        }
        public String getClassMode() {
            return this.classMode;
        }

    }

    public static class QueryLoRaJoinPermissionsResponseJoinPermissions extends TeaModel {
        @NameInMap("JoinPermission")
        @Validation(required = true)
        public java.util.List<QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission> joinPermission;

        public static QueryLoRaJoinPermissionsResponseJoinPermissions build(java.util.Map<String, ?> map) throws Exception {
            QueryLoRaJoinPermissionsResponseJoinPermissions self = new QueryLoRaJoinPermissionsResponseJoinPermissions();
            return TeaModel.build(map, self);
        }

        public QueryLoRaJoinPermissionsResponseJoinPermissions setJoinPermission(java.util.List<QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission> joinPermission) {
            this.joinPermission = joinPermission;
            return this;
        }
        public java.util.List<QueryLoRaJoinPermissionsResponseJoinPermissionsJoinPermission> getJoinPermission() {
            return this.joinPermission;
        }

    }

}
