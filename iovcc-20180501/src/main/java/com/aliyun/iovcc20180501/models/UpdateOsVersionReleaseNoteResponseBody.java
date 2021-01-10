// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionReleaseNoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOsVersionReleaseNoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionReleaseNoteResponseBody self = new UpdateOsVersionReleaseNoteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionReleaseNoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
