// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class PredictCVDResponseBody extends TeaModel {
    @NameInMap("Data")
    public PredictCVDResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7CB9B663-3EF8-4C9C-A464-FDA2B5F1E3A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PredictCVDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictCVDResponseBody self = new PredictCVDResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictCVDResponseBody setData(PredictCVDResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PredictCVDResponseBodyData getData() {
        return this.data;
    }

    public PredictCVDResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PredictCVDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PredictCVDResponseBodyDataLesionFeatureScore extends TeaModel {
        @NameInMap("AortaCalciumScore")
        public java.util.List<Double> aortaCalciumScore;

        @NameInMap("AortaCalciumVolume")
        public java.util.List<Double> aortaCalciumVolume;

        @NameInMap("AortaMaxDiam")
        public java.util.List<Double> aortaMaxDiam;

        @NameInMap("AortaMaxDiamStd")
        public java.util.List<Double> aortaMaxDiamStd;

        @NameInMap("AorticHeightIndex")
        public java.util.List<Double> aorticHeightIndex;

        @NameInMap("AorticTortuosityIndex")
        public java.util.List<Double> aorticTortuosityIndex;

        @NameInMap("AscAoMaxDiam")
        public java.util.List<Double> ascAoMaxDiam;

        @NameInMap("AscendAortaLength")
        public java.util.List<Double> ascendAortaLength;

        @NameInMap("CardioThoracicRatio")
        public java.util.List<Double> cardioThoracicRatio;

        @NameInMap("ChestWidth")
        public java.util.List<Double> chestWidth;

        @NameInMap("CoronaryCalciumScore")
        public java.util.List<Double> coronaryCalciumScore;

        @NameInMap("CoronaryCalciumVol")
        public java.util.List<Double> coronaryCalciumVol;

        @NameInMap("DeepFeature")
        public java.util.List<Double> deepFeature;

        @NameInMap("EatHUMean")
        public java.util.List<Double> eatHUMean;

        @NameInMap("EatHUSTD")
        public java.util.List<Double> eatHUSTD;

        @NameInMap("EatVolume")
        public java.util.List<Double> eatVolume;

        @NameInMap("HeartLongDiam")
        public java.util.List<Double> heartLongDiam;

        @NameInMap("HeartShortDiam")
        public java.util.List<Double> heartShortDiam;

        @NameInMap("HeartWidth")
        public java.util.List<Double> heartWidth;

        @NameInMap("LeftLungHighattRatio")
        public java.util.List<Double> leftLungHighattRatio;

        @NameInMap("LeftLungLowattRatio")
        public java.util.List<Double> leftLungLowattRatio;

        @NameInMap("MyoEpiRatio")
        public java.util.List<Double> myoEpiRatio;

        @NameInMap("RightLungHighattRatio")
        public java.util.List<Double> rightLungHighattRatio;

        @NameInMap("RightLungLowattRatio")
        public java.util.List<Double> rightLungLowattRatio;

        public static PredictCVDResponseBodyDataLesionFeatureScore build(java.util.Map<String, ?> map) throws Exception {
            PredictCVDResponseBodyDataLesionFeatureScore self = new PredictCVDResponseBodyDataLesionFeatureScore();
            return TeaModel.build(map, self);
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAortaCalciumScore(java.util.List<Double> aortaCalciumScore) {
            this.aortaCalciumScore = aortaCalciumScore;
            return this;
        }
        public java.util.List<Double> getAortaCalciumScore() {
            return this.aortaCalciumScore;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAortaCalciumVolume(java.util.List<Double> aortaCalciumVolume) {
            this.aortaCalciumVolume = aortaCalciumVolume;
            return this;
        }
        public java.util.List<Double> getAortaCalciumVolume() {
            return this.aortaCalciumVolume;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAortaMaxDiam(java.util.List<Double> aortaMaxDiam) {
            this.aortaMaxDiam = aortaMaxDiam;
            return this;
        }
        public java.util.List<Double> getAortaMaxDiam() {
            return this.aortaMaxDiam;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAortaMaxDiamStd(java.util.List<Double> aortaMaxDiamStd) {
            this.aortaMaxDiamStd = aortaMaxDiamStd;
            return this;
        }
        public java.util.List<Double> getAortaMaxDiamStd() {
            return this.aortaMaxDiamStd;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAorticHeightIndex(java.util.List<Double> aorticHeightIndex) {
            this.aorticHeightIndex = aorticHeightIndex;
            return this;
        }
        public java.util.List<Double> getAorticHeightIndex() {
            return this.aorticHeightIndex;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAorticTortuosityIndex(java.util.List<Double> aorticTortuosityIndex) {
            this.aorticTortuosityIndex = aorticTortuosityIndex;
            return this;
        }
        public java.util.List<Double> getAorticTortuosityIndex() {
            return this.aorticTortuosityIndex;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAscAoMaxDiam(java.util.List<Double> ascAoMaxDiam) {
            this.ascAoMaxDiam = ascAoMaxDiam;
            return this;
        }
        public java.util.List<Double> getAscAoMaxDiam() {
            return this.ascAoMaxDiam;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setAscendAortaLength(java.util.List<Double> ascendAortaLength) {
            this.ascendAortaLength = ascendAortaLength;
            return this;
        }
        public java.util.List<Double> getAscendAortaLength() {
            return this.ascendAortaLength;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setCardioThoracicRatio(java.util.List<Double> cardioThoracicRatio) {
            this.cardioThoracicRatio = cardioThoracicRatio;
            return this;
        }
        public java.util.List<Double> getCardioThoracicRatio() {
            return this.cardioThoracicRatio;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setChestWidth(java.util.List<Double> chestWidth) {
            this.chestWidth = chestWidth;
            return this;
        }
        public java.util.List<Double> getChestWidth() {
            return this.chestWidth;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setCoronaryCalciumScore(java.util.List<Double> coronaryCalciumScore) {
            this.coronaryCalciumScore = coronaryCalciumScore;
            return this;
        }
        public java.util.List<Double> getCoronaryCalciumScore() {
            return this.coronaryCalciumScore;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setCoronaryCalciumVol(java.util.List<Double> coronaryCalciumVol) {
            this.coronaryCalciumVol = coronaryCalciumVol;
            return this;
        }
        public java.util.List<Double> getCoronaryCalciumVol() {
            return this.coronaryCalciumVol;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setDeepFeature(java.util.List<Double> deepFeature) {
            this.deepFeature = deepFeature;
            return this;
        }
        public java.util.List<Double> getDeepFeature() {
            return this.deepFeature;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setEatHUMean(java.util.List<Double> eatHUMean) {
            this.eatHUMean = eatHUMean;
            return this;
        }
        public java.util.List<Double> getEatHUMean() {
            return this.eatHUMean;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setEatHUSTD(java.util.List<Double> eatHUSTD) {
            this.eatHUSTD = eatHUSTD;
            return this;
        }
        public java.util.List<Double> getEatHUSTD() {
            return this.eatHUSTD;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setEatVolume(java.util.List<Double> eatVolume) {
            this.eatVolume = eatVolume;
            return this;
        }
        public java.util.List<Double> getEatVolume() {
            return this.eatVolume;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setHeartLongDiam(java.util.List<Double> heartLongDiam) {
            this.heartLongDiam = heartLongDiam;
            return this;
        }
        public java.util.List<Double> getHeartLongDiam() {
            return this.heartLongDiam;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setHeartShortDiam(java.util.List<Double> heartShortDiam) {
            this.heartShortDiam = heartShortDiam;
            return this;
        }
        public java.util.List<Double> getHeartShortDiam() {
            return this.heartShortDiam;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setHeartWidth(java.util.List<Double> heartWidth) {
            this.heartWidth = heartWidth;
            return this;
        }
        public java.util.List<Double> getHeartWidth() {
            return this.heartWidth;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setLeftLungHighattRatio(java.util.List<Double> leftLungHighattRatio) {
            this.leftLungHighattRatio = leftLungHighattRatio;
            return this;
        }
        public java.util.List<Double> getLeftLungHighattRatio() {
            return this.leftLungHighattRatio;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setLeftLungLowattRatio(java.util.List<Double> leftLungLowattRatio) {
            this.leftLungLowattRatio = leftLungLowattRatio;
            return this;
        }
        public java.util.List<Double> getLeftLungLowattRatio() {
            return this.leftLungLowattRatio;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setMyoEpiRatio(java.util.List<Double> myoEpiRatio) {
            this.myoEpiRatio = myoEpiRatio;
            return this;
        }
        public java.util.List<Double> getMyoEpiRatio() {
            return this.myoEpiRatio;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setRightLungHighattRatio(java.util.List<Double> rightLungHighattRatio) {
            this.rightLungHighattRatio = rightLungHighattRatio;
            return this;
        }
        public java.util.List<Double> getRightLungHighattRatio() {
            return this.rightLungHighattRatio;
        }

        public PredictCVDResponseBodyDataLesionFeatureScore setRightLungLowattRatio(java.util.List<Double> rightLungLowattRatio) {
            this.rightLungLowattRatio = rightLungLowattRatio;
            return this;
        }
        public java.util.List<Double> getRightLungLowattRatio() {
            return this.rightLungLowattRatio;
        }

    }

    public static class PredictCVDResponseBodyDataLesion extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CVDProbability")
        public Float CVDProbability;

        @NameInMap("FeatureScore")
        public PredictCVDResponseBodyDataLesionFeatureScore featureScore;

        @NameInMap("ImagesURL")
        public String imagesURL;

        @NameInMap("ResultURL")
        public java.util.List<String> resultURL;

        public static PredictCVDResponseBodyDataLesion build(java.util.Map<String, ?> map) throws Exception {
            PredictCVDResponseBodyDataLesion self = new PredictCVDResponseBodyDataLesion();
            return TeaModel.build(map, self);
        }

        public PredictCVDResponseBodyDataLesion setCVDProbability(Float CVDProbability) {
            this.CVDProbability = CVDProbability;
            return this;
        }
        public Float getCVDProbability() {
            return this.CVDProbability;
        }

        public PredictCVDResponseBodyDataLesion setFeatureScore(PredictCVDResponseBodyDataLesionFeatureScore featureScore) {
            this.featureScore = featureScore;
            return this;
        }
        public PredictCVDResponseBodyDataLesionFeatureScore getFeatureScore() {
            return this.featureScore;
        }

        public PredictCVDResponseBodyDataLesion setImagesURL(String imagesURL) {
            this.imagesURL = imagesURL;
            return this;
        }
        public String getImagesURL() {
            return this.imagesURL;
        }

        public PredictCVDResponseBodyDataLesion setResultURL(java.util.List<String> resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public java.util.List<String> getResultURL() {
            return this.resultURL;
        }

    }

    public static class PredictCVDResponseBodyData extends TeaModel {
        @NameInMap("Lesion")
        public PredictCVDResponseBodyDataLesion lesion;

        public static PredictCVDResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PredictCVDResponseBodyData self = new PredictCVDResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PredictCVDResponseBodyData setLesion(PredictCVDResponseBodyDataLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public PredictCVDResponseBodyDataLesion getLesion() {
            return this.lesion;
        }

    }

}
