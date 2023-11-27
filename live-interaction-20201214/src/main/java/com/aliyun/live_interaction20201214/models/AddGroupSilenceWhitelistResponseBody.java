// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceWhitelistResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AddGroupSilenceWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceWhitelistResponseBody self = new AddGroupSilenceWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceWhitelistResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddGroupSilenceWhitelistResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddGroupSilenceWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
