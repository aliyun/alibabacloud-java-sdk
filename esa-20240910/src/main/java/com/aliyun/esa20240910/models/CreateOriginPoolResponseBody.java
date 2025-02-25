// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the newly created origin address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>103852052519****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOriginPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginPoolResponseBody self = new CreateOriginPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOriginPoolResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOriginPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
