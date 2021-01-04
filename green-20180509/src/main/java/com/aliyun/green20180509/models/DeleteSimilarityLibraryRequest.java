// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteSimilarityLibraryRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DeleteSimilarityLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimilarityLibraryRequest self = new DeleteSimilarityLibraryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSimilarityLibraryRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
