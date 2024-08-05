// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiResponseBody extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>8afff6c8c4c6447abb035812e4d66b65</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6C87A26A-6A18-4B8E-8099-705278381A2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiResponseBody self = new CreateApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public CreateApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
