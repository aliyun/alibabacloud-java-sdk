// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeletePlayInfoResponseBody extends TeaModel {
    @NameInMap("ForbiddenList")
    public java.util.List<String> forbiddenList;

    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlayInfoResponseBody self = new DeletePlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlayInfoResponseBody setForbiddenList(java.util.List<String> forbiddenList) {
        this.forbiddenList = forbiddenList;
        return this;
    }
    public java.util.List<String> getForbiddenList() {
        return this.forbiddenList;
    }

    public DeletePlayInfoResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public DeletePlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
