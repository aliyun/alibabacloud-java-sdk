// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("NetworkInterfacePermissions")
    public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions networkInterfacePermissions;

    public static DescribeNetworkInterfacePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacePermissionsResponseBody self = new DescribeNetworkInterfacePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacePermissionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeNetworkInterfacePermissionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacePermissionsResponseBody setNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions networkInterfacePermissions) {
        this.networkInterfacePermissions = networkInterfacePermissions;
        return this;
    }
    public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions getNetworkInterfacePermissions() {
        return this.networkInterfacePermissions;
    }

    public static class DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission extends TeaModel {
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

        public static DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission self = new DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissionsNetworkInterfacePermission setPermissionState(String permissionState) {
            this.permissionState = permissionState;
            return this;
        }
        public String getPermissionState() {
            return this.permissionState;
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
