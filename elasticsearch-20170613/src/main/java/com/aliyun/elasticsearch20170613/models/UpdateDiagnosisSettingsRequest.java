// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDiagnosisSettingsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

    public UpdateDiagnosisSettingsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
