// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCommonImageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCommonImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommonImageResponseBody self = new GetCommonImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommonImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
