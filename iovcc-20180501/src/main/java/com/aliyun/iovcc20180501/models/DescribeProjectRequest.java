// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeProjectRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectRequest self = new DescribeProjectRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
