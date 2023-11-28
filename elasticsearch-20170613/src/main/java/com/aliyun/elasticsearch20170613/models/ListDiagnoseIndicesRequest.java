// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseIndicesRequest extends TeaModel {
    /**
     * <p>The language. Multiple languages are supported.</p>
     */
    @NameInMap("lang")
    public String lang;

    public static ListDiagnoseIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseIndicesRequest self = new ListDiagnoseIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseIndicesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
