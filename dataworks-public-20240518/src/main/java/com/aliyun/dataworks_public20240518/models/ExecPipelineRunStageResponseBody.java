// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecPipelineRunStageResponseBody extends TeaModel {
    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AFBB799F-8578-51C5-A766-E922EDB8XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.<blockquote>
     * <p>Notice: This only indicates whether the stage is triggered, not the execution result of the publish stage.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExecPipelineRunStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecPipelineRunStageResponseBody self = new ExecPipelineRunStageResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecPipelineRunStageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecPipelineRunStageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
