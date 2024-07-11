// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAdaptationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5435****</p>
     */
    @NameInMap("AdaptApplyId")
    public Long adaptApplyId;

    @NameInMap("AdaptTarget")
    public GetAdaptationResponseBodyAdaptTarget adaptTarget;

    /**
     * <strong>example:</strong>
     * <p>4384****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1432****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("BitRate")
        public Integer bitRate;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        /**
         * <strong>example:</strong>
         * <p>1080p</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <strong>example:</strong>
         * <p>/example/example.exe</p>
         */
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
