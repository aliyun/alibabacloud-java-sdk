// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDirectorySsoStatusRequest extends TeaModel {
    /**
     * <p>The AD directory ID.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to enable SSO. Valid values:</p>
     * <br>
     * <p>*   true: enables SSO.</p>
     * <p>*   false: disables SSO.</p>
     */
    @NameInMap("EnableSso")
    public Boolean enableSso;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetDirectorySsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDirectorySsoStatusRequest self = new SetDirectorySsoStatusRequest();
        return TeaModel.build(map, self);
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

    public SetDirectorySsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
