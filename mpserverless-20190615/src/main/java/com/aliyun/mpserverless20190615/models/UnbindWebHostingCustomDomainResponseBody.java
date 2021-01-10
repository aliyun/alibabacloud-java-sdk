// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UnbindWebHostingCustomDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static UnbindWebHostingCustomDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindWebHostingCustomDomainResponseBody self = new UnbindWebHostingCustomDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindWebHostingCustomDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindWebHostingCustomDomainResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
