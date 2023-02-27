// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMiniCogRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static ADMiniCogRequest build(java.util.Map<String, ?> map) throws Exception {
        ADMiniCogRequest self = new ADMiniCogRequest();
        return TeaModel.build(map, self);
    }

    public ADMiniCogRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ADMiniCogRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
