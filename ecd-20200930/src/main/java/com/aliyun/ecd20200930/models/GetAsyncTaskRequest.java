// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetAsyncTaskRequest extends TeaModel {
    /**
     * <p>The asynchronous task ID. This parameter is not returned if you copy files. This parameter is returned if you copy folders in the backend in an asynchronous manner. You can call the GetAsyncTask operation to obtain the ID and information about an asynchronous task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>81a8a07a-aec4-4dd5-80da-ae69e482****</p>
     */
    @NameInMap("AsyncTaskId")
    public String asyncTaskId;

    /**
     * <p>The ID of the cloud disk.</p>
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
