// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetVersionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>41A847C8-3D12-5F24-8CE9-7F9EB2DA9ECD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the dataset version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static CreateDatasetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetVersionResponseBody self = new CreateDatasetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasetVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
