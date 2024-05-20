// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsChGeneralRequest extends TeaModel {
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

    public static GetWsChGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsChGeneralRequest self = new GetWsChGeneralRequest();
        return TeaModel.build(map, self);
    }

    public GetWsChGeneralRequest setOutType(String outType) {
        this.outType = outType;
        return this;
    }
    public String getOutType() {
        return this.outType;
    }

    public GetWsChGeneralRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetWsChGeneralRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GetWsChGeneralRequest setTokenizerId(String tokenizerId) {
        this.tokenizerId = tokenizerId;
        return this;
    }
    public String getTokenizerId() {
        return this.tokenizerId;
    }

}
