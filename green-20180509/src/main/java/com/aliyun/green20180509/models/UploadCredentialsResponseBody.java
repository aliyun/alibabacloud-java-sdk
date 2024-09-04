// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class UploadCredentialsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UploadCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadCredentialsResponseBody self = new UploadCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
