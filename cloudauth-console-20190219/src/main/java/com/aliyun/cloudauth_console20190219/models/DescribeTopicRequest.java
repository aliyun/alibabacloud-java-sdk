// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeTopicRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("EndPoint")
    public String endPoint;

    public static DescribeTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopicRequest self = new DescribeTopicRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopicRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTopicRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeTopicRequest setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

}
