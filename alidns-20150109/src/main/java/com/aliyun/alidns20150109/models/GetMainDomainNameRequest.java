// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameRequest extends TeaModel {
    @NameInMap("InputString")
    public String inputString;

    @NameInMap("Lang")
    public String lang;

    public static GetMainDomainNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameRequest self = new GetMainDomainNameRequest();
        return TeaModel.build(map, self);
    }

    public GetMainDomainNameRequest setInputString(String inputString) {
        this.inputString = inputString;
        return this;
    }
    public String getInputString() {
        return this.inputString;
    }

    public GetMainDomainNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
