// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class SharedStorageTemplate extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("MountDirectory")
    public String mountDirectory;

    @NameInMap("MountOptions")
    public String mountOptions;

    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    @NameInMap("NASDirectory")
    public String NASDirectory;

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
