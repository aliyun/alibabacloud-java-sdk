// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyAppVersionResponseBody extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppVersionResponseBody self = new ModifyAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppVersionResponseBody setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public ModifyAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
