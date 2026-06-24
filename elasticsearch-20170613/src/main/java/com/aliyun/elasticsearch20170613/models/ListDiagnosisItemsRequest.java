// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsRequest extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The language of the request. Default value: the browser language. Valid values:</p>
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

    public static ListDiagnosisItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisItemsRequest self = new ListDiagnosisItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisItemsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDiagnosisItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
