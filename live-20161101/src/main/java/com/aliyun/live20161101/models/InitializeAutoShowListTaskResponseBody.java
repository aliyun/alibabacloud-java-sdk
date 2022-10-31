// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class InitializeAutoShowListTaskResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamList")
    public String streamList;

    public static InitializeAutoShowListTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeAutoShowListTaskResponseBody self = new InitializeAutoShowListTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeAutoShowListTaskResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public InitializeAutoShowListTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeAutoShowListTaskResponseBody setStreamList(String streamList) {
        this.streamList = streamList;
        return this;
    }
    public String getStreamList() {
        return this.streamList;
    }

}
