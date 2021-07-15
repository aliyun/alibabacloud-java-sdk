// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 出现获取错误的ID或inputUr
    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    public static DeleteMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfosResponseBody self = new DeleteMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMediaInfosResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

}
