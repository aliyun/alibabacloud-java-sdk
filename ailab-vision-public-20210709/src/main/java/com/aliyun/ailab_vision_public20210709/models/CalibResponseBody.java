// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class CalibResponseBody extends TeaModel {
    @NameInMap("success")
    public Long success;

    @NameInMap("errmsg")
    public String errmsg;

    @NameInMap("results")
    public CalibResponseBodyResults results;

    public static CalibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalibResponseBody self = new CalibResponseBody();
        return TeaModel.build(map, self);
    }

    public CalibResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public CalibResponseBody setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public CalibResponseBody setResults(CalibResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public CalibResponseBodyResults getResults() {
        return this.results;
    }

    public static class CalibResponseBodyResults extends TeaModel {
        @NameInMap("H_cam2map")
        public java.util.List<java.util.List<Float>> hCam2map;

        @NameInMap("t")
        public java.util.List<Float> t;

        @NameInMap("Q")
        public java.util.List<Float> q;

        @NameInMap("cam_inmap")
        public java.util.List<Float> camInmap;

        public static CalibResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            CalibResponseBodyResults self = new CalibResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public CalibResponseBodyResults setHCam2map(java.util.List<java.util.List<Float>> hCam2map) {
            this.hCam2map = hCam2map;
            return this;
        }
        public java.util.List<java.util.List<Float>> getHCam2map() {
            return this.hCam2map;
        }

        public CalibResponseBodyResults setT(java.util.List<Float> t) {
            this.t = t;
            return this;
        }
        public java.util.List<Float> getT() {
            return this.t;
        }

        public CalibResponseBodyResults setQ(java.util.List<Float> q) {
            this.q = q;
            return this;
        }
        public java.util.List<Float> getQ() {
            return this.q;
        }

        public CalibResponseBodyResults setCamInmap(java.util.List<Float> camInmap) {
            this.camInmap = camInmap;
            return this;
        }
        public java.util.List<Float> getCamInmap() {
            return this.camInmap;
        }

    }

}
