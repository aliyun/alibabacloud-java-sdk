// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppAdaptorsRequest extends TeaModel {
    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("LoadTypeList")
    public java.util.List<String> loadTypeList;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Os")
    public String os;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("VersionUid")
    public String versionUid;

    public static CreateAppAdaptorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAdaptorsRequest self = new CreateAppAdaptorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppAdaptorsRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateAppAdaptorsRequest setLoadTypeList(java.util.List<String> loadTypeList) {
        this.loadTypeList = loadTypeList;
        return this;
    }
    public java.util.List<String> getLoadTypeList() {
        return this.loadTypeList;
    }

    public CreateAppAdaptorsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateAppAdaptorsRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateAppAdaptorsRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateAppAdaptorsRequest setVersionUid(String versionUid) {
        this.versionUid = versionUid;
        return this;
    }
    public String getVersionUid() {
        return this.versionUid;
    }

}
