// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class ClientUserLogoutResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClientUserLogoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClientUserLogoutResponseBody self = new ClientUserLogoutResponseBody();
        return TeaModel.build(map, self);
    }

    public ClientUserLogoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
