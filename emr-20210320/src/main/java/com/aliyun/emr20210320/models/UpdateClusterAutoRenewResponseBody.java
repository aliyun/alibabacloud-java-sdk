// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateClusterAutoRenewResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3896A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    @Deprecated
    public Boolean success;

    public static UpdateClusterAutoRenewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAutoRenewResponseBody self = new UpdateClusterAutoRenewResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAutoRenewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    @Deprecated
    public UpdateClusterAutoRenewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
