// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CountLatestReportsRequest extends TeaModel {
    @NameInMap("LogStore")
    public String logStore;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Uid")
    public Long uid;

    public static CountLatestReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        CountLatestReportsRequest self = new CountLatestReportsRequest();
        return TeaModel.build(map, self);
    }

    public CountLatestReportsRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public CountLatestReportsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CountLatestReportsRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
