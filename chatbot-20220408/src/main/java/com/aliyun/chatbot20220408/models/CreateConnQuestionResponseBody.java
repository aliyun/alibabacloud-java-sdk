// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateConnQuestionResponseBody extends TeaModel {
    // 关联关系ID
    @NameInMap("OutlineId")
    public Long outlineId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateConnQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConnQuestionResponseBody self = new CreateConnQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConnQuestionResponseBody setOutlineId(Long outlineId) {
        this.outlineId = outlineId;
        return this;
    }
    public Long getOutlineId() {
        return this.outlineId;
    }

    public CreateConnQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
