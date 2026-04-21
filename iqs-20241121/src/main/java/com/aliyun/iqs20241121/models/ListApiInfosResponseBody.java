// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiInfosResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86CD53FA-81A5-56A0-AE6F-CA1C56F48574</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListApiInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiInfosResponseBody self = new ListApiInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
