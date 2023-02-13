// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusRequest extends TeaModel {
    /**
     * <p>The unique identifiers of the client certificates or server certificates that you want to query. Separate multiple unique identifiers with commas (,).</p>
     * <br>
     * <p>>  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers of all client certificates and server certificates.</p>
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
