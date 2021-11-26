// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CancelFavoritePublicMediaResponseBody extends TeaModel {
    @NameInMap("IgnoredList")
    public java.util.List<String> ignoredList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CancelFavoritePublicMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelFavoritePublicMediaResponseBody self = new CancelFavoritePublicMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelFavoritePublicMediaResponseBody setIgnoredList(java.util.List<String> ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    public CancelFavoritePublicMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
