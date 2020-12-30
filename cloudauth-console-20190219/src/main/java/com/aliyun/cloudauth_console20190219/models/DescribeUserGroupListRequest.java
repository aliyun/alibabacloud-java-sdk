// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUserGroupListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeUserGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserGroupListRequest self = new DescribeUserGroupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserGroupListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUserGroupListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
