// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusForSerialNumberRequest extends TeaModel {
    /**
     * <p>The serial number of the client or server certificate to query. To query multiple certificates, separate their serial numbers with a comma.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> operation to retrieve the serial numbers of all client and server certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b67e53ebcea9b77d65b0c3236646d715****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static DescribeClientCertificateStatusForSerialNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateStatusForSerialNumberRequest self = new DescribeClientCertificateStatusForSerialNumberRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateStatusForSerialNumberRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
