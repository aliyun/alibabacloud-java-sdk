// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsResponseBody extends TeaModel {
    // Details about the permissions on ENIs.
    @NameInMap("NetworkInterfacePermissions")
    public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions networkInterfacePermissions;

    // The number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworkInterfacePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacePermissionsResponseBody self = new DescribeNetworkInterfacePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacePermissionsResponseBody setNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions networkInterfacePermissions) {
        this.networkInterfacePermissions = networkInterfacePermissions;
        return this;
    }
    public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions getNetworkInterfacePermissions() {
        return this.networkInterfacePermissions;
    }

    public DescribeNetworkInterfacePermissionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacePermissionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfacePermissionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission extends TeaModel {
        // The ID of the Alibaba Cloud partner (a certified ISV) or individual user.
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

        public static DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission self = new DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setPermissionState(String permissionState) {
            this.permissionState = permissionState;
            return this;
        }
        public String getPermissionState() {
            return this.permissionState;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions extends TeaModel {
        @NameInMap("NetworkInterfacePermission")
        public java.util.List<DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission> networkInterfacePermission;

        public static DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions self = new DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions setNetworkInterfacePermission(java.util.List<DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission> networkInterfacePermission) {
            this.networkInterfacePermission = networkInterfacePermission;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission> getNetworkInterfacePermission() {
            return this.networkInterfacePermission;
        }

    }

}
