// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartVisualServiceResponseBody extends TeaModel {
    /**
     * <p>The status of the VNC Remote visualization service. Valid values:</p>
     * <ul>
     * <li>Service started</li>
     * <li>Service stopped</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Service started</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE6880</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartVisualServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartVisualServiceResponseBody self = new StartVisualServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartVisualServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartVisualServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
