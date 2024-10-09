// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCheckResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E583A0FF-803C-51C4-9AC9-E029471ACD6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCheckResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckResourceResponseBody self = new EnableCheckResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCheckResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
