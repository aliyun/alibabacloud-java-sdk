// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyInstanceVswitchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>F2C5B6A8-DD04-51F5-AAD5-BA2FE6FD****</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyInstanceVswitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVswitchResponseBody self = new ModifyInstanceVswitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVswitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceVswitchResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public ModifyInstanceVswitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
