// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DownloadEntityResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EntityTSVFile")
    public String entityTSVFile;

    public static DownloadEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadEntityResponseBody self = new DownloadEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadEntityResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public DownloadEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadEntityResponseBody setEntityTSVFile(String entityTSVFile) {
        this.entityTSVFile = entityTSVFile;
        return this;
    }
    public String getEntityTSVFile() {
        return this.entityTSVFile;
    }

}
