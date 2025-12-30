// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class DashscopeAsyncTaskFinishEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static DashscopeAsyncTaskFinishEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DashscopeAsyncTaskFinishEventRequest self = new DashscopeAsyncTaskFinishEventRequest();
        return TeaModel.build(map, self);
    }

    public DashscopeAsyncTaskFinishEventRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
