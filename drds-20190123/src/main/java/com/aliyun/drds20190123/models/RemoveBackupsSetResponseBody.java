// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveBackupsSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SQL audit was disabled for the DRDS database.</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RemoveBackupsSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackupsSetResponseBody self = new RemoveBackupsSetResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveBackupsSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveBackupsSetResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public RemoveBackupsSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
