// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or the server certificate that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to query the unique identifiers of all client certificates and server certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d3b95700998e47afc4d95f886579****</p>
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
