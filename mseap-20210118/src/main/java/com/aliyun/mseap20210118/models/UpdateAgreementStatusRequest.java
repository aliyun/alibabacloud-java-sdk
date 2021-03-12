// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class UpdateAgreementStatusRequest extends TeaModel {
    @NameInMap("AgreementCode")
    public String agreementCode;

    public static UpdateAgreementStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgreementStatusRequest self = new UpdateAgreementStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgreementStatusRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
