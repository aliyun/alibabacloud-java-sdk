// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetLoginPreferenceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoginPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoginPreferenceResponseBody self = new SetLoginPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoginPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
