// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionResponseBody extends TeaModel {
    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2F7F8080-9132-4279-85D0-B7E5C4305162</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeInstanceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionResponseBody self = new UpgradeInstanceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpgradeInstanceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
