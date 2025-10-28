// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ContinuePipelineRequest extends TeaModel {
    /**
     * <p>Specifies whether to release the next batch. Valid values:</p>
     * <ul>
     * <li>true: releases the next batch.</li>
     * <li>false: does not release the next batch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Confirm")
    public Boolean confirm;

    /**
     * <p>The ID of the change process. You can call the GetChangeOrderInfo operation to query the ID of the change process that corresponds to a specific batch. For more information, see <a href="https://help.aliyun.com/document_detail/62072.html">GetChangeOrderInfo</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5648dbd7-df13********************</p>
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
