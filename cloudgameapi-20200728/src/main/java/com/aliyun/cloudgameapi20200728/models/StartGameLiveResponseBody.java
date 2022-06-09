// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StartGameLiveResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static StartGameLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartGameLiveResponseBody self = new StartGameLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public StartGameLiveResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public StartGameLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
