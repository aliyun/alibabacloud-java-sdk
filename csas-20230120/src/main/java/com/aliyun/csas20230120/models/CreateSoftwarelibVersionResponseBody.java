// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibVersionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the software version that was created.</p>
     * 
     * <strong>example:</strong>
     * <p>softwarelib-version-21ae186e2ac9****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static CreateSoftwarelibVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSoftwarelibVersionResponseBody self = new CreateSoftwarelibVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSoftwarelibVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSoftwarelibVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
