// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class DeleteTopicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20250623101207d2a3770b026dd321</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicResponseBody self = new DeleteTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
