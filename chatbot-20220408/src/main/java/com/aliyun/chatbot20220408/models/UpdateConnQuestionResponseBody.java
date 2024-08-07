// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateConnQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>004EB5C0-9DEB-53BF-A57A-0407A6D6B3C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConnQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnQuestionResponseBody self = new UpdateConnQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
