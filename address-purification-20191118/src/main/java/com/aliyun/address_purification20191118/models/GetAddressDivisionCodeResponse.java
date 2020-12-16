// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetAddressDivisionCodeResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static GetAddressDivisionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddressDivisionCodeResponse self = new GetAddressDivisionCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAddressDivisionCodeResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAddressDivisionCodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
