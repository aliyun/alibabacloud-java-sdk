// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocExtractionResultRequest extends TeaModel {
    /**
     * <ul>
     * <li>Task ID.</li>
     * <li>taskId is obtained from the SubmitDocExtractionTaskAdvance and SubmitDocExtractionTask interfaces.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>97693b4c-17a8-4198-aa28-798d3c855577mhrv</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetDocExtractionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocExtractionResultRequest self = new GetDocExtractionResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocExtractionResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
