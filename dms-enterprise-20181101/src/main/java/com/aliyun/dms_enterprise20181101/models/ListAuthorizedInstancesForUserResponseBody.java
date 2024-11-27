// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedInstancesForUserResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListAuthorizedInstancesForUserResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>B7DB89CC-017D-5503-8953-38FFE241A618</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAuthorizedInstancesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedInstancesForUserResponseBody self = new ListAuthorizedInstancesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedInstancesForUserResponseBody setInstances(java.util.List<ListAuthorizedInstancesForUserResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListAuthorizedInstancesForUserResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListAuthorizedInstancesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <strong>example:</strong>
         * <p>2024-12-06 10:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>CORRECT</p>
         */
        @NameInMap("PermType")
        public String permType;

        public static ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail self = new ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail setPermType(String permType) {
            this.permType = permType;
            return this;
        }
        public String getPermType() {
            return this.permType;
        }

    }

    public static class ListAuthorizedInstancesForUserResponseBodyInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>rm-2zex9lrc0gz0****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>DMS_TEST</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <strong>example:</strong>
         * <p>21****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PermissionDetail")
        public ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail permissionDetail;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>user_test</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListAuthorizedInstancesForUserResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedInstancesForUserResponseBodyInstances self = new ListAuthorizedInstancesForUserResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setPermissionDetail(ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail permissionDetail) {
            this.permissionDetail = permissionDetail;
            return this;
        }
        public ListAuthorizedInstancesForUserResponseBodyInstancesPermissionDetail getPermissionDetail() {
            return this.permissionDetail;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAuthorizedInstancesForUserResponseBodyInstances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
