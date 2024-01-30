// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CheckTransferInFeasibilityResponseBody extends TeaModel {
    @NameInMap("CanTransfer")
    public Boolean canTransfer;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckTransferInFeasibilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckTransferInFeasibilityResponseBody self = new CheckTransferInFeasibilityResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckTransferInFeasibilityResponseBody setCanTransfer(Boolean canTransfer) {
        this.canTransfer = canTransfer;
        return this;
    }
    public Boolean getCanTransfer() {
        return this.canTransfer;
    }

    public CheckTransferInFeasibilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckTransferInFeasibilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckTransferInFeasibilityResponseBody setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CheckTransferInFeasibilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
