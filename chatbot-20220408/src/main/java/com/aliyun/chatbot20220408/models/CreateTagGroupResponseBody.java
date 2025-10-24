// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateTagGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7393472</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>xxxXxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTagGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagGroupResponseBody self = new CreateTagGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagGroupResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateTagGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
