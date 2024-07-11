// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstanceUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7D162AAE-6501-5691-BF14-D7018F662895</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The permissions of the user on the instance.</p>
     */
    @NameInMap("UserPermissions")
    public ListInstanceUserPermissionsResponseBodyUserPermissions userPermissions;

    public static ListInstanceUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceUserPermissionsResponseBody self = new ListInstanceUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceUserPermissionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstanceUserPermissionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInstanceUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceUserPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstanceUserPermissionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListInstanceUserPermissionsResponseBody setUserPermissions(ListInstanceUserPermissionsResponseBodyUserPermissions userPermissions) {
        this.userPermissions = userPermissions;
        return this;
    }
    public ListInstanceUserPermissionsResponseBodyUserPermissions getUserPermissions() {
        return this.userPermissions;
    }

    public static class ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail extends TeaModel {
        /**
         * <p>The time when the permissions were granted.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-12 00:00:00</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The time when the permissions expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-12 00:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("ExtraData")
        public String extraData;

        /**
         * <p>The user who grants the permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx authorization</p>
         */
        @NameInMap("OriginFrom")
        public String originFrom;

        /**
         * <p>The type of the permissions. Valid values:</p>
         * <ul>
         * <li>LOGIN: the logon permissions</li>
         * <li>PERF: the query permissions on the instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOGIN</p>
         */
        @NameInMap("PermType")
        public String permType;

        /**
         * <p>The ID of the authorization record.</p>
         * 
         * <strong>example:</strong>
         * <p>773****</p>
         */
        @NameInMap("UserAccessId")
        public String userAccessId;

        public static ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail self = new ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail();
            return TeaModel.build(map, self);
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setOriginFrom(String originFrom) {
            this.originFrom = originFrom;
            return this;
        }
        public String getOriginFrom() {
            return this.originFrom;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setPermType(String permType) {
            this.permType = permType;
            return this;
        }
        public String getPermType() {
            return this.permType;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setUserAccessId(String userAccessId) {
            this.userAccessId = userAccessId;
            return this;
        }
        public String getUserAccessId() {
            return this.userAccessId;
        }

    }

    public static class ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails extends TeaModel {
        @NameInMap("PermDetail")
        public java.util.List<ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> permDetail;

        public static ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails self = new ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails();
            return TeaModel.build(map, self);
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails setPermDetail(java.util.List<ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> permDetail) {
            this.permDetail = permDetail;
            return this;
        }
        public java.util.List<ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> getPermDetail() {
            return this.permDetail;
        }

    }

    public static class ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>174****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The details of permissions.</p>
         */
        @NameInMap("PermDetails")
        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test_nick_name</p>
         */
        @NameInMap("UserNickName")
        public String userNickName;

        public static ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission self = new ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission();
            return TeaModel.build(map, self);
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission setPermDetails(ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails) {
            this.permDetails = permDetails;
            return this;
        }
        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails getPermDetails() {
            return this.permDetails;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission setUserNickName(String userNickName) {
            this.userNickName = userNickName;
            return this;
        }
        public String getUserNickName() {
            return this.userNickName;
        }

    }

    public static class ListInstanceUserPermissionsResponseBodyUserPermissions extends TeaModel {
        @NameInMap("UserPermission")
        public java.util.List<ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission> userPermission;

        public static ListInstanceUserPermissionsResponseBodyUserPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceUserPermissionsResponseBodyUserPermissions self = new ListInstanceUserPermissionsResponseBodyUserPermissions();
            return TeaModel.build(map, self);
        }

        public ListInstanceUserPermissionsResponseBodyUserPermissions setUserPermission(java.util.List<ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission> userPermission) {
            this.userPermission = userPermission;
            return this;
        }
        public java.util.List<ListInstanceUserPermissionsResponseBodyUserPermissionsUserPermission> getUserPermission() {
            return this.userPermission;
        }

    }

}
