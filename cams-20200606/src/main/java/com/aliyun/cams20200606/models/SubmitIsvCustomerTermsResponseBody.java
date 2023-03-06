// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SubmitIsvCustomerTermsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitIsvCustomerTermsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitIsvCustomerTermsResponseBody self = new SubmitIsvCustomerTermsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitIsvCustomerTermsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitIsvCustomerTermsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitIsvCustomerTermsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
