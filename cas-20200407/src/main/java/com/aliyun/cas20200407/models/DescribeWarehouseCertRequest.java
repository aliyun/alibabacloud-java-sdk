// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeWarehouseCertRequest extends TeaModel {
    /**
     * <p>The unique identifier of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    public static DescribeWarehouseCertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarehouseCertRequest self = new DescribeWarehouseCertRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWarehouseCertRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

}
