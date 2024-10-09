// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CloseBdrcServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>663D8898-E0B5-5964-BF28-A191CE6A1825</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloseBdrcServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseBdrcServiceResponseBody self = new CloseBdrcServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseBdrcServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
