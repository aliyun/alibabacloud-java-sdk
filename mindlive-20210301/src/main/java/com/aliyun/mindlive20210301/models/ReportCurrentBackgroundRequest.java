// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportCurrentBackgroundRequest extends TeaModel {
    @NameInMap("Open")
    public Boolean open;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ResourceUuid")
    public String resourceUuid;

    @NameInMap("BgConfig")
    public java.util.Map<String, ?> bgConfig;

    public static ReportCurrentBackgroundRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportCurrentBackgroundRequest self = new ReportCurrentBackgroundRequest();
        return TeaModel.build(map, self);
    }

    public ReportCurrentBackgroundRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public ReportCurrentBackgroundRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ReportCurrentBackgroundRequest setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
        return this;
    }
    public String getResourceUuid() {
        return this.resourceUuid;
    }

    public ReportCurrentBackgroundRequest setBgConfig(java.util.Map<String, ?> bgConfig) {
        this.bgConfig = bgConfig;
        return this;
    }
    public java.util.Map<String, ?> getBgConfig() {
        return this.bgConfig;
    }

}
