// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteSimilarityImageRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DeleteSimilarityImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimilarityImageRequest self = new DeleteSimilarityImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSimilarityImageRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
