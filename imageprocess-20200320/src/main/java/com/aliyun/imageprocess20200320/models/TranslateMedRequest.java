// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TranslateMedRequest extends TeaModel {
    @NameInMap("FromLanguage")
    public String fromLanguage;

    @NameInMap("Text")
    public String text;

    @NameInMap("ToLanguage")
    public String toLanguage;

    public static TranslateMedRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateMedRequest self = new TranslateMedRequest();
        return TeaModel.build(map, self);
    }

    public TranslateMedRequest setFromLanguage(String fromLanguage) {
        this.fromLanguage = fromLanguage;
        return this;
    }
    public String getFromLanguage() {
        return this.fromLanguage;
    }

    public TranslateMedRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public TranslateMedRequest setToLanguage(String toLanguage) {
        this.toLanguage = toLanguage;
        return this;
    }
    public String getToLanguage() {
        return this.toLanguage;
    }

}
