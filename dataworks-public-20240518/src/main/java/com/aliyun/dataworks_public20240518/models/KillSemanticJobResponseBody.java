// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class KillSemanticJobResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the stop request has been accepted by the executor. Even if true is returned, call GetSemanticJobDetail to query the final status.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static KillSemanticJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillSemanticJobResponseBody self = new KillSemanticJobResponseBody();
        return TeaModel.build(map, self);
    }

    public KillSemanticJobResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public KillSemanticJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KillSemanticJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
