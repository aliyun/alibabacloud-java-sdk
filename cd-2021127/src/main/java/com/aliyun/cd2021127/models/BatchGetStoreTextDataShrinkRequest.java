// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchGetStoreTextDataShrinkRequest extends TeaModel {
    @NameInMap("StoreIds")
    public String storeIdsShrink;

    @NameInMap("country")
    public String country;

    public static BatchGetStoreTextDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetStoreTextDataShrinkRequest self = new BatchGetStoreTextDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetStoreTextDataShrinkRequest setStoreIdsShrink(String storeIdsShrink) {
        this.storeIdsShrink = storeIdsShrink;
        return this;
    }
    public String getStoreIdsShrink() {
        return this.storeIdsShrink;
    }

    public BatchGetStoreTextDataShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
