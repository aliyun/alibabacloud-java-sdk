// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CheckLdpsColumnarIndexStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Opened")
    public Boolean opened;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckLdpsColumnarIndexStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLdpsColumnarIndexStatusResponseBody self = new CheckLdpsColumnarIndexStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLdpsColumnarIndexStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckLdpsColumnarIndexStatusResponseBody setOpened(Boolean opened) {
        this.opened = opened;
        return this;
    }
    public Boolean getOpened() {
        return this.opened;
    }

    public CheckLdpsColumnarIndexStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
