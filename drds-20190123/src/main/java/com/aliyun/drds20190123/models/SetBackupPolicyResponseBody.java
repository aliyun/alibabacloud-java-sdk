// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the backup policy was successfully configured.</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>Indicates whether the database creation failure records were removed from the DRDS instance.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetBackupPolicyResponseBody self = new SetBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetBackupPolicyResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SetBackupPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
