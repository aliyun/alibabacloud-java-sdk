// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppVersionAdaptorRequest extends TeaModel {
    @NameInMap("ComputeType")
    public String computeType;

    @NameInMap("Extensions")
    public java.util.Map<String, ?> extensions;

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

    public static CreateAppVersionAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionAdaptorRequest self = new CreateAppVersionAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionAdaptorRequest setComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }
    public String getComputeType() {
        return this.computeType;
    }

    public CreateAppVersionAdaptorRequest setExtensions(java.util.Map<String, ?> extensions) {
        this.extensions = extensions;
        return this;
    }
    public java.util.Map<String, ?> getExtensions() {
        return this.extensions;
    }

    public CreateAppVersionAdaptorRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public CreateAppVersionAdaptorRequest setHardware(String hardware) {
        this.hardware = hardware;
        return this;
    }
    public String getHardware() {
        return this.hardware;
    }

    public CreateAppVersionAdaptorRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateAppVersionAdaptorRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public CreateAppVersionAdaptorRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateAppVersionAdaptorRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
