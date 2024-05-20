// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChEcomCommentRequest extends TeaModel {
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

    public static GetWsCustomizedChEcomCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChEcomCommentRequest self = new GetWsCustomizedChEcomCommentRequest();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChEcomCommentRequest setOutType(String outType) {
        this.outType = outType;
        return this;
    }
    public String getOutType() {
        return this.outType;
    }

    public GetWsCustomizedChEcomCommentRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetWsCustomizedChEcomCommentRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GetWsCustomizedChEcomCommentRequest setTokenizerId(String tokenizerId) {
        this.tokenizerId = tokenizerId;
        return this;
    }
    public String getTokenizerId() {
        return this.tokenizerId;
    }

}
