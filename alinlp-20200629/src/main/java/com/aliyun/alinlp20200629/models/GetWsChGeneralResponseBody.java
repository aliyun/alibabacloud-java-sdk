// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsChGeneralResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetWsChGeneralResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWsChGeneralResponseBody self = new GetWsChGeneralResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWsChGeneralResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetWsChGeneralResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
