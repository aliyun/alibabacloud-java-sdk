// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetAsyncTaskRequest extends TeaModel {
    /**
     * <p>The asynchronous task ID. When you call the <a href="https://help.aliyun.com/document_detail/2247626.html">CopyCdsFile</a> operation to copy a folder, this field is returned because the copy is performed asynchronously in the background. Call this operation and pass in the asynchronous task ID to retrieve the task details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>81a8a07a-aec4-4dd5-80da-ae69e482****</p>
     */
    @NameInMap("AsyncTaskId")
    public String asyncTaskId;

    /**
     * <p>The enterprise network disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai+cds-135515****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    public static GetAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskRequest self = new GetAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskRequest setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public GetAsyncTaskRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

}
