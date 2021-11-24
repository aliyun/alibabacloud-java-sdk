// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateListenerResponseBody extends TeaModel {
    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerResponseBody self = new CreateListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
