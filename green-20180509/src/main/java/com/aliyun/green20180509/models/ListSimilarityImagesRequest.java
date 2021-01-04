// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ListSimilarityImagesRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ListSimilarityImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSimilarityImagesRequest self = new ListSimilarityImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListSimilarityImagesRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
