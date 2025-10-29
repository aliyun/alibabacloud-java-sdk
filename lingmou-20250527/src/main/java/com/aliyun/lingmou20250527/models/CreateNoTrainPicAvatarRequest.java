// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateNoTrainPicAvatarRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NORMAL/ENTHUSIASTIC</p>
     */
    @NameInMap("expressiveness")
    public String expressiveness;

    /**
     * <strong>example:</strong>
     * <p>FEMALE/MALE</p>
     */
    @NameInMap("gender")
    public String gender;

    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("generateAssets")
    public Boolean generateAssets;

    /**
     * <strong>example:</strong>
     * <p>material/INPUT_INFER_PIC/Mt.CPQX3T6E25QU2/2e81e20797954440aed4da4264eb7494.webp</p>
     */
    @NameInMap("imageOssPath")
    public String imageOssPath;

    /**
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("jwtToken")
    public String jwtToken;

    /**
     * <strong>example:</strong>
     * <p>avatar</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("transparent")
    public Boolean transparent;

    public static CreateNoTrainPicAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNoTrainPicAvatarRequest self = new CreateNoTrainPicAvatarRequest();
        return TeaModel.build(map, self);
    }

    public CreateNoTrainPicAvatarRequest setExpressiveness(String expressiveness) {
        this.expressiveness = expressiveness;
        return this;
    }
    public String getExpressiveness() {
        return this.expressiveness;
    }

    public CreateNoTrainPicAvatarRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateNoTrainPicAvatarRequest setGenerateAssets(Boolean generateAssets) {
        this.generateAssets = generateAssets;
        return this;
    }
    public Boolean getGenerateAssets() {
        return this.generateAssets;
    }

    public CreateNoTrainPicAvatarRequest setImageOssPath(String imageOssPath) {
        this.imageOssPath = imageOssPath;
        return this;
    }
    public String getImageOssPath() {
        return this.imageOssPath;
    }

    public CreateNoTrainPicAvatarRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateNoTrainPicAvatarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNoTrainPicAvatarRequest setTransparent(Boolean transparent) {
        this.transparent = transparent;
        return this;
    }
    public Boolean getTransparent() {
        return this.transparent;
    }

}
