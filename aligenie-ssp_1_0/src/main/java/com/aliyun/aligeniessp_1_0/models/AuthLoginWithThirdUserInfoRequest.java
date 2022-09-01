// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithThirdUserInfoRequest extends TeaModel {
    @NameInMap("ExtInfo")
    public java.util.Map<String, ?> extInfo;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("ThirdUserIdentifier")
    public String thirdUserIdentifier;

    @NameInMap("ThirdUserType")
    public String thirdUserType;

    public static AuthLoginWithThirdUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithThirdUserInfoRequest self = new AuthLoginWithThirdUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithThirdUserInfoRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public AuthLoginWithThirdUserInfoRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public AuthLoginWithThirdUserInfoRequest setThirdUserIdentifier(String thirdUserIdentifier) {
        this.thirdUserIdentifier = thirdUserIdentifier;
        return this;
    }
    public String getThirdUserIdentifier() {
        return this.thirdUserIdentifier;
    }

    public AuthLoginWithThirdUserInfoRequest setThirdUserType(String thirdUserType) {
        this.thirdUserType = thirdUserType;
        return this;
    }
    public String getThirdUserType() {
        return this.thirdUserType;
    }

}
