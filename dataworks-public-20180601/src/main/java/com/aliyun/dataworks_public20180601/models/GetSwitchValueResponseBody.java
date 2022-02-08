// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetSwitchValueResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSwitchValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchValueResponseBody self = new GetSwitchValueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchValueResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSwitchValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
