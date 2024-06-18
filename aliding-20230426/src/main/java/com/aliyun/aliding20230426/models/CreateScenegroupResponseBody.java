// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScenegroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cid1324wwwerxxx</p>
     */
    @NameInMap("openConversationId")
    public String openConversationId;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateScenegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScenegroupResponseBody self = new CreateScenegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScenegroupResponseBody setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public CreateScenegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
