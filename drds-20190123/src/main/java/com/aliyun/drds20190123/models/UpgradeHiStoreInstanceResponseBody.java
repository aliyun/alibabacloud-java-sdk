// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpgradeHiStoreInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeHiStoreInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeHiStoreInstanceResponseBody self = new UpgradeHiStoreInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeHiStoreInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpgradeHiStoreInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
