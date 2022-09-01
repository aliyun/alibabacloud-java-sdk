// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithThirdUserInfoShrinkRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public String extInfoShrink;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("ThirdUserIdentifier")
    public String thirdUserIdentifier;

    @NameInMap("ThirdUserType")
    public String thirdUserType;

    public static AuthLoginWithThirdUserInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithThirdUserInfoShrinkRequest self = new AuthLoginWithThirdUserInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithThirdUserInfoShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public AuthLoginWithThirdUserInfoShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public AuthLoginWithThirdUserInfoShrinkRequest setThirdUserIdentifier(String thirdUserIdentifier) {
        this.thirdUserIdentifier = thirdUserIdentifier;
        return this;
    }
    public String getThirdUserIdentifier() {
        return this.thirdUserIdentifier;
    }

    public AuthLoginWithThirdUserInfoShrinkRequest setThirdUserType(String thirdUserType) {
        this.thirdUserType = thirdUserType;
        return this;
    }
    public String getThirdUserType() {
        return this.thirdUserType;
    }

}
