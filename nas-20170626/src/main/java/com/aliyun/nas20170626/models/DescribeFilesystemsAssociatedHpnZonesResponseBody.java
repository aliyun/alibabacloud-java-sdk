// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsAssociatedHpnZonesResponseBody extends TeaModel {
    /**
     * <p>The list of HpnZones associated with the file system.</p>
     */
    @NameInMap("Filesystems")
    public java.util.List<DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems> filesystems;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFilesystemsAssociatedHpnZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsAssociatedHpnZonesResponseBody self = new DescribeFilesystemsAssociatedHpnZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsAssociatedHpnZonesResponseBody setFilesystems(java.util.List<DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems> filesystems) {
        this.filesystems = filesystems;
        return this;
    }
    public java.util.List<DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems> getFilesystems() {
        return this.filesystems;
    }

    public DescribeFilesystemsAssociatedHpnZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems extends TeaModel {
        /**
         * <p>The list of HpnZones supported by the file system.</p>
         */
        @NameInMap("AssociatedHpnZones")
        public java.util.List<String> associatedHpnZones;

        /**
         * <p>The ID of the CPFS for Lingjun file system.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290t15yn4uo8lid****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems self = new DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems();
            return TeaModel.build(map, self);
        }

        public DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems setAssociatedHpnZones(java.util.List<String> associatedHpnZones) {
            this.associatedHpnZones = associatedHpnZones;
            return this;
        }
        public java.util.List<String> getAssociatedHpnZones() {
            return this.associatedHpnZones;
        }

        public DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFilesystemsAssociatedHpnZonesResponseBodyFilesystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
