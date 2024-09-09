// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateRealisticPortraitRequest extends TeaModel {
    @NameInMap("ages")
    public java.util.List<Integer> ages;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cloth")
    public Integer cloth;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("color")
    public Integer color;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("custom")
    public String custom;

    @NameInMap("face")
    public java.util.List<Integer> face;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("figure")
    public Integer figure;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gender")
    public Integer gender;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("hairColor")
    public Integer hairColor;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("hairstyle")
    public Integer hairstyle;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("height")
    public Integer height;

    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("numbers")
    public Integer numbers;

    /**
     * <strong>example:</strong>
     * <p>1:1</p>
     */
    @NameInMap("ratio")
    public String ratio;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("width")
    public Integer width;

    public static CreateRealisticPortraitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealisticPortraitRequest self = new CreateRealisticPortraitRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealisticPortraitRequest setAges(java.util.List<Integer> ages) {
        this.ages = ages;
        return this;
    }
    public java.util.List<Integer> getAges() {
        return this.ages;
    }

    public CreateRealisticPortraitRequest setCloth(Integer cloth) {
        this.cloth = cloth;
        return this;
    }
    public Integer getCloth() {
        return this.cloth;
    }

    public CreateRealisticPortraitRequest setColor(Integer color) {
        this.color = color;
        return this;
    }
    public Integer getColor() {
        return this.color;
    }

    public CreateRealisticPortraitRequest setCustom(String custom) {
        this.custom = custom;
        return this;
    }
    public String getCustom() {
        return this.custom;
    }

    public CreateRealisticPortraitRequest setFace(java.util.List<Integer> face) {
        this.face = face;
        return this;
    }
    public java.util.List<Integer> getFace() {
        return this.face;
    }

    public CreateRealisticPortraitRequest setFigure(Integer figure) {
        this.figure = figure;
        return this;
    }
    public Integer getFigure() {
        return this.figure;
    }

    public CreateRealisticPortraitRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public CreateRealisticPortraitRequest setHairColor(Integer hairColor) {
        this.hairColor = hairColor;
        return this;
    }
    public Integer getHairColor() {
        return this.hairColor;
    }

    public CreateRealisticPortraitRequest setHairstyle(Integer hairstyle) {
        this.hairstyle = hairstyle;
        return this;
    }
    public Integer getHairstyle() {
        return this.hairstyle;
    }

    public CreateRealisticPortraitRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateRealisticPortraitRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateRealisticPortraitRequest setNumbers(Integer numbers) {
        this.numbers = numbers;
        return this;
    }
    public Integer getNumbers() {
        return this.numbers;
    }

    public CreateRealisticPortraitRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public CreateRealisticPortraitRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
