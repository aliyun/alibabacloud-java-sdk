// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RunPluginPipelineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E9E6192C-E3D6-5176-9109-340E9DA7CADD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RunPluginPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPluginPipelineResponseBody self = new RunPluginPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPluginPipelineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunPluginPipelineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunPluginPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
