// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityLibraryRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static AddSimilarityLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityLibraryRequest self = new AddSimilarityLibraryRequest();
        return TeaModel.build(map, self);
    }

    public AddSimilarityLibraryRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
