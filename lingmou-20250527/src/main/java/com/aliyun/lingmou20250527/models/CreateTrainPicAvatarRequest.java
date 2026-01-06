// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateTrainPicAvatarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FEMALE</p>
     */
    @NameInMap("gender")
    public String gender;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("generateAssets")
    public Boolean generateAssets;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>material/INPUT_TRAIN_PIC/Mt.CQEJ2DQ6BBYU2/2.jpg</p>
     */
    @NameInMap("imageOssPath")
    public String imageOssPath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>M16vSG46Pby9HWOrFSZ7QaQA</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("transparent")
    public Boolean transparent;

    public static CreateTrainPicAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainPicAvatarRequest self = new CreateTrainPicAvatarRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainPicAvatarRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateTrainPicAvatarRequest setGenerateAssets(Boolean generateAssets) {
        this.generateAssets = generateAssets;
        return this;
    }
    public Boolean getGenerateAssets() {
        return this.generateAssets;
    }

    public CreateTrainPicAvatarRequest setImageOssPath(String imageOssPath) {
        this.imageOssPath = imageOssPath;
        return this;
    }
    public String getImageOssPath() {
        return this.imageOssPath;
    }

    public CreateTrainPicAvatarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrainPicAvatarRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateTrainPicAvatarRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

}
