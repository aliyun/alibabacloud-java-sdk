// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDirectorySsoStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DirectoryId")
    @Validation(required = true)
    public String directoryId;

    @NameInMap("EnableSso")
    @Validation(required = true)
    public Boolean enableSso;

    public static SetDirectorySsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDirectorySsoStatusRequest self = new SetDirectorySsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDirectorySsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDirectorySsoStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetDirectorySsoStatusRequest setEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
        return this;
    }
    public Boolean getEnableSso() {
        return this.enableSso;
    }

}
