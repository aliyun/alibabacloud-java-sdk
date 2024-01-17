// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcRegisterAppResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestId")
    public String requestId;

    public static VpcRegisterAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcRegisterAppResponseBody self = new VpcRegisterAppResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcRegisterAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VpcRegisterAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
