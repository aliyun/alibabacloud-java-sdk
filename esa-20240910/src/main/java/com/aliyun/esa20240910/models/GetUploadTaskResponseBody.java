// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUploadTaskResponseBody extends TeaModel {
    /**
     * <p>The error message returned when the file upload task failed.</p>
     * 
     * <strong>example:</strong>
     * <p>invalid url</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A52****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status.</p>
     * <ul>
     * <li><strong>INIT</strong>: The task is being initialized.</li>
     * <li><strong>activacted</strong>: The task is activated.</li>
     * <li><strong>running</strong>: The task is running.</li>
     * <li><strong>success</strong>: The task is successful.</li>
     * <li><strong>partial</strong>: The task is partially successful.</li>
     * <li><strong>fail</strong>: The task failed.</li>
     * </ul>
     * 
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
