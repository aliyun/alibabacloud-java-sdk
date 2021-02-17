// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListProjectAPIsResponseBody extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("APIs")
    public java.util.List<String> APIs;

    public static ListProjectAPIsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAPIsResponseBody self = new ListProjectAPIsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectAPIsResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ListProjectAPIsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectAPIsResponseBody setAPIs(java.util.List<String> APIs) {
        this.APIs = APIs;
        return this;
    }
    public java.util.List<String> getAPIs() {
        return this.APIs;
    }

}
