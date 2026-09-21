// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetRoutineEnvironmentVariablesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of environment variable keys that were set successfully.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;key1&quot;,&quot;key2&quot;]</p>
     */
    @NameInMap("SetKeys")
    public java.util.List<String> setKeys;

    public static SetRoutineEnvironmentVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRoutineEnvironmentVariablesResponseBody self = new SetRoutineEnvironmentVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRoutineEnvironmentVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetRoutineEnvironmentVariablesResponseBody setSetKeys(java.util.List<String> setKeys) {
        this.setKeys = setKeys;
        return this;
    }
    public java.util.List<String> getSetKeys() {
        return this.setKeys;
    }

}
