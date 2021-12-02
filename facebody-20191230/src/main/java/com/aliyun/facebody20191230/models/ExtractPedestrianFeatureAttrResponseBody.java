// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttrResponseBody extends TeaModel {
    @NameInMap("Data")
    public ExtractPedestrianFeatureAttrResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ExtractPedestrianFeatureAttrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttrResponseBody self = new ExtractPedestrianFeatureAttrResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttrResponseBody setData(ExtractPedestrianFeatureAttrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExtractPedestrianFeatureAttrResponseBodyData getData() {
        return this.data;
    }

    public ExtractPedestrianFeatureAttrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtractPedestrianFeatureAttrResponseBodyData extends TeaModel {
        @NameInMap("Age")
        public String age;

        @NameInMap("AgeScore")
        public Float ageScore;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("GenderScore")
        public Float genderScore;

        @NameInMap("Hair")
        public String hair;

        @NameInMap("HairScore")
        public Float hairScore;

        @NameInMap("LowerColor")
        public String lowerColor;

        @NameInMap("LowerColorScore")
        public Float lowerColorScore;

        @NameInMap("LowerType")
        public String lowerType;

        @NameInMap("LowerTypeScore")
        public Float lowerTypeScore;

        @NameInMap("ObjType")
        public String objType;

        @NameInMap("ObjTypeScore")
        public Float objTypeScore;

        @NameInMap("Orientation")
        public String orientation;

        @NameInMap("OrientationScore")
        public Float orientationScore;

        @NameInMap("QualityScore")
        public Float qualityScore;

        @NameInMap("UpperColor")
        public String upperColor;

        @NameInMap("UpperColorScore")
        public Float upperColorScore;

        @NameInMap("UpperType")
        public String upperType;

        @NameInMap("UpperTypeScore")
        public Float upperTypeScore;

        public static ExtractPedestrianFeatureAttrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttrResponseBodyData self = new ExtractPedestrianFeatureAttrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setHair(String hair) {
            this.hair = hair;
            return this;
        }
        public String getHair() {
            return this.hair;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setHairScore(Float hairScore) {
            this.hairScore = hairScore;
            return this;
        }
        public Float getHairScore() {
            return this.hairScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setLowerColor(String lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public String getLowerColor() {
            return this.lowerColor;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setLowerColorScore(Float lowerColorScore) {
            this.lowerColorScore = lowerColorScore;
            return this;
        }
        public Float getLowerColorScore() {
            return this.lowerColorScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setLowerType(String lowerType) {
            this.lowerType = lowerType;
            return this;
        }
        public String getLowerType() {
            return this.lowerType;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setLowerTypeScore(Float lowerTypeScore) {
            this.lowerTypeScore = lowerTypeScore;
            return this;
        }
        public Float getLowerTypeScore() {
            return this.lowerTypeScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setObjType(String objType) {
            this.objType = objType;
            return this;
        }
        public String getObjType() {
            return this.objType;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setObjTypeScore(Float objTypeScore) {
            this.objTypeScore = objTypeScore;
            return this;
        }
        public Float getObjTypeScore() {
            return this.objTypeScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setOrientation(String orientation) {
            this.orientation = orientation;
            return this;
        }
        public String getOrientation() {
            return this.orientation;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setOrientationScore(Float orientationScore) {
            this.orientationScore = orientationScore;
            return this;
        }
        public Float getOrientationScore() {
            return this.orientationScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setQualityScore(Float qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public Float getQualityScore() {
            return this.qualityScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setUpperColor(String upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public String getUpperColor() {
            return this.upperColor;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setUpperColorScore(Float upperColorScore) {
            this.upperColorScore = upperColorScore;
            return this;
        }
        public Float getUpperColorScore() {
            return this.upperColorScore;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setUpperType(String upperType) {
            this.upperType = upperType;
            return this;
        }
        public String getUpperType() {
            return this.upperType;
        }

        public ExtractPedestrianFeatureAttrResponseBodyData setUpperTypeScore(Float upperTypeScore) {
            this.upperTypeScore = upperTypeScore;
            return this;
        }
        public Float getUpperTypeScore() {
            return this.upperTypeScore;
        }

    }

}
