// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoveryFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6AD56E39-430B-5401-AB4A-7B086454****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>6AD56E39-430B-5401-AB4A-7B086454****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecoveryFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoveryFileResponseBody self = new RecoveryFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoveryFileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecoveryFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
