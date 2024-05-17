// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ContinuePipelineRequest extends TeaModel {
    /**
     * <p>Specifies whether to release the next batch. Valid values:</p>
     * <br>
     * <p>*   true: releases the next batch.</p>
     * <p>*   false: does not release the next batch.</p>
     */
    @NameInMap("Confirm")
    public Boolean confirm;

    /**
     * <p>The ID of the change process. You can call the GetChangeOrderInfo operation to query the ID of the change process that corresponds to a specific batch. For more information, see [GetChangeOrderInfo](https://help.aliyun.com/document_detail/62072.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    public static ContinuePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuePipelineRequest self = new ContinuePipelineRequest();
        return TeaModel.build(map, self);
    }

    public ContinuePipelineRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

    public ContinuePipelineRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
