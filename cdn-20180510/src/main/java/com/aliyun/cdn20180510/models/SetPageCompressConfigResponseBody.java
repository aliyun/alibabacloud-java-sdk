// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetPageCompressConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPageCompressConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPageCompressConfigResponseBody self = new SetPageCompressConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPageCompressConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
