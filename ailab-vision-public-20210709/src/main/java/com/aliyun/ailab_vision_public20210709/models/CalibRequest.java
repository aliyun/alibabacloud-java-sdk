// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class CalibRequest extends TeaModel {
    @NameInMap("sceneId")
    public String sceneId;

    @NameInMap("floorId")
    public String floorId;

    @NameInMap("cameraId")
    public String cameraId;

    @NameInMap("featureMatch")
    public CalibRequestFeatureMatch featureMatch;

    @NameInMap("cameraType")
    public String cameraType;

    @NameInMap("zoomLevel")
    public String zoomLevel;

    @NameInMap("kptsNum")
    public String kptsNum;

    @NameInMap("reprojectThresh")
    public String reprojectThresh;

    public static CalibRequest build(java.util.Map<String, ?> map) throws Exception {
        CalibRequest self = new CalibRequest();
        return TeaModel.build(map, self);
    }

    public CalibRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CalibRequest setFloorId(String floorId) {
        this.floorId = floorId;
        return this;
    }
    public String getFloorId() {
        return this.floorId;
    }

    public CalibRequest setCameraId(String cameraId) {
        this.cameraId = cameraId;
        return this;
    }
    public String getCameraId() {
        return this.cameraId;
    }

    public CalibRequest setFeatureMatch(CalibRequestFeatureMatch featureMatch) {
        this.featureMatch = featureMatch;
        return this;
    }
    public CalibRequestFeatureMatch getFeatureMatch() {
        return this.featureMatch;
    }

    public CalibRequest setCameraType(String cameraType) {
        this.cameraType = cameraType;
        return this;
    }
    public String getCameraType() {
        return this.cameraType;
    }

    public CalibRequest setZoomLevel(String zoomLevel) {
        this.zoomLevel = zoomLevel;
        return this;
    }
    public String getZoomLevel() {
        return this.zoomLevel;
    }

    public CalibRequest setKptsNum(String kptsNum) {
        this.kptsNum = kptsNum;
        return this;
    }
    public String getKptsNum() {
        return this.kptsNum;
    }

    public CalibRequest setReprojectThresh(String reprojectThresh) {
        this.reprojectThresh = reprojectThresh;
        return this;
    }
    public String getReprojectThresh() {
        return this.reprojectThresh;
    }

    public static class CalibRequestFeatureMatch extends TeaModel {
        @NameInMap("img0")
        public String img0;

        @NameInMap("img1")
        public String img1;

        @NameInMap("match_num")
        public Long matchNum;

        @NameInMap("img0_kpts")
        public java.util.List<java.util.List<Float>> img0Kpts;

        @NameInMap("img1_kpts")
        public java.util.List<java.util.List<Float>> img1Kpts;

        public static CalibRequestFeatureMatch build(java.util.Map<String, ?> map) throws Exception {
            CalibRequestFeatureMatch self = new CalibRequestFeatureMatch();
            return TeaModel.build(map, self);
        }

        public CalibRequestFeatureMatch setImg0(String img0) {
            this.img0 = img0;
            return this;
        }
        public String getImg0() {
            return this.img0;
        }

        public CalibRequestFeatureMatch setImg1(String img1) {
            this.img1 = img1;
            return this;
        }
        public String getImg1() {
            return this.img1;
        }

        public CalibRequestFeatureMatch setMatchNum(Long matchNum) {
            this.matchNum = matchNum;
            return this;
        }
        public Long getMatchNum() {
            return this.matchNum;
        }

        public CalibRequestFeatureMatch setImg0Kpts(java.util.List<java.util.List<Float>> img0Kpts) {
            this.img0Kpts = img0Kpts;
            return this;
        }
        public java.util.List<java.util.List<Float>> getImg0Kpts() {
            return this.img0Kpts;
        }

        public CalibRequestFeatureMatch setImg1Kpts(java.util.List<java.util.List<Float>> img1Kpts) {
            this.img1Kpts = img1Kpts;
            return this;
        }
        public java.util.List<java.util.List<Float>> getImg1Kpts() {
            return this.img1Kpts;
        }

    }

}
