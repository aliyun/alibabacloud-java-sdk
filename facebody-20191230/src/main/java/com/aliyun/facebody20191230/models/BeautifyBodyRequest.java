// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BeautifyBodyRequest extends TeaModel {
    @NameInMap("AgeRange")
    public BeautifyBodyRequestAgeRange ageRange;

    @NameInMap("BodyBoxes")
    public java.util.List<BeautifyBodyRequestBodyBoxes> bodyBoxes;

    @NameInMap("Custom")
    public Long custom;

    @NameInMap("FaceList")
    public java.util.List<BeautifyBodyRequestFaceList> faceList;

    @NameInMap("FemaleLiquifyDegree")
    public Float femaleLiquifyDegree;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("IsPregnant")
    public Boolean isPregnant;

    @NameInMap("LengthenDegree")
    public Float lengthenDegree;

    @NameInMap("MaleLiquifyDegree")
    public Float maleLiquifyDegree;

    @NameInMap("OriginalHeight")
    public Long originalHeight;

    @NameInMap("OriginalWidth")
    public Long originalWidth;

    @NameInMap("PoseList")
    public java.util.List<BeautifyBodyRequestPoseList> poseList;

    public static BeautifyBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        BeautifyBodyRequest self = new BeautifyBodyRequest();
        return TeaModel.build(map, self);
    }

    public BeautifyBodyRequest setAgeRange(BeautifyBodyRequestAgeRange ageRange) {
        this.ageRange = ageRange;
        return this;
    }
    public BeautifyBodyRequestAgeRange getAgeRange() {
        return this.ageRange;
    }

    public BeautifyBodyRequest setBodyBoxes(java.util.List<BeautifyBodyRequestBodyBoxes> bodyBoxes) {
        this.bodyBoxes = bodyBoxes;
        return this;
    }
    public java.util.List<BeautifyBodyRequestBodyBoxes> getBodyBoxes() {
        return this.bodyBoxes;
    }

    public BeautifyBodyRequest setCustom(Long custom) {
        this.custom = custom;
        return this;
    }
    public Long getCustom() {
        return this.custom;
    }

    public BeautifyBodyRequest setFaceList(java.util.List<BeautifyBodyRequestFaceList> faceList) {
        this.faceList = faceList;
        return this;
    }
    public java.util.List<BeautifyBodyRequestFaceList> getFaceList() {
        return this.faceList;
    }

    public BeautifyBodyRequest setFemaleLiquifyDegree(Float femaleLiquifyDegree) {
        this.femaleLiquifyDegree = femaleLiquifyDegree;
        return this;
    }
    public Float getFemaleLiquifyDegree() {
        return this.femaleLiquifyDegree;
    }

    public BeautifyBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public BeautifyBodyRequest setIsPregnant(Boolean isPregnant) {
        this.isPregnant = isPregnant;
        return this;
    }
    public Boolean getIsPregnant() {
        return this.isPregnant;
    }

    public BeautifyBodyRequest setLengthenDegree(Float lengthenDegree) {
        this.lengthenDegree = lengthenDegree;
        return this;
    }
    public Float getLengthenDegree() {
        return this.lengthenDegree;
    }

    public BeautifyBodyRequest setMaleLiquifyDegree(Float maleLiquifyDegree) {
        this.maleLiquifyDegree = maleLiquifyDegree;
        return this;
    }
    public Float getMaleLiquifyDegree() {
        return this.maleLiquifyDegree;
    }

    public BeautifyBodyRequest setOriginalHeight(Long originalHeight) {
        this.originalHeight = originalHeight;
        return this;
    }
    public Long getOriginalHeight() {
        return this.originalHeight;
    }

    public BeautifyBodyRequest setOriginalWidth(Long originalWidth) {
        this.originalWidth = originalWidth;
        return this;
    }
    public Long getOriginalWidth() {
        return this.originalWidth;
    }

    public BeautifyBodyRequest setPoseList(java.util.List<BeautifyBodyRequestPoseList> poseList) {
        this.poseList = poseList;
        return this;
    }
    public java.util.List<BeautifyBodyRequestPoseList> getPoseList() {
        return this.poseList;
    }

    public static class BeautifyBodyRequestAgeRange extends TeaModel {
        @NameInMap("AgeMax")
        public Long ageMax;

        @NameInMap("AgeMinimum")
        public Long ageMinimum;

        public static BeautifyBodyRequestAgeRange build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestAgeRange self = new BeautifyBodyRequestAgeRange();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestAgeRange setAgeMax(Long ageMax) {
            this.ageMax = ageMax;
            return this;
        }
        public Long getAgeMax() {
            return this.ageMax;
        }

        public BeautifyBodyRequestAgeRange setAgeMinimum(Long ageMinimum) {
            this.ageMinimum = ageMinimum;
            return this;
        }
        public Long getAgeMinimum() {
            return this.ageMinimum;
        }

    }

    public static class BeautifyBodyRequestBodyBoxes extends TeaModel {
        @NameInMap("Height")
        public Float height;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static BeautifyBodyRequestBodyBoxes build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestBodyBoxes self = new BeautifyBodyRequestBodyBoxes();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestBodyBoxes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public BeautifyBodyRequestBodyBoxes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public BeautifyBodyRequestBodyBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public BeautifyBodyRequestBodyBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class BeautifyBodyRequestFaceListFaceBox extends TeaModel {
        @NameInMap("Height")
        public Float height;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static BeautifyBodyRequestFaceListFaceBox build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestFaceListFaceBox self = new BeautifyBodyRequestFaceListFaceBox();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestFaceListFaceBox setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public BeautifyBodyRequestFaceListFaceBox setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public BeautifyBodyRequestFaceListFaceBox setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public BeautifyBodyRequestFaceListFaceBox setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class BeautifyBodyRequestFaceList extends TeaModel {
        @NameInMap("Age")
        public Long age;

        @NameInMap("FaceBox")
        public BeautifyBodyRequestFaceListFaceBox faceBox;

        @NameInMap("Gender")
        public Long gender;

        public static BeautifyBodyRequestFaceList build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestFaceList self = new BeautifyBodyRequestFaceList();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestFaceList setAge(Long age) {
            this.age = age;
            return this;
        }
        public Long getAge() {
            return this.age;
        }

        public BeautifyBodyRequestFaceList setFaceBox(BeautifyBodyRequestFaceListFaceBox faceBox) {
            this.faceBox = faceBox;
            return this;
        }
        public BeautifyBodyRequestFaceListFaceBox getFaceBox() {
            return this.faceBox;
        }

        public BeautifyBodyRequestFaceList setGender(Long gender) {
            this.gender = gender;
            return this;
        }
        public Long getGender() {
            return this.gender;
        }

    }

    public static class BeautifyBodyRequestPoseListPose extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static BeautifyBodyRequestPoseListPose build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestPoseListPose self = new BeautifyBodyRequestPoseListPose();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestPoseListPose setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public BeautifyBodyRequestPoseListPose setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public BeautifyBodyRequestPoseListPose setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class BeautifyBodyRequestPoseList extends TeaModel {
        @NameInMap("Pose")
        public java.util.List<BeautifyBodyRequestPoseListPose> pose;

        public static BeautifyBodyRequestPoseList build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestPoseList self = new BeautifyBodyRequestPoseList();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestPoseList setPose(java.util.List<BeautifyBodyRequestPoseListPose> pose) {
            this.pose = pose;
            return this;
        }
        public java.util.List<BeautifyBodyRequestPoseListPose> getPose() {
            return this.pose;
        }

    }

}
