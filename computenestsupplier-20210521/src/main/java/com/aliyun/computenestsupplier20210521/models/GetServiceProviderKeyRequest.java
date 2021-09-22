// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceProviderKeyRequest extends TeaModel {
    @NameInMap("ServiceId")
    public String serviceId;

    public static GetServiceProviderKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProviderKeyRequest self = new GetServiceProviderKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceProviderKeyRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
