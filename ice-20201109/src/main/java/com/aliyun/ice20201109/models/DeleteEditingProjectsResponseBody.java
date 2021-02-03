// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IgnoredList")
    public String ignoredList;

    public static DeleteEditingProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsResponseBody self = new DeleteEditingProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEditingProjectsResponseBody setIgnoredList(String ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public String getIgnoredList() {
        return this.ignoredList;
    }

}
