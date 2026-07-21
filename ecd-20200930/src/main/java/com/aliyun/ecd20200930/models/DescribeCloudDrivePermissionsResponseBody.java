// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDrivePermissionsResponseBody extends TeaModel {
    /**
     * <p>The list of permission settings for the enterprise cloud drive.</p>
     */
    @NameInMap("CloudDrivePermissionModels")
    public java.util.List<DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels> cloudDrivePermissionModels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A87DBB05-653A-5E4B-B72B-5F4A1E07E5B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudDrivePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDrivePermissionsResponseBody self = new DescribeCloudDrivePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDrivePermissionsResponseBody setCloudDrivePermissionModels(java.util.List<DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels> cloudDrivePermissionModels) {
        this.cloudDrivePermissionModels = cloudDrivePermissionModels;
        return this;
    }
    public java.util.List<DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels> getCloudDrivePermissionModels() {
        return this.cloudDrivePermissionModels;
    }

    public DescribeCloudDrivePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels extends TeaModel {
        /**
         * <p>The list of end user IDs.</p>
         */
        @NameInMap("EndUsers")
        public java.util.List<String> endUsers;

        /**
         * <p>The file transfer permission between the enterprise cloud drive and the on-premises device for the user. Valid values:</p>
         * <ul>
         * <li>CDS_CREATE_DOWNLOAD: has both upload and download permissions.</li>
         * <li>CDS_DOWNLOAD: has only download permission.</li>
         * <li>CDS_CREATE: has only upload permission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CDS_DOWNLOAD</p>
         */
        @NameInMap("Permission")
        public String permission;

        public static DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels self = new DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels setEndUsers(java.util.List<String> endUsers) {
            this.endUsers = endUsers;
            return this;
        }
        public java.util.List<String> getEndUsers() {
            return this.endUsers;
        }

        public DescribeCloudDrivePermissionsResponseBodyCloudDrivePermissionModels setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

    }

}
