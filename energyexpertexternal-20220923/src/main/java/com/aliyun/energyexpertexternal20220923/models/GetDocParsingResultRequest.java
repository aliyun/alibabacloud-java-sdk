// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocParsingResultRequest extends TeaModel {
    /**
     * <ul>
     * <li>The document parsing result supports two formats: markdown and json.</li>
     * <li>By default, the result is returned in markdown format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>md</p>
     */
    @NameInMap("returnFormat")
    public String returnFormat;

    /**
     * <ul>
     * <li>Task ID.</li>
     * <li>The taskId is obtained from the SubmitDocParsingTaskAdvance or SubmitDocParsingTask interfaces.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2c22388d-e2ed-44fe-99e6-99922f15e7bb</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetDocParsingResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocParsingResultRequest self = new GetDocParsingResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocParsingResultRequest setReturnFormat(String returnFormat) {
        this.returnFormat = returnFormat;
        return this;
    }
    public String getReturnFormat() {
        return this.returnFormat;
    }

    public GetDocParsingResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
