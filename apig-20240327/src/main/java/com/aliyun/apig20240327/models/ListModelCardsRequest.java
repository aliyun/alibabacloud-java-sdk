// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListModelCardsRequest extends TeaModel {
    /**
     * <p>The identifier of the model provider used to filter model cards by provider.</p>
     * 
     * <strong>example:</strong>
     * <p>provider-xxxxxxxx</p>
     */
    @NameInMap("provider")
    public String provider;

    public static ListModelCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelCardsRequest self = new ListModelCardsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelCardsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
