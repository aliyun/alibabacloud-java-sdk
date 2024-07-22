// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AnchorResponse extends TeaModel {
    @NameInMap("anchorId")
    public String anchorId;

    @NameInMap("anchorMaterialName")
    public String anchorMaterialName;

    @NameInMap("anchorType")
    public String anchorType;

    @NameInMap("coverHeight")
    public Integer coverHeight;

    @NameInMap("coverRate")
    public String coverRate;

    @NameInMap("coverThumbnailUrl")
    public String coverThumbnailUrl;

    @NameInMap("coverUrl")
    public String coverUrl;

    @NameInMap("coverWeight")
    public Integer coverWeight;

    @NameInMap("digitalHumanType")
    public String digitalHumanType;

    @NameInMap("gender")
    public String gender;

    @NameInMap("resourceTypeDesc")
    public String resourceTypeDesc;

    @NameInMap("status")
    public String status;

    @NameInMap("useScene")
    public String useScene;

    public static AnchorResponse build(java.util.Map<String, ?> map) throws Exception {
        AnchorResponse self = new AnchorResponse();
        return TeaModel.build(map, self);
    }

    public AnchorResponse setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public AnchorResponse setAnchorMaterialName(String anchorMaterialName) {
        this.anchorMaterialName = anchorMaterialName;
        return this;
    }
    public String getAnchorMaterialName() {
        return this.anchorMaterialName;
    }

    public AnchorResponse setAnchorType(String anchorType) {
        this.anchorType = anchorType;
        return this;
    }
    public String getAnchorType() {
        return this.anchorType;
    }

    public AnchorResponse setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
        return this;
    }
    public Integer getCoverHeight() {
        return this.coverHeight;
    }

    public AnchorResponse setCoverRate(String coverRate) {
        this.coverRate = coverRate;
        return this;
    }
    public String getCoverRate() {
        return this.coverRate;
    }

    public AnchorResponse setCoverThumbnailUrl(String coverThumbnailUrl) {
        this.coverThumbnailUrl = coverThumbnailUrl;
        return this;
    }
    public String getCoverThumbnailUrl() {
        return this.coverThumbnailUrl;
    }

    public AnchorResponse setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public AnchorResponse setCoverWeight(Integer coverWeight) {
        this.coverWeight = coverWeight;
        return this;
    }
    public Integer getCoverWeight() {
        return this.coverWeight;
    }

    public AnchorResponse setDigitalHumanType(String digitalHumanType) {
        this.digitalHumanType = digitalHumanType;
        return this;
    }
    public String getDigitalHumanType() {
        return this.digitalHumanType;
    }

    public AnchorResponse setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public AnchorResponse setResourceTypeDesc(String resourceTypeDesc) {
        this.resourceTypeDesc = resourceTypeDesc;
        return this;
    }
    public String getResourceTypeDesc() {
        return this.resourceTypeDesc;
    }

    public AnchorResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AnchorResponse setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

}
