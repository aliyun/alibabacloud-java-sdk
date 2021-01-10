// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistHistoryDetailsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AssistId")
    public String assistId;

    public static ListAssistHistoryDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssistHistoryDetailsRequest self = new ListAssistHistoryDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListAssistHistoryDetailsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListAssistHistoryDetailsRequest setAssistId(String assistId) {
        this.assistId = assistId;
        return this;
    }
    public String getAssistId() {
        return this.assistId;
    }

}
