// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerAttributeRequest extends TeaModel {
    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    public static GetListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeRequest self = new GetListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

}
