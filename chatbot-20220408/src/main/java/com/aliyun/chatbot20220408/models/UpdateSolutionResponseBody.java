// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSolutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8B8F098D-A338-54DD-B19C-24BBBCBD8498</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionResponseBody self = new UpdateSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
