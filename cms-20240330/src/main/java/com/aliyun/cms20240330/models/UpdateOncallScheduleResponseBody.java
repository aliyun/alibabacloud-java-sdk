// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateOncallScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateOncallScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOncallScheduleResponseBody self = new UpdateOncallScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOncallScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
