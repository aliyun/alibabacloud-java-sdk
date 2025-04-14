// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0E1C0122-F79F-5C26-B546-47A321691868</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCollectionResponseBody self = new UpdateMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
