// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAuthCodeBindForExtShrinkRequest extends TeaModel {
    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("EncodeKey")
    public String encodeKey;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static CheckAuthCodeBindForExtShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthCodeBindForExtShrinkRequest self = new CheckAuthCodeBindForExtShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckAuthCodeBindForExtShrinkRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CheckAuthCodeBindForExtShrinkRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public CheckAuthCodeBindForExtShrinkRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public CheckAuthCodeBindForExtShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
