// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSummaryChEcomRequest extends TeaModel {
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Text")
    public String text;

    public static GetSummaryChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryChEcomRequest self = new GetSummaryChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetSummaryChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
