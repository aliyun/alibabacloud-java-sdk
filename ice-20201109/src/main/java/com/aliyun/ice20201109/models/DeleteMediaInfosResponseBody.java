// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosResponseBody extends TeaModel {
    @NameInMap("ForbiddenList")
    public java.util.List<String> forbiddenList;

    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    /**
     * <strong>example:</strong>
     * <p>0622C702-41BE-467E-AF2E-883D4517962E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfosResponseBody self = new DeleteMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfosResponseBody setForbiddenList(java.util.List<String> forbiddenList) {
        this.forbiddenList = forbiddenList;
        return this;
    }
    public java.util.List<String> getForbiddenList() {
        return this.forbiddenList;
    }

    public DeleteMediaInfosResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public DeleteMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
