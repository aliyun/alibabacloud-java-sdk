// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListSharedStoragesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6757FA4-8FED-4602-B7F5-3550C084****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the attached shared storage.</p>
     */
    @NameInMap("SharedStorages")
    public java.util.List<ListSharedStoragesResponseBodySharedStorages> sharedStorages;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListSharedStoragesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSharedStoragesResponseBody self = new ListSharedStoragesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSharedStoragesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedStoragesResponseBody setSharedStorages(java.util.List<ListSharedStoragesResponseBodySharedStorages> sharedStorages) {
        this.sharedStorages = sharedStorages;
        return this;
    }
    public java.util.List<ListSharedStoragesResponseBodySharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    public ListSharedStoragesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListSharedStoragesResponseBodySharedStoragesMountInfo extends TeaModel {
        /**
         * <p>The local mount directory of the attached file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("MountDirectory")
        public String mountDirectory;

        /**
         * <p>The mount options for the attached file system. Valid values:</p>
         * <ul>
         * <li>\-t nfs -o vers=3,nolock,proto=tcp,noresvport</li>
         * <li>\-t nfs -o vers=4.0,noresvport</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-t nfs -o vers=4.0,noresvport</p>
         */
        @NameInMap("MountOptions")
        public String mountOptions;

        /**
         * <p>The mount target of the attached file system.</p>
         * 
         * <strong>example:</strong>
         * <p>0bd504b***-ngq26.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTarget")
        public String mountTarget;

        /**
         * <p>The protocol used by the mount target of the attached file system. Valid values:</p>
         * <ul>
         * <li>nfs3</li>
         * <li>nfs4</li>
         * <li>cpfs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nfs3</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The storage directory of the attached file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/testehpc</p>
         */
        @NameInMap("StorageDirectory")
        public String storageDirectory;

        public static ListSharedStoragesResponseBodySharedStoragesMountInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSharedStoragesResponseBodySharedStoragesMountInfo self = new ListSharedStoragesResponseBodySharedStoragesMountInfo();
            return TeaModel.build(map, self);
        }

        public ListSharedStoragesResponseBodySharedStoragesMountInfo setMountDirectory(String mountDirectory) {
            this.mountDirectory = mountDirectory;
            return this;
        }
        public String getMountDirectory() {
            return this.mountDirectory;
        }

        public ListSharedStoragesResponseBodySharedStoragesMountInfo setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public ListSharedStoragesResponseBodySharedStoragesMountInfo setMountTarget(String mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }
        public String getMountTarget() {
            return this.mountTarget;
        }

        public ListSharedStoragesResponseBodySharedStoragesMountInfo setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListSharedStoragesResponseBodySharedStoragesMountInfo setStorageDirectory(String storageDirectory) {
            this.storageDirectory = storageDirectory;
            return this;
        }
        public String getStorageDirectory() {
            return this.storageDirectory;
        }

    }

    public static class ListSharedStoragesResponseBodySharedStorages extends TeaModel {
        /**
         * <p>The ID of the attached file system.</p>
         * 
         * <strong>example:</strong>
         * <p>08c7f4b***</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The protocol used by the attached file system. Valid values:</p>
         * <ul>
         * <li>nfs3</li>
         * <li>nfs4</li>
         * <li>cpfs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nfs4</p>
         */
        @NameInMap("FileSystemProtocol")
        public String fileSystemProtocol;

        /**
         * <p>The type of the attached file system. Valid values:</p>
         * <ul>
         * <li>nas</li>
         * <li>cpfs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nas</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The mount information.</p>
         */
        @NameInMap("MountInfo")
        public java.util.List<ListSharedStoragesResponseBodySharedStoragesMountInfo> mountInfo;

        public static ListSharedStoragesResponseBodySharedStorages build(java.util.Map<String, ?> map) throws Exception {
            ListSharedStoragesResponseBodySharedStorages self = new ListSharedStoragesResponseBodySharedStorages();
            return TeaModel.build(map, self);
        }

        public ListSharedStoragesResponseBodySharedStorages setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListSharedStoragesResponseBodySharedStorages setFileSystemProtocol(String fileSystemProtocol) {
            this.fileSystemProtocol = fileSystemProtocol;
            return this;
        }
        public String getFileSystemProtocol() {
            return this.fileSystemProtocol;
        }

        public ListSharedStoragesResponseBodySharedStorages setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public ListSharedStoragesResponseBodySharedStorages setMountInfo(java.util.List<ListSharedStoragesResponseBodySharedStoragesMountInfo> mountInfo) {
            this.mountInfo = mountInfo;
            return this;
        }
        public java.util.List<ListSharedStoragesResponseBodySharedStoragesMountInfo> getMountInfo() {
            return this.mountInfo;
        }

    }

}
