// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityImageRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static AddSimilarityImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityImageRequest self = new AddSimilarityImageRequest();
        return TeaModel.build(map, self);
    }

    public AddSimilarityImageRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
