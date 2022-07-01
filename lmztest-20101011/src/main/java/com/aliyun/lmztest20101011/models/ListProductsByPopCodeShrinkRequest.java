// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ListProductsByPopCodeShrinkRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Env")
    public String env;

    @NameInMap("ExtraParams")
    public String extraParamsShrink;

    @NameInMap("IdentityDTO")
    public String identityDTOShrink;

    @NameInMap("PopCode")
    public String popCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerClientIp")
    public String serverClientIp;

    public static ListProductsByPopCodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsByPopCodeShrinkRequest self = new ListProductsByPopCodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsByPopCodeShrinkRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ListProductsByPopCodeShrinkRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ListProductsByPopCodeShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListProductsByPopCodeShrinkRequest setExtraParamsShrink(String extraParamsShrink) {
        this.extraParamsShrink = extraParamsShrink;
        return this;
    }
    public String getExtraParamsShrink() {
        return this.extraParamsShrink;
    }

    public ListProductsByPopCodeShrinkRequest setIdentityDTOShrink(String identityDTOShrink) {
        this.identityDTOShrink = identityDTOShrink;
        return this;
    }
    public String getIdentityDTOShrink() {
        return this.identityDTOShrink;
    }

    public ListProductsByPopCodeShrinkRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public ListProductsByPopCodeShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsByPopCodeShrinkRequest setServerClientIp(String serverClientIp) {
        this.serverClientIp = serverClientIp;
        return this;
    }
    public String getServerClientIp() {
        return this.serverClientIp;
    }

}
