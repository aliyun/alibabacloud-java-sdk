// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21645FCD-BAB9-5742-89AE-AEB27****B2E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static CreateModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelVersionResponseBody self = new CreateModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
