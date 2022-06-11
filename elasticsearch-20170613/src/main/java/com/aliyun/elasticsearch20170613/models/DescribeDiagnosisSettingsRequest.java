// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("lang")
    public String lang;

    public static DescribeDiagnosisSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSettingsRequest self = new DescribeDiagnosisSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public DescribeDiagnosisSettingsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
