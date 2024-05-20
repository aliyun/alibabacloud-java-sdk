// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerChEcomRequest extends TeaModel {
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

    public static GetNerChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNerChEcomRequest self = new GetNerChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetNerChEcomRequest setLexerId(String lexerId) {
        this.lexerId = lexerId;
        return this;
    }
    public String getLexerId() {
        return this.lexerId;
    }

    public GetNerChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetNerChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
