// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsProductForChannelCustResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static CreateSmsProductForChannelCustResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsProductForChannelCustResponseBody self = new CreateSmsProductForChannelCustResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsProductForChannelCustResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSmsProductForChannelCustResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSmsProductForChannelCustResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
