// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetOperationChMedicalRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetOperationChMedicalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationChMedicalRequest self = new GetOperationChMedicalRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationChMedicalRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOperationChMedicalRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
