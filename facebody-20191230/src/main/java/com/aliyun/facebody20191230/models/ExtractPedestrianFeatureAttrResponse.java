// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttrResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ExtractPedestrianFeatureAttrResponseData data;

    public static ExtractPedestrianFeatureAttrResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttrResponse self = new ExtractPedestrianFeatureAttrResponse();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttrResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtractPedestrianFeatureAttrResponse setData(ExtractPedestrianFeatureAttrResponseData data) {
        this.data = data;
        return this;
    }
    public ExtractPedestrianFeatureAttrResponseData getData() {
        return this.data;
    }

    public static class ExtractPedestrianFeatureAttrResponseData extends TeaModel {
        @NameInMap("ObjType")
        @Validation(required = true)
        public String objType;

        @NameInMap("ObjTypeScore")
        @Validation(required = true)
        public Float objTypeScore;

        @NameInMap("Feature")
        @Validation(required = true)
        public String feature;

        @NameInMap("QualityScore")
        @Validation(required = true)
        public Float qualityScore;

        @NameInMap("UpperColor")
        @Validation(required = true)
        public String upperColor;

        @NameInMap("UpperColorScore")
        @Validation(required = true)
        public Float upperColorScore;

        @NameInMap("UpperType")
        @Validation(required = true)
        public String upperType;

        @NameInMap("UpperTypeScore")
        @Validation(required = true)
        public Float upperTypeScore;

        @NameInMap("LowerColor")
        @Validation(required = true)
        public String lowerColor;

        @NameInMap("LowerColorScore")
        @Validation(required = true)
        public Float lowerColorScore;

        @NameInMap("LowerType")
        @Validation(required = true)
        public String lowerType;

        @NameInMap("LowerTypeScore")
        @Validation(required = true)
        public Float lowerTypeScore;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("GenderScore")
        @Validation(required = true)
        public Float genderScore;

        @NameInMap("Hair")
        @Validation(required = true)
        public String hair;

        @NameInMap("HairScore")
        @Validation(required = true)
        public Float hairScore;

        @NameInMap("Age")
        @Validation(required = true)
        public String age;

        @NameInMap("AgeScore")
        @Validation(required = true)
        public Float ageScore;

        public static ExtractPedestrianFeatureAttrResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttrResponseData self = new ExtractPedestrianFeatureAttrResponseData();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttrResponseData setObjType(String objType) {
            this.objType = objType;
            return this;
        }
        public String getObjType() {
            return this.objType;
        }

        public ExtractPedestrianFeatureAttrResponseData setObjTypeScore(Float objTypeScore) {
            this.objTypeScore = objTypeScore;
            return this;
        }
        public Float getObjTypeScore() {
            return this.objTypeScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ExtractPedestrianFeatureAttrResponseData setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setUpperColor(String upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public String getUpperColor() {
            return this.upperColor;
        }

        public ExtractPedestrianFeatureAttrResponseData setUpperColorScore(Float upperColorScore) {
            this.upperColorScore = upperColorScore;
            return this;
        }
        public Float getUpperColorScore() {
            return this.upperColorScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setUpperType(String upperType) {
            this.upperType = upperType;
            return this;
        }
        public String getUpperType() {
            return this.upperType;
        }

        public ExtractPedestrianFeatureAttrResponseData setUpperTypeScore(Float upperTypeScore) {
            this.upperTypeScore = upperTypeScore;
            return this;
        }
        public Float getUpperTypeScore() {
            return this.upperTypeScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setLowerColor(String lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public String getLowerColor() {
            return this.lowerColor;
        }

        public ExtractPedestrianFeatureAttrResponseData setLowerColorScore(Float lowerColorScore) {
            this.lowerColorScore = lowerColorScore;
            return this;
        }
        public Float getLowerColorScore() {
            return this.lowerColorScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setLowerType(String lowerType) {
            this.lowerType = lowerType;
            return this;
        }
        public String getLowerType() {
            return this.lowerType;
        }

        public ExtractPedestrianFeatureAttrResponseData setLowerTypeScore(Float lowerTypeScore) {
            this.lowerTypeScore = lowerTypeScore;
            return this;
        }
        public Float getLowerTypeScore() {
            return this.lowerTypeScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ExtractPedestrianFeatureAttrResponseData setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setHair(String hair) {
            this.hair = hair;
            return this;
        }
        public String getHair() {
            return this.hair;
        }

        public ExtractPedestrianFeatureAttrResponseData setHairScore(Float hairScore) {
            this.hairScore = hairScore;
            return this;
        }
        public Float getHairScore() {
            return this.hairScore;
        }

        public ExtractPedestrianFeatureAttrResponseData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ExtractPedestrianFeatureAttrResponseData setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

    }

}
