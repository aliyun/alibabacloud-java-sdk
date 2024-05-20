// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDiagnosisChMedicalRequest extends TeaModel {
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

    public static GetDiagnosisChMedicalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisChMedicalRequest self = new GetDiagnosisChMedicalRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisChMedicalRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDiagnosisChMedicalRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
