// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetContentAnalyzeConfigResponseBody extends TeaModel {
    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>953CFD27-4A2C-54AD-857F-B79EF3A338E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the configuration succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: Success</p>
     * </li>
     * <li><p>false: Failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetContentAnalyzeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetContentAnalyzeConfigResponseBody self = new SetContentAnalyzeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetContentAnalyzeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetContentAnalyzeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
