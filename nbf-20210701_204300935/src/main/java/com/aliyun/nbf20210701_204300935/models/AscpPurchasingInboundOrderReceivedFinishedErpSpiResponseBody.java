// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 是否可重试
    @NameInMap("retry")
    public Boolean retry;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody self = new AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
