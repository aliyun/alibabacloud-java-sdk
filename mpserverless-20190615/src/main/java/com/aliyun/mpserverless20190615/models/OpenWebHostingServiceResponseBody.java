// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenWebHostingServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenWebHostingServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenWebHostingServiceResponseBody self = new OpenWebHostingServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenWebHostingServiceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public OpenWebHostingServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
