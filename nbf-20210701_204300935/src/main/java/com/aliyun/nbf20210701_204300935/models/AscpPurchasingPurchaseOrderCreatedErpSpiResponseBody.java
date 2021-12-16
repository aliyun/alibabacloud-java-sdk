// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody extends TeaModel {
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

    public static AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody self = new AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
