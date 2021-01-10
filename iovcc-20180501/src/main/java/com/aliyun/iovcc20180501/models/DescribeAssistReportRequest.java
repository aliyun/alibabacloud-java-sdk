// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistReportRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AssistId")
    public String assistId;

    public static DescribeAssistReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistReportRequest self = new DescribeAssistReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssistReportRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeAssistReportRequest setAssistId(String assistId) {
        this.assistId = assistId;
        return this;
    }
    public String getAssistId() {
        return this.assistId;
    }

}
