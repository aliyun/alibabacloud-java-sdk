// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAdaptationResponseBody extends TeaModel {
    @NameInMap("AdaptApplyId")
    public Long adaptApplyId;

    @NameInMap("AdaptTarget")
    public GetAdaptationResponseBodyAdaptTarget adaptTarget;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAdaptationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdaptationResponseBody self = new GetAdaptationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdaptationResponseBody setAdaptApplyId(Long adaptApplyId) {
        this.adaptApplyId = adaptApplyId;
        return this;
    }
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    public GetAdaptationResponseBody setAdaptTarget(GetAdaptationResponseBodyAdaptTarget adaptTarget) {
        this.adaptTarget = adaptTarget;
        return this;
    }
    public GetAdaptationResponseBodyAdaptTarget getAdaptTarget() {
        return this.adaptTarget;
    }

    public GetAdaptationResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAdaptationResponseBody setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public GetAdaptationResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAdaptationResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAdaptationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAdaptationResponseBodyAdaptTarget extends TeaModel {
        @NameInMap("BitRate")
        public Integer bitRate;

        @NameInMap("FrameRate")
        public Integer frameRate;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("StartProgram")
        public String startProgram;

        public static GetAdaptationResponseBodyAdaptTarget build(java.util.Map<String, ?> map) throws Exception {
            GetAdaptationResponseBodyAdaptTarget self = new GetAdaptationResponseBodyAdaptTarget();
            return TeaModel.build(map, self);
        }

        public GetAdaptationResponseBodyAdaptTarget setBitRate(Integer bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public Integer getBitRate() {
            return this.bitRate;
        }

        public GetAdaptationResponseBodyAdaptTarget setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

        public GetAdaptationResponseBodyAdaptTarget setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetAdaptationResponseBodyAdaptTarget setStartProgram(String startProgram) {
            this.startProgram = startProgram;
            return this;
        }
        public String getStartProgram() {
            return this.startProgram;
        }

    }

}
