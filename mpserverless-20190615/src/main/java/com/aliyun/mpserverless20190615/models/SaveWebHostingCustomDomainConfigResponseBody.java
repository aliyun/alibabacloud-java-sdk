// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveWebHostingCustomDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveWebHostingCustomDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWebHostingCustomDomainConfigResponseBody self = new SaveWebHostingCustomDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWebHostingCustomDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
