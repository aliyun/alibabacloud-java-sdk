// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoSelfDelegateResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a regular member is authorized. Valid values:</p>
     * <br>
     * <p>*   true: The member is authorized.</p>
     * <p>*   false: The authorization is canceled.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DoSelfDelegateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoSelfDelegateResponseBody self = new DoSelfDelegateResponseBody();
        return TeaModel.build(map, self);
    }

    public DoSelfDelegateResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DoSelfDelegateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
