// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistActionDetailsRequest extends TeaModel {
    @NameInMap("ActionTimestamp")
    public String actionTimestamp;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListAssistActionDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssistActionDetailsRequest self = new ListAssistActionDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListAssistActionDetailsRequest setActionTimestamp(String actionTimestamp) {
        this.actionTimestamp = actionTimestamp;
        return this;
    }
    public String getActionTimestamp() {
        return this.actionTimestamp;
    }

    public ListAssistActionDetailsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
