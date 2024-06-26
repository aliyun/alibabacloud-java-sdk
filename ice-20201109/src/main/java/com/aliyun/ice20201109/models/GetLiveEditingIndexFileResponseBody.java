// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingIndexFileResponseBody extends TeaModel {
    @NameInMap("IndexFile")
    public String indexFile;

    /**
     * <strong>example:</strong>
     * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveEditingIndexFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingIndexFileResponseBody self = new GetLiveEditingIndexFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingIndexFileResponseBody setIndexFile(String indexFile) {
        this.indexFile = indexFile;
        return this;
    }
    public String getIndexFile() {
        return this.indexFile;
    }

    public GetLiveEditingIndexFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
