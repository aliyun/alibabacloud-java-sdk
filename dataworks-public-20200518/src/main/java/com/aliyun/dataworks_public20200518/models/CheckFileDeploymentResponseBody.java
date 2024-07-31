// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>86d5a5ac-0cc0-4c5f-a374-a15713b252ab</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckFileDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFileDeploymentResponseBody self = new CheckFileDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFileDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
