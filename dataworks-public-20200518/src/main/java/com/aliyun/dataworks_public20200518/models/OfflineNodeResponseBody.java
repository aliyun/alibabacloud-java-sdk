// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class OfflineNodeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static OfflineNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineNodeResponseBody self = new OfflineNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OfflineNodeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
