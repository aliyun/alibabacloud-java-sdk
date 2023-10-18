// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateRequest extends TeaModel {
    /**
     * <p>The SHA-256 fingerprint of the certificate.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static DescribeClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateRequest self = new DescribeClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
