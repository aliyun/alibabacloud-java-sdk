// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeletePipelineResponseBody extends TeaModel {
    /**
     * <p>The ID of the MPS queue that is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>d1ce4d3efcb549419193f50f1fcd****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>338CA33A-AE83-5DF4-B6F2-C6D3ED8143F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineResponseBody self = new DeletePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePipelineResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public DeletePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
