// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AttachSharedStoragesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about the shared storage resources that you want to attach to the cluster.</p>
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
         * <p>The ID of the file system to be attached.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0bd504b0**</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The storage location of the file system to be attached. Valid values:</p>
         * <ul>
         * <li>OnPremise: The file system is deployed on a hybrid cloud.</li>
         * <li>PublicCloud: The file system is deployed on a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The local mount directory of the file system that you want to attach.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("MountDirectory")
        public String mountDirectory;

        /**
         * <p>The attaching options of the file system to be attached. Valid values:</p>
         * <ul>
         * <li>\-t nfs -o vers=3,nolock,proto=tcp,noresvport</li>
         * <li>\-t nfs -o vers=4.0,noresvport</li>
         * </ul>
         * <p>Default value:-t nfs -o vers=3,nolock,proto=tcp,noresvport</p>
         * <blockquote>
         * <p> The v3 version is recommended for higher performance if multiple Elastic Compute Service (ECS) instances do not edit the same file at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-t nfs -o vers=3,nolock,proto=tcp,noresvport</p>
         */
        @NameInMap("MountOptions")
        public String mountOptions;

        /**
         * <p>The address of the mount point of the file system to be attached.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0bd504b***-ngq26.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTarget")
        public String mountTarget;

        /**
         * <p>The protocol type of the file system to be attached. Valid values:</p>
         * <ul>
         * <li>NFS</li>
         * <li>SMB</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The storage directory of the file system. You can mount any directory in the file system to the specified cluster directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/testehpc</p>
         */
        @NameInMap("StorageDirectory")
        public String storageDirectory;

        /**
         * <p>The type of the file system to be attached. Valid values:</p>
         * <ul>
         * <li>nas</li>
         * <li>cpfs</li>
         * </ul>
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
