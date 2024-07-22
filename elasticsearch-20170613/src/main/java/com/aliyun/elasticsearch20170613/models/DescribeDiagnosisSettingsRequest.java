// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsRequest extends TeaModel {
    /**
     * <p>The language of the returned result. Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("lang")
    public String lang;

    public static DescribeDiagnosisSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSettingsRequest self = new DescribeDiagnosisSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSettingsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
