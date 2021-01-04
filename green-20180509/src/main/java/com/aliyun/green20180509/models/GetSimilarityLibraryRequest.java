// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityLibraryRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static GetSimilarityLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityLibraryRequest self = new GetSimilarityLibraryRequest();
        return TeaModel.build(map, self);
    }

    public GetSimilarityLibraryRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
