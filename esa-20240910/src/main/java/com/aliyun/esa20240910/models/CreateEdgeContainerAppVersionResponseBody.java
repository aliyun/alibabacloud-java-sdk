// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created version.</p>
     * 
     * <strong>example:</strong>
     * <p>ver-87962637161651****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static CreateEdgeContainerAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppVersionResponseBody self = new CreateEdgeContainerAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEdgeContainerAppVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
