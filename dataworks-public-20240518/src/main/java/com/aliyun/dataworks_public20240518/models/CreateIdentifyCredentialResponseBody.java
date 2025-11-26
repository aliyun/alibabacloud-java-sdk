// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateIdentifyCredentialResponseBody extends TeaModel {
    /**
     * <p>success true or false</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;HttpStatusCode&quot;: 200,   &quot;Success&quot;: true }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIdentifyCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentifyCredentialResponseBody self = new CreateIdentifyCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIdentifyCredentialResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateIdentifyCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
