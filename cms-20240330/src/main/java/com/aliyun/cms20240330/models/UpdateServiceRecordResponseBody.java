// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateServiceRecordResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateServiceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRecordResponseBody self = new UpdateServiceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
