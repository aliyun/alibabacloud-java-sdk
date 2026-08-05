// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ModifyAppInfoResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInfoResponseBody self = new ModifyAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppInfoResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
