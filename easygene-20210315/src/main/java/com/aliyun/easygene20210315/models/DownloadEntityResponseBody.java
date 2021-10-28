// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DownloadEntityResponseBody extends TeaModel {
    // 下载的表格文件URL
    @NameInMap("EntityCSVFile")
    public String entityCSVFile;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DownloadEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadEntityResponseBody self = new DownloadEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadEntityResponseBody setEntityCSVFile(String entityCSVFile) {
        this.entityCSVFile = entityCSVFile;
        return this;
    }
    public String getEntityCSVFile() {
        return this.entityCSVFile;
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

}
