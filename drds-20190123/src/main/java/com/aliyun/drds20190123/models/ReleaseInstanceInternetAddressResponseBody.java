// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseInstanceInternetAddressResponseBody extends TeaModel {
    /**
     * <p>The result returned by the current API.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FD17CD3C-3355-49E8-9231-FE2DB0******</p>
     */
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
