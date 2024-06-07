// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExportUserDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignedUrl")
    public String signedUrl;

    public static ExportUserDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportUserDevicesResponseBody self = new ExportUserDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportUserDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportUserDevicesResponseBody setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
        return this;
    }
    public String getSignedUrl() {
        return this.signedUrl;
    }

}
