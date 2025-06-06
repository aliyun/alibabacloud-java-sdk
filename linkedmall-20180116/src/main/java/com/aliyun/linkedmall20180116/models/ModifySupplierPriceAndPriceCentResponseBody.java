// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifySupplierPriceAndPriceCentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The bizId or lmOrderId is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Model")
    public Boolean model;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F1339E71-CB73-5440-BD39-1C98A8ED50E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySupplierPriceAndPriceCentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySupplierPriceAndPriceCentResponseBody self = new ModifySupplierPriceAndPriceCentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySupplierPriceAndPriceCentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySupplierPriceAndPriceCentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySupplierPriceAndPriceCentResponseBody setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public ModifySupplierPriceAndPriceCentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
