// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("QRCodeType")
    public String QRCodeType;

    public static DescribeAntChainQRCodeAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationRequest self = new DescribeAntChainQRCodeAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainQRCodeAuthorizationRequest setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

}
