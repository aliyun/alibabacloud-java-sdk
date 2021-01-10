// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddAddressResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("AddressId")
    public Long addressId;

    public static AddAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAddressResponseBody self = new AddAddressResponseBody();
        return TeaModel.build(map, self);
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

    public AddAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAddressResponseBody setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }
    public Long getAddressId() {
        return this.addressId;
    }

}
