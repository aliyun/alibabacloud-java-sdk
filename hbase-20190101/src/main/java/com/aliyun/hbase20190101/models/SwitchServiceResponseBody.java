// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F1005DE4-D981-559F-9E37-5172DXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchServiceResponseBody self = new SwitchServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
