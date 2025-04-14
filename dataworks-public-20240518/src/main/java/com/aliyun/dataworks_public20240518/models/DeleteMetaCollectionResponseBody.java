// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>45D14A7A-7C28-5547-AB0A-35FBCD9DE7B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionResponseBody self = new DeleteMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
