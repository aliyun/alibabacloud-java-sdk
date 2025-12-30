// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaQualityAnalysisJobVqaResult extends TeaModel {
    @NameInMap("Block")
    public MediaQualityAnalysisJobVqaScoreDetail block;

    @NameInMap("Color")
    public MediaQualityAnalysisJobVqaScoreDetail color;

    @NameInMap("Detail")
    public MediaQualityAnalysisJobVqaScoreDetail detail;

    @NameInMap("Noise")
    public MediaQualityAnalysisJobVqaScoreDetail noise;

    @NameInMap("ScoreResult")
    public MediaQualityAnalysisJobVqaResultScoreResult scoreResult;

    @NameInMap("Sharp")
    public MediaQualityAnalysisJobVqaScoreDetail sharp;

    @NameInMap("State")
    public String state;

    public static MediaQualityAnalysisJobVqaResult build(java.util.Map<String, ?> map) throws Exception {
        MediaQualityAnalysisJobVqaResult self = new MediaQualityAnalysisJobVqaResult();
        return TeaModel.build(map, self);
    }

    public MediaQualityAnalysisJobVqaResult setBlock(MediaQualityAnalysisJobVqaScoreDetail block) {
        this.block = block;
        return this;
    }
    public MediaQualityAnalysisJobVqaScoreDetail getBlock() {
        return this.block;
    }

    public MediaQualityAnalysisJobVqaResult setColor(MediaQualityAnalysisJobVqaScoreDetail color) {
        this.color = color;
        return this;
    }
    public MediaQualityAnalysisJobVqaScoreDetail getColor() {
        return this.color;
    }

    public MediaQualityAnalysisJobVqaResult setDetail(MediaQualityAnalysisJobVqaScoreDetail detail) {
        this.detail = detail;
        return this;
    }
    public MediaQualityAnalysisJobVqaScoreDetail getDetail() {
        return this.detail;
    }

    public MediaQualityAnalysisJobVqaResult setNoise(MediaQualityAnalysisJobVqaScoreDetail noise) {
        this.noise = noise;
        return this;
    }
    public MediaQualityAnalysisJobVqaScoreDetail getNoise() {
        return this.noise;
    }

    public MediaQualityAnalysisJobVqaResult setScoreResult(MediaQualityAnalysisJobVqaResultScoreResult scoreResult) {
        this.scoreResult = scoreResult;
        return this;
    }
    public MediaQualityAnalysisJobVqaResultScoreResult getScoreResult() {
        return this.scoreResult;
    }

    public MediaQualityAnalysisJobVqaResult setSharp(MediaQualityAnalysisJobVqaScoreDetail sharp) {
        this.sharp = sharp;
        return this;
    }
    public MediaQualityAnalysisJobVqaScoreDetail getSharp() {
        return this.sharp;
    }

    public MediaQualityAnalysisJobVqaResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class MediaQualityAnalysisJobVqaResultScoreResultBlock extends TeaModel {
        @NameInMap("IntensityValue")
        public Double intensityValue;

        @NameInMap("PerceptualScore")
        public Double perceptualScore;

        public static MediaQualityAnalysisJobVqaResultScoreResultBlock build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobVqaResultScoreResultBlock self = new MediaQualityAnalysisJobVqaResultScoreResultBlock();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobVqaResultScoreResultBlock setIntensityValue(Double intensityValue) {
            this.intensityValue = intensityValue;
            return this;
        }
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        public MediaQualityAnalysisJobVqaResultScoreResultBlock setPerceptualScore(Double perceptualScore) {
            this.perceptualScore = perceptualScore;
            return this;
        }
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

    }

    public static class MediaQualityAnalysisJobVqaResultScoreResultColor extends TeaModel {
        @NameInMap("IntensityValue")
        public Double intensityValue;

        @NameInMap("PerceptualScore")
        public Double perceptualScore;

        public static MediaQualityAnalysisJobVqaResultScoreResultColor build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobVqaResultScoreResultColor self = new MediaQualityAnalysisJobVqaResultScoreResultColor();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobVqaResultScoreResultColor setIntensityValue(Double intensityValue) {
            this.intensityValue = intensityValue;
            return this;
        }
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        public MediaQualityAnalysisJobVqaResultScoreResultColor setPerceptualScore(Double perceptualScore) {
            this.perceptualScore = perceptualScore;
            return this;
        }
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

    }

    public static class MediaQualityAnalysisJobVqaResultScoreResultDetail extends TeaModel {
        @NameInMap("IntensityValue")
        public Double intensityValue;

        @NameInMap("PerceptualScore")
        public Double perceptualScore;

        public static MediaQualityAnalysisJobVqaResultScoreResultDetail build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobVqaResultScoreResultDetail self = new MediaQualityAnalysisJobVqaResultScoreResultDetail();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobVqaResultScoreResultDetail setIntensityValue(Double intensityValue) {
            this.intensityValue = intensityValue;
            return this;
        }
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        public MediaQualityAnalysisJobVqaResultScoreResultDetail setPerceptualScore(Double perceptualScore) {
            this.perceptualScore = perceptualScore;
            return this;
        }
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

    }

    public static class MediaQualityAnalysisJobVqaResultScoreResultNoise extends TeaModel {
        @NameInMap("IntensityValue")
        public Double intensityValue;

        @NameInMap("PerceptualScore")
        public Double perceptualScore;

        public static MediaQualityAnalysisJobVqaResultScoreResultNoise build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobVqaResultScoreResultNoise self = new MediaQualityAnalysisJobVqaResultScoreResultNoise();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobVqaResultScoreResultNoise setIntensityValue(Double intensityValue) {
            this.intensityValue = intensityValue;
            return this;
        }
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        public MediaQualityAnalysisJobVqaResultScoreResultNoise setPerceptualScore(Double perceptualScore) {
            this.perceptualScore = perceptualScore;
            return this;
        }
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

    }

    public static class MediaQualityAnalysisJobVqaResultScoreResultSharp extends TeaModel {
        @NameInMap("IntensityValue")
        public Double intensityValue;

        @NameInMap("PerceptualScore")
        public Double perceptualScore;

        public static MediaQualityAnalysisJobVqaResultScoreResultSharp build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobVqaResultScoreResultSharp self = new MediaQualityAnalysisJobVqaResultScoreResultSharp();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobVqaResultScoreResultSharp setIntensityValue(Double intensityValue) {
            this.intensityValue = intensityValue;
            return this;
        }
        public Double getIntensityValue() {
            return this.intensityValue;
        }

        public MediaQualityAnalysisJobVqaResultScoreResultSharp setPerceptualScore(Double perceptualScore) {
            this.perceptualScore = perceptualScore;
            return this;
        }
        public Double getPerceptualScore() {
            return this.perceptualScore;
        }

    }

    public static class MediaQualityAnalysisJobVqaResultScoreResult extends TeaModel {
        @NameInMap("Block")
        public MediaQualityAnalysisJobVqaResultScoreResultBlock block;

        @NameInMap("Color")
        public MediaQualityAnalysisJobVqaResultScoreResultColor color;

        @NameInMap("Detail")
        public MediaQualityAnalysisJobVqaResultScoreResultDetail detail;

        @NameInMap("Noise")
        public MediaQualityAnalysisJobVqaResultScoreResultNoise noise;

        @NameInMap("Sharp")
        public MediaQualityAnalysisJobVqaResultScoreResultSharp sharp;

        public static MediaQualityAnalysisJobVqaResultScoreResult build(java.util.Map<String, ?> map) throws Exception {
            MediaQualityAnalysisJobVqaResultScoreResult self = new MediaQualityAnalysisJobVqaResultScoreResult();
            return TeaModel.build(map, self);
        }

        public MediaQualityAnalysisJobVqaResultScoreResult setBlock(MediaQualityAnalysisJobVqaResultScoreResultBlock block) {
            this.block = block;
            return this;
        }
        public MediaQualityAnalysisJobVqaResultScoreResultBlock getBlock() {
            return this.block;
        }

        public MediaQualityAnalysisJobVqaResultScoreResult setColor(MediaQualityAnalysisJobVqaResultScoreResultColor color) {
            this.color = color;
            return this;
        }
        public MediaQualityAnalysisJobVqaResultScoreResultColor getColor() {
            return this.color;
        }

        public MediaQualityAnalysisJobVqaResultScoreResult setDetail(MediaQualityAnalysisJobVqaResultScoreResultDetail detail) {
            this.detail = detail;
            return this;
        }
        public MediaQualityAnalysisJobVqaResultScoreResultDetail getDetail() {
            return this.detail;
        }

        public MediaQualityAnalysisJobVqaResultScoreResult setNoise(MediaQualityAnalysisJobVqaResultScoreResultNoise noise) {
            this.noise = noise;
            return this;
        }
        public MediaQualityAnalysisJobVqaResultScoreResultNoise getNoise() {
            return this.noise;
        }

        public MediaQualityAnalysisJobVqaResultScoreResult setSharp(MediaQualityAnalysisJobVqaResultScoreResultSharp sharp) {
            this.sharp = sharp;
            return this;
        }
        public MediaQualityAnalysisJobVqaResultScoreResultSharp getSharp() {
            return this.sharp;
        }

    }

}
