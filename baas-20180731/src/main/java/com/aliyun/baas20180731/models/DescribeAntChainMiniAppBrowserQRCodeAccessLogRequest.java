// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest extends TeaModel {
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

    public static DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest self = new DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

}
