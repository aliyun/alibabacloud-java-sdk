// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class PedestrianDetectAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public PedestrianDetectAttributeResponseData data;

    public static PedestrianDetectAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        PedestrianDetectAttributeResponse self = new PedestrianDetectAttributeResponse();
        return TeaModel.build(map, self);
    }

    public PedestrianDetectAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PedestrianDetectAttributeResponse setData(PedestrianDetectAttributeResponseData data) {
        this.data = data;
        return this;
    }
    public PedestrianDetectAttributeResponseData getData() {
        return this.data;
    }

    public static class PedestrianDetectAttributeResponseDataAttributesAge extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesAge build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesAge self = new PedestrianDetectAttributeResponseDataAttributesAge();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesAge setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesAge setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesBackpack extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesBackpack build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesBackpack self = new PedestrianDetectAttributeResponseDataAttributesBackpack();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesBackpack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesBackpack setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesGender extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesGender build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesGender self = new PedestrianDetectAttributeResponseDataAttributesGender();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesGender setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesGender setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesGlasses extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesGlasses build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesGlasses self = new PedestrianDetectAttributeResponseDataAttributesGlasses();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesGlasses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesGlasses setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesHandbag extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesHandbag build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesHandbag self = new PedestrianDetectAttributeResponseDataAttributesHandbag();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesHandbag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesHandbag setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesHat extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesHat build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesHat self = new PedestrianDetectAttributeResponseDataAttributesHat();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesHat setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesHat setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesLowerColor extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesLowerColor build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesLowerColor self = new PedestrianDetectAttributeResponseDataAttributesLowerColor();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesLowerColor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesLowerColor setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesLowerWear extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesLowerWear build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesLowerWear self = new PedestrianDetectAttributeResponseDataAttributesLowerWear();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesLowerWear setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesLowerWear setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesOrient extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesOrient build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesOrient self = new PedestrianDetectAttributeResponseDataAttributesOrient();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesOrient setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesOrient setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesShoulderBag extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesShoulderBag build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesShoulderBag self = new PedestrianDetectAttributeResponseDataAttributesShoulderBag();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesShoulderBag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesShoulderBag setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesUpperColor extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesUpperColor build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesUpperColor self = new PedestrianDetectAttributeResponseDataAttributesUpperColor();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesUpperColor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesUpperColor setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributesUpperWear extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static PedestrianDetectAttributeResponseDataAttributesUpperWear build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributesUpperWear self = new PedestrianDetectAttributeResponseDataAttributesUpperWear();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributesUpperWear setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseDataAttributesUpperWear setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseDataAttributes extends TeaModel {
        @NameInMap("Age")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesAge age;

        @NameInMap("Backpack")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesBackpack backpack;

        @NameInMap("Gender")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesGender gender;

        @NameInMap("Glasses")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesGlasses glasses;

        @NameInMap("Handbag")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesHandbag handbag;

        @NameInMap("Hat")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesHat hat;

        @NameInMap("LowerColor")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesLowerColor lowerColor;

        @NameInMap("LowerWear")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesLowerWear lowerWear;

        @NameInMap("Orient")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesOrient orient;

        @NameInMap("ShoulderBag")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesShoulderBag shoulderBag;

        @NameInMap("UpperColor")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesUpperColor upperColor;

        @NameInMap("UpperWear")
        @Validation(required = true)
        public PedestrianDetectAttributeResponseDataAttributesUpperWear upperWear;

        public static PedestrianDetectAttributeResponseDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataAttributes self = new PedestrianDetectAttributeResponseDataAttributes();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataAttributes setAge(PedestrianDetectAttributeResponseDataAttributesAge age) {
            this.age = age;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesAge getAge() {
            return this.age;
        }

        public PedestrianDetectAttributeResponseDataAttributes setBackpack(PedestrianDetectAttributeResponseDataAttributesBackpack backpack) {
            this.backpack = backpack;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesBackpack getBackpack() {
            return this.backpack;
        }

        public PedestrianDetectAttributeResponseDataAttributes setGender(PedestrianDetectAttributeResponseDataAttributesGender gender) {
            this.gender = gender;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesGender getGender() {
            return this.gender;
        }

        public PedestrianDetectAttributeResponseDataAttributes setGlasses(PedestrianDetectAttributeResponseDataAttributesGlasses glasses) {
            this.glasses = glasses;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesGlasses getGlasses() {
            return this.glasses;
        }

        public PedestrianDetectAttributeResponseDataAttributes setHandbag(PedestrianDetectAttributeResponseDataAttributesHandbag handbag) {
            this.handbag = handbag;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesHandbag getHandbag() {
            return this.handbag;
        }

        public PedestrianDetectAttributeResponseDataAttributes setHat(PedestrianDetectAttributeResponseDataAttributesHat hat) {
            this.hat = hat;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesHat getHat() {
            return this.hat;
        }

        public PedestrianDetectAttributeResponseDataAttributes setLowerColor(PedestrianDetectAttributeResponseDataAttributesLowerColor lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesLowerColor getLowerColor() {
            return this.lowerColor;
        }

        public PedestrianDetectAttributeResponseDataAttributes setLowerWear(PedestrianDetectAttributeResponseDataAttributesLowerWear lowerWear) {
            this.lowerWear = lowerWear;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesLowerWear getLowerWear() {
            return this.lowerWear;
        }

        public PedestrianDetectAttributeResponseDataAttributes setOrient(PedestrianDetectAttributeResponseDataAttributesOrient orient) {
            this.orient = orient;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesOrient getOrient() {
            return this.orient;
        }

        public PedestrianDetectAttributeResponseDataAttributes setShoulderBag(PedestrianDetectAttributeResponseDataAttributesShoulderBag shoulderBag) {
            this.shoulderBag = shoulderBag;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesShoulderBag getShoulderBag() {
            return this.shoulderBag;
        }

        public PedestrianDetectAttributeResponseDataAttributes setUpperColor(PedestrianDetectAttributeResponseDataAttributesUpperColor upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesUpperColor getUpperColor() {
            return this.upperColor;
        }

        public PedestrianDetectAttributeResponseDataAttributes setUpperWear(PedestrianDetectAttributeResponseDataAttributesUpperWear upperWear) {
            this.upperWear = upperWear;
            return this;
        }
        public PedestrianDetectAttributeResponseDataAttributesUpperWear getUpperWear() {
            return this.upperWear;
        }

    }

    public static class PedestrianDetectAttributeResponseDataBoxes extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("TopLeftX")
        @Validation(required = true)
        public Float topLeftX;

        @NameInMap("TopLeftY")
        @Validation(required = true)
        public Float topLeftY;

        @NameInMap("BottomRightX")
        @Validation(required = true)
        public Float bottomRightX;

        @NameInMap("BottomRightY")
        @Validation(required = true)
        public Float bottomRightY;

        public static PedestrianDetectAttributeResponseDataBoxes build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseDataBoxes self = new PedestrianDetectAttributeResponseDataBoxes();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseDataBoxes setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public PedestrianDetectAttributeResponseDataBoxes setTopLeftX(Float topLeftX) {
            this.topLeftX = topLeftX;
            return this;
        }
        public Float getTopLeftX() {
            return this.topLeftX;
        }

        public PedestrianDetectAttributeResponseDataBoxes setTopLeftY(Float topLeftY) {
            this.topLeftY = topLeftY;
            return this;
        }
        public Float getTopLeftY() {
            return this.topLeftY;
        }

        public PedestrianDetectAttributeResponseDataBoxes setBottomRightX(Float bottomRightX) {
            this.bottomRightX = bottomRightX;
            return this;
        }
        public Float getBottomRightX() {
            return this.bottomRightX;
        }

        public PedestrianDetectAttributeResponseDataBoxes setBottomRightY(Float bottomRightY) {
            this.bottomRightY = bottomRightY;
            return this;
        }
        public Float getBottomRightY() {
            return this.bottomRightY;
        }

    }

    public static class PedestrianDetectAttributeResponseData extends TeaModel {
        @NameInMap("PersonNumber")
        @Validation(required = true)
        public Integer personNumber;

        @NameInMap("Attributes")
        @Validation(required = true)
        public java.util.List<PedestrianDetectAttributeResponseDataAttributes> attributes;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<PedestrianDetectAttributeResponseDataBoxes> boxes;

        public static PedestrianDetectAttributeResponseData build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseData self = new PedestrianDetectAttributeResponseData();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseData setPersonNumber(Integer personNumber) {
            this.personNumber = personNumber;
            return this;
        }
        public Integer getPersonNumber() {
            return this.personNumber;
        }

        public PedestrianDetectAttributeResponseData setAttributes(java.util.List<PedestrianDetectAttributeResponseDataAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<PedestrianDetectAttributeResponseDataAttributes> getAttributes() {
            return this.attributes;
        }

        public PedestrianDetectAttributeResponseData setBoxes(java.util.List<PedestrianDetectAttributeResponseDataBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<PedestrianDetectAttributeResponseDataBoxes> getBoxes() {
            return this.boxes;
        }

    }

}
