// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class GetListActionsByServiceCodesRequest extends TeaModel {
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetListActionsByServiceCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListActionsByServiceCodesRequest self = new GetListActionsByServiceCodesRequest();
        return TeaModel.build(map, self);
    }

    public GetListActionsByServiceCodesRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
