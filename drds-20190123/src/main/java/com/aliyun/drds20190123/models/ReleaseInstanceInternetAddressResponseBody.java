// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseInstanceInternetAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseInstanceInternetAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceInternetAddressResponseBody self = new ReleaseInstanceInternetAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceInternetAddressResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ReleaseInstanceInternetAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
