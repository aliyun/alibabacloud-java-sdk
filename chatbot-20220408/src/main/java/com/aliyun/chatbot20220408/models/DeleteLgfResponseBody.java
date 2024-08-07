// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteLgfResponseBody extends TeaModel {
    /**
     * <p>LGF ID</p>
     * 
     * <strong>example:</strong>
     * <p>2342424</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    /**
     * <strong>example:</strong>
     * <p>dgw2342424qw42</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLgfResponseBody self = new DeleteLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLgfResponseBody setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public DeleteLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
