// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveASRConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveASRConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveASRConfigResponseBody self = new AddLiveASRConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveASRConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
