// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InitializeServiceLinkRoleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A5E7D4E3-D30C-56C1-817F-F2B8CE6BXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InitializeServiceLinkRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeServiceLinkRoleResponseBody self = new InitializeServiceLinkRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeServiceLinkRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitializeServiceLinkRoleResponseBody setData(InitializeServiceLinkRoleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InitializeServiceLinkRoleResponseBodyData getData() {
        return this.data;
    }

    public InitializeServiceLinkRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitializeServiceLinkRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeServiceLinkRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InitializeServiceLinkRoleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ram:CreateServiceLinkedRole</p>
         */
        @NameInMap("RequiredPermission")
        public String requiredPermission;

        /**
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForMSE</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>mse.aliyuncs.com</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static InitializeServiceLinkRoleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InitializeServiceLinkRoleResponseBodyData self = new InitializeServiceLinkRoleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InitializeServiceLinkRoleResponseBodyData setRequiredPermission(String requiredPermission) {
            this.requiredPermission = requiredPermission;
            return this;
        }
        public String getRequiredPermission() {
            return this.requiredPermission;
        }

        public InitializeServiceLinkRoleResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public InitializeServiceLinkRoleResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
