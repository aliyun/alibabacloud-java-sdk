// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSessionClusterResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Workspace Id。</p>
     * 
     * <strong>example:</strong>
     * <p>w-******</p>
     */
    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    public static CreateSessionClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionClusterResponseBody self = new CreateSessionClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSessionClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSessionClusterResponseBody setSessionClusterId(String sessionClusterId) {
        this.sessionClusterId = sessionClusterId;
        return this;
    }
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

}
