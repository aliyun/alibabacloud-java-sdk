// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSSETestRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetSSETestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSSETestRequest self = new GetSSETestRequest();
        return TeaModel.build(map, self);
    }

    public GetSSETestRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetSSETestRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
