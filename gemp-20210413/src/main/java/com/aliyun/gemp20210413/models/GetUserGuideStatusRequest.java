// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserGuideStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static GetUserGuideStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserGuideStatusRequest self = new GetUserGuideStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUserGuideStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
