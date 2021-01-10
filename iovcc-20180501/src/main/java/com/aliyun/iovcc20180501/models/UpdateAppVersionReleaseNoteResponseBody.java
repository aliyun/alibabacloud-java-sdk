// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionReleaseNoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppVersionReleaseNoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionReleaseNoteResponseBody self = new UpdateAppVersionReleaseNoteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionReleaseNoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
