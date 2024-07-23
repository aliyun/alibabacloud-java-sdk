// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionResponseBody extends TeaModel {
    /**
     * <p>The permission on the ENI.</p>
     */
    @NameInMap("NetworkInterfacePermission")
    public CreateNetworkInterfacePermissionResponseBodyNetworkInterfacePermission networkInterfacePermission;

    /**
     * <p>Details about permissions on ENIs.</p>
     * 
     * <strong>example:</strong>
     * <p>0FCD3DEF-63D3-4605-A818-805C8BD7DB87</p>
     */
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
        /**
         * <p>The ID of the permission on the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the Alibaba Cloud partner (a certified ISV).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp14v2sdd3v8htln****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-perm-bp1cs4lwn56lfb****</p>
         */
        @NameInMap("NetworkInterfacePermissionId")
        public String networkInterfacePermissionId;

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceAttach</p>
         */
        @NameInMap("Permission")
        public String permission;

        /**
         * <strong>example:</strong>
         * <p>Granted</p>
         */
        @NameInMap("PermissionState")
        public String permissionState;

        /**
         * <p>The state of the permission on the ENI. Valid values:</p>
         * <ul>
         * <li>Pending: The permission is being granted.</li>
         * <li>Granted: The permission is granted.</li>
         * <li>Revoking: The permission is being revoked.</li>
         * <li>Revoked: The permission is revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
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
