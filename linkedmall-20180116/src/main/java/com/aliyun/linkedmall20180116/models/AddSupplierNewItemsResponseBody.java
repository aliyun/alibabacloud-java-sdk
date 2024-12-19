// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddSupplierNewItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F2D3CA1E-28BE-5E1C-B55F-81C8F290****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddSupplierNewItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSupplierNewItemsResponseBody self = new AddSupplierNewItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSupplierNewItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSupplierNewItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSupplierNewItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
