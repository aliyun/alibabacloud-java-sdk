// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CheckSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5389BE87-571B-573C-90ED-F07C5E68760B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>FREE</p>
     */
    @NameInMap("status")
    public String status;

    public static CheckSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSessionResponseBody self = new CheckSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSessionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
