// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMiniCogResultRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static ADMiniCogResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ADMiniCogResultRequest self = new ADMiniCogResultRequest();
        return TeaModel.build(map, self);
    }

    public ADMiniCogResultRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ADMiniCogResultRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
