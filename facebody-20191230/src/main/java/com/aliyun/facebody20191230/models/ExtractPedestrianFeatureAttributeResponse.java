// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ExtractPedestrianFeatureAttributeResponseData data;

    public static ExtractPedestrianFeatureAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttributeResponse self = new ExtractPedestrianFeatureAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtractPedestrianFeatureAttributeResponse setData(ExtractPedestrianFeatureAttributeResponseData data) {
        this.data = data;
        return this;
    }
    public ExtractPedestrianFeatureAttributeResponseData getData() {
        return this.data;
    }

    public static class ExtractPedestrianFeatureAttributeResponseDataElements extends TeaModel {
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

        public static ExtractPedestrianFeatureAttributeResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttributeResponseDataElements self = new ExtractPedestrianFeatureAttributeResponseDataElements();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setObjType(String objType) {
            this.objType = objType;
            return this;
        }
        public String getObjType() {
            return this.objType;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setObjTypeScore(Float objTypeScore) {
            this.objTypeScore = objTypeScore;
            return this;
        }
        public Float getObjTypeScore() {
            return this.objTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setUpperColor(String upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public String getUpperColor() {
            return this.upperColor;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setUpperColorScore(Float upperColorScore) {
            this.upperColorScore = upperColorScore;
            return this;
        }
        public Float getUpperColorScore() {
            return this.upperColorScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setUpperType(String upperType) {
            this.upperType = upperType;
            return this;
        }
        public String getUpperType() {
            return this.upperType;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setUpperTypeScore(Float upperTypeScore) {
            this.upperTypeScore = upperTypeScore;
            return this;
        }
        public Float getUpperTypeScore() {
            return this.upperTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setLowerColor(String lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public String getLowerColor() {
            return this.lowerColor;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setLowerColorScore(Float lowerColorScore) {
            this.lowerColorScore = lowerColorScore;
            return this;
        }
        public Float getLowerColorScore() {
            return this.lowerColorScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setLowerType(String lowerType) {
            this.lowerType = lowerType;
            return this;
        }
        public String getLowerType() {
            return this.lowerType;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setLowerTypeScore(Float lowerTypeScore) {
            this.lowerTypeScore = lowerTypeScore;
            return this;
        }
        public Float getLowerTypeScore() {
            return this.lowerTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setHair(String hair) {
            this.hair = hair;
            return this;
        }
        public String getHair() {
            return this.hair;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setHairScore(Float hairScore) {
            this.hairScore = hairScore;
            return this;
        }
        public Float getHairScore() {
            return this.hairScore;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ExtractPedestrianFeatureAttributeResponseDataElements setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

    }

    public static class ExtractPedestrianFeatureAttributeResponseData extends TeaModel {
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

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<ExtractPedestrianFeatureAttributeResponseDataElements> elements;

        public static ExtractPedestrianFeatureAttributeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttributeResponseData self = new ExtractPedestrianFeatureAttributeResponseData();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttributeResponseData setObjType(String objType) {
            this.objType = objType;
            return this;
        }
        public String getObjType() {
            return this.objType;
        }

        public ExtractPedestrianFeatureAttributeResponseData setObjTypeScore(Float objTypeScore) {
            this.objTypeScore = objTypeScore;
            return this;
        }
        public Float getObjTypeScore() {
            return this.objTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ExtractPedestrianFeatureAttributeResponseData setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setUpperColor(String upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public String getUpperColor() {
            return this.upperColor;
        }

        public ExtractPedestrianFeatureAttributeResponseData setUpperColorScore(Float upperColorScore) {
            this.upperColorScore = upperColorScore;
            return this;
        }
        public Float getUpperColorScore() {
            return this.upperColorScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setUpperType(String upperType) {
            this.upperType = upperType;
            return this;
        }
        public String getUpperType() {
            return this.upperType;
        }

        public ExtractPedestrianFeatureAttributeResponseData setUpperTypeScore(Float upperTypeScore) {
            this.upperTypeScore = upperTypeScore;
            return this;
        }
        public Float getUpperTypeScore() {
            return this.upperTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setLowerColor(String lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public String getLowerColor() {
            return this.lowerColor;
        }

        public ExtractPedestrianFeatureAttributeResponseData setLowerColorScore(Float lowerColorScore) {
            this.lowerColorScore = lowerColorScore;
            return this;
        }
        public Float getLowerColorScore() {
            return this.lowerColorScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setLowerType(String lowerType) {
            this.lowerType = lowerType;
            return this;
        }
        public String getLowerType() {
            return this.lowerType;
        }

        public ExtractPedestrianFeatureAttributeResponseData setLowerTypeScore(Float lowerTypeScore) {
            this.lowerTypeScore = lowerTypeScore;
            return this;
        }
        public Float getLowerTypeScore() {
            return this.lowerTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ExtractPedestrianFeatureAttributeResponseData setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setHair(String hair) {
            this.hair = hair;
            return this;
        }
        public String getHair() {
            return this.hair;
        }

        public ExtractPedestrianFeatureAttributeResponseData setHairScore(Float hairScore) {
            this.hairScore = hairScore;
            return this;
        }
        public Float getHairScore() {
            return this.hairScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ExtractPedestrianFeatureAttributeResponseData setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

        public ExtractPedestrianFeatureAttributeResponseData setElements(java.util.List<ExtractPedestrianFeatureAttributeResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ExtractPedestrianFeatureAttributeResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
