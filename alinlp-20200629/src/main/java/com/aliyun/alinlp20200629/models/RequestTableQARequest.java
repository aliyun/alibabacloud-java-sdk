// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class RequestTableQARequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static RequestTableQARequest build(java.util.Map<String, ?> map) throws Exception {
        RequestTableQARequest self = new RequestTableQARequest();
        return TeaModel.build(map, self);
    }

    public RequestTableQARequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public RequestTableQARequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
