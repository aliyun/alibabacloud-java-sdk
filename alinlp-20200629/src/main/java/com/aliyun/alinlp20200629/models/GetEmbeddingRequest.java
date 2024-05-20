// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetEmbeddingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Text")
    public String text;

    @NameInMap("TextType")
    public String textType;

    public static GetEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmbeddingRequest self = new GetEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public GetEmbeddingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetEmbeddingRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GetEmbeddingRequest setTextType(String textType) {
        this.textType = textType;
        return this;
    }
    public String getTextType() {
        return this.textType;
    }

}
