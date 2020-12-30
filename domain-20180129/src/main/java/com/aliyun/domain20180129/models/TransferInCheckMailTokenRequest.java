// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInCheckMailTokenRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static TransferInCheckMailTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferInCheckMailTokenRequest self = new TransferInCheckMailTokenRequest();
        return TeaModel.build(map, self);
    }

    public TransferInCheckMailTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public TransferInCheckMailTokenRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TransferInCheckMailTokenRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
