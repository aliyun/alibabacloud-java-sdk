// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryLoRaJoinPermissionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("JoinPermissions")
    public QueryLoRaJoinPermissionsResponseBodyJoinPermissions joinPermissions;

    /**
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryLoRaJoinPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLoRaJoinPermissionsResponseBody self = new QueryLoRaJoinPermissionsResponseBody();
        return TeaModel.build(map, self);
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

    public QueryLoRaJoinPermissionsResponseBody setJoinPermissions(QueryLoRaJoinPermissionsResponseBodyJoinPermissions joinPermissions) {
        this.joinPermissions = joinPermissions;
        return this;
    }
    public QueryLoRaJoinPermissionsResponseBodyJoinPermissions getJoinPermissions() {
        return this.joinPermissions;
    }

    public QueryLoRaJoinPermissionsResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
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

    public static class QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("ClassMode")
        public String classMode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>80***</p>
         */
        @NameInMap("JoinPermissionId")
        public String joinPermissionId;

        /**
         * <strong>example:</strong>
         * <p>ForTest</p>
         */
        @NameInMap("JoinPermissionName")
        public String joinPermissionName;

        /**
         * <strong>example:</strong>
         * <p>LOCAL</p>
         */
        @NameInMap("JoinPermissionType")
        public String joinPermissionType;

        /**
         * <strong>example:</strong>
         * <p>1375364789****</p>
         */
        @NameInMap("OwnerAliyunPk")
        public String ownerAliyunPk;

        public static QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission build(java.util.Map<String, ?> map) throws Exception {
            QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission self = new QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission();
            return TeaModel.build(map, self);
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setClassMode(String classMode) {
            this.classMode = classMode;
            return this;
        }
        public String getClassMode() {
            return this.classMode;
        }

        public QueryLoRaJoinPermissionsResponseBodyJoinPermissionsJoinPermission setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
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
