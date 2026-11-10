// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class InvokeDataProductRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("productCode")
    public String productCode;

    @NameInMap("serviceParameters")
    public String serviceParameters;

    public static InvokeDataProductRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataProductRequest self = new InvokeDataProductRequest();
        return TeaModel.build(map, self);
    }

    public InvokeDataProductRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InvokeDataProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InvokeDataProductRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
