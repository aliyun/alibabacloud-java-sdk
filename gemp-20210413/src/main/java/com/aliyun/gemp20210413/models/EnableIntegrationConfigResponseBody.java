// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableIntegrationConfigResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnableIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableIntegrationConfigResponseBody self = new EnableIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
