// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDigitalEmployeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeResponseBody self = new UpdateDigitalEmployeeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
