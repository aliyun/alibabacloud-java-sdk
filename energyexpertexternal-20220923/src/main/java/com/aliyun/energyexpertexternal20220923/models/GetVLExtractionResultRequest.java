// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetVLExtractionResultRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>taskID.</p>
     * </li>
     * <li><p>The taskId is obtained from the interfaces SubmitVLExtractionTaskAdvance and SubmitVLExtractionTask.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1436b6f5-ddea-4308-9d1c-60939e5d5ea8</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetVLExtractionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVLExtractionResultRequest self = new GetVLExtractionResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVLExtractionResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
