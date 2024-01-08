// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the created WAF rule group.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnWafGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafGroupResponseBody self = new CreateDcdnWafGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafGroupResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDcdnWafGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
