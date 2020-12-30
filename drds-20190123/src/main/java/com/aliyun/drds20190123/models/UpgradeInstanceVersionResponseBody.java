// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static UpgradeInstanceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionResponseBody self = new UpgradeInstanceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeInstanceVersionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
