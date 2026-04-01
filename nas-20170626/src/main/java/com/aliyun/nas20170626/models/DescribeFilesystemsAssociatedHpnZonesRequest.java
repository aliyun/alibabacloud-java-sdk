// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsAssociatedHpnZonesRequest extends TeaModel {
    /**
     * <p>The collection of file system IDs.</p>
     * <blockquote>
     * <p> The maximum number of elements in the set must be less than or equal to 20.</p>
     * </blockquote>
     */
    @NameInMap("Filesystems")
    public java.util.List<DescribeFilesystemsAssociatedHpnZonesRequestFilesystems> filesystems;

    /**
     * <p>The ID of the region where the file system resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFilesystemsAssociatedHpnZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsAssociatedHpnZonesRequest self = new DescribeFilesystemsAssociatedHpnZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsAssociatedHpnZonesRequest setFilesystems(java.util.List<DescribeFilesystemsAssociatedHpnZonesRequestFilesystems> filesystems) {
        this.filesystems = filesystems;
        return this;
    }
    public java.util.List<DescribeFilesystemsAssociatedHpnZonesRequestFilesystems> getFilesystems() {
        return this.filesystems;
    }

    public DescribeFilesystemsAssociatedHpnZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeFilesystemsAssociatedHpnZonesRequestFilesystems extends TeaModel {
        /**
         * <p>The ID of the CPFS for Lingjun file system. Must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290t15yn4uo8lid****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        public static DescribeFilesystemsAssociatedHpnZonesRequestFilesystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesystemsAssociatedHpnZonesRequestFilesystems self = new DescribeFilesystemsAssociatedHpnZonesRequestFilesystems();
            return TeaModel.build(map, self);
        }

        public DescribeFilesystemsAssociatedHpnZonesRequestFilesystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

    }

}
