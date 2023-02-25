// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class OpenDcdnServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenDcdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDcdnServiceResponseBody self = new OpenDcdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDcdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
