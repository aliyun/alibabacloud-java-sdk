// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyVisualServicePasswdResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Service started.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE6880</p>
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
