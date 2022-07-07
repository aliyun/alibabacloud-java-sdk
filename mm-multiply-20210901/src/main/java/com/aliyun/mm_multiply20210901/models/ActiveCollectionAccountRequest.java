// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ActiveCollectionAccountRequest extends TeaModel {
    // collectionMode
    @NameInMap("CollectionMode")
    public String collectionMode;

    // mallId
    @NameInMap("MallId")
    public String mallId;

    public static ActiveCollectionAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveCollectionAccountRequest self = new ActiveCollectionAccountRequest();
        return TeaModel.build(map, self);
    }

    public ActiveCollectionAccountRequest setCollectionMode(String collectionMode) {
        this.collectionMode = collectionMode;
        return this;
    }
    public String getCollectionMode() {
        return this.collectionMode;
    }

    public ActiveCollectionAccountRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
