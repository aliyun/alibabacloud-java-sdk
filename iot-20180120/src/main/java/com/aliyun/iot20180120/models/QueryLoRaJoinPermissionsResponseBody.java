// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLoRaJoinPermissionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("JoinPermissions")
    public QueryLoRaJoinPermissionsResponseBodyJoinPermissions joinPermissions;

    public static QueryLoRaJoinPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLoRaJoinPermissionsResponseBody self = new QueryLoRaJoinPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLoRaJoinPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLoRaJoinPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLoRaJoinPermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLoRaJoinPermissionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLoRaJoinPermissionsResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryLoRaJoinPermissionsResponseBody setJoinPermissions(QueryLoRaJoinPermissionsResponseBodyJoinPermissions joinPermissions) {
        this.joinPermissions = joinPermissions;
        return this;
    }
    public QueryLoRaJoinPermissionsResponseBodyJoinPermissions getJoinPermissions() {
        return this.joinPermissions;
    }

    public static class QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission extends TeaModel {
        @NameInMap("JoinPermissionId")
        public String joinPermissionId;

        @NameInMap("JoinPermissionName")
        public String joinPermissionName;

        @NameInMap("JoinPermissionType")
        public String joinPermissionType;

        @NameInMap("OwnerAliyunPk")
        public String ownerAliyunPk;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ClassMode")
        public String classMode;

        public static QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission build(java.util.Map<String, ?> map) throws Exception {
            QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission self = new QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission();
            return TeaModel.build(map, self);
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setJoinPermissionId(String joinPermissionId) {
            this.joinPermissionId = joinPermissionId;
            return this;
        }
        public String getJoinPermissionId() {
            return this.joinPermissionId;
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setJoinPermissionName(String joinPermissionName) {
            this.joinPermissionName = joinPermissionName;
            return this;
        }
        public String getJoinPermissionName() {
            return this.joinPermissionName;
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setJoinPermissionType(String joinPermissionType) {
            this.joinPermissionType = joinPermissionType;
            return this;
        }
        public String getJoinPermissionType() {
            return this.joinPermissionType;
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setOwnerAliyunPk(String ownerAliyunPk) {
            this.ownerAliyunPk = ownerAliyunPk;
            return this;
        }
        public String getOwnerAliyunPk() {
            return this.ownerAliyunPk;
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setClassMode(String classMode) {
            this.classMode = classMode;
            return this;
        }
        public String getClassMode() {
            return this.classMode;
        }

    }

    public static class QueryLoRaJoinPermissionsResponseBodyJoinPermissions extends TeaModel {
        @NameInMap("JoinPermission")
        public java.util.List<QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission> joinPermission;

        public static QueryLoRaJoinPermissionsResponseBodyJoinPermissions build(java.util.Map<String, ?> map) throws Exception {
            QueryLoRaJoinPermissionsResponseBodyJoinPermissions self = new QueryLoRaJoinPermissionsResponseBodyJoinPermissions();
            return TeaModel.build(map, self);
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissions setJoinPermission(java.util.List<QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission> joinPermission) {
            this.joinPermission = joinPermission;
            return this;
        }
        public java.util.List<QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission> getJoinPermission() {
            return this.joinPermission;
        }

    }

}
