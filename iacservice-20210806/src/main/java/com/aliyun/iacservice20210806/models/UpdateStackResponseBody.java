// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateStackResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0D298375-F92F-5B65-82E4-EA68F02521F1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackResponseBody self = new UpdateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
