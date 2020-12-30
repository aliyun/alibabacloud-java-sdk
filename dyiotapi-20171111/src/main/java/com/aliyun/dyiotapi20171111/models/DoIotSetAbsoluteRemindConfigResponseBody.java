// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotSetAbsoluteRemindConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DoIotSetAbsoluteRemindConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoIotSetAbsoluteRemindConfigResponseBody self = new DoIotSetAbsoluteRemindConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DoIotSetAbsoluteRemindConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoIotSetAbsoluteRemindConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoIotSetAbsoluteRemindConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
