// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static UpgradeInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionResponse self = new UpgradeInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeInstanceVersionResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
