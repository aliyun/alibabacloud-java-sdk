// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerCustomizedChEcomRequest extends TeaModel {
    @NameInMap("LexerId")
    public String lexerId;

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

    public static GetNerCustomizedChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNerCustomizedChEcomRequest self = new GetNerCustomizedChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetNerCustomizedChEcomRequest setLexerId(String lexerId) {
        this.lexerId = lexerId;
        return this;
    }
    public String getLexerId() {
        return this.lexerId;
    }

    public GetNerCustomizedChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetNerCustomizedChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
