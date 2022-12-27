// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusRequest extends TeaModel {
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetIntegratedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusRequest self = new GetIntegratedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
