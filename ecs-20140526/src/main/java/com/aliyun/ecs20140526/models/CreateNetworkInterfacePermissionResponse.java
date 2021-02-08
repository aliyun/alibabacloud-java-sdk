// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkInterfacePermission")
    @Validation(required = true)
    public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission networkInterfacePermission;

    public static CreateNetworkInterfacePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfacePermissionResponse self = new CreateNetworkInterfacePermissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfacePermissionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkInterfacePermissionResponse setNetworkInterfacePermission(CreateNetworkInterfacePermissionResponseNetworkInterfacePermission networkInterfacePermission) {
        this.networkInterfacePermission = networkInterfacePermission;
        return this;
    }
    public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission getNetworkInterfacePermission() {
        return this.networkInterfacePermission;
    }

    public static class CreateNetworkInterfacePermissionResponseNetworkInterfacePermission extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public Long accountId;

        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        @NameInMap("NetworkInterfacePermissionId")
        @Validation(required = true)
        public String networkInterfacePermissionId;

        @NameInMap("Permission")
        @Validation(required = true)
        public String permission;

        @NameInMap("PermissionState")
        @Validation(required = true)
        public String permissionState;

        public static CreateNetworkInterfacePermissionResponseNetworkInterfacePermission build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfacePermissionResponseNetworkInterfacePermission self = new CreateNetworkInterfacePermissionResponseNetworkInterfacePermission();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public CreateNetworkInterfacePermissionResponseNetworkInterfacePermission setPermissionState(String permissionState) {
            this.permissionState = permissionState;
            return this;
        }
        public String getPermissionState() {
            return this.permissionState;
        }

    }

}
