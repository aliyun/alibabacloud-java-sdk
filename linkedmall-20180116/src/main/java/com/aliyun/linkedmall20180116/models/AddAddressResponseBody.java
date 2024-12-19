// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>560100452</p>
     */
    @NameInMap("AddressId")
    public Long addressId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>1718921E-C8D4-55E1-B8D4-114AE537C1B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAddressResponseBody self = new AddAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAddressResponseBody setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }
    public Long getAddressId() {
        return this.addressId;
    }

    public AddAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
