// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMessageRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("MessageId")
    public Long messageId;

    public static DescribeMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMessageRequest self = new DescribeMessageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMessageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeMessageRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

}
