// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateForSerialNumberRequest extends TeaModel {
    /**
     * <p>The serial numbers of the client or server certificates. Separate multiple serial numbers with a comma.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> to query the serial numbers of all client and server certificates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static DescribeClientCertificateForSerialNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientCertificateForSerialNumberRequest self = new DescribeClientCertificateForSerialNumberRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClientCertificateForSerialNumberRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
