// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCrossPrivateStateResponseBody extends TeaModel {
    @NameInMap("CrossPrivateState")
    public Boolean crossPrivateState;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCrossPrivateStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossPrivateStateResponseBody self = new UpdateCrossPrivateStateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCrossPrivateStateResponseBody setCrossPrivateState(Boolean crossPrivateState) {
        this.crossPrivateState = crossPrivateState;
        return this;
    }
    public Boolean getCrossPrivateState() {
        return this.crossPrivateState;
    }

    public UpdateCrossPrivateStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
