// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyMaterializedViewRecommendResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F0983B43-B2EC-536A-8791-142B5CF1E9B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMaterializedViewRecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaterializedViewRecommendResponseBody self = new ModifyMaterializedViewRecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMaterializedViewRecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
