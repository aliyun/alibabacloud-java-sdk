// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ApplyResourceAccessPermissionResponseBody extends TeaModel {
    /**
     * <p>The list of application IDs.</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17***903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyResourceAccessPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourceAccessPermissionResponseBody self = new ApplyResourceAccessPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyResourceAccessPermissionResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ApplyResourceAccessPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
