// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class DescribeAgreementStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10aa40008e081ad7b1fb50bffc3a70b1</p>
     */
    @NameInMap("AgreementCode")
    public String agreementCode;

    public static DescribeAgreementStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgreementStatusRequest self = new DescribeAgreementStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgreementStatusRequest setAgreementCode(String agreementCode) {
        this.agreementCode = agreementCode;
        return this;
    }
    public String getAgreementCode() {
        return this.agreementCode;
    }

}
