// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeHostAttackSurfacesFacetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("Host")
    public String host;

    public static DescribeHostAttackSurfacesFacetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAttackSurfacesFacetsRequest self = new DescribeHostAttackSurfacesFacetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHostAttackSurfacesFacetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeHostAttackSurfacesFacetsRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public DescribeHostAttackSurfacesFacetsRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

}
