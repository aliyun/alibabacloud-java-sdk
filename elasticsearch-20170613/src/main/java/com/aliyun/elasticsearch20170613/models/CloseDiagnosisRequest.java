// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseDiagnosisRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    @NameInMap("lang")
    public String lang;

    public static CloseDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDiagnosisRequest self = new CloseDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public CloseDiagnosisRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloseDiagnosisRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CloseDiagnosisRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
