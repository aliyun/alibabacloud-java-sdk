// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAdvancedSearchFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D231366D-E2AD-559E-9C29-58FF7F4B1F5D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAdvancedSearchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedSearchFileResponseBody self = new CreateAdvancedSearchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedSearchFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
