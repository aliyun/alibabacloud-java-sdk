// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetKeywordChEcomRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

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

    public static GetKeywordChEcomRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordChEcomRequest self = new GetKeywordChEcomRequest();
        return TeaModel.build(map, self);
    }

    public GetKeywordChEcomRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetKeywordChEcomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetKeywordChEcomRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
