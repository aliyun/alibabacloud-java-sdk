// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeHiStoreInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static UpgradeHiStoreInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeHiStoreInstanceResponse self = new UpgradeHiStoreInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeHiStoreInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeHiStoreInstanceResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
