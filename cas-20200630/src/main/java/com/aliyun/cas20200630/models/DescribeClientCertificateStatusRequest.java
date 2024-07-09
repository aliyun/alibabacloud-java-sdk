// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static DescribeClientCertificateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateStatusRequest self = new DescribeClientCertificateStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateStatusRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
