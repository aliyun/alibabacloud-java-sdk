// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteMaterializedViewRecommendResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7B081A85-0568-5E54-82EF-6958C4A3D4B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMaterializedViewRecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterializedViewRecommendResponseBody self = new DeleteMaterializedViewRecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMaterializedViewRecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
