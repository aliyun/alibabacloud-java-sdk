// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicItemSupplierPriceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Model")
    public Boolean model;

    /**
     * <strong>example:</strong>
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBasicItemSupplierPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicItemSupplierPriceResponseBody self = new ModifyBasicItemSupplierPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBasicItemSupplierPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyBasicItemSupplierPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyBasicItemSupplierPriceResponseBody setModel(Boolean model) {
        this.model = model;
        return this;
    }
    public Boolean getModel() {
        return this.model;
    }

    public ModifyBasicItemSupplierPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
