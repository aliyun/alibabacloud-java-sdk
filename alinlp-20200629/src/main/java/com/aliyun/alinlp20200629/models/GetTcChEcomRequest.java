// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTcChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Text")
    public String text;

    public static GetTcChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTcChEcomRequest self = new GetTcChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetTcChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetTcChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
