// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class PushStoreSpeechDataShrinkRequest extends TeaModel {
    @NameInMap("Speech")
    public String speechShrink;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("country")
    public String country;

    public static PushStoreSpeechDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushStoreSpeechDataShrinkRequest self = new PushStoreSpeechDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushStoreSpeechDataShrinkRequest setSpeechShrink(String speechShrink) {
        this.speechShrink = speechShrink;
        return this;
    }
    public String getSpeechShrink() {
        return this.speechShrink;
    }

    public PushStoreSpeechDataShrinkRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public PushStoreSpeechDataShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

}
