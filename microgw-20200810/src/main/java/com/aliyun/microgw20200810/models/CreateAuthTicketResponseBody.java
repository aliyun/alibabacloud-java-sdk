// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateAuthTicketResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    // message
    @NameInMap("message")
    public String message;

    public static CreateAuthTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthTicketResponseBody self = new CreateAuthTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuthTicketResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateAuthTicketResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public CreateAuthTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
