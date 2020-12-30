// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeBindUserIdListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeBindUserIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindUserIdListRequest self = new DescribeBindUserIdListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBindUserIdListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeBindUserIdListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
