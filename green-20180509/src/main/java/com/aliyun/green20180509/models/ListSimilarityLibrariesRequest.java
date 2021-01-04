// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ListSimilarityLibrariesRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ListSimilarityLibrariesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSimilarityLibrariesRequest self = new ListSimilarityLibrariesRequest();
        return TeaModel.build(map, self);
    }

    public ListSimilarityLibrariesRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
