// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DownloadEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://my-bucket.oss.aliyucs.com/entity.csv">https://my-bucket.oss.aliyucs.com/entity.csv</a></p>
     */
    @NameInMap("EntityCSVFile")
    public String entityCSVFile;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
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
