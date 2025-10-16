// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>970F08C9-EB28-5A3D-A228-D541AEC4C807</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryResponseBody self = new DeleteMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
