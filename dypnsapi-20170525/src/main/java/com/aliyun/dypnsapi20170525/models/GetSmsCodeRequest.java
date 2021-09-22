// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsCodeRequest extends TeaModel {
    @NameInMap("BizToken")
    public String bizToken;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("OsType")
    public String osType;

    public static GetSmsCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmsCodeRequest self = new GetSmsCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetSmsCodeRequest setBizToken(String bizToken) {
        this.bizToken = bizToken;
        return this;
    }
    public String getBizToken() {
        return this.bizToken;
    }

    public GetSmsCodeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetSmsCodeRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public GetSmsCodeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

}
