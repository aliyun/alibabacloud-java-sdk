// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchStreamResponseBody extends TeaModel {
    @NameInMap("data")
    public AISearchStreamItem data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F21E33A-42F8-50BC-89DE-DC0B96B967DD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchStreamResponseBody self = new AISearchStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchStreamResponseBody setData(AISearchStreamItem data) {
        this.data = data;
        return this;
    }
    public AISearchStreamItem getData() {
        return this.data;
    }

    public AISearchStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
