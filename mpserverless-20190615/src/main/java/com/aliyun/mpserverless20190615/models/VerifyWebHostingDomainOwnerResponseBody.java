// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class VerifyWebHostingDomainOwnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static VerifyWebHostingDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyWebHostingDomainOwnerResponseBody self = new VerifyWebHostingDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyWebHostingDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyWebHostingDomainOwnerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
