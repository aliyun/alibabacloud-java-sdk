// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("MonitorGroupId")
    public Long monitorGroupId;

    /**
     * <p>auditing</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMonitorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupResponseBody self = new CreateMonitorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupResponseBody setMonitorGroupId(Long monitorGroupId) {
        this.monitorGroupId = monitorGroupId;
        return this;
    }
    public Long getMonitorGroupId() {
        return this.monitorGroupId;
    }

    public CreateMonitorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
