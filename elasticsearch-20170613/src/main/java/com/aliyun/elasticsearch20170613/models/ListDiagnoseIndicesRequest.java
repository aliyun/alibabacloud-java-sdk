// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseIndicesRequest extends TeaModel {
    /**
     * <p>The language. Default value: the browser language. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh: Simplified Chinese</li>
     * <li>zt: Traditional Chinese</li>
     * <li>es: Spanish</li>
     * <li>fr: French.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
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
