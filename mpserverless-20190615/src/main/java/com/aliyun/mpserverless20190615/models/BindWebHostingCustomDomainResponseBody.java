// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BindWebHostingCustomDomainResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static BindWebHostingCustomDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindWebHostingCustomDomainResponseBody self = new BindWebHostingCustomDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BindWebHostingCustomDomainResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public BindWebHostingCustomDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
