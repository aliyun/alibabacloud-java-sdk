// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class DownloadClusterManagedCertResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>emhlbmdza****W5qaWFuYmlhbm1hY2VzaGk=</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DownloadClusterManagedCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadClusterManagedCertResponseBody self = new DownloadClusterManagedCertResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadClusterManagedCertResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DownloadClusterManagedCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
