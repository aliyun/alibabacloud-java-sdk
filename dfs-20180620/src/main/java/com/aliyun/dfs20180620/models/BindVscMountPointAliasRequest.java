// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class BindVscMountPointAliasRequest extends TeaModel {
    @NameInMap("AliasPrefix")
    public String aliasPrefix;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("MountPointId")
    public String mountPointId;

    public static BindVscMountPointAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        BindVscMountPointAliasRequest self = new BindVscMountPointAliasRequest();
        return TeaModel.build(map, self);
    }

    public BindVscMountPointAliasRequest setAliasPrefix(String aliasPrefix) {
        this.aliasPrefix = aliasPrefix;
        return this;
    }
    public String getAliasPrefix() {
        return this.aliasPrefix;
    }

    public BindVscMountPointAliasRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public BindVscMountPointAliasRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public BindVscMountPointAliasRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

}
