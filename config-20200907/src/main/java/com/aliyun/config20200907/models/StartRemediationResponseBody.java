// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartRemediationResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartRemediationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRemediationResponseBody self = new StartRemediationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRemediationResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public StartRemediationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
