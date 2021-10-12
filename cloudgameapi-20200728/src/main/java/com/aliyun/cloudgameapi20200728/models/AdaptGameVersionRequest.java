// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AdaptGameVersionRequest extends TeaModel {
    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("FrameRate")
    public String frameRate;

    public static AdaptGameVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AdaptGameVersionRequest self = new AdaptGameVersionRequest();
        return TeaModel.build(map, self);
    }

    public AdaptGameVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public AdaptGameVersionRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public AdaptGameVersionRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

}
