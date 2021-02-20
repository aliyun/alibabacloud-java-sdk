// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAttackSurfacesFacetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TaskId")
    public Integer taskId;

    public static DescribeAttackSurfacesFacetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackSurfacesFacetsRequest self = new DescribeAttackSurfacesFacetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackSurfacesFacetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAttackSurfacesFacetsRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
