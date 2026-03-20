// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class UpdateTopicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20260319152525d2a3770b00c232d4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicResponseBody self = new UpdateTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
