// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSecurityStrategyResponseBody extends TeaModel {
    /**
     * <p>The security strategy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSecurityStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityStrategyResponseBody self = new CreateSecurityStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityStrategyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateSecurityStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
