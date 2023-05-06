// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppAdaptorRequest extends TeaModel {
    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("LoadType")
    public String loadType;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Os")
    public String os;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("VersionUid")
    public String versionUid;

    public static CreateAppAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAdaptorRequest self = new CreateAppAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAdaptorRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateAppAdaptorRequest setLoadType(String loadType) {
        this.loadType = loadType;
        return this;
    }
    public String getLoadType() {
        return this.loadType;
    }

    public CreateAppAdaptorRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateAppAdaptorRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateAppAdaptorRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateAppAdaptorRequest setVersionUid(String versionUid) {
        this.versionUid = versionUid;
        return this;
    }
    public String getVersionUid() {
        return this.versionUid;
    }

}
