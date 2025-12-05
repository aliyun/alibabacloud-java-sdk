// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetDefaultKmsInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>kst-hzz65f176a0ogplgq****</p>
     */
    @NameInMap("DefaultKmsInstanceId")
    public String defaultKmsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>bbc4e9ab-c76f-48ca-9c2a-8535772117e2</p>
     */
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
