// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateLgfResponseBody extends TeaModel {
    /**
     * <p>LGF ID</p>
     * 
     * <strong>example:</strong>
     * <p>123453433453</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    /**
     * <strong>example:</strong>
     * <p>af5fg3sdf457j5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLgfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLgfResponseBody self = new CreateLgfResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLgfResponseBody setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

    public CreateLgfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
