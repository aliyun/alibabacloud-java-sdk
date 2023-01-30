// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class LogOffAllSessionsInAppInstanceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static LogOffAllSessionsInAppInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LogOffAllSessionsInAppInstanceGroupResponseBody self = new LogOffAllSessionsInAppInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LogOffAllSessionsInAppInstanceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LogOffAllSessionsInAppInstanceGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LogOffAllSessionsInAppInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
