// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenLCResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenLCResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473dbfb0-9cb7-e18e-450b-e4d0e4ce6c1c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScreenLCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScreenLCResponseBody self = new ScreenLCResponseBody();
        return TeaModel.build(map, self);
    }

    public ScreenLCResponseBody setData(ScreenLCResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScreenLCResponseBodyData getData() {
        return this.data;
    }

    public ScreenLCResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScreenLCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb extends TeaModel {
        @NameInMap("BenignProb")
        public Float benignProb;

        @NameInMap("CalcProb")
        public Float calcProb;

        @NameInMap("CystProb")
        public Float cystProb;

        @NameInMap("MalignantProb")
        public Float malignantProb;

        public static ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb self = new ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb();
            return TeaModel.build(map, self);
        }

        public ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb setBenignProb(Float benignProb) {
            this.benignProb = benignProb;
            return this;
        }
        public Float getBenignProb() {
            return this.benignProb;
        }

        public ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb setCalcProb(Float calcProb) {
            this.calcProb = calcProb;
            return this;
        }
        public Float getCalcProb() {
            return this.calcProb;
        }

        public ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb setCystProb(Float cystProb) {
            this.cystProb = cystProb;
            return this;
        }
        public Float getCystProb() {
            return this.cystProb;
        }

        public ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb setMalignantProb(Float malignantProb) {
            this.malignantProb = malignantProb;
            return this;
        }
        public Float getMalignantProb() {
            return this.malignantProb;
        }

    }

    public static class ScreenLCResponseBodyDataLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KeySlice")
        public Long keySlice;

        /**
         * <strong>example:</strong>
         * <p>0.9375</p>
         */
        @NameInMap("Malignancy")
        public Float malignancy;

        @NameInMap("RecistEndpoints")
        public java.util.List<Float> recistEndpoints;

        @NameInMap("ScoreAllClassesProb")
        public ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb scoreAllClassesProb;

        /**
         * <strong>example:</strong>
         * <p>HCC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>305.3661</p>
         */
        @NameInMap("Volume")
        public Float volume;

        public static ScreenLCResponseBodyDataLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCResponseBodyDataLesionLesionList self = new ScreenLCResponseBodyDataLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenLCResponseBodyDataLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenLCResponseBodyDataLesionLesionList setKeySlice(Long keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Long getKeySlice() {
            return this.keySlice;
        }

        public ScreenLCResponseBodyDataLesionLesionList setMalignancy(Float malignancy) {
            this.malignancy = malignancy;
            return this;
        }
        public Float getMalignancy() {
            return this.malignancy;
        }

        public ScreenLCResponseBodyDataLesionLesionList setRecistEndpoints(java.util.List<Float> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<Float> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenLCResponseBodyDataLesionLesionList setScoreAllClassesProb(ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb scoreAllClassesProb) {
            this.scoreAllClassesProb = scoreAllClassesProb;
            return this;
        }
        public ScreenLCResponseBodyDataLesionLesionListScoreAllClassesProb getScoreAllClassesProb() {
            return this.scoreAllClassesProb;
        }

        public ScreenLCResponseBodyDataLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ScreenLCResponseBodyDataLesionLesionList setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

    }

    public static class ScreenLCResponseBodyDataLesionPatientLevelResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0077</p>
         */
        @NameInMap("BenignNonCystProb")
        public String benignNonCystProb;

        @NameInMap("BenignProb")
        public Float benignProb;

        @NameInMap("CalcProb")
        public Float calcProb;

        /**
         * <strong>example:</strong>
         * <p>0.9233</p>
         */
        @NameInMap("CystProb")
        public Float cystProb;

        /**
         * <strong>example:</strong>
         * <p>0.9941</p>
         */
        @NameInMap("HCCProb")
        public Float HCCProb;

        /**
         * <strong>example:</strong>
         * <p>0.0073</p>
         */
        @NameInMap("MalignantNonHCCProb")
        public Float malignantNonHCCProb;

        @NameInMap("MalignantProb")
        public Float malignantProb;

        public static ScreenLCResponseBodyDataLesionPatientLevelResult build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCResponseBodyDataLesionPatientLevelResult self = new ScreenLCResponseBodyDataLesionPatientLevelResult();
            return TeaModel.build(map, self);
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setBenignNonCystProb(String benignNonCystProb) {
            this.benignNonCystProb = benignNonCystProb;
            return this;
        }
        public String getBenignNonCystProb() {
            return this.benignNonCystProb;
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setBenignProb(Float benignProb) {
            this.benignProb = benignProb;
            return this;
        }
        public Float getBenignProb() {
            return this.benignProb;
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setCalcProb(Float calcProb) {
            this.calcProb = calcProb;
            return this;
        }
        public Float getCalcProb() {
            return this.calcProb;
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setCystProb(Float cystProb) {
            this.cystProb = cystProb;
            return this;
        }
        public Float getCystProb() {
            return this.cystProb;
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setHCCProb(Float HCCProb) {
            this.HCCProb = HCCProb;
            return this;
        }
        public Float getHCCProb() {
            return this.HCCProb;
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setMalignantNonHCCProb(Float malignantNonHCCProb) {
            this.malignantNonHCCProb = malignantNonHCCProb;
            return this;
        }
        public Float getMalignantNonHCCProb() {
            return this.malignantNonHCCProb;
        }

        public ScreenLCResponseBodyDataLesionPatientLevelResult setMalignantProb(Float malignantProb) {
            this.malignantProb = malignantProb;
            return this;
        }
        public Float getMalignantProb() {
            return this.malignantProb;
        }

    }

    public static class ScreenLCResponseBodyDataLesion extends TeaModel {
        @NameInMap("LesionList")
        public java.util.List<ScreenLCResponseBodyDataLesionLesionList> lesionList;

        /**
         * <strong>example:</strong>
         * <p>1364.9468</p>
         */
        @NameInMap("LiverVolume")
        public Float liverVolume;

        /**
         * <strong>example:</strong>
         * <p>20-050_0000.nii.gz</p>
         */
        @NameInMap("Mask")
        public String mask;

        @NameInMap("PatientLevelProb")
        public Float patientLevelProb;

        @NameInMap("PatientLevelResult")
        public ScreenLCResponseBodyDataLesionPatientLevelResult patientLevelResult;

        public static ScreenLCResponseBodyDataLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCResponseBodyDataLesion self = new ScreenLCResponseBodyDataLesion();
            return TeaModel.build(map, self);
        }

        public ScreenLCResponseBodyDataLesion setLesionList(java.util.List<ScreenLCResponseBodyDataLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenLCResponseBodyDataLesionLesionList> getLesionList() {
            return this.lesionList;
        }

        public ScreenLCResponseBodyDataLesion setLiverVolume(Float liverVolume) {
            this.liverVolume = liverVolume;
            return this;
        }
        public Float getLiverVolume() {
            return this.liverVolume;
        }

        public ScreenLCResponseBodyDataLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenLCResponseBodyDataLesion setPatientLevelProb(Float patientLevelProb) {
            this.patientLevelProb = patientLevelProb;
            return this;
        }
        public Float getPatientLevelProb() {
            return this.patientLevelProb;
        }

        public ScreenLCResponseBodyDataLesion setPatientLevelResult(ScreenLCResponseBodyDataLesionPatientLevelResult patientLevelResult) {
            this.patientLevelResult = patientLevelResult;
            return this;
        }
        public ScreenLCResponseBodyDataLesionPatientLevelResult getPatientLevelResult() {
            return this.patientLevelResult;
        }

    }

    public static class ScreenLCResponseBodyData extends TeaModel {
        @NameInMap("Lesion")
        public ScreenLCResponseBodyDataLesion lesion;

        public static ScreenLCResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScreenLCResponseBodyData self = new ScreenLCResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScreenLCResponseBodyData setLesion(ScreenLCResponseBodyDataLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenLCResponseBodyDataLesion getLesion() {
            return this.lesion;
        }

    }

}
