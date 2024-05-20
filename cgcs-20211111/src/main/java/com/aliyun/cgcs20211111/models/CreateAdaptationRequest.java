// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAdaptationRequest extends TeaModel {
    @NameInMap("AdaptTarget")
    public CreateAdaptationRequestAdaptTarget adaptTarget;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    public static CreateAdaptationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdaptationRequest self = new CreateAdaptationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdaptationRequest setAdaptTarget(CreateAdaptationRequestAdaptTarget adaptTarget) {
        this.adaptTarget = adaptTarget;
        return this;
    }
    public CreateAdaptationRequestAdaptTarget getAdaptTarget() {
        return this.adaptTarget;
    }

    public CreateAdaptationRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static class CreateAdaptationRequestAdaptTarget extends TeaModel {
        @NameInMap("BitRate")
        public Integer bitRate;

        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("StartProgram")
        public String startProgram;

        public static CreateAdaptationRequestAdaptTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateAdaptationRequestAdaptTarget self = new CreateAdaptationRequestAdaptTarget();
            return TeaModel.build(map, self);
        }

        public CreateAdaptationRequestAdaptTarget setBitRate(Integer bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Integer getBitRate() {
            return this.bitRate;
        }

        public CreateAdaptationRequestAdaptTarget setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public CreateAdaptationRequestAdaptTarget setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public CreateAdaptationRequestAdaptTarget setStartProgram(String startProgram) {
            this.startProgram = startProgram;
            return this;
        }
        public String getStartProgram() {
            return this.startProgram;
        }

    }

}
