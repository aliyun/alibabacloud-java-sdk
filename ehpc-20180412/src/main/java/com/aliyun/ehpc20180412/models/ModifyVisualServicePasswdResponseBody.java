// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdResponseBody extends TeaModel {
    /**
     * <p>The status of the VNC Remote visualization service. Valid values:</p>
     * <br>
     * <p>*   Service started.: started</p>
     * <p>*   Service stopped.: stopped</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVisualServicePasswdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVisualServicePasswdResponseBody self = new ModifyVisualServicePasswdResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVisualServicePasswdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyVisualServicePasswdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
