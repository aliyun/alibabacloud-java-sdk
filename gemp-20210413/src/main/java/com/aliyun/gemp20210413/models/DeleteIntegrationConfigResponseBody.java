// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIntegrationConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationConfigResponseBody self = new DeleteIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
