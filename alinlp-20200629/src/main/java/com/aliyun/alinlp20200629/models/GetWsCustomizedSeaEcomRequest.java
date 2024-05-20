// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedSeaEcomRequest extends TeaModel {
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

    public static GetWsCustomizedSeaEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedSeaEcomRequest self = new GetWsCustomizedSeaEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedSeaEcomRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetWsCustomizedSeaEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetWsCustomizedSeaEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
