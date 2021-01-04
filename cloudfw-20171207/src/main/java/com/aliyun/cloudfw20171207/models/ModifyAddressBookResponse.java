// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAddressBookResponseBody body;

    public static ModifyAddressBookResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookResponse self = new ModifyAddressBookResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAddressBookResponse setBody(ModifyAddressBookResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAddressBookResponseBody getBody() {
        return this.body;
    }

}
