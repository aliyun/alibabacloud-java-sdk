// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Text")
    public String text;

    public static GetDpChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDpChEcomRequest self = new GetDpChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetDpChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetDpChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
