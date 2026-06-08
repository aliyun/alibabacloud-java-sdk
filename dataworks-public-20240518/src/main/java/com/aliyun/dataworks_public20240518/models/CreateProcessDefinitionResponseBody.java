// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1010543619</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>0bc5df3a17***903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProcessDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionResponseBody self = new CreateProcessDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProcessDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
