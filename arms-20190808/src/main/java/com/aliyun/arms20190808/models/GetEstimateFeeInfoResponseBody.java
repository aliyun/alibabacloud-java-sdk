// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetEstimateFeeInfoResponseBody extends TeaModel {
    // data
    @NameInMap("Data")
    public String data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetEstimateFeeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEstimateFeeInfoResponseBody self = new GetEstimateFeeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEstimateFeeInfoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetEstimateFeeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
