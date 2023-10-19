// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachApiProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachApiProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachApiProductResponseBody self = new AttachApiProductResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachApiProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
