// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BeautifyBodyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("OriginalWidth")
    public Long originalWidth;

    @NameInMap("OriginalHeight")
    public Long originalHeight;

    @NameInMap("Custom")
    public Long custom;

    @NameInMap("MaleLiquifyDegree")
    public Float maleLiquifyDegree;

    @NameInMap("FemaleLiquifyDegree")
    public Float femaleLiquifyDegree;

    @NameInMap("LengthenDegree")
    public Float lengthenDegree;

    @NameInMap("AgeRange")
    public BeautifyBodyAdvanceRequestAgeRange ageRange;

    @NameInMap("BodyBoxes")
    public java.util.List<BeautifyBodyAdvanceRequestBodyBoxes> bodyBoxes;

    @NameInMap("FaceList")
    public java.util.List<BeautifyBodyAdvanceRequestFaceList> faceList;

    @NameInMap("PoseList")
    public java.util.List<BeautifyBodyAdvanceRequestPoseList> poseList;

    @NameInMap("IsPregnant")
    public Boolean isPregnant;

    public static BeautifyBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BeautifyBodyAdvanceRequest self = new BeautifyBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public BeautifyBodyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public BeautifyBodyAdvanceRequest setOriginalWidth(Long originalWidth) {
        this.originalWidth = originalWidth;
        return this;
    }
    public Long getOriginalWidth() {
        return this.originalWidth;
    }

    public BeautifyBodyAdvanceRequest setOriginalHeight(Long originalHeight) {
        this.originalHeight = originalHeight;
        return this;
    }
    public Long getOriginalHeight() {
        return this.originalHeight;
    }

    public BeautifyBodyAdvanceRequest setCustom(Long custom) {
        this.custom = custom;
        return this;
    }
    public Long getCustom() {
        return this.custom;
    }

    public BeautifyBodyAdvanceRequest setMaleLiquifyDegree(Float maleLiquifyDegree) {
        this.maleLiquifyDegree = maleLiquifyDegree;
        return this;
    }
    public Float getMaleLiquifyDegree() {
        return this.maleLiquifyDegree;
    }

    public BeautifyBodyAdvanceRequest setFemaleLiquifyDegree(Float femaleLiquifyDegree) {
        this.femaleLiquifyDegree = femaleLiquifyDegree;
        return this;
    }
    public Float getFemaleLiquifyDegree() {
        return this.femaleLiquifyDegree;
    }

    public BeautifyBodyAdvanceRequest setLengthenDegree(Float lengthenDegree) {
        this.lengthenDegree = lengthenDegree;
        return this;
    }
    public Float getLengthenDegree() {
        return this.lengthenDegree;
    }

    public BeautifyBodyAdvanceRequest setAgeRange(BeautifyBodyAdvanceRequestAgeRange ageRange) {
        this.ageRange = ageRange;
        return this;
    }
    public BeautifyBodyAdvanceRequestAgeRange getAgeRange() {
        return this.ageRange;
    }

    public BeautifyBodyAdvanceRequest setBodyBoxes(java.util.List<BeautifyBodyAdvanceRequestBodyBoxes> bodyBoxes) {
        this.bodyBoxes = bodyBoxes;
        return this;
    }
    public java.util.List<BeautifyBodyAdvanceRequestBodyBoxes> getBodyBoxes() {
        return this.bodyBoxes;
    }

    public BeautifyBodyAdvanceRequest setFaceList(java.util.List<BeautifyBodyAdvanceRequestFaceList> faceList) {
        this.faceList = faceList;
        return this;
    }
    public java.util.List<BeautifyBodyAdvanceRequestFaceList> getFaceList() {
        return this.faceList;
    }

    public BeautifyBodyAdvanceRequest setPoseList(java.util.List<BeautifyBodyAdvanceRequestPoseList> poseList) {
        this.poseList = poseList;
        return this;
    }
    public java.util.List<BeautifyBodyAdvanceRequestPoseList> getPoseList() {
        return this.poseList;
    }

    public BeautifyBodyAdvanceRequest setIsPregnant(Boolean isPregnant) {
        this.isPregnant = isPregnant;
        return this;
    }
    public Boolean getIsPregnant() {
        return this.isPregnant;
    }

    public static class BeautifyBodyAdvanceRequestAgeRange extends TeaModel {
        @NameInMap("AgeMinimum")
        public Long ageMinimum;

        @NameInMap("AgeMax")
        public Long ageMax;

        public static BeautifyBodyAdvanceRequestAgeRange build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyAdvanceRequestAgeRange self = new BeautifyBodyAdvanceRequestAgeRange();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyAdvanceRequestAgeRange setAgeMinimum(Long ageMinimum) {
            this.ageMinimum = ageMinimum;
            return this;
        }
        public Long getAgeMinimum() {
            return this.ageMinimum;
        }

        public BeautifyBodyAdvanceRequestAgeRange setAgeMax(Long ageMax) {
            this.ageMax = ageMax;
            return this;
        }
        public Long getAgeMax() {
            return this.ageMax;
        }

    }

    public static class BeautifyBodyAdvanceRequestBodyBoxes extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        public static BeautifyBodyAdvanceRequestBodyBoxes build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyAdvanceRequestBodyBoxes self = new BeautifyBodyAdvanceRequestBodyBoxes();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyAdvanceRequestBodyBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public BeautifyBodyAdvanceRequestBodyBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public BeautifyBodyAdvanceRequestBodyBoxes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public BeautifyBodyAdvanceRequestBodyBoxes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

    }

    public static class BeautifyBodyAdvanceRequestFaceListFaceBox extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        public static BeautifyBodyAdvanceRequestFaceListFaceBox build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyAdvanceRequestFaceListFaceBox self = new BeautifyBodyAdvanceRequestFaceListFaceBox();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyAdvanceRequestFaceListFaceBox setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public BeautifyBodyAdvanceRequestFaceListFaceBox setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public BeautifyBodyAdvanceRequestFaceListFaceBox setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public BeautifyBodyAdvanceRequestFaceListFaceBox setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

    }

    public static class BeautifyBodyAdvanceRequestFaceList extends TeaModel {
        @NameInMap("FaceBox")
        public BeautifyBodyAdvanceRequestFaceListFaceBox faceBox;

        @NameInMap("Age")
        public Long age;

        @NameInMap("Gender")
        public Long gender;

        public static BeautifyBodyAdvanceRequestFaceList build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyAdvanceRequestFaceList self = new BeautifyBodyAdvanceRequestFaceList();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyAdvanceRequestFaceList setFaceBox(BeautifyBodyAdvanceRequestFaceListFaceBox faceBox) {
            this.faceBox = faceBox;
            return this;
        }
        public BeautifyBodyAdvanceRequestFaceListFaceBox getFaceBox() {
            return this.faceBox;
        }

        public BeautifyBodyAdvanceRequestFaceList setAge(Long age) {
            this.age = age;
            return this;
        }
        public Long getAge() {
            return this.age;
        }

        public BeautifyBodyAdvanceRequestFaceList setGender(Long gender) {
            this.gender = gender;
            return this;
        }
        public Long getGender() {
            return this.gender;
        }

    }

    public static class BeautifyBodyAdvanceRequestPoseListPose extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        @NameInMap("Score")
        public Float score;

        public static BeautifyBodyAdvanceRequestPoseListPose build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyAdvanceRequestPoseListPose self = new BeautifyBodyAdvanceRequestPoseListPose();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyAdvanceRequestPoseListPose setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public BeautifyBodyAdvanceRequestPoseListPose setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

        public BeautifyBodyAdvanceRequestPoseListPose setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class BeautifyBodyAdvanceRequestPoseList extends TeaModel {
        @NameInMap("Pose")
        public java.util.List<BeautifyBodyAdvanceRequestPoseListPose> pose;

        public static BeautifyBodyAdvanceRequestPoseList build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyAdvanceRequestPoseList self = new BeautifyBodyAdvanceRequestPoseList();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyAdvanceRequestPoseList setPose(java.util.List<BeautifyBodyAdvanceRequestPoseListPose> pose) {
            this.pose = pose;
            return this;
        }
        public java.util.List<BeautifyBodyAdvanceRequestPoseListPose> getPose() {
            return this.pose;
        }

    }

}
