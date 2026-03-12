// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteYikeAssetMediaInfosResponseBody extends TeaModel {
    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteYikeAssetMediaInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteYikeAssetMediaInfosResponseBody self = new DeleteYikeAssetMediaInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteYikeAssetMediaInfosResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public DeleteYikeAssetMediaInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
