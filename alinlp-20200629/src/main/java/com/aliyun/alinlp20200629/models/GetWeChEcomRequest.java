// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWeChEcomRequest extends TeaModel {
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Size")
    public String size;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TokenizerId")
    public String tokenizerId;

    @NameInMap("Type")
    public String type;

    public static GetWeChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWeChEcomRequest self = new GetWeChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetWeChEcomRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GetWeChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetWeChEcomRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public GetWeChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GetWeChEcomRequest setTokenizerId(String tokenizerId) {
        this.tokenizerId = tokenizerId;
        return this;
    }
    public String getTokenizerId() {
        return this.tokenizerId;
    }

    public GetWeChEcomRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
