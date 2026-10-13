// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaProfilingResultDbOverviewRequest extends TeaModel {
    /**
     * <p>Specifies whether to return only summary data.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isSummary")
    public String isSummary;

    /**
     * <p>The ID of the metadata profiling task. It is used to locate the profiling task for which you want to query the overview.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetMetaProfilingResultDbOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaProfilingResultDbOverviewRequest self = new GetMetaProfilingResultDbOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaProfilingResultDbOverviewRequest setIsSummary(String isSummary) {
        this.isSummary = isSummary;
        return this;
    }
    public String getIsSummary() {
        return this.isSummary;
    }

    public GetMetaProfilingResultDbOverviewRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
