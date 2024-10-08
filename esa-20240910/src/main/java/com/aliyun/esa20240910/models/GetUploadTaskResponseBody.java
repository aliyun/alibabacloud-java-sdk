// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUploadTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>invalid url</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A52****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetUploadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadTaskResponseBody self = new GetUploadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetUploadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
