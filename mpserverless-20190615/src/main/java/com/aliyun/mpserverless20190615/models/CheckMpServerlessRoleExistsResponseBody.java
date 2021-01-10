// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CheckMpServerlessRoleExistsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Exists")
    public Boolean exists;

    public static CheckMpServerlessRoleExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMpServerlessRoleExistsResponseBody self = new CheckMpServerlessRoleExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMpServerlessRoleExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMpServerlessRoleExistsResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

}
