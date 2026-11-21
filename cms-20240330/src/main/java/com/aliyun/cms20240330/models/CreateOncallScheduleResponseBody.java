// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateOncallScheduleResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the on-call schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>testOncallScheduleId</p>
     */
    @NameInMap("oncallScheduleId")
    public String oncallScheduleId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateOncallScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOncallScheduleResponseBody self = new CreateOncallScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOncallScheduleResponseBody setOncallScheduleId(String oncallScheduleId) {
        this.oncallScheduleId = oncallScheduleId;
        return this;
    }
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    public CreateOncallScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
