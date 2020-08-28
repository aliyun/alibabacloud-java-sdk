// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NetworkInterfacePermissions")
    @Validation(required = true)
    public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions networkInterfacePermissions;

    public static DescribeNetworkInterfacePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacePermissionsResponse self = new DescribeNetworkInterfacePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission extends TeaModel {
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

        public static DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission self = new DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions extends TeaModel {
        @NameInMap("NetworkInterfacePermission")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission> networkInterfacePermission;

        public static DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions self = new DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions();
            return TeaModel.build(map, self);
        }

    }

}
