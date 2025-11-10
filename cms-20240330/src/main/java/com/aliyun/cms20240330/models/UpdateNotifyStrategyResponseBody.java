// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateNotifyStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12312-31-23-123-1-23123</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateNotifyStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotifyStrategyResponseBody self = new UpdateNotifyStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNotifyStrategyResponseBody setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public UpdateNotifyStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
