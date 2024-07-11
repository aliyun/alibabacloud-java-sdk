// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ModifyAppVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1432****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
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
