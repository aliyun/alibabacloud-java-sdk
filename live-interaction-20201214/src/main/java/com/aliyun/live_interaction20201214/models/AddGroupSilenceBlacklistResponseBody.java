// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceBlacklistResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddGroupSilenceBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceBlacklistResponseBody self = new AddGroupSilenceBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceBlacklistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddGroupSilenceBlacklistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddGroupSilenceBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
