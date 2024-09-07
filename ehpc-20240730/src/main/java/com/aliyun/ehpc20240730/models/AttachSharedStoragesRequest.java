// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AttachSharedStoragesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SharedStorages")
    public java.util.List<AttachSharedStoragesRequestSharedStorages> sharedStorages;

    public static AttachSharedStoragesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachSharedStoragesRequest self = new AttachSharedStoragesRequest();
        return TeaModel.build(map, self);
    }

    public AttachSharedStoragesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachSharedStoragesRequest setSharedStorages(java.util.List<AttachSharedStoragesRequestSharedStorages> sharedStorages) {
        this.sharedStorages = sharedStorages;
        return this;
    }
    public java.util.List<AttachSharedStoragesRequestSharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    public static class AttachSharedStoragesRequestSharedStorages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0bd504b0**</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("MountDirectory")
        public String mountDirectory;

        /**
         * <strong>example:</strong>
         * <p>-t nfs -o vers=3,nolock,proto=tcp,noresvport</p>
         */
        @NameInMap("MountOptions")
        public String mountOptions;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0bd504b***-ngq26.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTarget")
        public String mountTarget;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/testehpc</p>
         */
        @NameInMap("StorageDirectory")
        public String storageDirectory;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nas</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        public static AttachSharedStoragesRequestSharedStorages build(java.util.Map<String, ?> map) throws Exception {
            AttachSharedStoragesRequestSharedStorages self = new AttachSharedStoragesRequestSharedStorages();
            return TeaModel.build(map, self);
        }

        public AttachSharedStoragesRequestSharedStorages setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public AttachSharedStoragesRequestSharedStorages setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public AttachSharedStoragesRequestSharedStorages setMountDirectory(String mountDirectory) {
            this.mountDirectory = mountDirectory;
            return this;
        }
        public String getMountDirectory() {
            return this.mountDirectory;
        }

        public AttachSharedStoragesRequestSharedStorages setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public AttachSharedStoragesRequestSharedStorages setMountTarget(String mountTarget) {
            this.mountTarget = mountTarget;
            return this;
        }
        public String getMountTarget() {
            return this.mountTarget;
        }

        public AttachSharedStoragesRequestSharedStorages setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public AttachSharedStoragesRequestSharedStorages setStorageDirectory(String storageDirectory) {
            this.storageDirectory = storageDirectory;
            return this;
        }
        public String getStorageDirectory() {
            return this.storageDirectory;
        }

        public AttachSharedStoragesRequestSharedStorages setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

    }

}
