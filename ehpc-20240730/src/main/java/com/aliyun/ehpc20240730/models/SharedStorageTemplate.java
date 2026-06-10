// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class SharedStorageTemplate extends TeaModel {
    /**
     * <p>The ID of the mounted file system.</p>
     * 
     * <strong>example:</strong>
     * <p>008b63****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The local mount directory of the attached file system.</p>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("MountDirectory")
    public String mountDirectory;

    /**
     * <p>The storage mount options of the mounted file system.</p>
     * 
     * <strong>example:</strong>
     * <p>-t nfs -o vers=3,nolock,noresvport</p>
     */
    @NameInMap("MountOptions")
    public String mountOptions;

    /**
     * <p>The address of the mount point of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>008b****-sihc.cn-hangzhou.extreme.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The remote mount directory of the mounted file system.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("NASDirectory")
    public String NASDirectory;

    /**
     * <p>The protocol type of the mounted file system. Valid values:</p>
     * <ul>
     * <li>NFS</li>
     * <li>SMB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    public static SharedStorageTemplate build(java.util.Map<String, ?> map) throws Exception {
        SharedStorageTemplate self = new SharedStorageTemplate();
        return TeaModel.build(map, self);
    }

    public SharedStorageTemplate setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public SharedStorageTemplate setMountDirectory(String mountDirectory) {
        this.mountDirectory = mountDirectory;
        return this;
    }
    public String getMountDirectory() {
        return this.mountDirectory;
    }

    public SharedStorageTemplate setMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }
    public String getMountOptions() {
        return this.mountOptions;
    }

    public SharedStorageTemplate setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public SharedStorageTemplate setNASDirectory(String NASDirectory) {
        this.NASDirectory = NASDirectory;
        return this;
    }
    public String getNASDirectory() {
        return this.NASDirectory;
    }

    public SharedStorageTemplate setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

}
