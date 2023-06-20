// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchUpdateStoreTextDataShrinkRequest extends TeaModel {
    @NameInMap("StoreTextData")
    public String storeTextDataShrink;

    @NameInMap("country")
    public String country;

    public static BatchUpdateStoreTextDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateStoreTextDataShrinkRequest self = new BatchUpdateStoreTextDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateStoreTextDataShrinkRequest setStoreTextDataShrink(String storeTextDataShrink) {
        this.storeTextDataShrink = storeTextDataShrink;
        return this;
    }
    public String getStoreTextDataShrink() {
        return this.storeTextDataShrink;
    }

    public BatchUpdateStoreTextDataShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
