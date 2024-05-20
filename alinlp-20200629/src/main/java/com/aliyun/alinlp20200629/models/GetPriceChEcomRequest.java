// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetPriceChEcomRequest extends TeaModel {
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

    public static GetPriceChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPriceChEcomRequest self = new GetPriceChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetPriceChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetPriceChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
