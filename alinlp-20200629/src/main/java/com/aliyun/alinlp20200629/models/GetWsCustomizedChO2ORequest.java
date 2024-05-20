// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChO2ORequest extends TeaModel {
    @NameInMap("OutType")
    public String outType;

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

    @NameInMap("TokenizerId")
    public String tokenizerId;

    public static GetWsCustomizedChO2ORequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChO2ORequest self = new GetWsCustomizedChO2ORequest();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChO2ORequest setOutType(String outType) {
        this.outType = outType;
        return this;
    }
    public String getOutType() {
        return this.outType;
    }

    public GetWsCustomizedChO2ORequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetWsCustomizedChO2ORequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GetWsCustomizedChO2ORequest setTokenizerId(String tokenizerId) {
        this.tokenizerId = tokenizerId;
        return this;
    }
    public String getTokenizerId() {
        return this.tokenizerId;
    }

}
