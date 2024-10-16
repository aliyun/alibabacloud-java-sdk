// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class CreateListenerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>lsn-wi3c0v30ivysrg****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <strong>example:</strong>
     * <p>A045E652-D298-5E70-A978-7247135336FB</p>
     */
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
