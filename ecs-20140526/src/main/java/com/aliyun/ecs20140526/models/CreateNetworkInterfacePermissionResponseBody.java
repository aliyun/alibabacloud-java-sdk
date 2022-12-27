// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionResponseBody extends TeaModel {
    // Details about the permission on the ENI.
    @NameInMap("NetworkInterfacePermission")
    public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission networkInterfacePermission;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkInterfacePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfacePermissionResponseBody self = new CreateNetworkInterfacePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfacePermissionResponseBody setNetworkInterfacePermission(CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission networkInterfacePermission) {
        this.networkInterfacePermission = networkInterfacePermission;
        return this;
    }
    public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission getNetworkInterfacePermission() {
        return this.networkInterfacePermission;
    }

    public CreateNetworkInterfacePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission extends TeaModel {
        // The ID of the Alibaba Cloud partner (a certified ISV).
        @NameInMap("AccountId")
        public Long accountId;

        // The ID of the ENI.
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        // The ID of the permission on the ENI.
        @NameInMap("NetworkInterfacePermissionId")
        public String networkInterfacePermissionId;

        // The permission on the ENI.
        @NameInMap("Permission")
        public String permission;

        // The status of the permission on the ENI. Valid values:
        // 
        // *   Pending: The permission is being granted.
        // *   Granted: The permission has been granted.
        // *   Revoking: The permission is being revoked.
        // *   Revoked: The permission has been revoked.
        @NameInMap("PermissionState")
        public String permissionState;

        // The name of the Alibaba Cloud service.
        @NameInMap("ServiceName")
        public String serviceName;

        public static CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission self = new CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setPermissionState(String permissionState) {
            this.permissionState = permissionState;
            return this;
        }
        public String getPermissionState() {
            return this.permissionState;
        }

        public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
