// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetAddressDivisionCodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAddressDivisionCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddressDivisionCodeResponseBody self = new GetAddressDivisionCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddressDivisionCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAddressDivisionCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
