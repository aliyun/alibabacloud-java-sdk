// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseIndicesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("lang")
    public String lang;

    public static ListDiagnoseIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseIndicesRequest self = new ListDiagnoseIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseIndicesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListDiagnoseIndicesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
