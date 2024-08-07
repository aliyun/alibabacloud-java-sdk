// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetQuickQueryResponseBody extends TeaModel {
    /**
     * <p>The query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>27D27DCB-D76B-5064-8B3B-0900DEF7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetQuickQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuickQueryResponseBody self = new GetQuickQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuickQueryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetQuickQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
