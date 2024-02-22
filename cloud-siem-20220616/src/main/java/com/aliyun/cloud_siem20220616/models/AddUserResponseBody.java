// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cloud account is added to the threat analysis feature.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserResponseBody self = new AddUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AddUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
