// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordResponseBody extends TeaModel {
    @NameInMap("RandomPassword")
    public String randomPassword;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRandomPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRandomPasswordResponseBody self = new GetRandomPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRandomPasswordResponseBody setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
        return this;
    }
    public String getRandomPassword() {
        return this.randomPassword;
    }

    public GetRandomPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
