// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QRCodeType")
    public String QRCodeType;

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

}
