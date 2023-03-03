// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddIntegrationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the integration was successful.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIntegrationResponseBody self = new AddIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIntegrationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
