// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class PedestrianDetectAttributeResponseBody extends TeaModel {
    @NameInMap("Data")
    public PedestrianDetectAttributeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static PedestrianDetectAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PedestrianDetectAttributeResponseBody self = new PedestrianDetectAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public PedestrianDetectAttributeResponseBody setData(PedestrianDetectAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PedestrianDetectAttributeResponseBodyData getData() {
        return this.data;
    }

    public PedestrianDetectAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesAge extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesAge build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesAge self = new PedestrianDetectAttributeResponseBodyDataAttributesAge();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesAge setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesAge setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesBackpack extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesBackpack build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesBackpack self = new PedestrianDetectAttributeResponseBodyDataAttributesBackpack();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesBackpack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesBackpack setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesGender extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesGender build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesGender self = new PedestrianDetectAttributeResponseBodyDataAttributesGender();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesGender setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesGender setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesGlasses extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesGlasses build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesGlasses self = new PedestrianDetectAttributeResponseBodyDataAttributesGlasses();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesGlasses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesGlasses setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesHandbag extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesHandbag build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesHandbag self = new PedestrianDetectAttributeResponseBodyDataAttributesHandbag();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesHandbag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesHandbag setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesHat extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesHat build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesHat self = new PedestrianDetectAttributeResponseBodyDataAttributesHat();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesHat setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesHat setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesLowerColor extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesLowerColor build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesLowerColor self = new PedestrianDetectAttributeResponseBodyDataAttributesLowerColor();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesLowerColor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesLowerColor setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesLowerWear extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesLowerWear build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesLowerWear self = new PedestrianDetectAttributeResponseBodyDataAttributesLowerWear();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesLowerWear setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesLowerWear setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesOrient extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesOrient build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesOrient self = new PedestrianDetectAttributeResponseBodyDataAttributesOrient();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesOrient setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesOrient setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag self = new PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesUpperColor extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesUpperColor build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesUpperColor self = new PedestrianDetectAttributeResponseBodyDataAttributesUpperColor();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesUpperColor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesUpperColor setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributesUpperWear extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public Float score;

        public static PedestrianDetectAttributeResponseBodyDataAttributesUpperWear build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributesUpperWear self = new PedestrianDetectAttributeResponseBodyDataAttributesUpperWear();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesUpperWear setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributesUpperWear setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataAttributes extends TeaModel {
        @NameInMap("Age")
        public PedestrianDetectAttributeResponseBodyDataAttributesAge age;

        @NameInMap("Backpack")
        public PedestrianDetectAttributeResponseBodyDataAttributesBackpack backpack;

        @NameInMap("Gender")
        public PedestrianDetectAttributeResponseBodyDataAttributesGender gender;

        @NameInMap("Glasses")
        public PedestrianDetectAttributeResponseBodyDataAttributesGlasses glasses;

        @NameInMap("Handbag")
        public PedestrianDetectAttributeResponseBodyDataAttributesHandbag handbag;

        @NameInMap("Hat")
        public PedestrianDetectAttributeResponseBodyDataAttributesHat hat;

        @NameInMap("LowerColor")
        public PedestrianDetectAttributeResponseBodyDataAttributesLowerColor lowerColor;

        @NameInMap("LowerWear")
        public PedestrianDetectAttributeResponseBodyDataAttributesLowerWear lowerWear;

        @NameInMap("Orient")
        public PedestrianDetectAttributeResponseBodyDataAttributesOrient orient;

        @NameInMap("ShoulderBag")
        public PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag shoulderBag;

        @NameInMap("UpperColor")
        public PedestrianDetectAttributeResponseBodyDataAttributesUpperColor upperColor;

        @NameInMap("UpperWear")
        public PedestrianDetectAttributeResponseBodyDataAttributesUpperWear upperWear;

        public static PedestrianDetectAttributeResponseBodyDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataAttributes self = new PedestrianDetectAttributeResponseBodyDataAttributes();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setAge(PedestrianDetectAttributeResponseBodyDataAttributesAge age) {
            this.age = age;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesAge getAge() {
            return this.age;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setBackpack(PedestrianDetectAttributeResponseBodyDataAttributesBackpack backpack) {
            this.backpack = backpack;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesBackpack getBackpack() {
            return this.backpack;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setGender(PedestrianDetectAttributeResponseBodyDataAttributesGender gender) {
            this.gender = gender;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesGender getGender() {
            return this.gender;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setGlasses(PedestrianDetectAttributeResponseBodyDataAttributesGlasses glasses) {
            this.glasses = glasses;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesGlasses getGlasses() {
            return this.glasses;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setHandbag(PedestrianDetectAttributeResponseBodyDataAttributesHandbag handbag) {
            this.handbag = handbag;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesHandbag getHandbag() {
            return this.handbag;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setHat(PedestrianDetectAttributeResponseBodyDataAttributesHat hat) {
            this.hat = hat;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesHat getHat() {
            return this.hat;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setLowerColor(PedestrianDetectAttributeResponseBodyDataAttributesLowerColor lowerColor) {
            this.lowerColor = lowerColor;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesLowerColor getLowerColor() {
            return this.lowerColor;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setLowerWear(PedestrianDetectAttributeResponseBodyDataAttributesLowerWear lowerWear) {
            this.lowerWear = lowerWear;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesLowerWear getLowerWear() {
            return this.lowerWear;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setOrient(PedestrianDetectAttributeResponseBodyDataAttributesOrient orient) {
            this.orient = orient;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesOrient getOrient() {
            return this.orient;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setShoulderBag(PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag shoulderBag) {
            this.shoulderBag = shoulderBag;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesShoulderBag getShoulderBag() {
            return this.shoulderBag;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setUpperColor(PedestrianDetectAttributeResponseBodyDataAttributesUpperColor upperColor) {
            this.upperColor = upperColor;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesUpperColor getUpperColor() {
            return this.upperColor;
        }

        public PedestrianDetectAttributeResponseBodyDataAttributes setUpperWear(PedestrianDetectAttributeResponseBodyDataAttributesUpperWear upperWear) {
            this.upperWear = upperWear;
            return this;
        }
        public PedestrianDetectAttributeResponseBodyDataAttributesUpperWear getUpperWear() {
            return this.upperWear;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyDataBoxes extends TeaModel {
        @NameInMap("BottomRightX")
        public Float bottomRightX;

        @NameInMap("BottomRightY")
        public Float bottomRightY;

        @NameInMap("Score")
        public Float score;

        @NameInMap("TopLeftX")
        public Float topLeftX;

        @NameInMap("TopLeftY")
        public Float topLeftY;

        public static PedestrianDetectAttributeResponseBodyDataBoxes build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyDataBoxes self = new PedestrianDetectAttributeResponseBodyDataBoxes();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyDataBoxes setBottomRightX(Float bottomRightX) {
            this.bottomRightX = bottomRightX;
            return this;
        }
        public Float getBottomRightX() {
            return this.bottomRightX;
        }

        public PedestrianDetectAttributeResponseBodyDataBoxes setBottomRightY(Float bottomRightY) {
            this.bottomRightY = bottomRightY;
            return this;
        }
        public Float getBottomRightY() {
            return this.bottomRightY;
        }

        public PedestrianDetectAttributeResponseBodyDataBoxes setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public PedestrianDetectAttributeResponseBodyDataBoxes setTopLeftX(Float topLeftX) {
            this.topLeftX = topLeftX;
            return this;
        }
        public Float getTopLeftX() {
            return this.topLeftX;
        }

        public PedestrianDetectAttributeResponseBodyDataBoxes setTopLeftY(Float topLeftY) {
            this.topLeftY = topLeftY;
            return this;
        }
        public Float getTopLeftY() {
            return this.topLeftY;
        }

    }

    public static class PedestrianDetectAttributeResponseBodyData extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<PedestrianDetectAttributeResponseBodyDataAttributes> attributes;

        @NameInMap("Boxes")
        public java.util.List<PedestrianDetectAttributeResponseBodyDataBoxes> boxes;

        @NameInMap("Height")
        public Long height;

        @NameInMap("PersonNumber")
        public Integer personNumber;

        @NameInMap("Width")
        public Long width;

        public static PedestrianDetectAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PedestrianDetectAttributeResponseBodyData self = new PedestrianDetectAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PedestrianDetectAttributeResponseBodyData setAttributes(java.util.List<PedestrianDetectAttributeResponseBodyDataAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<PedestrianDetectAttributeResponseBodyDataAttributes> getAttributes() {
            return this.attributes;
        }

        public PedestrianDetectAttributeResponseBodyData setBoxes(java.util.List<PedestrianDetectAttributeResponseBodyDataBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<PedestrianDetectAttributeResponseBodyDataBoxes> getBoxes() {
            return this.boxes;
        }

        public PedestrianDetectAttributeResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public PedestrianDetectAttributeResponseBodyData setPersonNumber(Integer personNumber) {
            this.personNumber = personNumber;
            return this;
        }
        public Integer getPersonNumber() {
            return this.personNumber;
        }

        public PedestrianDetectAttributeResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
