// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordImportResultRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The task ID. Although this parameter is marked as required:false in the specification, it is actually required. If you do not provide this parameter, the service returns a 400 error. You can obtain the task ID from the TaskId field in the response of the AddKeywordsToLib operation when you import keywords in batches from a file.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetKeywordImportResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordImportResultRequest self = new GetKeywordImportResultRequest();
        return TeaModel.build(map, self);
    }

    public GetKeywordImportResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetKeywordImportResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
