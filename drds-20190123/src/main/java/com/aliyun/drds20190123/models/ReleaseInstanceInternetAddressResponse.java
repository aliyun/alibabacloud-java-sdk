// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseInstanceInternetAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static ReleaseInstanceInternetAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceInternetAddressResponse self = new ReleaseInstanceInternetAddressResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceInternetAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseInstanceInternetAddressResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
