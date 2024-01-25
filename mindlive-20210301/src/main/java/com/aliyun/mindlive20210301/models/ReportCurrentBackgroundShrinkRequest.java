// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportCurrentBackgroundShrinkRequest extends TeaModel {
    @NameInMap("BgConfig")
    public String bgConfigShrink;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Open")
    public Boolean open;

    @NameInMap("ResourceUuid")
    public String resourceUuid;

    public static ReportCurrentBackgroundShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportCurrentBackgroundShrinkRequest self = new ReportCurrentBackgroundShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReportCurrentBackgroundShrinkRequest setBgConfigShrink(String bgConfigShrink) {
        this.bgConfigShrink = bgConfigShrink;
        return this;
    }
    public String getBgConfigShrink() {
        return this.bgConfigShrink;
    }

    public ReportCurrentBackgroundShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ReportCurrentBackgroundShrinkRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public ReportCurrentBackgroundShrinkRequest setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
        return this;
    }
    public String getResourceUuid() {
        return this.resourceUuid;
    }

}
