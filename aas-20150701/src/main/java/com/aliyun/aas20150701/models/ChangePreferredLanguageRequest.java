// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ChangePreferredLanguageRequest extends TeaModel {
    @NameInMap("PreferredLanguage")
    public String preferredLanguage;

    public static ChangePreferredLanguageRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangePreferredLanguageRequest self = new ChangePreferredLanguageRequest();
        return TeaModel.build(map, self);
    }

    public ChangePreferredLanguageRequest setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }
    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

}
