// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class SharedStorageTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>008b63****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("MountDirectory")
    public String mountDirectory;

    /**
     * <strong>example:</strong>
     * <p>-t nfs -o vers=3,nolock,noresvport</p>
     */
    @NameInMap("MountOptions")
    public String mountOptions;

    /**
     * <strong>example:</strong>
     * <p>008b****-sihc.cn-hangzhou.extreme.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("NASDirectory")
    public String NASDirectory;

    /**
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
