// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935.models;

import com.aliyun.tea.*;

public class AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody extends TeaModel {
    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 错误编码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    public static AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody self = new AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody();
        return TeaModel.build(map, self);
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
