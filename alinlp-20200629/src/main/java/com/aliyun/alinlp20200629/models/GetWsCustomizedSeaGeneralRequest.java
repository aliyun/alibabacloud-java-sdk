// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedSeaGeneralRequest extends TeaModel {
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

    public static GetWsCustomizedSeaGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedSeaGeneralRequest self = new GetWsCustomizedSeaGeneralRequest();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedSeaGeneralRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetWsCustomizedSeaGeneralRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetWsCustomizedSeaGeneralRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
