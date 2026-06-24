// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDiagnosisSettingsRequest extends TeaModel {
    /**
     * <p>A unique token used to ensure idempotence of the request. The client generates this value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    /**
     * <p>The language of the response. Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("lang")
    public String lang;

    public static UpdateDiagnosisSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiagnosisSettingsRequest self = new UpdateDiagnosisSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDiagnosisSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDiagnosisSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateDiagnosisSettingsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
