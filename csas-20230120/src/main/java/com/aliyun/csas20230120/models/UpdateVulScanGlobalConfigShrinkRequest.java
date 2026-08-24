// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVulScanGlobalConfigShrinkRequest extends TeaModel {
    /**
     * <p>The maximum download rate for vulnerability patches on a single user terminal device. Unit: Byte/s. A value of 0 indicates no speed limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("MaxDownloadSpeed")
    public Integer maxDownloadSpeed;

    /**
     * <p>The vulnerability fix configuration for WUYING Workspace. This configuration applies only to user terminal devices of the Cloud Desktop type.</p>
     */
    @NameInMap("WuyingVulFixConfig")
    @Deprecated
    public String wuyingVulFixConfigShrink;

    public static UpdateVulScanGlobalConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVulScanGlobalConfigShrinkRequest self = new UpdateVulScanGlobalConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVulScanGlobalConfigShrinkRequest setMaxDownloadSpeed(Integer maxDownloadSpeed) {
        this.maxDownloadSpeed = maxDownloadSpeed;
        return this;
    }
    public Integer getMaxDownloadSpeed() {
        return this.maxDownloadSpeed;
    }

    @Deprecated
    public UpdateVulScanGlobalConfigShrinkRequest setWuyingVulFixConfigShrink(String wuyingVulFixConfigShrink) {
        this.wuyingVulFixConfigShrink = wuyingVulFixConfigShrink;
        return this;
    }
    public String getWuyingVulFixConfigShrink() {
        return this.wuyingVulFixConfigShrink;
    }

}
