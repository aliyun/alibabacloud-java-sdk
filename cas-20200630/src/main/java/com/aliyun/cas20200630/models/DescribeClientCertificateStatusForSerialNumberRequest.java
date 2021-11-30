// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribeClientCertificateStatusForSerialNumberRequest extends TeaModel {
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
