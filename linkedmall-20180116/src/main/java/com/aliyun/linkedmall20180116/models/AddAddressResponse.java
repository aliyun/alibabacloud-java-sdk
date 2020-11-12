// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("AddressId")
    @Validation(required = true)
    public Long addressId;

    public static AddAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAddressResponse self = new AddAddressResponse();
        return TeaModel.build(map, self);
    }

    public AddAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAddressResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAddressResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAddressResponse setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }
    public Long getAddressId() {
        return this.addressId;
    }

}
