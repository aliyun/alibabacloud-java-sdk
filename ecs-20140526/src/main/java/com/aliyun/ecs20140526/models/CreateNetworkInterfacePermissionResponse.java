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

    }

}
