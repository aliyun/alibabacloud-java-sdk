// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateScriptResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-d6d6bc841c0d415fb81808bc6d09****</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static CreateScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptResponseBody self = new CreateScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScriptResponseBody setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
