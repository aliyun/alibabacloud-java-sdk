// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacePermissionsResponseBody extends TeaModel {
    /**
     * <p>Details about the ENI permissions.</p>
     */
    @NameInMap("NetworkInterfacePermissions")
    public DescribeNetworkInterfacePermissionsResponseBodyNetworkInterfacePermissions networkInterfacePermissions;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0FCD3DEF-63D3-4605-A818-805C8BD7DB87</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The ID of the Alibaba Cloud partner (a certified ISV) or individual user.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of ENI N.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp14v2sdd3v8htln****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The ID of the ENI permission.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-perm-bp1cs4lwn56lfb****</p>
         */
        @NameInMap("NetworkInterfacePermissionId")
        public String networkInterfacePermissionId;

        /**
         * <p>The ENI permission.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceAttach</p>
         */
        @NameInMap("Permission")
        public String permission;

        /**
         * <p>The status of the ENI permission. Valid values:</p>
         * <ul>
         * <li>Pending: The permission is being granted.</li>
         * <li>Granted: The permission is granted.</li>
         * <li>Revoking: The permission is being revoked.</li>
         * <li>Revoked: The permission is revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Granted</p>
         */
        @NameInMap("PermissionState")
        public String permissionState;

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
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
