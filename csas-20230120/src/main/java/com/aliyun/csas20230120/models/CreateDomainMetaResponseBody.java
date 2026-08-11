// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDomainMetaResponseBody extends TeaModel {
    /**
     * <p>The ID of the newly created list.</p>
     * 
     * <strong>example:</strong>
     * <p>ladl-6f1exxxxx6ab59</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C37AE32-A5C0-5E0F-9EC3-399B83102ED1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainMetaResponseBody self = new CreateDomainMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainMetaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateDomainMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
