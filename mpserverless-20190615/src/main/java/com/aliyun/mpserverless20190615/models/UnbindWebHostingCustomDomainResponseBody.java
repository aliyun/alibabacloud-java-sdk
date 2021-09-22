// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UnbindWebHostingCustomDomainResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UnbindWebHostingCustomDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindWebHostingCustomDomainResponseBody self = new UnbindWebHostingCustomDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindWebHostingCustomDomainResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UnbindWebHostingCustomDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
