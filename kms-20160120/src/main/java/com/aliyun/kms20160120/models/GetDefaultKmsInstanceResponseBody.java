// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetDefaultKmsInstanceResponseBody extends TeaModel {
    @NameInMap("DefaultKmsInstanceId")
    public String defaultKmsInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDefaultKmsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultKmsInstanceResponseBody self = new GetDefaultKmsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultKmsInstanceResponseBody setDefaultKmsInstanceId(String defaultKmsInstanceId) {
        this.defaultKmsInstanceId = defaultKmsInstanceId;
        return this;
    }
    public String getDefaultKmsInstanceId() {
        return this.defaultKmsInstanceId;
    }

    public GetDefaultKmsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
