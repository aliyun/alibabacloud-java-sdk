// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class GetAlipayUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>https://</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>2174AA97-56FB-50FA-B243-0460B9E4CE0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlipayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlipayUrlResponseBody self = new GetAlipayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlipayUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAlipayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
