// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMMURequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static ADMMURequest build(java.util.Map<String, ?> map) throws Exception {
        ADMMURequest self = new ADMMURequest();
        return TeaModel.build(map, self);
    }

    public ADMMURequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ADMMURequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
