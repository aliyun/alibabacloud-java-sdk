// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAnchorRequest extends TeaModel {
    @NameInMap("anchorCategory")
    public String anchorCategory;

    @NameInMap("anchorMaterialName")
    public String anchorMaterialName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://yic-pre.oss-cn-hangzhou.aliyuncs.com/common/image/anchor/1733474220549-1733474198960image.png?Expires=3311144948&OSSAccessKeyId=LTAI5tPHLyFPhh4UoRias4Zg&Signature=qldDufvRDj9IUTmOtb9r2451RIU%3D">https://yic-pre.oss-cn-hangzhou.aliyuncs.com/common/image/anchor/1733474220549-1733474198960image.png?Expires=3311144948&amp;OSSAccessKeyId=LTAI5tPHLyFPhh4UoRias4Zg&amp;Signature=qldDufvRDj9IUTmOtb9r2451RIU%3D</a></p>
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
