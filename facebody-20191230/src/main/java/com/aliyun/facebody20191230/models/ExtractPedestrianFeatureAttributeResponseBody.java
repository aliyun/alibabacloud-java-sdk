// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ExtractPedestrianFeatureAttributeResponseBodyData data;

    public static ExtractPedestrianFeatureAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttributeResponseBody self = new ExtractPedestrianFeatureAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExtractPedestrianFeatureAttributeResponseBody setData(ExtractPedestrianFeatureAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtractPedestrianFeatureAttributeResponseBodyData getData() {
        return this.data;
    }

    public static class ExtractPedestrianFeatureAttributeResponseBodyDataElements extends TeaModel {
        @NameInMap("QualityScore")
        public Float qualityScore;

        @NameInMap("ObjType")
        public String objType;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("LowerColorScore")
        public Float lowerColorScore;

        @NameInMap("ObjTypeScore")
        public Float objTypeScore;

        @NameInMap("Age")
        public String age;

        @NameInMap("AgeScore")
        public Float ageScore;

        @NameInMap("UpperTypeScore")
        public Float upperTypeScore;

        @NameInMap("LowerTypeScore")
        public Float lowerTypeScore;

        @NameInMap("LowerColor")
        public String lowerColor;

        @NameInMap("Hair")
        public String hair;

        @NameInMap("UpperColor")
        public String upperColor;

        @NameInMap("GenderScore")
        public Float genderScore;

        @NameInMap("UpperType")
        public String upperType;

        @NameInMap("HairScore")
        public Float hairScore;

        @NameInMap("LowerType")
        public String lowerType;

        @NameInMap("UpperColorScore")
        public Float upperColorScore;

        public static ExtractPedestrianFeatureAttributeResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttributeResponseBodyDataElements self = new ExtractPedestrianFeatureAttributeResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setObjType(String objType) {
            this.objType = objType;
            return this;
        }
        public String getObjType() {
            return this.objType;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setLowerColorScore(Float lowerColorScore) {
            this.lowerColorScore = lowerColorScore;
            return this;
        }
        public Float getLowerColorScore() {
            return this.lowerColorScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setObjTypeScore(Float objTypeScore) {
            this.objTypeScore = objTypeScore;
            return this;
        }
        public Float getObjTypeScore() {
            return this.objTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setUpperTypeScore(Float upperTypeScore) {
            this.upperTypeScore = upperTypeScore;
            return this;
        }
        public Float getUpperTypeScore() {
            return this.upperTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setLowerTypeScore(Float lowerTypeScore) {
            this.lowerTypeScore = lowerTypeScore;
            return this;
        }
        public Float getLowerTypeScore() {
            return this.lowerTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setLowerColor(String lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public String getLowerColor() {
            return this.lowerColor;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setHair(String hair) {
            this.hair = hair;
            return this;
        }
        public String getHair() {
            return this.hair;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setUpperColor(String upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public String getUpperColor() {
            return this.upperColor;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setUpperType(String upperType) {
            this.upperType = upperType;
            return this;
        }
        public String getUpperType() {
            return this.upperType;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setHairScore(Float hairScore) {
            this.hairScore = hairScore;
            return this;
        }
        public Float getHairScore() {
            return this.hairScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setLowerType(String lowerType) {
            this.lowerType = lowerType;
            return this;
        }
        public String getLowerType() {
            return this.lowerType;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyDataElements setUpperColorScore(Float upperColorScore) {
            this.upperColorScore = upperColorScore;
            return this;
        }
        public Float getUpperColorScore() {
            return this.upperColorScore;
        }

    }

    public static class ExtractPedestrianFeatureAttributeResponseBodyData extends TeaModel {
        @NameInMap("QualityScore")
        public Float qualityScore;

        @NameInMap("ObjType")
        public String objType;

        @NameInMap("Elements")
        public java.util.List<ExtractPedestrianFeatureAttributeResponseBodyDataElements> elements;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("LowerColorScore")
        public Float lowerColorScore;

        @NameInMap("ObjTypeScore")
        public Float objTypeScore;

        @NameInMap("Age")
        public String age;

        @NameInMap("AgeScore")
        public Float ageScore;

        @NameInMap("UpperTypeScore")
        public Float upperTypeScore;

        @NameInMap("LowerTypeScore")
        public Float lowerTypeScore;

        @NameInMap("LowerColor")
        public String lowerColor;

        @NameInMap("Hair")
        public String hair;

        @NameInMap("UpperColor")
        public String upperColor;

        @NameInMap("GenderScore")
        public Float genderScore;

        @NameInMap("UpperType")
        public String upperType;

        @NameInMap("HairScore")
        public Float hairScore;

        @NameInMap("LowerType")
        public String lowerType;

        @NameInMap("UpperColorScore")
        public Float upperColorScore;

        public static ExtractPedestrianFeatureAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttributeResponseBodyData self = new ExtractPedestrianFeatureAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setObjType(String objType) {
            this.objType = objType;
            return this;
        }
        public String getObjType() {
            return this.objType;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setElements(java.util.List<ExtractPedestrianFeatureAttributeResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ExtractPedestrianFeatureAttributeResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setLowerColorScore(Float lowerColorScore) {
            this.lowerColorScore = lowerColorScore;
            return this;
        }
        public Float getLowerColorScore() {
            return this.lowerColorScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setObjTypeScore(Float objTypeScore) {
            this.objTypeScore = objTypeScore;
            return this;
        }
        public Float getObjTypeScore() {
            return this.objTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setUpperTypeScore(Float upperTypeScore) {
            this.upperTypeScore = upperTypeScore;
            return this;
        }
        public Float getUpperTypeScore() {
            return this.upperTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setLowerTypeScore(Float lowerTypeScore) {
            this.lowerTypeScore = lowerTypeScore;
            return this;
        }
        public Float getLowerTypeScore() {
            return this.lowerTypeScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setLowerColor(String lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public String getLowerColor() {
            return this.lowerColor;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setHair(String hair) {
            this.hair = hair;
            return this;
        }
        public String getHair() {
            return this.hair;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setUpperColor(String upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public String getUpperColor() {
            return this.upperColor;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setUpperType(String upperType) {
            this.upperType = upperType;
            return this;
        }
        public String getUpperType() {
            return this.upperType;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setHairScore(Float hairScore) {
            this.hairScore = hairScore;
            return this;
        }
        public Float getHairScore() {
            return this.hairScore;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setLowerType(String lowerType) {
            this.lowerType = lowerType;
            return this;
        }
        public String getLowerType() {
            return this.lowerType;
        }

        public ExtractPedestrianFeatureAttributeResponseBodyData setUpperColorScore(Float upperColorScore) {
            this.upperColorScore = upperColorScore;
            return this;
        }
        public Float getUpperColorScore() {
            return this.upperColorScore;
        }

    }

}
