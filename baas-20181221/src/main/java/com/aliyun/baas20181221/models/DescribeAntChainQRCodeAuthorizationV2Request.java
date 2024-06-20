// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainQRCodeAuthorizationV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MINI_APP_BROWSER_TRANSACTION</p>
     */
    @NameInMap("QRCodeType")
    public String QRCodeType;

    public static DescribeAntChainQRCodeAuthorizationV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainQRCodeAuthorizationV2Request self = new DescribeAntChainQRCodeAuthorizationV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainQRCodeAuthorizationV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainQRCodeAuthorizationV2Request setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

}
