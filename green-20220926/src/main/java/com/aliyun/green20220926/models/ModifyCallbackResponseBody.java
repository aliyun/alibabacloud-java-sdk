// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyCallbackResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCallbackResponseBody self = new ModifyCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCallbackResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
