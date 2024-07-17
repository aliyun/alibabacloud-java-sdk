// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CancelQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Q-BCA5E96CB84BB8B8</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>DB07AAE9-4B88-5DEA-8F1D-4D1A9A864A85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CancelQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelQueryResponseBody self = new CancelQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelQueryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CancelQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
