// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListCollectionAccountInfoRequest extends TeaModel {
    @NameInMap("CollectionEnv")
    public String collectionEnv;

    @NameInMap("MallId")
    public String mallId;

    public static ListCollectionAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionAccountInfoRequest self = new ListCollectionAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectionAccountInfoRequest setCollectionEnv(String collectionEnv) {
        this.collectionEnv = collectionEnv;
        return this;
    }
    public String getCollectionEnv() {
        return this.collectionEnv;
    }

    public ListCollectionAccountInfoRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
