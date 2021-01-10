// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeCustomizedFilterRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    public static DescribeCustomizedFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedFilterRequest self = new DescribeCustomizedFilterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedFilterRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeCustomizedFilterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
