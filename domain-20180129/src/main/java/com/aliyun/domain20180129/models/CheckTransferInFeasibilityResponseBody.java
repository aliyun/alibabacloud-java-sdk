// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckTransferInFeasibilityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CanTransfer")
    public Boolean canTransfer;

    /**
     * <strong>example:</strong>
     * <p>CheckTransferResult.DomainTransferProhibited</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>This domain name is in transfer prohibited status, so it cannot be transferred. You can contact your original registrar to change its status.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2a</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>FC0D6B89-2353-4D64-BD80-6606A7DBD7C1</p>
     */
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
