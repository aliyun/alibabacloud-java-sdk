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

    public DescribeNetworkInterfacePermissionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfacePermissionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkInterfacePermissionsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacePermissionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacePermissionsResponse setNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions networkInterfacePermissions) {
        this.networkInterfacePermissions = networkInterfacePermissions;
        return this;
    }
    public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions getNetworkInterfacePermissions() {
        return this.networkInterfacePermissions;
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

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
            this.networkInterfacePermissionId = networkInterfacePermissionId;
            return this;
        }
        public String getNetworkInterfacePermissionId() {
            return this.networkInterfacePermissionId;
        }

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission setPermissionState(String permissionState) {
            this.permissionState = permissionState;
            return this;
        }
        public String getPermissionState() {
            return this.permissionState;
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

        public DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissions setNetworkInterfacePermission(java.util.List<DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission> networkInterfacePermission) {
            this.networkInterfacePermission = networkInterfacePermission;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacePermissionsResponseNetworkInterfacePermissionsNetworkInterfacePermission> getNetworkInterfacePermission() {
            return this.networkInterfacePermission;
        }

    }

}
