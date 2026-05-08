// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAnchorRequest extends TeaModel {
    /**
     * <p>类型</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO_ANCHOR</p>
     */
    @NameInMap("anchorCategory")
    public String anchorCategory;

    @NameInMap("anchorMaterialName")
    public String anchorMaterialName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("coverUrl")
    public String coverUrl;

    @NameInMap("digitalHumanType")
    public String digitalHumanType;

    /**
     * <strong>example:</strong>
     * <p>F</p>
     */
    @NameInMap("gender")
    public String gender;

    /**
     * <strong>example:</strong>
     * <p>offlineSynthesis</p>
     */
    @NameInMap("useScene")
    public String useScene;

    /**
     * <p>视频文件osskey</p>
     * 
     * <strong>example:</strong>
     * <p>path/key.mp4</p>
     */
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
