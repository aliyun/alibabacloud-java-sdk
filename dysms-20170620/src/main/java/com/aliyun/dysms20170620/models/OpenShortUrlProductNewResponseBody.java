// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class OpenShortUrlProductNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rusult")
    public Boolean rusult;

    public static OpenShortUrlProductNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenShortUrlProductNewResponseBody self = new OpenShortUrlProductNewResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenShortUrlProductNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenShortUrlProductNewResponseBody setRusult(Boolean rusult) {
        this.rusult = rusult;
        return this;
    }
    public Boolean getRusult() {
        return this.rusult;
    }

}
