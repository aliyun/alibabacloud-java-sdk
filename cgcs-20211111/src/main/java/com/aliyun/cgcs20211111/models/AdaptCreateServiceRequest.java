// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptCreateServiceRequest extends TeaModel {
    @NameInMap("AdaptTarget")
    public AdaptCreateServiceRequestAdaptTarget adaptTarget;

    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("AppVersionName")
    public String appVersionName;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AdaptCreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AdaptCreateServiceRequest self = new AdaptCreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public AdaptCreateServiceRequest setAdaptTarget(AdaptCreateServiceRequestAdaptTarget adaptTarget) {
        this.adaptTarget = adaptTarget;
        return this;
    }
    public AdaptCreateServiceRequestAdaptTarget getAdaptTarget() {
        return this.adaptTarget;
    }

    public AdaptCreateServiceRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public AdaptCreateServiceRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public AdaptCreateServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

    public static class AdaptCreateServiceRequestAdaptTarget extends TeaModel {
        @NameInMap("BitRate")
        public Integer bitRate;

        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("StartProgram")
        public String startProgram;

        public static AdaptCreateServiceRequestAdaptTarget build(java.util.Map<String, ?> map) throws Exception {
            AdaptCreateServiceRequestAdaptTarget self = new AdaptCreateServiceRequestAdaptTarget();
            return TeaModel.build(map, self);
        }

        public AdaptCreateServiceRequestAdaptTarget setBitRate(Integer bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Integer getBitRate() {
            return this.bitRate;
        }

        public AdaptCreateServiceRequestAdaptTarget setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public AdaptCreateServiceRequestAdaptTarget setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public AdaptCreateServiceRequestAdaptTarget setStartProgram(String startProgram) {
            this.startProgram = startProgram;
            return this;
        }
        public String getStartProgram() {
            return this.startProgram;
        }

    }

}
