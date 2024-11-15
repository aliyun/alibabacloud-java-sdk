// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAnswerImportProgressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>alAxbbxxxx-xxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetAnswerImportProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnswerImportProgressRequest self = new GetAnswerImportProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetAnswerImportProgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAnswerImportProgressRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
