// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BeautifyBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

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
    public BeautifyBodyRequestAgeRange ageRange;

    @NameInMap("BodyBoxes")
    public java.util.List<BeautifyBodyRequestBodyBoxes> bodyBoxes;

    @NameInMap("FaceList")
    public java.util.List<BeautifyBodyRequestFaceList> faceList;

    @NameInMap("PoseList")
    public java.util.List<BeautifyBodyRequestPoseList> poseList;

    public static BeautifyBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        BeautifyBodyRequest self = new BeautifyBodyRequest();
        return TeaModel.build(map, self);
    }

    public BeautifyBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public BeautifyBodyRequest setOriginalWidth(Long originalWidth) {
        this.originalWidth = originalWidth;
        return this;
    }
    public Long getOriginalWidth() {
        return this.originalWidth;
    }

    public BeautifyBodyRequest setOriginalHeight(Long originalHeight) {
        this.originalHeight = originalHeight;
        return this;
    }
    public Long getOriginalHeight() {
        return this.originalHeight;
    }

    public BeautifyBodyRequest setCustom(Long custom) {
        this.custom = custom;
        return this;
    }
    public Long getCustom() {
        return this.custom;
    }

    public BeautifyBodyRequest setMaleLiquifyDegree(Float maleLiquifyDegree) {
        this.maleLiquifyDegree = maleLiquifyDegree;
        return this;
    }
    public Float getMaleLiquifyDegree() {
        return this.maleLiquifyDegree;
    }

    public BeautifyBodyRequest setFemaleLiquifyDegree(Float femaleLiquifyDegree) {
        this.femaleLiquifyDegree = femaleLiquifyDegree;
        return this;
    }
    public Float getFemaleLiquifyDegree() {
        return this.femaleLiquifyDegree;
    }

    public BeautifyBodyRequest setLengthenDegree(Float lengthenDegree) {
        this.lengthenDegree = lengthenDegree;
        return this;
    }
    public Float getLengthenDegree() {
        return this.lengthenDegree;
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

    public BeautifyBodyRequest setFaceList(java.util.List<BeautifyBodyRequestFaceList> faceList) {
        this.faceList = faceList;
        return this;
    }
    public java.util.List<BeautifyBodyRequestFaceList> getFaceList() {
        return this.faceList;
    }

    public BeautifyBodyRequest setPoseList(java.util.List<BeautifyBodyRequestPoseList> poseList) {
        this.poseList = poseList;
        return this;
    }
    public java.util.List<BeautifyBodyRequestPoseList> getPoseList() {
        return this.poseList;
    }

    public static class BeautifyBodyRequestAgeRange extends TeaModel {
        @NameInMap("AgeMinimum")
        public Long ageMinimum;

        @NameInMap("AgeMax")
        public Long ageMax;

        public static BeautifyBodyRequestAgeRange build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestAgeRange self = new BeautifyBodyRequestAgeRange();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestAgeRange setAgeMinimum(Long ageMinimum) {
            this.ageMinimum = ageMinimum;
            return this;
        }
        public Long getAgeMinimum() {
            return this.ageMinimum;
        }

        public BeautifyBodyRequestAgeRange setAgeMax(Long ageMax) {
            this.ageMax = ageMax;
            return this;
        }
        public Long getAgeMax() {
            return this.ageMax;
        }

    }

    public static class BeautifyBodyRequestBodyBoxes extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        public static BeautifyBodyRequestBodyBoxes build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestBodyBoxes self = new BeautifyBodyRequestBodyBoxes();
            return TeaModel.build(map, self);
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

        public BeautifyBodyRequestBodyBoxes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public BeautifyBodyRequestBodyBoxes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

    }

    public static class BeautifyBodyRequestFaceListFaceBox extends TeaModel {
        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        public static BeautifyBodyRequestFaceListFaceBox build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestFaceListFaceBox self = new BeautifyBodyRequestFaceListFaceBox();
            return TeaModel.build(map, self);
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

        public BeautifyBodyRequestFaceListFaceBox setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public BeautifyBodyRequestFaceListFaceBox setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

    }

    public static class BeautifyBodyRequestFaceList extends TeaModel {
        @NameInMap("FaceBox")
        public BeautifyBodyRequestFaceListFaceBox faceBox;

        @NameInMap("Age")
        public Long age;

        @NameInMap("Gender")
        public Long gender;

        public static BeautifyBodyRequestFaceList build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestFaceList self = new BeautifyBodyRequestFaceList();
            return TeaModel.build(map, self);
        }

        public BeautifyBodyRequestFaceList setFaceBox(BeautifyBodyRequestFaceListFaceBox faceBox) {
            this.faceBox = faceBox;
            return this;
        }
        public BeautifyBodyRequestFaceListFaceBox getFaceBox() {
            return this.faceBox;
        }

        public BeautifyBodyRequestFaceList setAge(Long age) {
            this.age = age;
            return this;
        }
        public Long getAge() {
            return this.age;
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
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        @NameInMap("Score")
        public Float score;

        public static BeautifyBodyRequestPoseListPose build(java.util.Map<String, ?> map) throws Exception {
            BeautifyBodyRequestPoseListPose self = new BeautifyBodyRequestPoseListPose();
            return TeaModel.build(map, self);
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

        public BeautifyBodyRequestPoseListPose setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
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
