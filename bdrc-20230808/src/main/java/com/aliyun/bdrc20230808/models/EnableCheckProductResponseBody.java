// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCheckProductResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8724BC18-904D-5A0D-BFF4-F0554F0037E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCheckProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckProductResponseBody self = new EnableCheckProductResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCheckProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
