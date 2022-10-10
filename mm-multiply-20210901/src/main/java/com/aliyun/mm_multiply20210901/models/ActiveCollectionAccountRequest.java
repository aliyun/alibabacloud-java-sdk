// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ActiveCollectionAccountRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("CollectionEnv")
    public String collectionEnv;

    @NameInMap("MallId")
    public String mallId;

    public static ActiveCollectionAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveCollectionAccountRequest self = new ActiveCollectionAccountRequest();
        return TeaModel.build(map, self);
    }

    public ActiveCollectionAccountRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ActiveCollectionAccountRequest setCollectionEnv(String collectionEnv) {
        this.collectionEnv = collectionEnv;
        return this;
    }
    public String getCollectionEnv() {
        return this.collectionEnv;
    }

    public ActiveCollectionAccountRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
