// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSaSeaEcomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    public static GetSaSeaEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSaSeaEcomRequest self = new GetSaSeaEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetSaSeaEcomRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetSaSeaEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetSaSeaEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
