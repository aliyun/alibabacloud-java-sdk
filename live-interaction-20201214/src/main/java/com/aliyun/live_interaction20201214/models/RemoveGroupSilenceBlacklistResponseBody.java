// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupSilenceBlacklistResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RemoveGroupSilenceBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupSilenceBlacklistResponseBody self = new RemoveGroupSilenceBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveGroupSilenceBlacklistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveGroupSilenceBlacklistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveGroupSilenceBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
