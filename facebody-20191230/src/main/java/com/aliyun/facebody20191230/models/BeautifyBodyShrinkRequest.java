// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BeautifyBodyShrinkRequest extends TeaModel {
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
    public String ageRangeShrink;

    @NameInMap("BodyBoxes")
    public String bodyBoxesShrink;

    @NameInMap("FaceList")
    public String faceListShrink;

    @NameInMap("PoseList")
    public String poseListShrink;

    @NameInMap("IsPregnant")
    public Boolean isPregnant;

    public static BeautifyBodyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BeautifyBodyShrinkRequest self = new BeautifyBodyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BeautifyBodyShrinkRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public BeautifyBodyShrinkRequest setOriginalWidth(Long originalWidth) {
        this.originalWidth = originalWidth;
        return this;
    }
    public Long getOriginalWidth() {
        return this.originalWidth;
    }

    public BeautifyBodyShrinkRequest setOriginalHeight(Long originalHeight) {
        this.originalHeight = originalHeight;
        return this;
    }
    public Long getOriginalHeight() {
        return this.originalHeight;
    }

    public BeautifyBodyShrinkRequest setCustom(Long custom) {
        this.custom = custom;
        return this;
    }
    public Long getCustom() {
        return this.custom;
    }

    public BeautifyBodyShrinkRequest setMaleLiquifyDegree(Float maleLiquifyDegree) {
        this.maleLiquifyDegree = maleLiquifyDegree;
        return this;
    }
    public Float getMaleLiquifyDegree() {
        return this.maleLiquifyDegree;
    }

    public BeautifyBodyShrinkRequest setFemaleLiquifyDegree(Float femaleLiquifyDegree) {
        this.femaleLiquifyDegree = femaleLiquifyDegree;
        return this;
    }
    public Float getFemaleLiquifyDegree() {
        return this.femaleLiquifyDegree;
    }

    public BeautifyBodyShrinkRequest setLengthenDegree(Float lengthenDegree) {
        this.lengthenDegree = lengthenDegree;
        return this;
    }
    public Float getLengthenDegree() {
        return this.lengthenDegree;
    }

    public BeautifyBodyShrinkRequest setAgeRangeShrink(String ageRangeShrink) {
        this.ageRangeShrink = ageRangeShrink;
        return this;
    }
    public String getAgeRangeShrink() {
        return this.ageRangeShrink;
    }

    public BeautifyBodyShrinkRequest setBodyBoxesShrink(String bodyBoxesShrink) {
        this.bodyBoxesShrink = bodyBoxesShrink;
        return this;
    }
    public String getBodyBoxesShrink() {
        return this.bodyBoxesShrink;
    }

    public BeautifyBodyShrinkRequest setFaceListShrink(String faceListShrink) {
        this.faceListShrink = faceListShrink;
        return this;
    }
    public String getFaceListShrink() {
        return this.faceListShrink;
    }

    public BeautifyBodyShrinkRequest setPoseListShrink(String poseListShrink) {
        this.poseListShrink = poseListShrink;
        return this;
    }
    public String getPoseListShrink() {
        return this.poseListShrink;
    }

    public BeautifyBodyShrinkRequest setIsPregnant(Boolean isPregnant) {
        this.isPregnant = isPregnant;
        return this;
    }
    public Boolean getIsPregnant() {
        return this.isPregnant;
    }

}
