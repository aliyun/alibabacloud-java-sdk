// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchGetStoreTextDataRequest extends TeaModel {
    @NameInMap("StoreIds")
    public java.util.List<String> storeIds;

    @NameInMap("country")
    public String country;

    public static BatchGetStoreTextDataRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetStoreTextDataRequest self = new BatchGetStoreTextDataRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetStoreTextDataRequest setStoreIds(java.util.List<String> storeIds) {
        this.storeIds = storeIds;
        return this;
    }
    public java.util.List<String> getStoreIds() {
        return this.storeIds;
    }

    public BatchGetStoreTextDataRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
