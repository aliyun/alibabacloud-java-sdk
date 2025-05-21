// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class OpenErServiceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenErServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenErServiceResponseBody self = new OpenErServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenErServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
