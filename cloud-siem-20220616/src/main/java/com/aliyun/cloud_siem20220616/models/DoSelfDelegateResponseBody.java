// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoSelfDelegateResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a regular member is authorized. Valid values:</p>
     * <ul>
     * <li>true: The member is authorized.</li>
     * <li>false: The authorization is canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B9CBCEE-9225-5069-BC7F-880938A2****</p>
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
