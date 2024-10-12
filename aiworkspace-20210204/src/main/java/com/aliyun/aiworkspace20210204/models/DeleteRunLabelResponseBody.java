// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteRunLabelResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteRunLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRunLabelResponseBody self = new DeleteRunLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRunLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
