// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetTableQAServiceInfoByIdRequest extends TeaModel {
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("ServiceId")
    public String serviceId;

    public static GetTableQAServiceInfoByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableQAServiceInfoByIdRequest self = new GetTableQAServiceInfoByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTableQAServiceInfoByIdRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetTableQAServiceInfoByIdRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
