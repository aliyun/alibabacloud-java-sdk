// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityImageRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static GetSimilarityImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityImageRequest self = new GetSimilarityImageRequest();
        return TeaModel.build(map, self);
    }

    public GetSimilarityImageRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
