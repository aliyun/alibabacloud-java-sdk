// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppVersionAdaptorShrinkRequest extends TeaModel {
    @NameInMap("ComputeType")
    public String computeType;

    @NameInMap("Extensions")
    public String extensionsShrink;

    @NameInMap("FrameRate")
    public String frameRate;

    @NameInMap("Hardware")
    public String hardware;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Os")
    public String os;

    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("VersionId")
    public Long versionId;

    public static CreateAppVersionAdaptorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionAdaptorShrinkRequest self = new CreateAppVersionAdaptorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionAdaptorShrinkRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public CreateAppVersionAdaptorShrinkRequest setExtensionsShrink(String extensionsShrink) {
        this.extensionsShrink = extensionsShrink;
        return this;
    }
    public String getExtensionsShrink() {
        return this.extensionsShrink;
    }

    public CreateAppVersionAdaptorShrinkRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateAppVersionAdaptorShrinkRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public CreateAppVersionAdaptorShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateAppVersionAdaptorShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateAppVersionAdaptorShrinkRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateAppVersionAdaptorShrinkRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
