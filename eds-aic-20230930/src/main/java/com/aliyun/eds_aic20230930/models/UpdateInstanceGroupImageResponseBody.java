// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UpdateInstanceGroupImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>55726272-E40B-530D-914F-5126B19C79B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceGroupImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceGroupImageResponseBody self = new UpdateInstanceGroupImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceGroupImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
