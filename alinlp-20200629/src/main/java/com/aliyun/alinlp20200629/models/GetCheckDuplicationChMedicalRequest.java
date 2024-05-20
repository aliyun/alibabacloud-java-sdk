// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetCheckDuplicationChMedicalRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OriginQ")
    public String originQ;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OriginT")
    public String originT;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetCheckDuplicationChMedicalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDuplicationChMedicalRequest self = new GetCheckDuplicationChMedicalRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckDuplicationChMedicalRequest setOriginQ(String originQ) {
        this.originQ = originQ;
        return this;
    }
    public String getOriginQ() {
        return this.originQ;
    }

    public GetCheckDuplicationChMedicalRequest setOriginT(String originT) {
        this.originT = originT;
        return this;
    }
    public String getOriginT() {
        return this.originT;
    }

    public GetCheckDuplicationChMedicalRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
