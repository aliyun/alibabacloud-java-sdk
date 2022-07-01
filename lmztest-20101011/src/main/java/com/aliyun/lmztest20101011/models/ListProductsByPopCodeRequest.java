// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class ListProductsByPopCodeRequest extends TeaModel {
    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Env")
    public String env;

    @NameInMap("ExtraParams")
    public java.util.Map<String, ?> extraParams;

    @NameInMap("IdentityDTO")
    public java.util.Map<String, ?> identityDTO;

    @NameInMap("PopCode")
    public String popCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerClientIp")
    public String serverClientIp;

    public static ListProductsByPopCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsByPopCodeRequest self = new ListProductsByPopCodeRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsByPopCodeRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ListProductsByPopCodeRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public ListProductsByPopCodeRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListProductsByPopCodeRequest setExtraParams(java.util.Map<String, ?> extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public java.util.Map<String, ?> getExtraParams() {
        return this.extraParams;
    }

    public ListProductsByPopCodeRequest setIdentityDTO(java.util.Map<String, ?> identityDTO) {
        this.identityDTO = identityDTO;
        return this;
    }
    public java.util.Map<String, ?> getIdentityDTO() {
        return this.identityDTO;
    }

    public ListProductsByPopCodeRequest setPopCode(String popCode) {
        this.popCode = popCode;
        return this;
    }
    public String getPopCode() {
        return this.popCode;
    }

    public ListProductsByPopCodeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsByPopCodeRequest setServerClientIp(String serverClientIp) {
        this.serverClientIp = serverClientIp;
        return this;
    }
    public String getServerClientIp() {
        return this.serverClientIp;
    }

}
