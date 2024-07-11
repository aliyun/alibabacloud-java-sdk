// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4384****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppResponseBody self = new ModifyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
