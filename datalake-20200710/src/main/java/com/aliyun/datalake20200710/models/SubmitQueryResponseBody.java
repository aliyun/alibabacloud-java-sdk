// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SubmitQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Q-14475CF9B51FCE5E</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>279AA630-A8ED-5EA9-80A3-2E213D63548C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitQueryResponseBody self = new SubmitQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitQueryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SubmitQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
