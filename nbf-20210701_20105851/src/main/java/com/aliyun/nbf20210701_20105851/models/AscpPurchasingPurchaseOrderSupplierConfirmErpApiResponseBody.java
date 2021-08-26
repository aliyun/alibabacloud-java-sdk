// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_20105851.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody extends TeaModel {
    // 是否确认成功
    @NameInMap("success")
    public Boolean success;

    // 错误Code
    @NameInMap("errorCode")
    public String errorCode;

    // 是否可重试
    @NameInMap("retry")
    public Boolean retry;

    // 错误码
    @NameInMap("errorMsg")
    public String errorMsg;

    public static AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody self = new AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
