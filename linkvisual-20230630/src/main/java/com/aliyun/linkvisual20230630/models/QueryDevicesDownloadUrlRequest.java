// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryDevicesDownloadUrlRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDevicesDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesDownloadUrlRequest self = new QueryDevicesDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicesDownloadUrlRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryDevicesDownloadUrlRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
