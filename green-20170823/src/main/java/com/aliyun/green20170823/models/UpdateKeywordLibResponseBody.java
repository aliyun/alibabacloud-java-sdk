// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateKeywordLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateKeywordLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeywordLibResponseBody self = new UpdateKeywordLibResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKeywordLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
