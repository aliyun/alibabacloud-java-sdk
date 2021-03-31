// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NetworkInterfacePermission")
    public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission networkInterfacePermission;

    public static CreateNetworkInterfacePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfacePermissionResponseBody self = new CreateNetworkInterfacePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfacePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkInterfacePermissionResponseBody setNetworkInterfacePermission(CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission networkInterfacePermission) {
        this.networkInterfacePermission = networkInterfacePermission;
        return this;
    }
    public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission getNetworkInterfacePermission() {
        return this.networkInterfacePermission;
    }

    public static class CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission extends TeaModel {
        @NameInMap("Permission")
        public String permission;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("NetworkInterfacePermissionId")
        public String networkInterfacePermissionId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("PermissionState")
        public String permissionState;

        public static CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission self = new CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setPermissionState(String permissionState) {
            this.permissionState = permissionState;
            return this;
        }
        public String getPermissionState() {
            return this.permissionState;
        }

    }

}
