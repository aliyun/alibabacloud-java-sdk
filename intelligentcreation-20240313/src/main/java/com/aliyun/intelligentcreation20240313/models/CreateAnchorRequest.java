// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAnchorRequest extends TeaModel {
    @NameInMap("anchorCategory")
    public String anchorCategory;

    @NameInMap("anchorMaterialName")
    public String anchorMaterialName;

    @NameInMap("coverUrl")
    public String coverUrl;

    @NameInMap("digitalHumanType")
    public String digitalHumanType;

    @NameInMap("gender")
    public String gender;

    @NameInMap("useScene")
    public String useScene;

    @NameInMap("videoOssKey")
    public String videoOssKey;

    public static CreateAnchorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnchorRequest self = new CreateAnchorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnchorRequest setAnchorCategory(String anchorCategory) {
        this.anchorCategory = anchorCategory;
        return this;
    }
    public String getAnchorCategory() {
        return this.anchorCategory;
    }

    public CreateAnchorRequest setAnchorMaterialName(String anchorMaterialName) {
        this.anchorMaterialName = anchorMaterialName;
        return this;
    }
    public String getAnchorMaterialName() {
        return this.anchorMaterialName;
    }

    public CreateAnchorRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public CreateAnchorRequest setDigitalHumanType(String digitalHumanType) {
        this.digitalHumanType = digitalHumanType;
        return this;
    }
    public String getDigitalHumanType() {
        return this.digitalHumanType;
    }

    public CreateAnchorRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateAnchorRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

    public CreateAnchorRequest setVideoOssKey(String videoOssKey) {
        this.videoOssKey = videoOssKey;
        return this;
    }
    public String getVideoOssKey() {
        return this.videoOssKey;
    }

}
