// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetPackageResponseBody extends TeaModel {
    @NameInMap("CertPackage")
    public String certPackage;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackageResponseBody self = new GetPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackageResponseBody setCertPackage(String certPackage) {
        this.certPackage = certPackage;
        return this;
    }
    public String getCertPackage() {
        return this.certPackage;
    }

    public GetPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
