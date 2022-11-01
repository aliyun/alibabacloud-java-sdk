// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAppInstanceGroupImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppInstanceGroupImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInstanceGroupImageResponseBody self = new UpdateAppInstanceGroupImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppInstanceGroupImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAppInstanceGroupImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAppInstanceGroupImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
