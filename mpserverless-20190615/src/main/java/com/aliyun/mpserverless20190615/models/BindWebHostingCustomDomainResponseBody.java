// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BindWebHostingCustomDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static BindWebHostingCustomDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindWebHostingCustomDomainResponseBody self = new BindWebHostingCustomDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BindWebHostingCustomDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindWebHostingCustomDomainResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
