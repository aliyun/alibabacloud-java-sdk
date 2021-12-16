// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 失败是否可重试
    @NameInMap("retry")
    public Boolean retry;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody self = new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
