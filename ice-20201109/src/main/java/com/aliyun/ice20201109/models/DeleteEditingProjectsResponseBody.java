// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsResponseBody extends TeaModel {
    @NameInMap("IgnoredList")
    public String ignoredList;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEditingProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsResponseBody self = new DeleteEditingProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsResponseBody setIgnoredList(String ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public String getIgnoredList() {
        return this.ignoredList;
    }

    public DeleteEditingProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
