// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class LoginStateInfo extends TeaModel {
    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("ThirdUserIdentifier")
    public String thirdUserIdentifier;

    @NameInMap("ThirdUserType")
    public String thirdUserType;

    @NameInMap("UserId")
    public String userId;

    public static LoginStateInfo build(java.util.Map<String, ?> map) throws Exception {
        LoginStateInfo self = new LoginStateInfo();
        return TeaModel.build(map, self);
    }

    public LoginStateInfo setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public LoginStateInfo setThirdUserIdentifier(String thirdUserIdentifier) {
        this.thirdUserIdentifier = thirdUserIdentifier;
        return this;
    }
    public String getThirdUserIdentifier() {
        return this.thirdUserIdentifier;
    }

    public LoginStateInfo setThirdUserType(String thirdUserType) {
        this.thirdUserType = thirdUserType;
        return this;
    }
    public String getThirdUserType() {
        return this.thirdUserType;
    }

    public LoginStateInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
