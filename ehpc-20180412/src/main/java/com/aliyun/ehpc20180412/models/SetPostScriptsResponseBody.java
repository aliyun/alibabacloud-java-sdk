// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetPostScriptsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SetPostScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPostScriptsResponseBody self = new SetPostScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPostScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
