// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("lang")
    public String lang;

    public static ListDiagnosisItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisItemsRequest self = new ListDiagnosisItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
